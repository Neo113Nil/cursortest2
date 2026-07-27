package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24724a;

    /* renamed from: b, reason: collision with root package name */
    public int f24725b;

    /* renamed from: c, reason: collision with root package name */
    public int f24726c;

    /* renamed from: d, reason: collision with root package name */
    public long f24727d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24728e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f24729f;

    /* renamed from: g, reason: collision with root package name */
    public final Cr f24730g;

    /* renamed from: h, reason: collision with root package name */
    public int f24731h;
    public int i;

    public F2(Cr cr, Cr cr2, boolean z3) {
        this.f24730g = cr;
        this.f24729f = cr2;
        this.f24728e = z3;
        cr2.E(12);
        this.f24724a = cr2.h();
        cr.E(12);
        this.i = cr.h();
        MA.k("first_chunk must be 1", cr.b() == 1);
        this.f24725b = -1;
    }

    public final boolean a() {
        int i = this.f24725b + 1;
        this.f24725b = i;
        if (i == this.f24724a) {
            return false;
        }
        boolean z3 = this.f24728e;
        Cr cr = this.f24729f;
        this.f24727d = z3 ? cr.j() : cr.P();
        if (this.f24725b == this.f24731h) {
            Cr cr2 = this.f24730g;
            this.f24726c = cr2.h();
            cr2.G(4);
            int i6 = this.i - 1;
            this.i = i6;
            this.f24731h = i6 > 0 ? (-1) + cr2.h() : -1;
        }
        return true;
    }
}
