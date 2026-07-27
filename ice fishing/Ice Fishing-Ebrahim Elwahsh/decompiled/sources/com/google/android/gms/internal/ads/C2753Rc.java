package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2753Rc extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final Object f27383w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final C2770Sc f27384x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27385y;

    public C2753Rc(C2770Sc c2770Sc) {
        this.f27384x = c2770Sc;
    }

    public final void s() {
        t2.C.k("release: Trying to acquire lock");
        synchronized (this.f27383w) {
            try {
                t2.C.k("release: Lock acquired");
                if (this.f27385y) {
                    t2.C.k("release: Lock already released");
                    return;
                }
                this.f27385y = true;
                p(new C2837Wb(4), new C2837Wb(20));
                p(new C3562m7(this), new C3761pr(this));
                t2.C.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
