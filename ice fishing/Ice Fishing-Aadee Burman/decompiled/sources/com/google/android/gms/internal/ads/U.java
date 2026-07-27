package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public boolean f27838c;

    /* renamed from: e, reason: collision with root package name */
    public int f27840e;

    /* renamed from: h, reason: collision with root package name */
    public long f27843h;
    public final S i;

    /* renamed from: a, reason: collision with root package name */
    public T f27836a = new T();

    /* renamed from: b, reason: collision with root package name */
    public T f27837b = new T();

    /* renamed from: d, reason: collision with root package name */
    public long f27839d = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: f, reason: collision with root package name */
    public float f27841f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f27842g = -1.0f;

    public U(S s9) {
        this.i = s9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if ((r3 == 0 ? false : r0.f27670g[(int) ((r3 - 1) % 15)]) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6) {
        if (j6 == this.f27839d) {
            return;
        }
        this.f27843h++;
        this.f27836a.c(j6);
        if (this.f27836a.b()) {
            this.f27838c = false;
        } else if (this.f27839d != com.anythink.basead.exoplayer.b.f6382b) {
            if (this.f27838c) {
                T t6 = this.f27837b;
                long j9 = t6.f27667d;
            }
            this.f27837b.a();
            this.f27837b.c(this.f27839d);
            this.f27838c = true;
            this.f27837b.c(j6);
        }
        if (this.f27838c && this.f27837b.b()) {
            T t9 = this.f27836a;
            this.f27836a = this.f27837b;
            this.f27837b = t9;
            this.f27838c = false;
        }
        this.f27839d = j6;
        this.f27840e = this.f27836a.b() ? 0 : this.f27840e + 1;
        c();
    }

    public final long b() {
        if (!this.f27836a.b()) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        T t6 = this.f27836a;
        long j6 = t6.f27668e;
        if (j6 == 0) {
            return 0L;
        }
        return t6.f27669f / j6;
    }

    public final void c() {
        float f3;
        boolean b9 = this.f27836a.b();
        if (b9) {
            f3 = (float) (1.0E9d / (this.f27836a.f27668e != 0 ? r1.f27669f / r2 : 0L));
        } else {
            f3 = this.f27841f;
        }
        float f9 = this.f27842g;
        if (f3 == f9) {
            return;
        }
        if (f3 != -1.0f && f9 != -1.0f) {
            float f10 = 1.0f;
            if (b9 && this.f27836a.f27669f >= 5000000000L) {
                f10 = 0.1f;
            }
            if (Math.abs(f3 - f9) < f10) {
                return;
            }
        } else if (f3 == -1.0f && this.f27840e < 30) {
            return;
        }
        this.f27842g = f3;
        this.i.j(f3);
    }
}
