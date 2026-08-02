package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2858Wc extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final Object f29156w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final C2874Xc f29157x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29158y;

    public C2858Wc(C2874Xc c2874Xc) {
        this.f29157x = c2874Xc;
    }

    public final void s() {
        w2.z.k("release: Trying to acquire lock");
        synchronized (this.f29156w) {
            try {
                w2.z.k("release: Lock acquired");
                if (this.f29158y) {
                    w2.z.k("release: Lock already released");
                    return;
                }
                this.f29158y = true;
                p(new C2889Yb(4), new C2889Yb(20));
                p(new C3680o7(this), new C3717or(this));
                w2.z.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
