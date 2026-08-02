package E2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.RD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r2.C4906k;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f718a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f719b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f720c;

    /* renamed from: d, reason: collision with root package name */
    public final C3391io f721d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f722e;

    public C(Context context, C3391io c3391io, RD rd) {
        this.f720c = context;
        this.f721d = c3391io;
        this.f722e = rd;
    }

    public final synchronized void a(Object obj, H2.b bVar) {
        C4906k.f40186C.f40198k.getClass();
        AbstractC3436jg.f32060f.execute(new x(1, this, obj, new Pair(bVar, Long.valueOf(System.currentTimeMillis()))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r11.f729a == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(boolean z6, E e9) {
        try {
            HashMap hashMap = this.f718a;
            Boolean valueOf = Boolean.valueOf(z6);
            E e10 = (E) hashMap.get(valueOf);
            boolean z9 = true;
            if (e10 != null) {
                C4906k.f40186C.f40198k.getClass();
                if (!(e10.f731c <= System.currentTimeMillis())) {
                    if (e10.f729a != null) {
                    }
                }
            }
            hashMap.put(valueOf, e9);
            long longValue = (e9.f729a != null ? (Long) AbstractC2823Ua.f28728f.r() : (Long) AbstractC2823Ua.f28729g.r()).longValue();
            if (e9.f729a != null) {
                z9 = false;
            }
            AbstractC3436jg.f32058d.schedule(new A(this, z6, z9, 0), longValue, TimeUnit.SECONDS);
            HashMap hashMap2 = this.f719b;
            List list = (List) hashMap2.get(valueOf);
            hashMap2.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e(e9, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final void c(boolean z6) {
        HashMap hashMap = this.f719b;
        Boolean valueOf = Boolean.valueOf(z6);
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
        ((C3383ig) this.f722e).submit(new B(0, this, z6));
    }

    public final synchronized void d(boolean z6, boolean z9) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z6);
                HashMap hashMap = this.f718a;
                Boolean valueOf = Boolean.valueOf(z6);
                E e9 = (E) hashMap.get(valueOf);
                int i = 0;
                if (z9 && e9 != null) {
                    try {
                        i = e9.f732d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                E e10 = (E) hashMap.get(valueOf);
                D d9 = new D(this, z6, i, e10 == null ? null : Boolean.valueOf(e10.f733e.get()), this.f721d);
                m2.g gVar = new m2.g((m2.f) new m2.f(3).e(bundle));
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.xc)).booleanValue()) {
                    ((C3383ig) this.f722e).submit(new CallableC0308e(3, this, gVar, d9));
                } else {
                    H2.a.a(this.f720c, m2.b.BANNER, gVar, d9);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void e(E e9, Pair pair, boolean z6) {
        e9.f733e.set(true);
        H2.a aVar = e9.f729a;
        if (aVar != null) {
            ((H2.b) pair.first).onSuccess(aVar);
        } else {
            ((H2.b) pair.first).onFailure(e9.f730b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C4906k.f40186C.f40198k.getClass();
        t8.g.z(this.f721d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z6)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }
}
