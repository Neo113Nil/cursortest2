package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25480a;

    /* renamed from: b, reason: collision with root package name */
    public int f25481b;

    /* renamed from: c, reason: collision with root package name */
    public int f25482c;

    /* renamed from: d, reason: collision with root package name */
    public long f25483d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25484e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f25485f;

    /* renamed from: g, reason: collision with root package name */
    public final Cr f25486g;

    /* renamed from: h, reason: collision with root package name */
    public int f25487h;
    public int i;

    public F2(Cr cr, Cr cr2, boolean z6) {
        this.f25486g = cr;
        this.f25485f = cr2;
        this.f25484e = z6;
        cr2.E(12);
        this.f25480a = cr2.h();
        cr.E(12);
        this.i = cr.h();
        MA.k("first_chunk must be 1", cr.b() == 1);
        this.f25481b = -1;
    }

    public final boolean a() {
        int i = this.f25481b + 1;
        this.f25481b = i;
        if (i == this.f25480a) {
            return false;
        }
        boolean z6 = this.f25484e;
        Cr cr = this.f25485f;
        this.f25483d = z6 ? cr.j() : cr.P();
        if (this.f25481b == this.f25487h) {
            Cr cr2 = this.f25486g;
            this.f25482c = cr2.h();
            cr2.G(4);
            int i4 = this.i - 1;
            this.i = i4;
            this.f25487h = i4 > 0 ? (-1) + cr2.h() : -1;
        }
        return true;
    }
}
