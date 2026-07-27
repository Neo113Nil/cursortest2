package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3328ho implements Pu {

    /* renamed from: u, reason: collision with root package name */
    public final C3002bo f31266u;

    /* renamed from: v, reason: collision with root package name */
    public final S2.a f31267v;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f31265n = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f31268w = new HashMap();

    public C3328ho(C3002bo c3002bo, Set set, S2.a aVar) {
        this.f31266u = c3002bo;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3274go c3274go = (C3274go) it.next();
            HashMap hashMap = this.f31268w;
            c3274go.getClass();
            hashMap.put(Lu.RENDERER, c3274go);
        }
        this.f31267v = aVar;
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void a(Lu lu, String str) {
        HashMap hashMap = this.f31265n;
        if (hashMap.containsKey(lu)) {
            this.f31267v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(lu)).longValue();
            this.f31266u.f29588a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f31268w.containsKey(lu)) {
            b(lu, true);
        }
    }

    public final void b(Lu lu, boolean z8) {
        C3274go c3274go = (C3274go) this.f31268w.get(lu);
        if (c3274go == null) {
            return;
        }
        String str = true != z8 ? "f." : "s.";
        HashMap hashMap = this.f31265n;
        Lu lu2 = c3274go.f31102b;
        if (hashMap.containsKey(lu2)) {
            this.f31267v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(lu2)).longValue();
            ConcurrentHashMap concurrentHashMap = this.f31266u.f29588a;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            concurrentHashMap.put("label.".concat(c3274go.f31101a), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void t(Lu lu, String str) {
        this.f31267v.getClass();
        this.f31265n.put(lu, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void u(Lu lu, String str, Throwable th) {
        HashMap hashMap = this.f31265n;
        if (hashMap.containsKey(lu)) {
            this.f31267v.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.get(lu)).longValue();
            this.f31266u.f29588a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.f31268w.containsKey(lu)) {
            b(lu, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void d(String str) {
    }
}
