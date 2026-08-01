package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3535lu {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3680od f31864a;

    public C3535lu(InterfaceC3680od interfaceC3680od) {
        this.f31864a = interfaceC3680od;
    }

    public final boolean a() {
        try {
            return this.f31864a.m();
        } catch (Throwable th) {
            throw new C3267gu(th);
        }
    }

    public final void b(boolean z3) {
        try {
            this.f31864a.Q1(z3);
        } catch (Throwable th) {
            throw new C3267gu(th);
        }
    }
}
