package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2882Xk implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29331n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f29332u;

    public /* synthetic */ RunnableC2882Xk(C2898Yk c2898Yk, int i) {
        this.f29331n = i;
        switch (i) {
            case 1:
                this.f29332u = new WeakReference(c2898Yk);
                break;
            default:
                this.f29332u = new WeakReference(c2898Yk);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29331n) {
            case 0:
                C2898Yk c2898Yk = (C2898Yk) this.f29332u.get();
                if (c2898Yk != null) {
                    c2898Yk.M1(C2958ak.f29881S);
                    break;
                }
                break;
            default:
                C2898Yk c2898Yk2 = (C2898Yk) this.f29332u.get();
                if (c2898Yk2 != null) {
                    c2898Yk2.M1(C2958ak.f29880R);
                    break;
                }
                break;
        }
    }
}
