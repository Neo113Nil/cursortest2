package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3261go implements Mu {

    /* renamed from: u, reason: collision with root package name */
    public final C2993bo f30656u;

    /* renamed from: v, reason: collision with root package name */
    public final T2.a f30657v;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f30655n = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f30658w = new HashMap();

    public C3261go(C2993bo c2993bo, Set set, T2.a aVar) {
        this.f30656u = c2993bo;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3207fo c3207fo = (C3207fo) it.next();
            HashMap hashMap = this.f30658w;
            c3207fo.getClass();
            hashMap.put(Ju.RENDERER, c3207fo);
        }
        this.f30657v = aVar;
    }

    public final void a(Ju ju, boolean z3) {
        C3207fo c3207fo = (C3207fo) this.f30658w.get(ju);
        if (c3207fo == null) {
            return;
        }
        String str = true != z3 ? "f." : "s.";
        HashMap hashMap = this.f30655n;
        Ju ju2 = c3207fo.f30454b;
        if (hashMap.containsKey(ju2)) {
            this.f30657v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju2)).longValue();
            ConcurrentHashMap concurrentHashMap = this.f30656u.f29325a;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            concurrentHashMap.put("label.".concat(c3207fo.f30453a), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        HashMap hashMap = this.f30655n;
        if (hashMap.containsKey(ju)) {
            this.f30657v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju)).longValue();
            this.f30656u.f29325a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f30658w.containsKey(ju)) {
            a(ju, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void o(Ju ju, String str) {
        this.f30657v.getClass();
        this.f30655n.put(ju, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void x(Ju ju, String str) {
        HashMap hashMap = this.f30655n;
        if (hashMap.containsKey(ju)) {
            this.f30657v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju)).longValue();
            this.f30656u.f29325a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f30658w.containsKey(ju)) {
            a(ju, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
    }
}
