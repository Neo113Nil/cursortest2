package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f24790a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24791b = new Cr(32);

    /* renamed from: c, reason: collision with root package name */
    public int f24792c;

    /* renamed from: d, reason: collision with root package name */
    public int f24793d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24794e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24795f;

    public C4(B4 b42) {
        this.f24790a = b42;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, Cr cr) {
        int i4 = i & 1;
        int K7 = i4 != 0 ? cr.f24998b + cr.K() : -1;
        if (this.f24795f) {
            if (i4 == 0) {
                return;
            }
            this.f24795f = false;
            cr.E(K7);
            this.f24793d = 0;
        }
        while (cr.B() > 0) {
            int i6 = this.f24793d;
            Cr cr2 = this.f24791b;
            if (i6 < 3) {
                if (i6 == 0) {
                    int K8 = cr.K();
                    cr.E(cr.f24998b - 1);
                    if (K8 == 255) {
                        this.f24795f = true;
                        return;
                    }
                }
                int min = Math.min(cr.B(), 3 - this.f24793d);
                cr.H(cr2.f24997a, this.f24793d, min);
                int i9 = this.f24793d + min;
                this.f24793d = i9;
                if (i9 == 3) {
                    cr2.E(0);
                    cr2.C(3);
                    cr2.G(1);
                    int K9 = cr2.K();
                    boolean z6 = (K9 & 128) != 0;
                    int K10 = cr2.K();
                    this.f24794e = z6;
                    int i10 = (((K9 & 15) << 8) | K10) + 3;
                    this.f24792c = i10;
                    byte[] bArr = cr2.f24997a;
                    if (bArr.length < i10) {
                        int length = bArr.length;
                        cr2.A(Math.min(4098, Math.max(i10, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(cr.B(), this.f24792c - this.f24793d);
                cr.H(cr2.f24997a, this.f24793d, min2);
                int i11 = this.f24793d + min2;
                this.f24793d = i11;
                int i12 = this.f24792c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f24794e) {
                        cr2.C(i12);
                    } else {
                        if (AbstractC3182eu.h(0, i12, -1, cr2.f24997a) != 0) {
                            this.f24795f = true;
                            return;
                        }
                        cr2.C(this.f24792c - 4);
                    }
                    cr2.E(0);
                    this.f24790a.g(cr2);
                    this.f24793d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void b(Dt dt, S0 s02, F4 f42) {
        this.f24790a.b(dt, s02, f42);
        this.f24795f = true;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void f() {
        this.f24795f = true;
    }
}
