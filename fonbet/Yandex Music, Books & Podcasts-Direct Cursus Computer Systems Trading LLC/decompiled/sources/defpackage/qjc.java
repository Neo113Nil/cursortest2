package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class qjc extends kiu {
    public aa6[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList a1 = new ArrayList();
    public aa6[] b1 = null;
    public aa6[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06be  */
    @Override // defpackage.kiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        aa6[] aa6VarArr;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        ojc ojcVar;
        char c;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj;
        aa6 aa6Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.v0;
        z96 z96Var = z96.c;
        z96 z96Var2 = z96.b;
        if (i20 > 0) {
            aa6 aa6Var2 = this.V;
            awm awmVar = aa6Var2 != null ? ((ba6) aa6Var2).y0 : null;
            if (awmVar == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i21 = 0; i21 < this.v0; i21++) {
                aa6 aa6Var3 = this.u0[i21];
                if (aa6Var3 != null && !(aa6Var3 instanceof grd)) {
                    z96 k = aa6Var3.k(0);
                    z96 k2 = aa6Var3.k(1);
                    if (k != z96Var || aa6Var3.r == 1 || k2 != z96Var || aa6Var3.s == 1) {
                        if (k == z96Var) {
                            k = z96Var2;
                        }
                        if (k2 == z96Var) {
                            k2 = z96Var2;
                        }
                        fv2 fv2Var = this.F0;
                        fv2Var.a = k;
                        fv2Var.b = k2;
                        fv2Var.c = aa6Var3.r();
                        fv2Var.d = aa6Var3.l();
                        awmVar.d(aa6Var3, fv2Var);
                        aa6Var3.P(fv2Var.e);
                        aa6Var3.M(fv2Var.f);
                        aa6Var3.J(fv2Var.g);
                    }
                }
            }
        }
        int i22 = this.A0;
        int i23 = this.B0;
        int i24 = this.w0;
        int i25 = this.x0;
        int[] iArr2 = new int[2];
        int i26 = (i2 - i22) - i23;
        int i27 = this.Z0;
        if (i27 == 1) {
            i26 = (i4 - i24) - i25;
        }
        int i28 = i26;
        int i29 = this.H0;
        if (i27 == 0) {
            if (i29 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (i29 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        aa6[] aa6VarArr2 = this.u0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i5 = this.v0;
            i6 = i22;
            if (i30 >= i5) {
                break;
            }
            if (this.u0[i30].i0 == 8) {
                i31++;
            }
            i30++;
            i22 = i6;
        }
        if (i31 > 0) {
            aa6[] aa6VarArr3 = new aa6[i5 - i31];
            int i33 = 0;
            int i34 = 0;
            while (i33 < this.v0) {
                aa6 aa6Var4 = this.u0[i33];
                aa6[] aa6VarArr4 = aa6VarArr3;
                if (aa6Var4.i0 != 8) {
                    aa6VarArr4[i34] = aa6Var4;
                    i34++;
                }
                i33++;
                aa6VarArr3 = aa6VarArr4;
            }
            i5 = i34;
            aa6VarArr = aa6VarArr3;
        } else {
            aa6VarArr = aa6VarArr2;
        }
        this.e1 = aa6VarArr;
        this.f1 = i5;
        int i35 = this.X0;
        ArrayList arrayList = this.a1;
        if (i35 == 0) {
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
            int i36 = this.Z0;
            if (i5 != 0) {
                if (arrayList.size() == 0) {
                    ojcVar = new ojc(this, i36, this.J, this.K, this.L, this.M, i28);
                    arrayList.add(ojcVar);
                } else {
                    ojc ojcVar2 = (ojc) arrayList.get(0);
                    ojcVar2.c = 0;
                    ojcVar2.b = null;
                    ojcVar2.l = 0;
                    ojcVar2.m = 0;
                    ojcVar2.n = 0;
                    ojcVar2.o = 0;
                    ojcVar2.p = 0;
                    ojcVar2.f(i36, this.J, this.K, this.L, this.M, this.A0, this.w0, this.B0, this.x0, i28);
                    ojcVar = ojcVar2;
                }
                for (int i37 = 0; i37 < i5; i37++) {
                    ojcVar.a(aa6VarArr[i37]);
                }
                i32 = 0;
                iArr[0] = ojcVar.d();
                c = 1;
                iArr[1] = ojcVar.c();
                int i38 = iArr[i32] + i10 + i7;
                int i39 = iArr[c] + i8 + i9;
                if (i != 1073741824) {
                }
                i11 = i3;
                if (i11 == 1073741824) {
                }
                this.D0 = i38;
                this.E0 = i39;
                P(i38);
                M(i39);
                this.C0 = this.v0 > 0 ? c : i32;
            }
            c = 1;
            int i382 = iArr[i32] + i10 + i7;
            int i392 = iArr[c] + i8 + i9;
            if (i != 1073741824) {
            }
            i11 = i3;
            if (i11 == 1073741824) {
            }
            this.D0 = i382;
            this.E0 = i392;
            P(i382);
            M(i392);
            this.C0 = this.v0 > 0 ? c : i32;
        }
        o86 o86Var = this.K;
        o86 o86Var2 = this.J;
        o86 o86Var3 = this.L;
        o86 o86Var4 = this.M;
        if (i35 == 1) {
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
            int i40 = this.Z0;
            if (i5 != 0) {
                arrayList.clear();
                ojc ojcVar3 = new ojc(this, i40, this.J, this.K, this.L, this.M, i28);
                arrayList.add(ojcVar3);
                if (i40 == 0) {
                    i12 = 0;
                    int i41 = 0;
                    int i42 = 0;
                    while (i42 < i5) {
                        aa6 aa6Var5 = aa6VarArr[i42];
                        int Y = Y(aa6Var5, i28);
                        if (aa6Var5.U[0] == z96Var) {
                            i12++;
                        }
                        int i43 = i12;
                        boolean z = (i41 == i28 || (this.T0 + i41) + Y > i28) && ojcVar3.b != null;
                        if (!z && i42 > 0 && (i14 = this.Y0) > 0 && i42 % i14 == 0) {
                            z = true;
                        }
                        if (z) {
                            ojcVar3 = new ojc(this, i40, this.J, this.K, this.L, this.M, i28);
                            ojcVar3.n = i42;
                            arrayList.add(ojcVar3);
                        } else if (i42 > 0) {
                            i41 = this.T0 + Y + i41;
                            ojcVar3.a(aa6Var5);
                            i42++;
                            i12 = i43;
                        }
                        i41 = Y;
                        ojcVar3.a(aa6Var5);
                        i42++;
                        i12 = i43;
                    }
                } else {
                    i12 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i45 < i5) {
                        aa6 aa6Var6 = aa6VarArr[i45];
                        int X = X(aa6Var6, i28);
                        if (aa6Var6.U[1] == z96Var) {
                            i12++;
                        }
                        int i46 = i12;
                        boolean z2 = (i44 == i28 || (this.U0 + i44) + X > i28) && ojcVar3.b != null;
                        if (!z2 && i45 > 0 && (i13 = this.Y0) > 0 && i45 % i13 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            ojcVar3 = new ojc(this, i40, this.J, this.K, this.L, this.M, i28);
                            ojcVar3.n = i45;
                            arrayList.add(ojcVar3);
                        } else if (i45 > 0) {
                            i44 = this.U0 + X + i44;
                            ojcVar3.a(aa6Var6);
                            i45++;
                            i12 = i46;
                        }
                        i44 = X;
                        ojcVar3.a(aa6Var6);
                        i45++;
                        i12 = i46;
                    }
                }
                int size = arrayList.size();
                int i47 = this.A0;
                int i48 = this.w0;
                int i49 = this.B0;
                int i50 = this.x0;
                z96[] z96VarArr = this.U;
                boolean z3 = z96VarArr[0] == z96Var2 || z96VarArr[1] == z96Var2;
                if (i12 > 0 && z3) {
                    for (int i51 = 0; i51 < size; i51++) {
                        ojc ojcVar4 = (ojc) arrayList.get(i51);
                        if (i40 == 0) {
                            ojcVar4.e(i28 - ojcVar4.d());
                        } else {
                            ojcVar4.e(i28 - ojcVar4.c());
                        }
                    }
                }
                int i52 = i47;
                int i53 = i48;
                int i54 = i49;
                int i55 = i50;
                o86 o86Var5 = o86Var;
                o86 o86Var6 = o86Var2;
                int i56 = 0;
                int i57 = 0;
                o86 o86Var7 = o86Var3;
                o86 o86Var8 = o86Var4;
                for (int i58 = 0; i58 < size; i58++) {
                    ojc ojcVar5 = (ojc) arrayList.get(i58);
                    if (i40 == 0) {
                        if (i58 < size - 1) {
                            o86Var8 = ((ojc) arrayList.get(i58 + 1)).b.K;
                            i55 = 0;
                        } else {
                            i55 = this.x0;
                            o86Var8 = o86Var4;
                        }
                        o86 o86Var9 = ojcVar5.b.M;
                        ojcVar5.f(i40, o86Var6, o86Var5, o86Var7, o86Var8, i52, i53, i54, i55, i28);
                        i56 = Math.max(i56, ojcVar5.d());
                        int c2 = ojcVar5.c() + i57;
                        if (i58 > 0) {
                            c2 += this.U0;
                        }
                        i57 = c2;
                        o86Var5 = o86Var9;
                        i53 = 0;
                    } else {
                        if (i58 < size - 1) {
                            o86Var7 = ((ojc) arrayList.get(i58 + 1)).b.J;
                            i54 = 0;
                        } else {
                            i54 = this.B0;
                            o86Var7 = o86Var3;
                        }
                        o86 o86Var10 = ojcVar5.b.L;
                        ojcVar5.f(i40, o86Var6, o86Var5, o86Var7, o86Var8, i52, i53, i54, i55, i28);
                        int d = ojcVar5.d() + i56;
                        int max = Math.max(i57, ojcVar5.c());
                        if (i58 > 0) {
                            d += this.T0;
                        }
                        i57 = max;
                        i56 = d;
                        o86Var6 = o86Var10;
                        i52 = 0;
                    }
                }
                iArr[0] = i56;
                iArr[1] = i57;
            }
        } else {
            if (i35 == 2) {
                i7 = i23;
                i8 = i24;
                i9 = i25;
                iArr = iArr2;
                i10 = i6;
                int i59 = this.Z0;
                int i60 = this.Y0;
                if (i59 == 0) {
                    if (i60 <= 0) {
                        int i61 = 0;
                        i15 = 0;
                        for (int i62 = 0; i62 < i5; i62++) {
                            if (i62 > 0) {
                                i61 += this.T0;
                            }
                            aa6 aa6Var7 = aa6VarArr[i62];
                            if (aa6Var7 != null) {
                                int Y2 = Y(aa6Var7, i28) + i61;
                                if (Y2 > i28) {
                                    break;
                                }
                                i15++;
                                i61 = Y2;
                            }
                        }
                    } else {
                        i15 = i60;
                    }
                    i60 = 0;
                } else {
                    if (i60 <= 0) {
                        int i63 = 0;
                        int i64 = 0;
                        for (int i65 = 0; i65 < i5; i65++) {
                            if (i65 > 0) {
                                i63 += this.U0;
                            }
                            aa6 aa6Var8 = aa6VarArr[i65];
                            if (aa6Var8 != null) {
                                int X2 = X(aa6Var8, i28) + i63;
                                if (X2 > i28) {
                                    break;
                                }
                                i64++;
                                i63 = X2;
                            }
                        }
                        i60 = i64;
                    }
                    i15 = 0;
                }
                if (this.d1 == null) {
                    this.d1 = new int[2];
                }
                boolean z4 = (i60 == 0 && i59 == 1) || (i15 == 0 && i59 == 0);
                while (!z4) {
                    if (i59 == 0) {
                        i60 = (int) Math.ceil(i5 / i15);
                    } else {
                        i15 = (int) Math.ceil(i5 / i60);
                    }
                    aa6[] aa6VarArr5 = this.c1;
                    if (aa6VarArr5 == null || aa6VarArr5.length < i15) {
                        obj = null;
                        this.c1 = new aa6[i15];
                    } else {
                        obj = null;
                        Arrays.fill(aa6VarArr5, (Object) null);
                    }
                    aa6[] aa6VarArr6 = this.b1;
                    if (aa6VarArr6 == null || aa6VarArr6.length < i60) {
                        this.b1 = new aa6[i60];
                    } else {
                        Arrays.fill(aa6VarArr6, obj);
                    }
                    for (int i66 = 0; i66 < i15; i66++) {
                        for (int i67 = 0; i67 < i60; i67++) {
                            int i68 = (i67 * i15) + i66;
                            if (i59 == 1) {
                                i68 = (i66 * i60) + i67;
                            }
                            if (i68 < aa6VarArr.length && (aa6Var = aa6VarArr[i68]) != null) {
                                int Y3 = Y(aa6Var, i28);
                                aa6 aa6Var9 = this.c1[i66];
                                if (aa6Var9 == null || aa6Var9.r() < Y3) {
                                    this.c1[i66] = aa6Var;
                                }
                                int X3 = X(aa6Var, i28);
                                aa6 aa6Var10 = this.b1[i67];
                                if (aa6Var10 == null || aa6Var10.l() < X3) {
                                    this.b1[i67] = aa6Var;
                                }
                            }
                        }
                    }
                    int i69 = 0;
                    for (int i70 = 0; i70 < i15; i70++) {
                        aa6 aa6Var11 = this.c1[i70];
                        if (aa6Var11 != null) {
                            if (i70 > 0) {
                                i69 += this.T0;
                            }
                            i69 = Y(aa6Var11, i28) + i69;
                        }
                    }
                    int i71 = 0;
                    for (int i72 = 0; i72 < i60; i72++) {
                        aa6 aa6Var12 = this.b1[i72];
                        if (aa6Var12 != null) {
                            if (i72 > 0) {
                                i71 += this.U0;
                            }
                            i71 = X(aa6Var12, i28) + i71;
                        }
                    }
                    iArr[0] = i69;
                    iArr[1] = i71;
                    if (i59 == 0) {
                        if (i69 > i28 && i15 > 1) {
                            i15--;
                        }
                        z4 = true;
                    } else {
                        if (i71 > i28 && i60 > 1) {
                            i60--;
                        }
                        z4 = true;
                    }
                }
                int[] iArr3 = this.d1;
                iArr3[0] = i15;
                iArr3[1] = i60;
                c = 1;
                int i3822 = iArr[i32] + i10 + i7;
                int i3922 = iArr[c] + i8 + i9;
                if (i != 1073741824) {
                    i3822 = i2;
                } else {
                    if (i != Integer.MIN_VALUE) {
                        i11 = i3;
                        if (i != 0) {
                            i3822 = i32;
                        }
                        if (i11 == 1073741824) {
                            i3922 = i4;
                        } else if (i11 == Integer.MIN_VALUE) {
                            i3922 = Math.min(i3922, i4);
                        } else if (i11 != 0) {
                            i3922 = i32;
                        }
                        this.D0 = i3822;
                        this.E0 = i3922;
                        P(i3822);
                        M(i3922);
                        this.C0 = this.v0 > 0 ? c : i32;
                    }
                    i3822 = Math.min(i3822, i2);
                }
                i11 = i3;
                if (i11 == 1073741824) {
                }
                this.D0 = i3822;
                this.E0 = i3922;
                P(i3822);
                M(i3922);
                this.C0 = this.v0 > 0 ? c : i32;
            }
            if (i35 == 3) {
                int i73 = this.Z0;
                if (i5 != 0) {
                    arrayList.clear();
                    iArr = iArr2;
                    i9 = i25;
                    i10 = i6;
                    i7 = i23;
                    i8 = i24;
                    ojc ojcVar6 = new ojc(this, i73, this.J, this.K, this.L, this.M, i28);
                    arrayList.add(ojcVar6);
                    if (i73 == 0) {
                        int i74 = 0;
                        int i75 = 0;
                        i16 = 0;
                        int i76 = 0;
                        while (i74 < i5) {
                            i75++;
                            aa6 aa6Var13 = aa6VarArr[i74];
                            int Y4 = Y(aa6Var13, i28);
                            int i77 = i73;
                            if (aa6Var13.U[0] == z96Var) {
                                i16++;
                            }
                            int i78 = i16;
                            boolean z5 = (i76 == i28 || (this.T0 + i76) + Y4 > i28) && ojcVar6.b != null;
                            if (!z5 && i74 > 0 && (i19 = this.Y0) > 0 && i75 > i19) {
                                z5 = true;
                            }
                            if (z5) {
                                i18 = i74;
                                i73 = i77;
                                ojcVar6 = new ojc(this, i73, this.J, this.K, this.L, this.M, i28);
                                ojcVar6.n = i18;
                                arrayList.add(ojcVar6);
                                i76 = Y4;
                                i75 = 1;
                            } else {
                                i18 = i74;
                                i73 = i77;
                                i76 = i18 > 0 ? this.T0 + Y4 + i76 : Y4;
                            }
                            ojcVar6.a(aa6Var13);
                            i74 = i18 + 1;
                            i16 = i78;
                        }
                    } else {
                        int i79 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        int i82 = 0;
                        while (i82 < i5) {
                            i79++;
                            aa6 aa6Var14 = aa6VarArr[i82];
                            int X4 = X(aa6Var14, i28);
                            if (aa6Var14.U[1] == z96Var) {
                                i80++;
                            }
                            int i83 = i80;
                            boolean z6 = (i81 == i28 || (this.U0 + i81) + X4 > i28) && ojcVar6.b != null;
                            if (!z6 && i82 > 0 && (i17 = this.Y0) > 0 && i79 > i17) {
                                z6 = true;
                            }
                            if (z6) {
                                ojcVar6 = new ojc(this, i73, this.J, this.K, this.L, this.M, i28);
                                ojcVar6.n = i82;
                                arrayList.add(ojcVar6);
                                i81 = X4;
                                i79 = 1;
                            } else {
                                i81 = i82 > 0 ? this.U0 + X4 + i81 : X4;
                            }
                            ojcVar6.a(aa6Var14);
                            i82++;
                            i80 = i83;
                        }
                        i16 = i80;
                    }
                    int size2 = arrayList.size();
                    int i84 = this.A0;
                    int i85 = this.w0;
                    int i86 = this.B0;
                    int i87 = this.x0;
                    z96[] z96VarArr2 = this.U;
                    boolean z7 = z96VarArr2[0] == z96Var2 || z96VarArr2[1] == z96Var2;
                    if (i16 > 0 && z7) {
                        for (int i88 = 0; i88 < size2; i88++) {
                            ojc ojcVar7 = (ojc) arrayList.get(i88);
                            if (i73 == 0) {
                                ojcVar7.e(i28 - ojcVar7.d());
                            } else {
                                ojcVar7.e(i28 - ojcVar7.c());
                            }
                        }
                    }
                    int i89 = i84;
                    int i90 = i85;
                    int i91 = i86;
                    int i92 = i87;
                    o86 o86Var11 = o86Var;
                    o86 o86Var12 = o86Var2;
                    int i93 = 0;
                    int i94 = 0;
                    o86 o86Var13 = o86Var3;
                    o86 o86Var14 = o86Var4;
                    for (int i95 = 0; i95 < size2; i95++) {
                        ojc ojcVar8 = (ojc) arrayList.get(i95);
                        if (i73 == 0) {
                            if (i95 < size2 - 1) {
                                o86Var14 = ((ojc) arrayList.get(i95 + 1)).b.K;
                                i92 = 0;
                            } else {
                                i92 = this.x0;
                                o86Var14 = o86Var4;
                            }
                            o86 o86Var15 = ojcVar8.b.M;
                            ojcVar8.f(i73, o86Var12, o86Var11, o86Var13, o86Var14, i89, i90, i91, i92, i28);
                            i93 = Math.max(i93, ojcVar8.d());
                            int c3 = ojcVar8.c() + i94;
                            if (i95 > 0) {
                                c3 += this.U0;
                            }
                            i94 = c3;
                            o86Var11 = o86Var15;
                            i90 = 0;
                        } else {
                            if (i95 < size2 - 1) {
                                o86Var13 = ((ojc) arrayList.get(i95 + 1)).b.J;
                                i91 = 0;
                            } else {
                                i91 = this.B0;
                                o86Var13 = o86Var3;
                            }
                            o86 o86Var16 = ojcVar8.b.L;
                            ojcVar8.f(i73, o86Var12, o86Var11, o86Var13, o86Var14, i89, i90, i91, i92, i28);
                            int d2 = ojcVar8.d() + i93;
                            int max2 = Math.max(i94, ojcVar8.c());
                            if (i95 > 0) {
                                d2 += this.T0;
                            }
                            i94 = max2;
                            i93 = d2;
                            o86Var12 = o86Var16;
                            i89 = 0;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i94;
                }
            }
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
        }
        c = 1;
        int i38222 = iArr[i32] + i10 + i7;
        int i39222 = iArr[c] + i8 + i9;
        if (i != 1073741824) {
        }
        i11 = i3;
        if (i11 == 1073741824) {
        }
        this.D0 = i38222;
        this.E0 = i39222;
        P(i38222);
        M(i39222);
        this.C0 = this.v0 > 0 ? c : i32;
    }

    public final int X(aa6 aa6Var, int i) {
        aa6 aa6Var2;
        if (aa6Var == null) {
            return 0;
        }
        if (aa6Var.U[1] == z96.c) {
            int i2 = aa6Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (aa6Var.z * i);
                if (i3 != aa6Var.l()) {
                    aa6Var.g = true;
                    W(aa6Var, aa6Var.U[0], aa6Var.r(), z96.a, i3);
                }
                return i3;
            }
            aa6Var2 = aa6Var;
            if (i2 == 1) {
                return aa6Var2.l();
            }
            if (i2 == 3) {
                return (int) ((aa6Var2.r() * aa6Var2.Y) + 0.5f);
            }
        } else {
            aa6Var2 = aa6Var;
        }
        return aa6Var2.l();
    }

    public final int Y(aa6 aa6Var, int i) {
        aa6 aa6Var2;
        if (aa6Var == null) {
            return 0;
        }
        if (aa6Var.U[0] == z96.c) {
            int i2 = aa6Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (aa6Var.w * i);
                if (i3 != aa6Var.r()) {
                    aa6Var.g = true;
                    W(aa6Var, z96.a, i3, aa6Var.U[1], aa6Var.l());
                }
                return i3;
            }
            aa6Var2 = aa6Var;
            if (i2 == 1) {
                return aa6Var2.r();
            }
            if (i2 == 3) {
                return (int) ((aa6Var2.l() * aa6Var2.Y) + 0.5f);
            }
        } else {
            aa6Var2 = aa6Var;
        }
        return aa6Var2.r();
    }

    @Override // defpackage.aa6
    public final void b(j7g j7gVar, boolean z) {
        aa6 aa6Var;
        float f;
        int i;
        super.b(j7gVar, z);
        aa6 aa6Var2 = this.V;
        boolean z2 = aa6Var2 != null && ((ba6) aa6Var2).z0;
        int i2 = this.X0;
        ArrayList arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((ojc) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((ojc) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].E();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                aa6 aa6Var3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    aa6 aa6Var4 = this.c1[i];
                    if (aa6Var4 != null) {
                        o86 o86Var = aa6Var4.J;
                        if (aa6Var4.i0 != 8) {
                            if (i8 == 0) {
                                aa6Var4.f(o86Var, this.J, this.A0);
                                aa6Var4.l0 = this.H0;
                                aa6Var4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                aa6Var4.f(aa6Var4.L, this.L, this.B0);
                            }
                            if (i8 > 0 && aa6Var3 != null) {
                                o86 o86Var2 = aa6Var3.L;
                                aa6Var4.f(o86Var, o86Var2, this.T0);
                                aa6Var3.f(o86Var2, o86Var, 0);
                            }
                            aa6Var3 = aa6Var4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    aa6 aa6Var5 = this.b1[i9];
                    if (aa6Var5 != null) {
                        o86 o86Var3 = aa6Var5.K;
                        if (aa6Var5.i0 != 8) {
                            if (i9 == 0) {
                                aa6Var5.f(o86Var3, this.K, this.w0);
                                aa6Var5.m0 = this.I0;
                                aa6Var5.g0 = this.O0;
                            }
                            if (i9 == i7 - 1) {
                                aa6Var5.f(aa6Var5.M, this.M, this.x0);
                            }
                            if (i9 > 0 && aa6Var3 != null) {
                                o86 o86Var4 = aa6Var3.M;
                                aa6Var5.f(o86Var3, o86Var4, this.U0);
                                aa6Var3.f(o86Var4, o86Var3, 0);
                            }
                            aa6Var3 = aa6Var5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        aa6[] aa6VarArr = this.e1;
                        if (i12 < aa6VarArr.length && (aa6Var = aa6VarArr[i12]) != null && aa6Var.i0 != 8) {
                            aa6 aa6Var6 = this.c1[i10];
                            aa6 aa6Var7 = this.b1[i11];
                            if (aa6Var != aa6Var6) {
                                aa6Var.f(aa6Var.J, aa6Var6.J, 0);
                                aa6Var.f(aa6Var.L, aa6Var6.L, 0);
                            }
                            if (aa6Var != aa6Var7) {
                                aa6Var.f(aa6Var.K, aa6Var7.K, 0);
                                aa6Var.f(aa6Var.M, aa6Var7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((ojc) arrayList.get(0)).b(0, z2, true);
        }
        this.C0 = false;
    }

    @Override // defpackage.fxd, defpackage.aa6
    public final void g(aa6 aa6Var, HashMap hashMap) {
        super.g(aa6Var, hashMap);
        qjc qjcVar = (qjc) aa6Var;
        this.H0 = qjcVar.H0;
        this.I0 = qjcVar.I0;
        this.J0 = qjcVar.J0;
        this.K0 = qjcVar.K0;
        this.L0 = qjcVar.L0;
        this.M0 = qjcVar.M0;
        this.N0 = qjcVar.N0;
        this.O0 = qjcVar.O0;
        this.P0 = qjcVar.P0;
        this.Q0 = qjcVar.Q0;
        this.R0 = qjcVar.R0;
        this.S0 = qjcVar.S0;
        this.T0 = qjcVar.T0;
        this.U0 = qjcVar.U0;
        this.V0 = qjcVar.V0;
        this.W0 = qjcVar.W0;
        this.X0 = qjcVar.X0;
        this.Y0 = qjcVar.Y0;
        this.Z0 = qjcVar.Z0;
    }
}
