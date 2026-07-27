package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3056co implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29751n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2593Hm f29752u;

    public /* synthetic */ RunnableC3056co(C2593Hm c2593Hm, int i) {
        this.f29751n = i;
        this.f29752u = c2593Hm;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f29751n) {
            case 0:
                C2593Hm c2593Hm = this.f29752u;
                ((C3165eo) c2593Hm.f25416u).f30506a.c((ConcurrentHashMap) c2593Hm.f25417v);
                break;
            default:
                C2593Hm c2593Hm2 = this.f29752u;
                ((C3165eo) c2593Hm2.f25416u).f30506a.b((ConcurrentHashMap) c2593Hm2.f25417v);
                break;
        }
    }
}
