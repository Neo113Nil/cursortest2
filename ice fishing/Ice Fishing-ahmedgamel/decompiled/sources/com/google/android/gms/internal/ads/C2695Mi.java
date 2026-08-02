package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2695Mi {

    /* renamed from: a, reason: collision with root package name */
    public final int f27094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27095b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27096c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27097d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27100g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27101h;
    public final InterfaceC2491Ai i;

    /* renamed from: j, reason: collision with root package name */
    public int f27102j;

    /* renamed from: k, reason: collision with root package name */
    public int f27103k;

    /* renamed from: l, reason: collision with root package name */
    public int f27104l;

    /* renamed from: m, reason: collision with root package name */
    public int f27105m;

    /* renamed from: n, reason: collision with root package name */
    public int f27106n;

    /* renamed from: o, reason: collision with root package name */
    public int f27107o;

    /* renamed from: p, reason: collision with root package name */
    public int f27108p;

    /* renamed from: q, reason: collision with root package name */
    public double f27109q;

    public C2695Mi(int i, int i4, float f2, float f9, int i6, boolean z6) {
        this.f27094a = i;
        this.f27095b = i4;
        this.f27096c = f2;
        this.f27097d = f9;
        this.f27098e = i / i6;
        this.f27099f = i / 400;
        int i9 = i / 65;
        this.f27100g = i9;
        this.f27101h = i9 + i9;
        this.i = z6 ? new C4085vi(this) : new J0.b(this);
    }

    public final void a(int i, int i4) {
        InterfaceC2491Ai interfaceC2491Ai = this.i;
        interfaceC2491Ai.t(i4);
        Object w3 = interfaceC2491Ai.w();
        Object m9 = interfaceC2491Ai.m();
        int i6 = this.f27103k;
        int i9 = this.f27095b;
        System.arraycopy(w3, i * i9, m9, i6 * i9, i4 * i9);
        this.f27103k += i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        float f2;
        int i4;
        double d9;
        int i6;
        int i9;
        int i10;
        int i11;
        float f9;
        int i12;
        int i13;
        long j6;
        long j9;
        float f10 = this.f27096c;
        float f11 = this.f27097d;
        double d10 = f10 / f11;
        int i14 = this.f27103k;
        int i15 = this.f27094a;
        int i16 = this.f27095b;
        InterfaceC2491Ai interfaceC2491Ai = this.i;
        int i17 = 1;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i18 = this.f27102j;
            int i19 = this.f27101h;
            if (i18 >= i19) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f27107o;
                    if (i21 > 0) {
                        int min = Math.min(i19, i21);
                        a(i20, min);
                        this.f27107o -= min;
                        i20 += min;
                        f2 = f11;
                        d9 = d10;
                        i6 = i19;
                    } else {
                        int i22 = i15 > 4000 ? i15 / 4000 : i17;
                        int i23 = this.f27100g;
                        int i24 = this.f27099f;
                        if (i16 != i17) {
                            i = i16;
                        } else if (i22 == i17) {
                            i4 = interfaceC2491Ai.d(i20, i24, i23);
                            f2 = f11;
                            i = i17;
                            int i25 = !interfaceC2491Ai.i() ? this.f27108p : i4;
                            int i26 = i20 + i25;
                            interfaceC2491Ai.n();
                            this.f27108p = i4;
                            double d11 = i25;
                            if (d10 <= 1.0d) {
                                double d12 = d10 - 1.0d;
                                if (d10 >= 2.0d) {
                                    d9 = d10;
                                    int i27 = i25;
                                    double d13 = (d11 / d12) + this.f27109q;
                                    i11 = (int) Math.round(d13);
                                    i10 = i27;
                                    this.f27109q = d13 - i11;
                                } else {
                                    i10 = i25;
                                    d9 = d10;
                                    double d14 = ((d11 * (2.0d - d9)) / d12) + this.f27109q;
                                    int round = (int) Math.round(d14);
                                    this.f27107o = round;
                                    this.f27109q = d14 - round;
                                    i11 = i10;
                                }
                                interfaceC2491Ai.t(i11);
                                int i28 = i19;
                                int i29 = i11;
                                interfaceC2491Ai.g(i29, i, this.f27103k, i20, i26);
                                this.f27103k += i29;
                                i6 = i28;
                                i20 = i10 + i29 + i20;
                            } else {
                                int i30 = i25;
                                d9 = d10;
                                int i31 = i19;
                                double d15 = 1.0d - d9;
                                if (d9 < 0.5d) {
                                    i6 = i31;
                                    double d16 = ((d11 * d9) / d15) + this.f27109q;
                                    int round2 = (int) Math.round(d16);
                                    this.f27109q = d16 - round2;
                                    i9 = round2;
                                } else {
                                    i6 = i31;
                                    double d17 = ((d11 * ((d9 + d9) - 1.0d)) / d15) + this.f27109q;
                                    int round3 = (int) Math.round(d17);
                                    this.f27107o = round3;
                                    this.f27109q = d17 - round3;
                                    i9 = i30;
                                }
                                int i32 = i30 + i9;
                                interfaceC2491Ai.t(i32);
                                System.arraycopy(interfaceC2491Ai.w(), i20 * i, interfaceC2491Ai.m(), this.f27103k * i, i30 * i);
                                int i33 = i20;
                                interfaceC2491Ai.g(i9, i, this.f27103k + i30, i26, i33);
                                this.f27103k += i32;
                                i20 = i33 + i9;
                            }
                        } else {
                            i = i17;
                        }
                        interfaceC2491Ai.j(i20, i22);
                        f2 = f11;
                        int o4 = interfaceC2491Ai.o(i24 / i22, i23 / i22);
                        if (i22 != 1) {
                            int i34 = o4 * i22;
                            int i35 = i22 * 4;
                            int i36 = i34 - i35;
                            if (i36 >= i24) {
                                i24 = i36;
                            }
                            int i37 = i34 + i35;
                            if (i37 <= i23) {
                                i23 = i37;
                            }
                            if (i == 1) {
                                i4 = interfaceC2491Ai.d(i20, i24, i23);
                            } else {
                                interfaceC2491Ai.j(i20, 1);
                                i4 = interfaceC2491Ai.o(i24, i23);
                            }
                        } else {
                            i4 = o4;
                        }
                        if (!interfaceC2491Ai.i()) {
                        }
                        int i262 = i20 + i25;
                        interfaceC2491Ai.n();
                        this.f27108p = i4;
                        double d112 = i25;
                        if (d10 <= 1.0d) {
                        }
                    }
                    if (i20 + i6 > i18) {
                        break;
                    }
                    f11 = f2;
                    i19 = i6;
                    d10 = d9;
                    i17 = 1;
                }
                int i38 = this.f27102j - i20;
                System.arraycopy(interfaceC2491Ai.w(), i20 * i16, interfaceC2491Ai.w(), 0, i38 * i16);
                this.f27102j = i38;
                f9 = this.f27098e * f2;
                if (f9 != 1.0f || this.f27103k == i14) {
                }
                long j10 = (long) (i15 / f9);
                long j11 = i15;
                while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
                    j10 /= 2;
                    j11 /= 2;
                }
                int i39 = this.f27103k - i14;
                interfaceC2491Ai.f(i39);
                System.arraycopy(interfaceC2491Ai.m(), i14 * i16, interfaceC2491Ai.r(), this.f27104l * i16, i39 * i16);
                this.f27103k = i14;
                this.f27104l += i39;
                int i40 = 0;
                while (true) {
                    i12 = this.f27104l - 1;
                    if (i40 >= i12) {
                        break;
                    }
                    while (true) {
                        i13 = this.f27105m + 1;
                        j6 = i13;
                        long j12 = j6 * j10;
                        j9 = this.f27106n;
                        if (j12 <= j9 * j11) {
                            break;
                        }
                        interfaceC2491Ai.t(1);
                        interfaceC2491Ai.e(i40, j11, j10);
                        this.f27106n++;
                        this.f27103k++;
                    }
                    this.f27105m = i13;
                    if (j6 == j11) {
                        this.f27105m = 0;
                        AbstractC2792Sd.H(j9 == j10);
                        this.f27106n = 0;
                    }
                    i40++;
                }
                if (i12 != 0) {
                    System.arraycopy(interfaceC2491Ai.r(), i12 * i16, interfaceC2491Ai.r(), 0, (this.f27104l - i12) * i16);
                    this.f27104l -= i12;
                    return;
                }
                return;
            }
        } else {
            a(0, this.f27102j);
            this.f27102j = 0;
        }
        f2 = f11;
        f9 = this.f27098e * f2;
        if (f9 != 1.0f) {
        }
    }
}
