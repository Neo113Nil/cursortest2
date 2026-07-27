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
import p2.C4835j;

/* loaded from: classes2.dex */
public final class Kv {

    /* renamed from: c, reason: collision with root package name */
    public final Qv f25992c;

    /* renamed from: d, reason: collision with root package name */
    public final C3534lt f25993d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f25994e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f25995f;

    /* renamed from: h, reason: collision with root package name */
    public final T2.a f25997h;
    public AtomicInteger i;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25996g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25990a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f25991b = new ConcurrentHashMap();

    public Kv(Qv qv, C3534lt c3534lt, Context context, T2.a aVar) {
        this.f25992c = qv;
        this.f25993d = c3534lt;
        this.f25994e = context;
        this.f25997h = aVar;
    }

    public static String a(String str, k2.b bVar) {
        String name = bVar == null ? "NULL" : bVar.name();
        return D.y.s(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()), str, "#", name);
    }

    public final void b(boolean z3) {
        synchronized (this) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31988C)).booleanValue()) {
                c(z3);
            }
        }
    }

    public final synchronized void c(boolean z3) {
        try {
            if (z3) {
                Iterator it = this.f25990a.values().iterator();
                while (it.hasNext()) {
                    ((Fv) it.next()).n();
                }
            } else {
                Iterator it2 = this.f25990a.values().iterator();
                while (it2.hasNext()) {
                    ((Fv) it2.next()).f24872g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (((java.lang.Boolean) r3.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32013F)).booleanValue() != false) goto L34;
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
                q2.V0 v02 = (q2.V0) it.next();
                String a9 = a(v02.f40074n, k2.b.a(v02.f40075u));
                hashSet.add(a9);
                ConcurrentHashMap concurrentHashMap = this.f25990a;
                Fv fv = (Fv) concurrentHashMap.get(a9);
                if (fv == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.f25991b;
                    if (concurrentHashMap2.containsKey(a9)) {
                        Fv fv2 = (Fv) concurrentHashMap2.get(a9);
                        if (((q2.V0) fv2.f24870e.get()).equals(v02)) {
                            fv2.a(v02.f40077w);
                            fv2.n();
                            concurrentHashMap.put(a9, fv2);
                            concurrentHashMap2.remove(a9);
                        } else {
                            arrayList2.add(v02);
                        }
                    } else {
                        arrayList2.add(v02);
                    }
                } else if (((q2.V0) fv.f24870e.get()).equals(v02)) {
                    fv.a(v02.f40077w);
                } else {
                    this.f25991b.put(a9, fv);
                    concurrentHashMap.remove(a9);
                    arrayList2.add(v02);
                }
            }
            Iterator it2 = this.f25990a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f25991b.put((String) entry.getKey(), (Fv) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f25991b.entrySet().iterator();
            while (it3.hasNext()) {
                Fv fv3 = (Fv) ((Map.Entry) it3.next()).getValue();
                fv3.f24872g.set(false);
                fv3.f24880p.set(false);
                C3301ha c3301ha = AbstractC3569ma.f32005E;
                q2.r rVar = q2.r.f40204e;
                if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                }
                Queue queue = fv3.f24874j;
                synchronized (queue) {
                    queue.clear();
                }
                if (!fv3.l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList2;
    }

    public final synchronized boolean e(String str, k2.b bVar) {
        boolean z3;
        try {
            this.f25997h.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Fv g4 = g(str, bVar);
            z3 = g4 != null && g4.l();
            Long valueOf = z3 ? Long.valueOf(System.currentTimeMillis()) : null;
            Lv lv = new Lv(new C3481ku(17, str, bVar));
            int i = 0;
            C3534lt c3534lt = this.f25993d;
            int s9 = g4 == null ? 0 : g4.s();
            if (g4 != null) {
                i = g4.t();
            }
            c3534lt.v(s9, i, currentTimeMillis, valueOf, g4 != null ? g4.o() : null, lv, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    public final synchronized Object f(Class cls, String str, k2.b bVar) {
        Lv lv = new Lv(new C3481ku(17, str, bVar));
        C3534lt c3534lt = this.f25993d;
        this.f25997h.getClass();
        c3534lt.A("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, lv, "1");
        Fv g4 = g(str, bVar);
        if (g4 == null) {
            return null;
        }
        try {
            String o6 = g4.o();
            Object m4 = g4.m();
            Object cast = m4 == null ? null : cls.cast(m4);
            if (cast != null) {
                c3534lt.x(System.currentTimeMillis(), g4.s(), g4.t(), o6, lv, "1");
            }
            return cast;
        } catch (ClassCastException e9) {
            C4835j.f39730C.f39740h.d("PreloadAdManager.pollAd", e9);
            u2.z.l("Unable to cast ad to the requested type:".concat(cls.getName()), e9);
            return null;
        }
    }

    public final synchronized Fv g(String str, k2.b bVar) {
        return (Fv) this.f25990a.get(a(str, bVar));
    }
}
