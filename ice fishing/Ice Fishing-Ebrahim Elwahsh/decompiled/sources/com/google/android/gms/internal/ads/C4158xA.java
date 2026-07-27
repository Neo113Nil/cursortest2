package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4158xA {

    /* renamed from: a, reason: collision with root package name */
    public final Dy f35126a;

    public C4158xA(Wx wx, Dy dy) {
        this.f35126a = dy;
    }

    public final C4104wA a(int i) {
        return new C4104wA(i, this.f35126a);
    }

    public final void b(int i) {
        ((Hy) this.f35126a).b(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        ((Hy) this.f35126a).b(i - 1, -1L, null, str);
    }

    public final void d(int i, Throwable th) {
        ((Hy) this.f35126a).b(i - 1, -1L, th, null);
    }

    public final void e(int i, J3.a aVar) {
        C4104wA a9 = a(i);
        a9.a();
        C2478Aq c2478Aq = new C2478Aq(this, a9);
        aVar.c(new MD(0, aVar, c2478Aq), HD.f25326n);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
