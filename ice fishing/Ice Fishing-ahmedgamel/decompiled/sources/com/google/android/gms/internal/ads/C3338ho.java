package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3338ho implements Mu {

    /* renamed from: u, reason: collision with root package name */
    public final C3069co f31719u;

    /* renamed from: v, reason: collision with root package name */
    public final V2.a f31720v;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f31718n = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f31721w = new HashMap();

    public C3338ho(C3069co c3069co, Set set, V2.a aVar) {
        this.f31719u = c3069co;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3284go c3284go = (C3284go) it.next();
            HashMap hashMap = this.f31721w;
            c3284go.getClass();
            hashMap.put(Ju.RENDERER, c3284go);
        }
        this.f31720v = aVar;
    }

    public final void a(Ju ju, boolean z6) {
        C3284go c3284go = (C3284go) this.f31721w.get(ju);
        if (c3284go == null) {
            return;
        }
        String str = true != z6 ? "f." : "s.";
        HashMap hashMap = this.f31718n;
        Ju ju2 = c3284go.f31427b;
        if (hashMap.containsKey(ju2)) {
            this.f31720v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju2)).longValue();
            ConcurrentHashMap concurrentHashMap = this.f31719u.f30367a;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            concurrentHashMap.put("label.".concat(c3284go.f31426a), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        HashMap hashMap = this.f31718n;
        if (hashMap.containsKey(ju)) {
            this.f31720v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju)).longValue();
            this.f31719u.f30367a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f31721w.containsKey(ju)) {
            a(ju, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void o(Ju ju, String str) {
        this.f31720v.getClass();
        this.f31718n.put(ju, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void w(Ju ju, String str) {
        HashMap hashMap = this.f31718n;
        if (hashMap.containsKey(ju)) {
            this.f31720v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(ju)).longValue();
            this.f31719u.f30367a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f31721w.containsKey(ju)) {
            a(ju, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
    }
}
