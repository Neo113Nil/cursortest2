package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4006uA {

    /* renamed from: a, reason: collision with root package name */
    public final Cy f35275a;

    public C4006uA(Vx vx, Cy cy) {
        this.f35275a = cy;
    }

    public final C3952tA a(int i) {
        return new C3952tA(i, this.f35275a);
    }

    public final void b(int i) {
        ((Gy) this.f35275a).a(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        ((Gy) this.f35275a).a(i - 1, -1L, null, str);
    }

    public final void d(int i, Throwable th) {
        ((Gy) this.f35275a).a(i - 1, -1L, th, null);
    }

    public final void e(int i, P3.a aVar) {
        C3952tA a9 = a(i);
        a9.a();
        C4201xq c4201xq = new C4201xq(this, a9);
        aVar.a(new LD(0, aVar, c4201xq), GD.f25742n);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
