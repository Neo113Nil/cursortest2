package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3983uA {

    /* renamed from: a, reason: collision with root package name */
    public final Cy f34501a;

    public C3983uA(Vx vx, Cy cy) {
        this.f34501a = cy;
    }

    public final C3929tA a(int i) {
        return new C3929tA(i, this.f34501a);
    }

    public final void b(int i) {
        ((Gy) this.f34501a).a(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        ((Gy) this.f34501a).a(i - 1, -1L, null, str);
    }

    public final void d(int i, Throwable th) {
        ((Gy) this.f34501a).a(i - 1, -1L, th, null);
    }

    public final void e(int i, N3.a aVar) {
        C3929tA a9 = a(i);
        a9.a();
        C4178xq c4178xq = new C4178xq(this, a9);
        aVar.a(new LD(0, aVar, c4178xq), GD.f24952n);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
