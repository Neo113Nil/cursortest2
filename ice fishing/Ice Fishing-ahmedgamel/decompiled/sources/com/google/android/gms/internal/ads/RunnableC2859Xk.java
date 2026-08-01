package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2859Xk implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28559n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f28560u;

    public /* synthetic */ RunnableC2859Xk(C2875Yk c2875Yk, int i) {
        this.f28559n = i;
        switch (i) {
            case 1:
                this.f28560u = new WeakReference(c2875Yk);
                break;
            default:
                this.f28560u = new WeakReference(c2875Yk);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28559n) {
            case 0:
                C2875Yk c2875Yk = (C2875Yk) this.f28560u.get();
                if (c2875Yk != null) {
                    c2875Yk.M1(C2935ak.f29106S);
                    break;
                }
                break;
            default:
                C2875Yk c2875Yk2 = (C2875Yk) this.f28560u.get();
                if (c2875Yk2 != null) {
                    c2875Yk2.M1(C2935ak.f29105R);
                    break;
                }
                break;
        }
    }
}
