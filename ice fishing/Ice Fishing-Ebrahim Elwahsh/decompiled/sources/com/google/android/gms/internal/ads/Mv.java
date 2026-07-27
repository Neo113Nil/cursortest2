package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k2.EnumC4631b;

/* loaded from: classes2.dex */
public final class Mv {

    /* renamed from: c, reason: collision with root package name */
    public final Sv f26398c;

    /* renamed from: d, reason: collision with root package name */
    public final Mt f26399d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f26400e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f26401f;

    /* renamed from: h, reason: collision with root package name */
    public final S2.a f26403h;
    public AtomicInteger i;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f26402g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f26396a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26397b = new ConcurrentHashMap();

    public Mv(Sv sv, Mt mt, Context context, S2.a aVar) {
        this.f26398c = sv;
        this.f26399d = mt;
        this.f26400e = context;
        this.f26403h = aVar;
    }

    public static String a(String str, EnumC4631b enumC4631b) {
        String name = enumC4631b == null ? "NULL" : enumC4631b.name();
        return D.y.o(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()), str, "#", name);
    }

    public final void b(boolean z8) {
        synchronized (this) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31409C)).booleanValue()) {
                c(z8);
            }
        }
    }

    public final synchronized void c(boolean z8) {
        try {
            if (z8) {
                Iterator it = this.f26396a.values().iterator();
                while (it.hasNext()) {
                    ((Hv) it.next()).n();
                }
            } else {
                Iterator it2 = this.f26396a.values().iterator();
                while (it2.hasNext()) {
                    ((Hv) it2.next()).f25452g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (((java.lang.Boolean) r3.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31433F)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2;
        try {
            HashSet hashSet = new HashSet();
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q2.W0 w02 = (q2.W0) it.next();
                String a9 = a(w02.f39986n, EnumC4631b.a(w02.f39987u));
                hashSet.add(a9);
                ConcurrentHashMap concurrentHashMap = this.f26396a;
                Hv hv = (Hv) concurrentHashMap.get(a9);
                if (hv == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.f26397b;
                    if (concurrentHashMap2.containsKey(a9)) {
                        Hv hv2 = (Hv) concurrentHashMap2.get(a9);
                        if (((q2.W0) hv2.f25450e.get()).equals(w02)) {
                            hv2.a(w02.f39989w);
                            hv2.n();
                            concurrentHashMap.put(a9, hv2);
                            concurrentHashMap2.remove(a9);
                        } else {
                            arrayList2.add(w02);
                        }
                    } else {
                        arrayList2.add(w02);
                    }
                } else if (((q2.W0) hv.f25450e.get()).equals(w02)) {
                    hv.a(w02.f39989w);
                } else {
                    this.f26397b.put(a9, hv);
                    concurrentHashMap.remove(a9);
                    arrayList2.add(w02);
                }
            }
            Iterator it2 = this.f26396a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f26397b.put((String) entry.getKey(), (Hv) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f26397b.entrySet().iterator();
            while (it3.hasNext()) {
                Hv hv3 = (Hv) ((Map.Entry) it3.next()).getValue();
                hv3.f25452g.set(false);
                hv3.f25460p.set(false);
                C3151ea c3151ea = AbstractC3368ia.f31425E;
                q2.r rVar = q2.r.f40116e;
                if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                }
                Queue queue = hv3.f25454j;
                synchronized (queue) {
                    queue.clear();
                }
                if (!hv3.l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList2;
    }

    public final synchronized boolean e(String str, EnumC4631b enumC4631b) {
        boolean z8;
        try {
            this.f26403h.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Hv g9 = g(str, enumC4631b);
            z8 = g9 != null && g9.l();
            Long valueOf = z8 ? Long.valueOf(System.currentTimeMillis()) : null;
            Nv nv = new Nv(new C3602mu(17, str, enumC4631b));
            int i = 0;
            Mt mt = this.f26399d;
            int s3 = g9 == null ? 0 : g9.s();
            if (g9 != null) {
                i = g9.t();
            }
            mt.u(s3, i, currentTimeMillis, valueOf, g9 != null ? g9.o() : null, nv, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    public final synchronized Object f(Class cls, String str, EnumC4631b enumC4631b) {
        Nv nv = new Nv(new C3602mu(17, str, enumC4631b));
        Mt mt = this.f26399d;
        this.f26403h.getClass();
        mt.y("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, nv, "1");
        Hv g9 = g(str, enumC4631b);
        if (g9 == null) {
            return null;
        }
        try {
            String o9 = g9.o();
            Object m8 = g9.m();
            Object cast = m8 == null ? null : cls.cast(m8);
            if (cast != null) {
                mt.v(System.currentTimeMillis(), g9.s(), g9.t(), o9, nv, "1");
            }
            return cast;
        } catch (ClassCastException e6) {
            p2.j.f39798C.f39808h.d("PreloadAdManager.pollAd", e6);
            t2.C.l("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
            return null;
        }
    }

    public final synchronized Hv g(String str, EnumC4631b enumC4631b) {
        return (Hv) this.f26396a.get(a(str, enumC4631b));
    }
}
