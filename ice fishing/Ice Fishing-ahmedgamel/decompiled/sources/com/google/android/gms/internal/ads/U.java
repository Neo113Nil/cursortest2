package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public boolean f28635c;

    /* renamed from: e, reason: collision with root package name */
    public int f28637e;

    /* renamed from: h, reason: collision with root package name */
    public long f28640h;
    public final S i;

    /* renamed from: a, reason: collision with root package name */
    public T f28633a = new T();

    /* renamed from: b, reason: collision with root package name */
    public T f28634b = new T();

    /* renamed from: d, reason: collision with root package name */
    public long f28636d = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: f, reason: collision with root package name */
    public float f28638f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f28639g = -1.0f;

    public U(S s9) {
        this.i = s9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if ((r3 == 0 ? false : r0.f28453g[(int) ((r3 - 1) % 15)]) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6) {
        if (j6 == this.f28636d) {
            return;
        }
        this.f28640h++;
        this.f28633a.c(j6);
        if (this.f28633a.b()) {
            this.f28635c = false;
        } else if (this.f28636d != com.anythink.basead.exoplayer.b.f7168b) {
            if (this.f28635c) {
                T t6 = this.f28634b;
                long j9 = t6.f28450d;
            }
            this.f28634b.a();
            this.f28634b.c(this.f28636d);
            this.f28635c = true;
            this.f28634b.c(j6);
        }
        if (this.f28635c && this.f28634b.b()) {
            T t9 = this.f28633a;
            this.f28633a = this.f28634b;
            this.f28634b = t9;
            this.f28635c = false;
        }
        this.f28636d = j6;
        this.f28637e = this.f28633a.b() ? 0 : this.f28637e + 1;
        c();
    }

    public final long b() {
        if (!this.f28633a.b()) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        T t6 = this.f28633a;
        long j6 = t6.f28451e;
        if (j6 == 0) {
            return 0L;
        }
        return t6.f28452f / j6;
    }

    public final void c() {
        float f2;
        boolean b9 = this.f28633a.b();
        if (b9) {
            f2 = (float) (1.0E9d / (this.f28633a.f28451e != 0 ? r1.f28452f / r2 : 0L));
        } else {
            f2 = this.f28638f;
        }
        float f9 = this.f28639g;
        if (f2 == f9) {
            return;
        }
        if (f2 != -1.0f && f9 != -1.0f) {
            float f10 = 1.0f;
            if (b9 && this.f28633a.f28452f >= 5000000000L) {
                f10 = 0.1f;
            }
            if (Math.abs(f2 - f9) < f10) {
                return;
            }
        } else if (f2 == -1.0f && this.f28637e < 30) {
            return;
        }
        this.f28639g = f2;
        this.i.j(f2);
    }
}
