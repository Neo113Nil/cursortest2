package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f24027a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24028b = new Cr(32);

    /* renamed from: c, reason: collision with root package name */
    public int f24029c;

    /* renamed from: d, reason: collision with root package name */
    public int f24030d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24032f;

    public C4(B4 b42) {
        this.f24027a = b42;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, Cr cr) {
        int i6 = i & 1;
        int K7 = i6 != 0 ? cr.f24253b + cr.K() : -1;
        if (this.f24032f) {
            if (i6 == 0) {
                return;
            }
            this.f24032f = false;
            cr.E(K7);
            this.f24030d = 0;
        }
        while (cr.B() > 0) {
            int i9 = this.f24030d;
            Cr cr2 = this.f24028b;
            if (i9 < 3) {
                if (i9 == 0) {
                    int K8 = cr.K();
                    cr.E(cr.f24253b - 1);
                    if (K8 == 255) {
                        this.f24032f = true;
                        return;
                    }
                }
                int min = Math.min(cr.B(), 3 - this.f24030d);
                cr.H(cr2.f24252a, this.f24030d, min);
                int i10 = this.f24030d + min;
                this.f24030d = i10;
                if (i10 == 3) {
                    cr2.E(0);
                    cr2.C(3);
                    cr2.G(1);
                    int K9 = cr2.K();
                    boolean z3 = (K9 & 128) != 0;
                    int K10 = cr2.K();
                    this.f24031e = z3;
                    int i11 = (((K9 & 15) << 8) | K10) + 3;
                    this.f24029c = i11;
                    byte[] bArr = cr2.f24252a;
                    if (bArr.length < i11) {
                        int length = bArr.length;
                        cr2.A(Math.min(4098, Math.max(i11, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(cr.B(), this.f24029c - this.f24030d);
                cr.H(cr2.f24252a, this.f24030d, min2);
                int i12 = this.f24030d + min2;
                this.f24030d = i12;
                int i13 = this.f24029c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.f24031e) {
                        cr2.C(i13);
                    } else {
                        if (AbstractC3159eu.h(0, i13, -1, cr2.f24252a) != 0) {
                            this.f24032f = true;
                            return;
                        }
                        cr2.C(this.f24029c - 4);
                    }
                    cr2.E(0);
                    this.f24027a.g(cr2);
                    this.f24030d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void b(Dt dt, S0 s02, F4 f42) {
        this.f24027a.b(dt, s02, f42);
        this.f24032f = true;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void f() {
        this.f24032f = true;
    }
}
