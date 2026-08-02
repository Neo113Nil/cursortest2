package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ta4 extends ynv {
    public final ArrayList k;
    public int l;

    public ta4(aa6 aa6Var, int i) {
        super(aa6Var);
        aa6 aa6Var2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        aa6 aa6Var3 = this.b;
        aa6 n = aa6Var3.n(i);
        while (true) {
            aa6Var2 = aa6Var3;
            aa6Var3 = n;
            if (aa6Var3 == null) {
                break;
            } else {
                n = aa6Var3.n(this.f);
            }
        }
        this.b = aa6Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? aa6Var2.d : i2 == 1 ? aa6Var2.e : null);
        aa6 m = aa6Var2.m(this.f);
        while (m != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? m.d : i3 == 1 ? m.e : null);
            m = m.m(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ynv ynvVar = (ynv) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                ynvVar.b.b = this;
            } else if (i4 == 1) {
                ynvVar.b.c = this;
            }
        }
        if (this.f == 0 && ((ba6) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((ynv) vz1.m(arrayList, 1)).b;
        }
        int i5 = this.f;
        aa6 aa6Var4 = this.b;
        this.l = i5 == 0 ? aa6Var4.l0 : aa6Var4.m0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x0399, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    @Override // defpackage.px7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(px7 px7Var) {
        int i;
        int i2;
        z96 z96Var;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int i16;
        sx7 sx7Var = this.h;
        if (sx7Var.j) {
            sx7 sx7Var2 = this.i;
            if (sx7Var2.j) {
                aa6 aa6Var = this.b.V;
                boolean z3 = aa6Var instanceof ba6 ? ((ba6) aa6Var).z0 : false;
                int i17 = sx7Var2.g - sx7Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((ynv) arrayList.get(i18)).b.i0 != 8) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int i19 = size - 1;
                int i20 = i19;
                while (true) {
                    if (i20 < 0) {
                        break;
                    }
                    if (((ynv) arrayList.get(i20)).b.i0 != 8) {
                        i = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (true) {
                    z96Var = z96.c;
                    if (i21 >= 2) {
                        z = z3;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i22 = 0;
                    i5 = 0;
                    i13 = 0;
                    i14 = 0;
                    while (i22 < size) {
                        ynv ynvVar = (ynv) arrayList.get(i22);
                        boolean z4 = z3;
                        aa6 aa6Var2 = ynvVar.b;
                        int i23 = i21;
                        if (aa6Var2.i0 != i2) {
                            i14++;
                            if (i22 > 0 && i22 >= i18) {
                                i5 += ynvVar.h.f;
                            }
                            v38 v38Var = ynvVar.e;
                            int i24 = v38Var.g;
                            boolean z5 = ynvVar.d != z96Var;
                            if (z5) {
                                int i25 = this.f;
                                z2 = z5;
                                if (i25 == 0 && !aa6Var2.d.e.j) {
                                    return;
                                }
                                if (i25 == 1 && !aa6Var2.e.e.j) {
                                    return;
                                } else {
                                    i15 = i5;
                                }
                            } else {
                                z2 = z5;
                                i15 = i5;
                                if (ynvVar.a == 1 && i23 == 0) {
                                    i16 = v38Var.m;
                                    i13++;
                                } else if (v38Var.j) {
                                    i16 = i24;
                                }
                                z2 = true;
                                if (z2) {
                                    i13++;
                                    float f3 = aa6Var2.n0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i15;
                                } else {
                                    i5 = i15 + i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i5 += -ynvVar.i.f;
                                }
                            }
                            i16 = i24;
                            if (z2) {
                            }
                            if (i22 < i19) {
                                i5 += -ynvVar.i.f;
                            }
                        }
                        i22++;
                        z3 = z4;
                        i21 = i23;
                        i2 = 8;
                    }
                    z = z3;
                    int i26 = i21;
                    if (i5 < i17 || i13 == 0) {
                        break;
                    }
                    i21 = i26 + 1;
                    z3 = z;
                    i2 = 8;
                }
                i3 = i13;
                i4 = i14;
                int i27 = sx7Var.g;
                if (z) {
                    i27 = sx7Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i17) {
                    i27 = z ? i27 + ((int) (((i5 - i17) / 2.0f) + 0.5f)) : i27 - ((int) (((i5 - i17) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i17 - i5;
                    int i28 = (int) ((f5 / i3) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        float f6 = f4;
                        ynv ynvVar2 = (ynv) arrayList.get(i29);
                        int i31 = i27;
                        aa6 aa6Var3 = ynvVar2.b;
                        int i32 = i3;
                        v38 v38Var2 = ynvVar2.e;
                        float f7 = f5;
                        int i33 = i28;
                        if (aa6Var3.i0 == 8 || ynvVar2.d != z96Var || v38Var2.j) {
                            i12 = i29;
                        } else {
                            int i34 = f > 0.0f ? (int) (((aa6Var3.n0[this.f] * f7) / f) + f6) : i33;
                            if (this.f == 0) {
                                i10 = aa6Var3.v;
                                i11 = aa6Var3.u;
                            } else {
                                i10 = aa6Var3.y;
                                i11 = aa6Var3.x;
                            }
                            i12 = i29;
                            int max = Math.max(i11, ynvVar2.a == 1 ? Math.min(i34, v38Var2.m) : i34);
                            if (i10 > 0) {
                                max = Math.min(i10, max);
                            }
                            if (max != i34) {
                                i30++;
                                i34 = max;
                            }
                            v38Var2.d(i34);
                        }
                        i29 = i12 + 1;
                        i27 = i31;
                        f4 = f6;
                        i3 = i32;
                        f5 = f7;
                        i28 = i33;
                    }
                    i6 = i27;
                    f2 = f4;
                    int i35 = i3;
                    if (i30 > 0) {
                        i3 = i35 - i30;
                        i5 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            ynv ynvVar3 = (ynv) arrayList.get(i36);
                            if (ynvVar3.b.i0 != 8) {
                                if (i36 > 0 && i36 >= i18) {
                                    i5 += ynvVar3.h.f;
                                }
                                i5 += ynvVar3.e.g;
                                if (i36 < i19 && i36 < i) {
                                    i5 += -ynvVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i35;
                    }
                    i8 = 2;
                    if (this.l == 2 && i30 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i27;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i17) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i18 == i) {
                    this.l = i8;
                }
                int i37 = this.l;
                if (i37 == 1) {
                    int i38 = i4 > 1 ? (i17 - i5) / (i4 - 1) : i4 == 1 ? (i17 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i38 = i7;
                    }
                    int i39 = i6;
                    for (int i40 = i7; i40 < size; i40++) {
                        ynv ynvVar4 = (ynv) arrayList.get(z ? size - (i40 + 1) : i40);
                        aa6 aa6Var4 = ynvVar4.b;
                        sx7 sx7Var3 = ynvVar4.i;
                        sx7 sx7Var4 = ynvVar4.h;
                        if (aa6Var4.i0 == 8) {
                            sx7Var4.d(i39);
                            sx7Var3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i18) {
                                i39 = z ? i39 - sx7Var4.f : i39 + sx7Var4.f;
                            }
                            if (z) {
                                sx7Var3.d(i39);
                            } else {
                                sx7Var4.d(i39);
                            }
                            v38 v38Var3 = ynvVar4.e;
                            int i41 = v38Var3.g;
                            if (ynvVar4.d == z96Var) {
                                i9 = i39;
                                if (ynvVar4.a == 1) {
                                    i41 = v38Var3.m;
                                }
                            } else {
                                i9 = i39;
                            }
                            i39 = z ? i9 - i41 : i9 + i41;
                            if (z) {
                                sx7Var4.d(i39);
                            } else {
                                sx7Var3.d(i39);
                            }
                            ynvVar4.g = true;
                            if (i40 < i19 && i40 < i) {
                                i39 = z ? i39 - (-sx7Var3.f) : i39 + (-sx7Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i42 = (i17 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i42 = i7;
                    }
                    int i43 = i6;
                    for (int i44 = i7; i44 < size; i44++) {
                        ynv ynvVar5 = (ynv) arrayList.get(z ? size - (i44 + 1) : i44);
                        aa6 aa6Var5 = ynvVar5.b;
                        sx7 sx7Var5 = ynvVar5.i;
                        sx7 sx7Var6 = ynvVar5.h;
                        if (aa6Var5.i0 == 8) {
                            sx7Var6.d(i43);
                            sx7Var5.d(i43);
                        } else {
                            int i45 = z ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i18) {
                                i45 = z ? i45 - sx7Var6.f : i45 + sx7Var6.f;
                            }
                            if (z) {
                                sx7Var5.d(i45);
                            } else {
                                sx7Var6.d(i45);
                            }
                            v38 v38Var4 = ynvVar5.e;
                            int i46 = v38Var4.g;
                            if (ynvVar5.d == z96Var && ynvVar5.a == 1) {
                                i46 = Math.min(i46, v38Var4.m);
                            }
                            i43 = z ? i45 - i46 : i45 + i46;
                            if (z) {
                                sx7Var6.d(i43);
                            } else {
                                sx7Var5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z ? i43 - (-sx7Var5.f) : i43 + (-sx7Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    int i47 = this.f;
                    aa6 aa6Var6 = this.b;
                    float f8 = i47 == 0 ? aa6Var6.f0 : aa6Var6.g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i48 = (int) (((i17 - i5) * f8) + f2);
                    if (i48 < 0 || i3 > 0) {
                        i48 = i7;
                    }
                    int i49 = z ? i6 - i48 : i6 + i48;
                    for (int i50 = i7; i50 < size; i50++) {
                        ynv ynvVar6 = (ynv) arrayList.get(z ? size - (i50 + 1) : i50);
                        aa6 aa6Var7 = ynvVar6.b;
                        sx7 sx7Var7 = ynvVar6.i;
                        sx7 sx7Var8 = ynvVar6.h;
                        if (aa6Var7.i0 == 8) {
                            sx7Var8.d(i49);
                            sx7Var7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i18) {
                                i49 = z ? i49 - sx7Var8.f : i49 + sx7Var8.f;
                            }
                            if (z) {
                                sx7Var7.d(i49);
                            } else {
                                sx7Var8.d(i49);
                            }
                            v38 v38Var5 = ynvVar6.e;
                            int i51 = v38Var5.g;
                            if (ynvVar6.d == z96Var && ynvVar6.a == 1) {
                                i51 = v38Var5.m;
                            }
                            i49 += i51;
                            if (z) {
                                sx7Var8.d(i49);
                            } else {
                                sx7Var7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z ? i49 - (-sx7Var7.f) : i49 + (-sx7Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ynv
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ynv) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        aa6 aa6Var = ((ynv) arrayList.get(0)).b;
        aa6 aa6Var2 = ((ynv) arrayList.get(size - 1)).b;
        int i = this.f;
        sx7 sx7Var = this.i;
        sx7 sx7Var2 = this.h;
        if (i == 0) {
            o86 o86Var = aa6Var.J;
            o86 o86Var2 = aa6Var2.L;
            sx7 i2 = ynv.i(o86Var, 0);
            int e = o86Var.e();
            aa6 m = m();
            if (m != null) {
                e = m.J.e();
            }
            if (i2 != null) {
                ynv.b(sx7Var2, i2, e);
            }
            sx7 i3 = ynv.i(o86Var2, 0);
            int e2 = o86Var2.e();
            aa6 n = n();
            if (n != null) {
                e2 = n.L.e();
            }
            if (i3 != null) {
                ynv.b(sx7Var, i3, -e2);
            }
        } else {
            o86 o86Var3 = aa6Var.K;
            o86 o86Var4 = aa6Var2.M;
            sx7 i4 = ynv.i(o86Var3, 1);
            int e3 = o86Var3.e();
            aa6 m2 = m();
            if (m2 != null) {
                e3 = m2.K.e();
            }
            if (i4 != null) {
                ynv.b(sx7Var2, i4, e3);
            }
            sx7 i5 = ynv.i(o86Var4, 1);
            int e4 = o86Var4.e();
            aa6 n2 = n();
            if (n2 != null) {
                e4 = n2.M.e();
            }
            if (i5 != null) {
                ynv.b(sx7Var, i5, -e4);
            }
        }
        sx7Var2.a = this;
        sx7Var.a = this;
    }

    @Override // defpackage.ynv
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((ynv) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.ynv
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ynv) it.next()).f();
        }
    }

    @Override // defpackage.ynv
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((ynv) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.ynv
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ynv) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final aa6 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            aa6 aa6Var = ((ynv) arrayList.get(i)).b;
            if (aa6Var.i0 != 8) {
                return aa6Var;
            }
            i++;
        }
    }

    public final aa6 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            aa6 aa6Var = ((ynv) arrayList.get(size)).b;
            if (aa6Var.i0 != 8) {
                return aa6Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ynv ynvVar = (ynv) it.next();
            sb.append("<");
            sb.append(ynvVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
