package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;
import w2.C5140B;

/* loaded from: classes2.dex */
public final class Ev {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25429a;

    /* renamed from: b, reason: collision with root package name */
    public final Qv f25430b;

    /* renamed from: c, reason: collision with root package name */
    public final C3557lt f25431c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f25432d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f25433e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25434f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final V2.a f25435g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f25436h;
    public final Cv i;

    /* renamed from: j, reason: collision with root package name */
    public final C5140B f25437j;

    public Ev(Qv qv, C3557lt c3557lt, Context context, V2.a aVar, Cv cv, C5140B c5140b) {
        HashMap hashMap = new HashMap();
        this.f25429a = hashMap;
        hashMap.put(m2.b.APP_OPEN_AD, new HashMap());
        hashMap.put(m2.b.INTERSTITIAL, new HashMap());
        hashMap.put(m2.b.REWARDED, new HashMap());
        this.f25430b = qv;
        this.f25431c = c3557lt;
        this.f25432d = context;
        this.f25435g = aVar;
        this.i = cv;
        this.f25437j = c5140b;
    }

    public final void a(boolean z6) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f25429a;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Fv fv = (Fv) arrayList.get(i);
            if (z6) {
                fv.n();
            } else {
                fv.f25662g.set(false);
            }
        }
    }

    public final Object b(Class cls, String str, m2.b bVar) {
        C3557lt c3557lt = this.f25431c;
        this.f25435g.getClass();
        c3557lt.A("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap hashMap = this.f25429a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(bVar)) {
                    return null;
                }
                Fv fv = (Fv) ((Map) hashMap.get(bVar)).get(str);
                if (fv != null && bVar.equals(fv.q())) {
                    C3504ku c3504ku = new C3504ku(17, fv.r(), fv.q());
                    c3504ku.f32447w = str;
                    Lv lv = new Lv(c3504ku);
                    c3557lt.A("poll_ad", "ppac_ts", System.currentTimeMillis(), fv.s(), fv.t(), null, lv, "2");
                    try {
                        String o4 = fv.o();
                        Object m9 = fv.m();
                        Object cast = m9 == null ? null : cls.cast(m9);
                        if (cast == null) {
                            return cast;
                        }
                        c3557lt.x(System.currentTimeMillis(), fv.s(), fv.t(), o4, lv, "2");
                        return cast;
                    } catch (ClassCastException e9) {
                        C4906k.f40186C.f40196h.d("PreloadAdManager.pollAd", e9);
                        w2.z.l("Unable to cast ad to the requested type:".concat(cls.getName()), e9);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean c(m2.b bVar) {
        HashMap hashMap = this.f25429a;
        int size = hashMap.containsKey(bVar) ? ((Map) hashMap.get(bVar)).size() : 0;
        int ordinal = bVar.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33164u5)).intValue(), 1) : Math.max(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33155t5)).intValue(), 1) : Math.max(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33145s5)).intValue(), 1));
    }
}
