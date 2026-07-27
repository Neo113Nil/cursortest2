package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;
import u2.C5069B;

/* loaded from: classes2.dex */
public final class Ev {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24673a;

    /* renamed from: b, reason: collision with root package name */
    public final Qv f24674b;

    /* renamed from: c, reason: collision with root package name */
    public final C3534lt f24675c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f24676d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f24677e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24678f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final T2.a f24679g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f24680h;
    public final Cv i;

    /* renamed from: j, reason: collision with root package name */
    public final C5069B f24681j;

    public Ev(Qv qv, C3534lt c3534lt, Context context, T2.a aVar, Cv cv, C5069B c5069b) {
        HashMap hashMap = new HashMap();
        this.f24673a = hashMap;
        hashMap.put(k2.b.APP_OPEN_AD, new HashMap());
        hashMap.put(k2.b.INTERSTITIAL, new HashMap());
        hashMap.put(k2.b.REWARDED, new HashMap());
        this.f24674b = qv;
        this.f24675c = c3534lt;
        this.f24676d = context;
        this.f24679g = aVar;
        this.i = cv;
        this.f24681j = c5069b;
    }

    public final void a(boolean z3) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f24673a;
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
            if (z3) {
                fv.n();
            } else {
                fv.f24872g.set(false);
            }
        }
    }

    public final Object b(Class cls, String str, k2.b bVar) {
        C3534lt c3534lt = this.f24675c;
        this.f24679g.getClass();
        c3534lt.A("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap hashMap = this.f24673a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(bVar)) {
                    return null;
                }
                Fv fv = (Fv) ((Map) hashMap.get(bVar)).get(str);
                if (fv != null && bVar.equals(fv.q())) {
                    C3481ku c3481ku = new C3481ku(17, fv.r(), fv.q());
                    c3481ku.f31665w = str;
                    Lv lv = new Lv(c3481ku);
                    c3534lt.A("poll_ad", "ppac_ts", System.currentTimeMillis(), fv.s(), fv.t(), null, lv, "2");
                    try {
                        String o6 = fv.o();
                        Object m4 = fv.m();
                        Object cast = m4 == null ? null : cls.cast(m4);
                        if (cast == null) {
                            return cast;
                        }
                        c3534lt.x(System.currentTimeMillis(), fv.s(), fv.t(), o6, lv, "2");
                        return cast;
                    } catch (ClassCastException e9) {
                        C4835j.f39730C.f39740h.d("PreloadAdManager.pollAd", e9);
                        u2.z.l("Unable to cast ad to the requested type:".concat(cls.getName()), e9);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean c(k2.b bVar) {
        HashMap hashMap = this.f24673a;
        int size = hashMap.containsKey(bVar) ? ((Map) hashMap.get(bVar)).size() : 0;
        int ordinal = bVar.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32384u5)).intValue(), 1) : Math.max(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32376t5)).intValue(), 1) : Math.max(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32366s5)).intValue(), 1));
    }
}
