package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2675Mi {

    /* renamed from: a, reason: collision with root package name */
    public final int f26305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26306b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26308d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26310f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26311g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26312h;
    public final InterfaceC2471Ai i;

    /* renamed from: j, reason: collision with root package name */
    public int f26313j;

    /* renamed from: k, reason: collision with root package name */
    public int f26314k;

    /* renamed from: l, reason: collision with root package name */
    public int f26315l;

    /* renamed from: m, reason: collision with root package name */
    public int f26316m;

    /* renamed from: n, reason: collision with root package name */
    public int f26317n;

    /* renamed from: o, reason: collision with root package name */
    public int f26318o;

    /* renamed from: p, reason: collision with root package name */
    public int f26319p;

    /* renamed from: q, reason: collision with root package name */
    public double f26320q;

    public C2675Mi(int i, int i6, float f3, float f9, int i9, boolean z3) {
        this.f26305a = i;
        this.f26306b = i6;
        this.f26307c = f3;
        this.f26308d = f9;
        this.f26309e = i / i9;
        this.f26310f = i / 400;
        int i10 = i / 65;
        this.f26311g = i10;
        this.f26312h = i10 + i10;
        this.i = z3 ? new C4062vi(this) : new J0.b(this);
    }

    public final void a(int i, int i6) {
        InterfaceC2471Ai interfaceC2471Ai = this.i;
        interfaceC2471Ai.t(i6);
        Object w6 = interfaceC2471Ai.w();
        Object m4 = interfaceC2471Ai.m();
        int i9 = this.f26314k;
        int i10 = this.f26306b;
        System.arraycopy(w6, i * i10, m4, i9 * i10, i6 * i10);
        this.f26314k += i6;
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
        float f3;
        int i6;
        double d2;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        long j6;
        long j9;
        float f10 = this.f26307c;
        float f11 = this.f26308d;
        double d9 = f10 / f11;
        int i15 = this.f26314k;
        int i16 = this.f26305a;
        int i17 = this.f26306b;
        InterfaceC2471Ai interfaceC2471Ai = this.i;
        int i18 = 1;
        if (d9 > 1.0000100135803223d || d9 < 0.9999899864196777d) {
            int i19 = this.f26313j;
            int i20 = this.f26312h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f26318o;
                    if (i22 > 0) {
                        int min = Math.min(i20, i22);
                        a(i21, min);
                        this.f26318o -= min;
                        i21 += min;
                        f3 = f11;
                        d2 = d9;
                        i9 = i20;
                    } else {
                        int i23 = i16 > 4000 ? i16 / 4000 : i18;
                        int i24 = this.f26311g;
                        int i25 = this.f26310f;
                        if (i17 != i18) {
                            i = i17;
                        } else if (i23 == i18) {
                            i6 = interfaceC2471Ai.d(i21, i25, i24);
                            f3 = f11;
                            i = i18;
                            int i26 = !interfaceC2471Ai.i() ? this.f26319p : i6;
                            int i27 = i21 + i26;
                            interfaceC2471Ai.n();
                            this.f26319p = i6;
                            double d10 = i26;
                            if (d9 <= 1.0d) {
                                double d11 = d9 - 1.0d;
                                if (d9 >= 2.0d) {
                                    d2 = d9;
                                    int i28 = i26;
                                    double d12 = (d10 / d11) + this.f26320q;
                                    i12 = (int) Math.round(d12);
                                    i11 = i28;
                                    this.f26320q = d12 - i12;
                                } else {
                                    i11 = i26;
                                    d2 = d9;
                                    double d13 = ((d10 * (2.0d - d2)) / d11) + this.f26320q;
                                    int round = (int) Math.round(d13);
                                    this.f26318o = round;
                                    this.f26320q = d13 - round;
                                    i12 = i11;
                                }
                                interfaceC2471Ai.t(i12);
                                int i29 = i20;
                                int i30 = i12;
                                interfaceC2471Ai.g(i30, i, this.f26314k, i21, i27);
                                this.f26314k += i30;
                                i9 = i29;
                                i21 = i11 + i30 + i21;
                            } else {
                                int i31 = i26;
                                d2 = d9;
                                int i32 = i20;
                                double d14 = 1.0d - d2;
                                if (d2 < 0.5d) {
                                    i9 = i32;
                                    double d15 = ((d10 * d2) / d14) + this.f26320q;
                                    int round2 = (int) Math.round(d15);
                                    this.f26320q = d15 - round2;
                                    i10 = round2;
                                } else {
                                    i9 = i32;
                                    double d16 = ((d10 * ((d2 + d2) - 1.0d)) / d14) + this.f26320q;
                                    int round3 = (int) Math.round(d16);
                                    this.f26318o = round3;
                                    this.f26320q = d16 - round3;
                                    i10 = i31;
                                }
                                int i33 = i31 + i10;
                                interfaceC2471Ai.t(i33);
                                System.arraycopy(interfaceC2471Ai.w(), i21 * i, interfaceC2471Ai.m(), this.f26314k * i, i31 * i);
                                int i34 = i21;
                                interfaceC2471Ai.g(i10, i, this.f26314k + i31, i27, i34);
                                this.f26314k += i33;
                                i21 = i34 + i10;
                            }
                        } else {
                            i = i18;
                        }
                        interfaceC2471Ai.j(i21, i23);
                        f3 = f11;
                        int o6 = interfaceC2471Ai.o(i25 / i23, i24 / i23);
                        if (i23 != 1) {
                            int i35 = o6 * i23;
                            int i36 = i23 * 4;
                            int i37 = i35 - i36;
                            if (i37 >= i25) {
                                i25 = i37;
                            }
                            int i38 = i35 + i36;
                            if (i38 <= i24) {
                                i24 = i38;
                            }
                            if (i == 1) {
                                i6 = interfaceC2471Ai.d(i21, i25, i24);
                            } else {
                                interfaceC2471Ai.j(i21, 1);
                                i6 = interfaceC2471Ai.o(i25, i24);
                            }
                        } else {
                            i6 = o6;
                        }
                        if (!interfaceC2471Ai.i()) {
                        }
                        int i272 = i21 + i26;
                        interfaceC2471Ai.n();
                        this.f26319p = i6;
                        double d102 = i26;
                        if (d9 <= 1.0d) {
                        }
                    }
                    if (i21 + i9 > i19) {
                        break;
                    }
                    f11 = f3;
                    i20 = i9;
                    d9 = d2;
                    i18 = 1;
                }
                int i39 = this.f26313j - i21;
                System.arraycopy(interfaceC2471Ai.w(), i21 * i17, interfaceC2471Ai.w(), 0, i39 * i17);
                this.f26313j = i39;
                f9 = this.f26309e * f3;
                if (f9 != 1.0f || this.f26314k == i15) {
                }
                long j10 = (long) (i16 / f9);
                long j11 = i16;
                while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
                    j10 /= 2;
                    j11 /= 2;
                }
                int i40 = this.f26314k - i15;
                interfaceC2471Ai.f(i40);
                System.arraycopy(interfaceC2471Ai.m(), i15 * i17, interfaceC2471Ai.r(), this.f26315l * i17, i40 * i17);
                this.f26314k = i15;
                this.f26315l += i40;
                int i41 = 0;
                while (true) {
                    i13 = this.f26315l - 1;
                    if (i41 >= i13) {
                        break;
                    }
                    while (true) {
                        i14 = this.f26316m + 1;
                        j6 = i14;
                        long j12 = j6 * j10;
                        j9 = this.f26317n;
                        if (j12 <= j9 * j11) {
                            break;
                        }
                        interfaceC2471Ai.t(1);
                        interfaceC2471Ai.e(i41, j11, j10);
                        this.f26317n++;
                        this.f26314k++;
                    }
                    this.f26316m = i14;
                    if (j6 == j11) {
                        this.f26316m = 0;
                        AbstractC2772Sd.H(j9 == j10);
                        this.f26317n = 0;
                    }
                    i41++;
                }
                if (i13 != 0) {
                    System.arraycopy(interfaceC2471Ai.r(), i13 * i17, interfaceC2471Ai.r(), 0, (this.f26315l - i13) * i17);
                    this.f26315l -= i13;
                    return;
                }
                return;
            }
        } else {
            a(0, this.f26313j);
            this.f26313j = 0;
        }
        f3 = f11;
        f9 = this.f26309e * f3;
        if (f9 != 1.0f) {
        }
    }
}
