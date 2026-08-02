package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ba6 extends aa6 {
    public final j7g A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public sa4[] F0;
    public sa4[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public WeakReference N0;
    public final HashSet O0;
    public final fv2 P0;
    public ArrayList u0 = new ArrayList();
    public final nsh v0 = new nsh(this);
    public final v97 w0;
    public int x0;
    public awm y0;
    public boolean z0;

    public ba6() {
        v97 v97Var = new v97();
        v97Var.b = true;
        v97Var.c = true;
        v97Var.f = new ArrayList();
        new ArrayList();
        v97Var.g = null;
        v97Var.h = new fv2();
        v97Var.i = new ArrayList();
        v97Var.d = this;
        v97Var.e = this;
        this.w0 = v97Var;
        this.y0 = null;
        this.z0 = false;
        this.A0 = new j7g();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new sa4[4];
        this.G0 = new sa4[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet();
        this.P0 = new fv2();
    }

    public static void W(aa6 aa6Var, awm awmVar, fv2 fv2Var) {
        int i;
        int i2;
        if (awmVar == null) {
            return;
        }
        int i3 = aa6Var.i0;
        int[] iArr = aa6Var.t;
        if (i3 == 8 || (aa6Var instanceof grd) || (aa6Var instanceof ap2)) {
            fv2Var.e = 0;
            fv2Var.f = 0;
            return;
        }
        z96[] z96VarArr = aa6Var.U;
        fv2Var.a = z96VarArr[0];
        fv2Var.b = z96VarArr[1];
        fv2Var.c = aa6Var.r();
        fv2Var.d = aa6Var.l();
        fv2Var.i = false;
        fv2Var.j = 0;
        z96 z96Var = fv2Var.a;
        z96 z96Var2 = z96.c;
        boolean z = z96Var == z96Var2;
        boolean z2 = fv2Var.b == z96Var2;
        boolean z3 = z && aa6Var.Y > 0.0f;
        boolean z4 = z2 && aa6Var.Y > 0.0f;
        z96 z96Var3 = z96.b;
        z96 z96Var4 = z96.a;
        if (z && aa6Var.u(0) && aa6Var.r == 0 && !z3) {
            fv2Var.a = z96Var3;
            if (z2 && aa6Var.s == 0) {
                fv2Var.a = z96Var4;
            }
            z = false;
        }
        if (z2 && aa6Var.u(1) && aa6Var.s == 0 && !z4) {
            fv2Var.b = z96Var3;
            if (z && aa6Var.r == 0) {
                fv2Var.b = z96Var4;
            }
            z2 = false;
        }
        if (aa6Var.B()) {
            fv2Var.a = z96Var4;
            z = false;
        }
        if (aa6Var.C()) {
            fv2Var.b = z96Var4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                fv2Var.a = z96Var4;
            } else if (!z2) {
                if (fv2Var.b == z96Var4) {
                    i2 = fv2Var.d;
                } else {
                    fv2Var.a = z96Var3;
                    awmVar.d(aa6Var, fv2Var);
                    i2 = fv2Var.f;
                }
                fv2Var.a = z96Var4;
                fv2Var.c = (int) (aa6Var.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                fv2Var.b = z96Var4;
            } else if (!z) {
                if (fv2Var.a == z96Var4) {
                    i = fv2Var.c;
                } else {
                    fv2Var.b = z96Var3;
                    awmVar.d(aa6Var, fv2Var);
                    i = fv2Var.e;
                }
                fv2Var.b = z96Var4;
                int i4 = aa6Var.Z;
                float f = aa6Var.Y;
                if (i4 == -1) {
                    fv2Var.d = (int) (i / f);
                } else {
                    fv2Var.d = (int) (f * i);
                }
            }
        }
        awmVar.d(aa6Var, fv2Var);
        aa6Var.P(fv2Var.e);
        aa6Var.M(fv2Var.f);
        aa6Var.E = fv2Var.h;
        aa6Var.J(fv2Var.g);
        fv2Var.j = 0;
    }

    @Override // defpackage.aa6
    public final void D() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        this.u0.clear();
        super.D();
    }

    @Override // defpackage.aa6
    public final void G(osh oshVar) {
        super.G(oshVar);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((aa6) this.u0.get(i)).G(oshVar);
        }
    }

    @Override // defpackage.aa6
    public final void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((aa6) this.u0.get(i)).Q(z, z2);
        }
    }

    public final void S(aa6 aa6Var, int i) {
        if (i == 0) {
            int i2 = this.D0 + 1;
            sa4[] sa4VarArr = this.G0;
            if (i2 >= sa4VarArr.length) {
                this.G0 = (sa4[]) Arrays.copyOf(sa4VarArr, sa4VarArr.length * 2);
            }
            sa4[] sa4VarArr2 = this.G0;
            int i3 = this.D0;
            sa4VarArr2[i3] = new sa4(aa6Var, 0, this.z0);
            this.D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.E0 + 1;
            sa4[] sa4VarArr3 = this.F0;
            if (i4 >= sa4VarArr3.length) {
                this.F0 = (sa4[]) Arrays.copyOf(sa4VarArr3, sa4VarArr3.length * 2);
            }
            sa4[] sa4VarArr4 = this.F0;
            int i5 = this.E0;
            sa4VarArr4[i5] = new sa4(aa6Var, 1, this.z0);
            this.E0 = i5 + 1;
        }
    }

    public final void T(j7g j7gVar) {
        ba6 ba6Var;
        j7g j7gVar2;
        boolean X = X(64);
        b(j7gVar, X);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            aa6 aa6Var = (aa6) this.u0.get(i);
            boolean[] zArr = aa6Var.T;
            zArr[0] = false;
            zArr[1] = false;
            if (aa6Var instanceof ap2) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                aa6 aa6Var2 = (aa6) this.u0.get(i2);
                if (aa6Var2 instanceof ap2) {
                    ap2 ap2Var = (ap2) aa6Var2;
                    for (int i3 = 0; i3 < ap2Var.v0; i3++) {
                        aa6 aa6Var3 = ap2Var.u0[i3];
                        if (ap2Var.x0 || aa6Var3.c()) {
                            int i4 = ap2Var.w0;
                            if (i4 == 0 || i4 == 1) {
                                aa6Var3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                aa6Var3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.O0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            aa6 aa6Var4 = (aa6) this.u0.get(i5);
            aa6Var4.getClass();
            boolean z2 = aa6Var4 instanceof kiu;
            if (z2 || (aa6Var4 instanceof grd)) {
                if (z2) {
                    hashSet.add(aa6Var4);
                } else {
                    aa6Var4.b(j7gVar, X);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kiu kiuVar = (kiu) ((aa6) it.next());
                for (int i6 = 0; i6 < kiuVar.v0; i6++) {
                    if (hashSet.contains(kiuVar.u0[i6])) {
                        kiuVar.b(j7gVar, X);
                        hashSet.remove(kiuVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((aa6) it2.next()).b(j7gVar, X);
                }
                hashSet.clear();
            }
        }
        boolean z3 = j7g.q;
        z96 z96Var = z96.b;
        if (z3) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                aa6 aa6Var5 = (aa6) this.u0.get(i7);
                aa6Var5.getClass();
                if (!(aa6Var5 instanceof kiu) && !(aa6Var5 instanceof grd)) {
                    hashSet2.add(aa6Var5);
                }
            }
            ba6Var = this;
            j7gVar2 = j7gVar;
            ba6Var.a(this, j7gVar2, hashSet2, this.U[0] == z96Var ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                aa6 aa6Var6 = (aa6) it3.next();
                ff7.u(this, j7gVar2, aa6Var6);
                aa6Var6.b(j7gVar2, X);
            }
        } else {
            ba6Var = this;
            j7gVar2 = j7gVar;
            for (int i8 = 0; i8 < size; i8++) {
                aa6 aa6Var7 = (aa6) ba6Var.u0.get(i8);
                if (aa6Var7 instanceof ba6) {
                    z96[] z96VarArr = aa6Var7.U;
                    z96 z96Var2 = z96VarArr[0];
                    z96 z96Var3 = z96VarArr[1];
                    z96 z96Var4 = z96.a;
                    if (z96Var2 == z96Var) {
                        aa6Var7.N(z96Var4);
                    }
                    if (z96Var3 == z96Var) {
                        aa6Var7.O(z96Var4);
                    }
                    aa6Var7.b(j7gVar2, X);
                    if (z96Var2 == z96Var) {
                        aa6Var7.N(z96Var2);
                    }
                    if (z96Var3 == z96Var) {
                        aa6Var7.O(z96Var3);
                    }
                } else {
                    ff7.u(this, j7gVar2, aa6Var7);
                    if (!(aa6Var7 instanceof kiu) && !(aa6Var7 instanceof grd)) {
                        aa6Var7.b(j7gVar2, X);
                    }
                }
            }
        }
        if (ba6Var.D0 > 0) {
            vnj.i(this, j7gVar2, null, 0);
        }
        if (ba6Var.E0 > 0) {
            vnj.i(this, j7gVar2, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        z96 z96Var;
        boolean z3;
        v97 v97Var = this.w0;
        ArrayList arrayList = (ArrayList) v97Var.f;
        ba6 ba6Var = (ba6) v97Var.d;
        boolean z4 = false;
        z96 k = ba6Var.k(0);
        z96 k2 = ba6Var.k(1);
        int s = ba6Var.s();
        int t = ba6Var.t();
        z96 z96Var2 = z96.a;
        if (z && (k == (z96Var = z96.b) || k2 == z96Var)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                ynv ynvVar = (ynv) it.next();
                if (ynvVar.f == i && !ynvVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && k == z96Var) {
                    ba6Var.N(z96Var2);
                    ba6Var.P(v97Var.e(ba6Var, 0));
                    ba6Var.d.e.d(ba6Var.r());
                }
            } else if (z3 && k2 == z96Var) {
                ba6Var.O(z96Var2);
                ba6Var.M(v97Var.e(ba6Var, 1));
                ba6Var.e.e.d(ba6Var.l());
            }
        }
        z96[] z96VarArr = ba6Var.U;
        z96 z96Var3 = z96.d;
        if (i == 0) {
            z96 z96Var4 = z96VarArr[0];
            if (z96Var4 == z96Var2 || z96Var4 == z96Var3) {
                int r = ba6Var.r() + s;
                ba6Var.d.i.d(r);
                ba6Var.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            z96 z96Var5 = z96VarArr[1];
            if (z96Var5 == z96Var2 || z96Var5 == z96Var3) {
                int l = ba6Var.l() + t;
                ba6Var.e.i.d(l);
                ba6Var.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        v97Var.l();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ynv ynvVar2 = (ynv) it2.next();
            if (ynvVar2.f == i && (ynvVar2.b != ba6Var || ynvVar2.g)) {
                ynvVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            ynv ynvVar3 = (ynv) it3.next();
            if (ynvVar3.f == i && (z2 || ynvVar3.b != ba6Var)) {
                if (!ynvVar3.h.j) {
                    break;
                }
                if (!ynvVar3.i.j) {
                    break;
                }
                if (!(ynvVar3 instanceof ta4) && !ynvVar3.e.j) {
                    break;
                }
            }
        }
        ba6Var.N(k);
        ba6Var.O(k2);
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x085b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0662 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0691  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        boolean[] zArr;
        int i;
        o86 o86Var;
        int i2;
        o86 o86Var2;
        int i3;
        int i4;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        z96 z96Var;
        boolean z4;
        int max;
        int max2;
        ?? r15;
        int i5;
        mmv mmvVar;
        mmv mmvVar2;
        int i6;
        int i7;
        z96 z96Var2;
        mmv mmvVar3;
        mmv mmvVar4;
        boolean z5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i8;
        o86 o86Var3;
        boolean[] zArr2 = ff7.j;
        this.a0 = 0;
        this.b0 = 0;
        this.I0 = false;
        this.J0 = false;
        int size = this.u0.size();
        int max3 = Math.max(0, r());
        int max4 = Math.max(0, l());
        z96[] z96VarArr = this.U;
        z96 z96Var3 = z96VarArr[1];
        z96 z96Var4 = z96VarArr[0];
        int i9 = this.x0;
        z96 z96Var5 = z96.c;
        o86 o86Var4 = this.K;
        o86 o86Var5 = this.J;
        z96 z96Var6 = z96.a;
        if (i9 == 0 && ff7.w(this.H0, 1)) {
            awm awmVar = this.y0;
            z96[] z96VarArr2 = this.U;
            z96 z96Var7 = z96VarArr2[0];
            z96 z96Var8 = z96VarArr2[1];
            F();
            ArrayList arrayList3 = this.u0;
            int size2 = arrayList3.size();
            zArr = zArr2;
            for (int i10 = 0; i10 < size2; i10++) {
                ((aa6) arrayList3.get(i10)).F();
            }
            boolean z6 = this.z0;
            if (z96Var7 == z96Var6) {
                i = max4;
                K(0, r());
            } else {
                i = max4;
                o86Var5.l(0);
                this.a0 = 0;
            }
            boolean z7 = false;
            int i11 = 0;
            boolean z8 = false;
            while (i11 < size2) {
                boolean z9 = z7;
                aa6 aa6Var = (aa6) arrayList3.get(i11);
                int i12 = i11;
                if (aa6Var instanceof grd) {
                    grd grdVar = (grd) aa6Var;
                    o86Var3 = o86Var5;
                    if (grdVar.y0 == 1) {
                        int i13 = grdVar.v0;
                        if (i13 != -1) {
                            grdVar.S(i13);
                        } else if (grdVar.w0 != -1 && B()) {
                            grdVar.S(r() - grdVar.w0);
                        } else if (B()) {
                            grdVar.S((int) ((grdVar.u0 * r()) + 0.5f));
                        }
                        z9 = true;
                    }
                } else {
                    o86Var3 = o86Var5;
                    if ((aa6Var instanceof ap2) && ((ap2) aa6Var).W() == 0) {
                        z7 = z9;
                        z8 = true;
                        i11 = i12 + 1;
                        o86Var5 = o86Var3;
                    }
                }
                z7 = z9;
                i11 = i12 + 1;
                o86Var5 = o86Var3;
            }
            o86Var = o86Var5;
            if (z7) {
                for (int i14 = 0; i14 < size2; i14 = i8 + 1) {
                    aa6 aa6Var2 = (aa6) arrayList3.get(i14);
                    if (aa6Var2 instanceof grd) {
                        grd grdVar2 = (grd) aa6Var2;
                        i8 = i14;
                        if (grdVar2.y0 == 1) {
                            pd.J(0, grdVar2, awmVar, z6);
                        }
                    } else {
                        i8 = i14;
                    }
                }
            }
            pd.J(0, this, awmVar, z6);
            if (z8) {
                for (int i15 = 0; i15 < size2; i15++) {
                    aa6 aa6Var3 = (aa6) arrayList3.get(i15);
                    if (aa6Var3 instanceof ap2) {
                        ap2 ap2Var = (ap2) aa6Var3;
                        if (ap2Var.W() == 0 && ap2Var.V()) {
                            pd.J(1, ap2Var, awmVar, z6);
                        }
                    }
                }
            }
            if (z96Var8 == z96Var6) {
                L(0, l());
            } else {
                o86Var4.l(0);
                this.b0 = 0;
            }
            int i16 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i16 < size2) {
                aa6 aa6Var4 = (aa6) arrayList3.get(i16);
                int i17 = i16;
                if (aa6Var4 instanceof grd) {
                    grd grdVar3 = (grd) aa6Var4;
                    if (grdVar3.y0 == 0) {
                        int i18 = grdVar3.v0;
                        if (i18 != -1) {
                            grdVar3.S(i18);
                        } else if (grdVar3.w0 != -1 && C()) {
                            grdVar3.S(l() - grdVar3.w0);
                        } else if (C()) {
                            grdVar3.S((int) ((grdVar3.u0 * l()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else if ((aa6Var4 instanceof ap2) && ((ap2) aa6Var4).W() == 1) {
                    z11 = true;
                }
                i16 = i17 + 1;
            }
            if (z10) {
                for (int i19 = 0; i19 < size2; i19++) {
                    aa6 aa6Var5 = (aa6) arrayList3.get(i19);
                    if (aa6Var5 instanceof grd) {
                        grd grdVar4 = (grd) aa6Var5;
                        if (grdVar4.y0 == 0) {
                            pd.d0(1, grdVar4, awmVar);
                        }
                    }
                }
            }
            pd.d0(0, this, awmVar);
            if (z11) {
                for (int i20 = 0; i20 < size2; i20++) {
                    aa6 aa6Var6 = (aa6) arrayList3.get(i20);
                    if (aa6Var6 instanceof ap2) {
                        ap2 ap2Var2 = (ap2) aa6Var6;
                        if (ap2Var2.W() == 1 && ap2Var2.V()) {
                            pd.d0(1, ap2Var2, awmVar);
                        }
                    }
                }
            }
            for (int i21 = 0; i21 < size2; i21++) {
                aa6 aa6Var7 = (aa6) arrayList3.get(i21);
                if (aa6Var7.A() && pd.w(aa6Var7)) {
                    W(aa6Var7, awmVar, pd.h);
                    if (!(aa6Var7 instanceof grd)) {
                        pd.J(0, aa6Var7, awmVar, z6);
                        pd.d0(0, aa6Var7, awmVar);
                    } else if (((grd) aa6Var7).y0 == 0) {
                        pd.d0(0, aa6Var7, awmVar);
                    } else {
                        pd.J(0, aa6Var7, awmVar, z6);
                    }
                }
            }
            for (int i22 = 0; i22 < size; i22++) {
                aa6 aa6Var8 = (aa6) this.u0.get(i22);
                if (aa6Var8.A() && !(aa6Var8 instanceof grd) && !(aa6Var8 instanceof ap2) && !(aa6Var8 instanceof kiu) && !aa6Var8.G) {
                    z96 k = aa6Var8.k(0);
                    z96 k2 = aa6Var8.k(1);
                    if (k != z96Var5 || aa6Var8.r == 1 || k2 != z96Var5 || aa6Var8.s == 1) {
                        W(aa6Var8, this.y0, new fv2());
                    }
                }
            }
        } else {
            zArr = zArr2;
            i = max4;
            o86Var = o86Var5;
        }
        z96 z96Var9 = z96.b;
        j7g j7gVar = this.A0;
        if (size <= 2 || !((z96Var4 == z96Var9 || z96Var3 == z96Var9) && ff7.w(this.H0, 1024))) {
            i2 = size;
            o86Var2 = o86Var4;
        } else {
            awm awmVar2 = this.y0;
            ArrayList arrayList4 = this.u0;
            int size3 = arrayList4.size();
            int i23 = 0;
            while (true) {
                if (i23 < size3) {
                    aa6 aa6Var9 = (aa6) arrayList4.get(i23);
                    z96[] z96VarArr3 = this.U;
                    int i24 = i23;
                    z96 z96Var10 = z96VarArr3[0];
                    z96 z96Var11 = z96VarArr3[1];
                    o86Var2 = o86Var4;
                    z96[] z96VarArr4 = aa6Var9.U;
                    i2 = size;
                    if (!xv7.F(z96Var10, z96Var11, z96VarArr4[0], z96VarArr4[1]) || (aa6Var9 instanceof qjc)) {
                        break;
                    }
                    i23 = i24 + 1;
                    o86Var4 = o86Var2;
                    size = i2;
                } else {
                    i2 = size;
                    o86Var2 = o86Var4;
                    int i25 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i25 < size3) {
                        int i26 = i25;
                        aa6 aa6Var10 = (aa6) arrayList4.get(i25);
                        ArrayList arrayList11 = arrayList5;
                        z96[] z96VarArr5 = this.U;
                        z96 z96Var12 = z96VarArr5[0];
                        ArrayList arrayList12 = arrayList6;
                        z96 z96Var13 = z96VarArr5[1];
                        ArrayList arrayList13 = arrayList7;
                        z96[] z96VarArr6 = aa6Var10.U;
                        ArrayList arrayList14 = arrayList8;
                        if (!xv7.F(z96Var12, z96Var13, z96VarArr6[0], z96VarArr6[1])) {
                            W(aa6Var10, awmVar2, this.P0);
                        }
                        boolean z12 = aa6Var10 instanceof grd;
                        if (z12) {
                            grd grdVar5 = (grd) aa6Var10;
                            if (grdVar5.y0 == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(grdVar5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z5 = z12;
                            if (grdVar5.y0 == 1) {
                                arrayList = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList.add(grdVar5);
                            } else {
                                arrayList = arrayList11;
                            }
                        } else {
                            z5 = z12;
                            arrayList = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (!(aa6Var10 instanceof fxd)) {
                            arrayList2 = arrayList;
                            arrayList6 = arrayList12;
                            arrayList8 = arrayList14;
                        } else if (aa6Var10 instanceof ap2) {
                            ap2 ap2Var3 = (ap2) aa6Var10;
                            if (ap2Var3.W() == 0) {
                                ArrayList arrayList15 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList15.add(ap2Var3);
                                arrayList12 = arrayList15;
                            }
                            arrayList2 = arrayList;
                            if (ap2Var3.W() == 1) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(ap2Var3);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            arrayList6 = arrayList12;
                        } else {
                            arrayList2 = arrayList;
                            fxd fxdVar = (fxd) aa6Var10;
                            arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                            arrayList6.add(fxdVar);
                            arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                            arrayList8.add(fxdVar);
                        }
                        if (aa6Var10.J.f == null && aa6Var10.L.f == null && !z5 && !(aa6Var10 instanceof ap2)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList9;
                            arrayList16.add(aa6Var10);
                            arrayList9 = arrayList16;
                        }
                        if (aa6Var10.K.f == null && aa6Var10.M.f == null && aa6Var10.N.f == null && !z5 && !(aa6Var10 instanceof ap2)) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList17 = arrayList10;
                            arrayList17.add(aa6Var10);
                            arrayList10 = arrayList17;
                        }
                        i25 = i26 + 1;
                        arrayList5 = arrayList2;
                    }
                    ArrayList arrayList18 = arrayList5;
                    ArrayList arrayList19 = arrayList6;
                    ArrayList arrayList20 = arrayList7;
                    ArrayList arrayList21 = arrayList8;
                    ArrayList arrayList22 = new ArrayList();
                    if (arrayList18 != null) {
                        Iterator it = arrayList18.iterator();
                        while (it.hasNext()) {
                            xv7.x((grd) it.next(), 0, arrayList22, null);
                        }
                    }
                    mmv mmvVar5 = null;
                    int i27 = 0;
                    if (arrayList19 != null) {
                        Iterator it2 = arrayList19.iterator();
                        while (it2.hasNext()) {
                            fxd fxdVar2 = (fxd) it2.next();
                            mmv x = xv7.x(fxdVar2, i27, arrayList22, mmvVar5);
                            fxdVar2.T(i27, x, arrayList22);
                            x.a(arrayList22);
                            mmvVar5 = null;
                            i27 = 0;
                        }
                    }
                    HashSet hashSet = j(2).a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            xv7.x(((o86) it3.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet2 = j(4).a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            xv7.x(((o86) it4.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet3 = j(7).a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            xv7.x(((o86) it5.next()).d, 0, arrayList22, null);
                        }
                    }
                    mmv mmvVar6 = null;
                    if (arrayList9 != null) {
                        Iterator it6 = arrayList9.iterator();
                        while (it6.hasNext()) {
                            xv7.x((aa6) it6.next(), 0, arrayList22, null);
                        }
                    }
                    if (arrayList20 != null) {
                        Iterator it7 = arrayList20.iterator();
                        while (it7.hasNext()) {
                            xv7.x((grd) it7.next(), 1, arrayList22, null);
                        }
                    }
                    int i28 = 1;
                    if (arrayList21 != null) {
                        Iterator it8 = arrayList21.iterator();
                        while (it8.hasNext()) {
                            fxd fxdVar3 = (fxd) it8.next();
                            mmv x2 = xv7.x(fxdVar3, i28, arrayList22, mmvVar6);
                            fxdVar3.T(i28, x2, arrayList22);
                            x2.a(arrayList22);
                            mmvVar6 = null;
                            i28 = 1;
                        }
                    }
                    HashSet hashSet4 = j(3).a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            xv7.x(((o86) it9.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet5 = j(6).a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            xv7.x(((o86) it10.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet6 = j(5).a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            xv7.x(((o86) it11.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet7 = j(7).a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            xv7.x(((o86) it12.next()).d, 1, arrayList22, null);
                        }
                    }
                    char c2 = 1;
                    if (arrayList10 != null) {
                        Iterator it13 = arrayList10.iterator();
                        while (it13.hasNext()) {
                            xv7.x((aa6) it13.next(), 1, arrayList22, null);
                        }
                    }
                    int i29 = 0;
                    while (i29 < size3) {
                        aa6 aa6Var11 = (aa6) arrayList4.get(i29);
                        z96[] z96VarArr7 = aa6Var11.U;
                        if (z96VarArr7[0] == z96Var5 && z96VarArr7[c2] == z96Var5) {
                            int i30 = aa6Var11.s0;
                            int size4 = arrayList22.size();
                            int i31 = 0;
                            while (true) {
                                if (i31 >= size4) {
                                    i7 = i29;
                                    z96Var2 = z96Var5;
                                    mmvVar3 = null;
                                    break;
                                }
                                i7 = i29;
                                mmvVar3 = (mmv) arrayList22.get(i31);
                                z96Var2 = z96Var5;
                                if (i30 == mmvVar3.b) {
                                    break;
                                }
                                i31++;
                                z96Var5 = z96Var2;
                                i29 = i7;
                            }
                            int i32 = aa6Var11.t0;
                            int size5 = arrayList22.size();
                            int i33 = 0;
                            while (true) {
                                if (i33 >= size5) {
                                    mmvVar4 = null;
                                    break;
                                }
                                mmvVar4 = (mmv) arrayList22.get(i33);
                                if (i32 == mmvVar4.b) {
                                    break;
                                } else {
                                    i33++;
                                }
                            }
                            if (mmvVar3 != null && mmvVar4 != null) {
                                mmvVar3.c(0, mmvVar4);
                                mmvVar4.c = 2;
                                arrayList22.remove(mmvVar3);
                            }
                        } else {
                            i7 = i29;
                            z96Var2 = z96Var5;
                        }
                        i29 = i7 + 1;
                        z96Var5 = z96Var2;
                        c2 = 1;
                    }
                    if (arrayList22.size() > 1) {
                        int i34 = 0;
                        if (this.U[0] == z96Var9) {
                            Iterator it14 = arrayList22.iterator();
                            int i35 = 0;
                            mmvVar = null;
                            while (it14.hasNext()) {
                                mmv mmvVar7 = (mmv) it14.next();
                                if (mmvVar7.c != 1) {
                                    int b = mmvVar7.b(j7gVar, i34);
                                    if (b > i35) {
                                        mmvVar = mmvVar7;
                                        i35 = b;
                                    }
                                    i34 = 0;
                                }
                            }
                            if (mmvVar != null) {
                                N(z96Var6);
                                P(i35);
                                int i36 = 1;
                                if (this.U[1] == z96Var9) {
                                    Iterator it15 = arrayList22.iterator();
                                    int i37 = 0;
                                    mmvVar2 = null;
                                    while (it15.hasNext()) {
                                        mmv mmvVar8 = (mmv) it15.next();
                                        if (mmvVar8.c != 0) {
                                            int b2 = mmvVar8.b(j7gVar, i36);
                                            if (b2 > i37) {
                                                mmvVar2 = mmvVar8;
                                                i37 = b2;
                                            }
                                            i36 = 1;
                                        }
                                    }
                                    if (mmvVar2 != null) {
                                        O(z96Var6);
                                        M(i37);
                                        if (mmvVar == null || mmvVar2 != null) {
                                            if (z96Var4 == z96Var9) {
                                                if (max3 >= r() || max3 <= 0) {
                                                    max3 = r();
                                                } else {
                                                    P(max3);
                                                    this.I0 = true;
                                                }
                                            }
                                            if (z96Var3 == z96Var9) {
                                                i6 = i;
                                                if (i6 >= l() || i6 <= 0) {
                                                    i3 = l();
                                                    i4 = max3;
                                                    z = true;
                                                } else {
                                                    M(i6);
                                                    this.J0 = true;
                                                }
                                            } else {
                                                i6 = i;
                                            }
                                            i3 = i6;
                                            i4 = max3;
                                            z = true;
                                        }
                                    }
                                }
                                mmvVar2 = null;
                                if (mmvVar == null) {
                                }
                                if (z96Var4 == z96Var9) {
                                }
                                if (z96Var3 == z96Var9) {
                                }
                                i3 = i6;
                                i4 = max3;
                                z = true;
                            }
                        }
                        mmvVar = null;
                        int i362 = 1;
                        if (this.U[1] == z96Var9) {
                        }
                        mmvVar2 = null;
                        if (mmvVar == null) {
                        }
                        if (z96Var4 == z96Var9) {
                        }
                        if (z96Var3 == z96Var9) {
                        }
                        i3 = i6;
                        i4 = max3;
                        z = true;
                    }
                }
            }
        }
        i4 = max3;
        i3 = i;
        z = false;
        boolean z13 = X(64) || X(128);
        j7gVar.getClass();
        j7gVar.h = false;
        if (this.H0 == 0 || !z13) {
            c = 1;
        } else {
            c = 1;
            j7gVar.h = true;
        }
        ArrayList arrayList23 = this.u0;
        z96[] z96VarArr8 = this.U;
        boolean z14 = z96VarArr8[0] == z96Var9 || z96VarArr8[c] == z96Var9;
        this.D0 = 0;
        this.E0 = 0;
        int i38 = i2;
        for (int i39 = 0; i39 < i38; i39++) {
            aa6 aa6Var12 = (aa6) this.u0.get(i39);
            if (aa6Var12 instanceof ba6) {
                ((ba6) aa6Var12).V();
            }
        }
        boolean X = X(64);
        boolean z15 = z;
        int i40 = 0;
        boolean z16 = true;
        while (z16) {
            int i41 = i40 + 1;
            try {
                j7gVar.t();
                z2 = z14;
                try {
                    this.D0 = 0;
                    this.E0 = 0;
                    h(j7gVar);
                    for (int i42 = 0; i42 < i38; i42++) {
                        ((aa6) this.u0.get(i42)).h(j7gVar);
                    }
                    T(j7gVar);
                    try {
                        WeakReference weakReference = this.K0;
                        if (weakReference == null || weakReference.get() == null) {
                            z3 = z15;
                        } else {
                            o86 o86Var6 = o86Var2;
                            try {
                                try {
                                    o86Var2 = o86Var6;
                                    z3 = z15;
                                } catch (Exception e) {
                                    e = e;
                                    o86Var2 = o86Var6;
                                    z3 = z15;
                                    z16 = true;
                                    e.printStackTrace();
                                    z96Var = z96Var6;
                                    System.out.println("EXCEPTION : " + e);
                                    if (z16) {
                                    }
                                    if (!z2) {
                                    }
                                    max = Math.max(this.d0, r());
                                    if (max > r()) {
                                    }
                                    max2 = Math.max(this.e0, l());
                                    if (max2 > l()) {
                                    }
                                    if (!z3) {
                                    }
                                    z15 = z3;
                                    i5 = 8;
                                    if (i41 <= i5) {
                                    }
                                    i40 = i41;
                                    z14 = z2;
                                    z96Var6 = z96Var;
                                }
                                try {
                                    j7gVar.f(j7gVar.k((o86) this.K0.get()), j7gVar.k(o86Var6), 0, 5);
                                    this.K0 = null;
                                } catch (Exception e2) {
                                    e = e2;
                                    z16 = true;
                                    e.printStackTrace();
                                    z96Var = z96Var6;
                                    System.out.println("EXCEPTION : " + e);
                                    if (z16) {
                                    }
                                    if (!z2) {
                                    }
                                    max = Math.max(this.d0, r());
                                    if (max > r()) {
                                    }
                                    max2 = Math.max(this.e0, l());
                                    if (max2 > l()) {
                                    }
                                    if (!z3) {
                                    }
                                    z15 = z3;
                                    i5 = 8;
                                    if (i41 <= i5) {
                                    }
                                    i40 = i41;
                                    z14 = z2;
                                    z96Var6 = z96Var;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                o86Var2 = o86Var6;
                            }
                        }
                        WeakReference weakReference2 = this.M0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            j7gVar.f(j7gVar.k(this.M), j7gVar.k((o86) this.M0.get()), 0, 5);
                            this.M0 = null;
                        }
                        WeakReference weakReference3 = this.L0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            o86 o86Var7 = o86Var;
                            try {
                                o86Var = o86Var7;
                                j7gVar.f(j7gVar.k((o86) this.L0.get()), j7gVar.k(o86Var7), 0, 5);
                                this.L0 = null;
                            } catch (Exception e4) {
                                e = e4;
                                o86Var = o86Var7;
                                z16 = true;
                                e.printStackTrace();
                                z96Var = z96Var6;
                                System.out.println("EXCEPTION : " + e);
                                if (z16) {
                                }
                                if (!z2) {
                                }
                                max = Math.max(this.d0, r());
                                if (max > r()) {
                                }
                                max2 = Math.max(this.e0, l());
                                if (max2 > l()) {
                                }
                                if (!z3) {
                                }
                                z15 = z3;
                                i5 = 8;
                                if (i41 <= i5) {
                                }
                                i40 = i41;
                                z14 = z2;
                                z96Var6 = z96Var;
                            }
                        }
                        WeakReference weakReference4 = this.N0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            try {
                            } catch (Exception e5) {
                                e = e5;
                            }
                            try {
                                j7gVar.f(j7gVar.k(this.L), j7gVar.k((o86) this.N0.get()), 0, 5);
                            } catch (Exception e6) {
                                e = e6;
                                z16 = true;
                                e.printStackTrace();
                                z96Var = z96Var6;
                                System.out.println("EXCEPTION : " + e);
                                if (z16) {
                                }
                                if (!z2) {
                                }
                                max = Math.max(this.d0, r());
                                if (max > r()) {
                                }
                                max2 = Math.max(this.e0, l());
                                if (max2 > l()) {
                                }
                                if (!z3) {
                                }
                                z15 = z3;
                                i5 = 8;
                                if (i41 <= i5) {
                                }
                                i40 = i41;
                                z14 = z2;
                                z96Var6 = z96Var;
                            }
                            try {
                                this.N0 = null;
                            } catch (Exception e7) {
                                e = e7;
                                z16 = true;
                                e.printStackTrace();
                                z96Var = z96Var6;
                                System.out.println("EXCEPTION : " + e);
                                if (z16) {
                                }
                                if (!z2) {
                                }
                                max = Math.max(this.d0, r());
                                if (max > r()) {
                                }
                                max2 = Math.max(this.e0, l());
                                if (max2 > l()) {
                                }
                                if (!z3) {
                                }
                                z15 = z3;
                                i5 = 8;
                                if (i41 <= i5) {
                                }
                                i40 = i41;
                                z14 = z2;
                                z96Var6 = z96Var;
                            }
                        }
                        j7gVar.p();
                        z96Var = z96Var6;
                        z16 = true;
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Exception e9) {
                    e = e9;
                    z3 = z15;
                    e.printStackTrace();
                    z96Var = z96Var6;
                    System.out.println("EXCEPTION : " + e);
                    if (z16) {
                    }
                    if (!z2) {
                    }
                    max = Math.max(this.d0, r());
                    if (max > r()) {
                    }
                    max2 = Math.max(this.e0, l());
                    if (max2 > l()) {
                    }
                    if (!z3) {
                    }
                    z15 = z3;
                    i5 = 8;
                    if (i41 <= i5) {
                    }
                    i40 = i41;
                    z14 = z2;
                    z96Var6 = z96Var;
                }
            } catch (Exception e10) {
                e = e10;
                z2 = z14;
            }
            if (z16) {
                zArr[2] = false;
                boolean X2 = X(64);
                R(j7gVar, X2);
                int size6 = this.u0.size();
                z4 = false;
                int i43 = 0;
                while (i43 < size6) {
                    aa6 aa6Var13 = (aa6) this.u0.get(i43);
                    aa6Var13.R(j7gVar, X2);
                    boolean z17 = X2;
                    int i44 = size6;
                    if (aa6Var13.h != -1 || aa6Var13.i != -1) {
                        z4 = true;
                    }
                    i43++;
                    X2 = z17;
                    size6 = i44;
                }
            } else {
                R(j7gVar, X);
                for (int i45 = 0; i45 < i38; i45++) {
                    ((aa6) this.u0.get(i45)).R(j7gVar, X);
                }
                z4 = false;
            }
            if (!z2 && i41 < 8) {
                if (zArr[2]) {
                    int i46 = 0;
                    int i47 = 0;
                    for (int i48 = 0; i48 < i38; i48++) {
                        aa6 aa6Var14 = (aa6) this.u0.get(i48);
                        i47 = Math.max(i47, aa6Var14.r() + aa6Var14.a0);
                        i46 = Math.max(i46, aa6Var14.l() + aa6Var14.b0);
                    }
                    int max5 = Math.max(this.d0, i47);
                    int max6 = Math.max(this.e0, i46);
                    if (z96Var4 == z96Var9 && r() < max5) {
                        P(max5);
                        this.U[0] = z96Var9;
                        z4 = true;
                        z3 = true;
                    }
                    if (z96Var3 == z96Var9 && l() < max6) {
                        M(max6);
                        this.U[1] = z96Var9;
                        z4 = true;
                        z3 = true;
                    }
                }
            }
            max = Math.max(this.d0, r());
            if (max > r()) {
                P(max);
                this.U[0] = z96Var;
                z4 = true;
                z3 = true;
            }
            max2 = Math.max(this.e0, l());
            if (max2 > l()) {
                M(max2);
                r15 = 1;
                this.U[1] = z96Var;
                z4 = true;
                z3 = true;
            } else {
                r15 = 1;
            }
            if (!z3) {
                if (this.U[0] == z96Var9 && i4 > 0 && r() > i4) {
                    this.I0 = r15;
                    this.U[0] = z96Var;
                    P(i4);
                    z4 = r15;
                    z3 = z4;
                }
                if (this.U[r15] == z96Var9 && i3 > 0 && l() > i3) {
                    this.J0 = r15;
                    this.U[r15] = z96Var;
                    M(i3);
                    i5 = 8;
                    z15 = true;
                    z4 = true;
                    z16 = i41 <= i5 ? false : z4;
                    i40 = i41;
                    z14 = z2;
                    z96Var6 = z96Var;
                }
            }
            z15 = z3;
            i5 = 8;
            if (i41 <= i5) {
            }
            i40 = i41;
            z14 = z2;
            z96Var6 = z96Var;
        }
        boolean z18 = z15;
        this.u0 = arrayList23;
        if (z18) {
            z96[] z96VarArr9 = this.U;
            z96VarArr9[0] = z96Var4;
            z96VarArr9[1] = z96Var3;
        }
        G(j7gVar.m);
    }

    public final boolean X(int i) {
        return (this.H0 & i) == i;
    }

    @Override // defpackage.aa6
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append(StringUtil.LF);
        sb.append("  actualHeight:" + this.X);
        sb.append(StringUtil.LF);
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((aa6) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
