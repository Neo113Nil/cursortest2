package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3656nu {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3531ld f33064a;

    public C3656nu(InterfaceC3531ld interfaceC3531ld) {
        this.f33064a = interfaceC3531ld;
    }

    public final boolean a() {
        try {
            return this.f33064a.n();
        } catch (Throwable th) {
            throw new C3334hu(th);
        }
    }

    public final void b(boolean z8) {
        try {
            this.f33064a.S1(z8);
        } catch (Throwable th) {
            throw new C3334hu(th);
        }
    }
}
