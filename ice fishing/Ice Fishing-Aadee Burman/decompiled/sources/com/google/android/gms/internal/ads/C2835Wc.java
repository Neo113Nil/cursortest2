package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2835Wc extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final Object f28357w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final C2851Xc f28358x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28359y;

    public C2835Wc(C2851Xc c2851Xc) {
        this.f28358x = c2851Xc;
    }

    public final void s() {
        u2.z.k("release: Trying to acquire lock");
        synchronized (this.f28357w) {
            try {
                u2.z.k("release: Lock acquired");
                if (this.f28359y) {
                    u2.z.k("release: Lock already released");
                    return;
                }
                this.f28359y = true;
                p(new C2866Yb(4), new C2866Yb(20));
                p(new C3657o7(this), new C3694or(this));
                u2.z.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
