package C2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.RD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f258a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f259b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f260c;

    /* renamed from: d, reason: collision with root package name */
    public final C3315ho f261d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f262e;

    public D(Context context, C3315ho c3315ho, RD rd) {
        this.f260c = context;
        this.f261d = c3315ho;
        this.f262e = rd;
    }

    public final synchronized void a(Object obj, F2.b bVar) {
        C4835j.f39733C.f39745k.getClass();
        AbstractC3413jg.f31273f.execute(new y(1, this, obj, new Pair(bVar, Long.valueOf(System.currentTimeMillis()))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r11.f269a == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(boolean z3, F f3) {
        try {
            HashMap hashMap = this.f258a;
            Boolean valueOf = Boolean.valueOf(z3);
            F f9 = (F) hashMap.get(valueOf);
            boolean z6 = true;
            if (f9 != null) {
                C4835j.f39733C.f39745k.getClass();
                if (!(f9.f271c <= System.currentTimeMillis())) {
                    if (f9.f269a != null) {
                    }
                }
            }
            hashMap.put(valueOf, f3);
            long longValue = (f3.f269a != null ? (Long) AbstractC2801Ua.f27930f.r() : (Long) AbstractC2801Ua.f27931g.r()).longValue();
            if (f3.f269a != null) {
                z6 = false;
            }
            AbstractC3413jg.f31271d.schedule(new B(this, z3, z6, 0), longValue, TimeUnit.SECONDS);
            HashMap hashMap2 = this.f259b;
            List list = (List) hashMap2.get(valueOf);
            hashMap2.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e(f3, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final void c(boolean z3) {
        HashMap hashMap = this.f259b;
        Boolean valueOf = Boolean.valueOf(z3);
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
        ((C3360ig) this.f262e).submit(new C(0, this, z3));
    }

    public final synchronized void d(boolean z3, boolean z6) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z3);
                HashMap hashMap = this.f258a;
                Boolean valueOf = Boolean.valueOf(z3);
                F f3 = (F) hashMap.get(valueOf);
                int i = 0;
                if (z6 && f3 != null) {
                    try {
                        i = f3.f272d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                F f9 = (F) hashMap.get(valueOf);
                E e9 = new E(this, z3, i, f9 == null ? null : Boolean.valueOf(f9.f273e.get()), this.f261d);
                k2.g gVar = new k2.g((k2.f) new k2.f(2).e(bundle));
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.xc)).booleanValue()) {
                    ((C3360ig) this.f262e).submit(new CallableC0272e(3, this, gVar, e9));
                } else {
                    F2.a.a(this.f260c, k2.b.BANNER, gVar, e9);
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

    public final void e(F f3, Pair pair, boolean z3) {
        f3.f273e.set(true);
        F2.a aVar = f3.f269a;
        if (aVar != null) {
            ((F2.b) pair.first).onSuccess(aVar);
        } else {
            ((F2.b) pair.first).onFailure(f3.f270b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C4835j.f39733C.f39745k.getClass();
        com.bumptech.glide.d.p(this.f261d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z3)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }
}
