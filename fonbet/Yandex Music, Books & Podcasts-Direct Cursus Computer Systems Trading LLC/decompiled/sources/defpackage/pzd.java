package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pzd implements woh, m0e {
    public final vm7 a;
    public final ym7 b;
    public final sld c;
    public final t6t d;
    public final gra e;
    public final cra f;
    public final xeg g;
    public final x0 h;
    public final zi7 i;
    public final IdentityHashMap j;
    public final f4m k;
    public final rwd l;
    public final boolean m;
    public final int n;
    public final ndl o;
    public final n7b p = new n7b(this);
    public voh q;
    public int r;
    public yvs s;
    public t0e[] t;
    public t0e[] u;
    public int v;
    public qr5 w;

    public pzd(vm7 vm7Var, ym7 ym7Var, sld sldVar, t6t t6tVar, gra graVar, cra craVar, xeg xegVar, x0 x0Var, zi7 zi7Var, rwd rwdVar, boolean z, int i, ndl ndlVar) {
        this.a = vm7Var;
        this.b = ym7Var;
        this.c = sldVar;
        this.d = t6tVar;
        this.e = graVar;
        this.f = craVar;
        this.g = xegVar;
        this.h = x0Var;
        this.i = zi7Var;
        this.l = rwdVar;
        this.m = z;
        this.n = i;
        this.o = ndlVar;
        rwdVar.getClass();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        this.w = new qr5(qsnVar, qsnVar);
        this.j = new IdentityHashMap();
        this.k = new f4m(17);
        this.t = new t0e[0];
        this.u = new t0e[0];
    }

    public static dsc j(dsc dscVar, dsc dscVar2, boolean z) {
        u2i u2iVar;
        int i;
        String str;
        String str2;
        yde ydeVar;
        int i2;
        int i3;
        String str3;
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        if (dscVar2 != null) {
            str2 = dscVar2.k;
            u2iVar = dscVar2.l;
            i2 = dscVar2.D;
            i = dscVar2.e;
            i3 = dscVar2.f;
            str = dscVar2.d;
            str3 = dscVar2.b;
            ydeVar = dscVar2.c;
        } else {
            String y = dvt.y(1, dscVar.k);
            u2iVar = dscVar.l;
            if (z) {
                i2 = dscVar.D;
                i = dscVar.e;
                i3 = dscVar.f;
                str = dscVar.d;
                str3 = dscVar.b;
                str2 = y;
                ydeVar = dscVar.c;
            } else {
                i = 0;
                str = null;
                str2 = y;
                ydeVar = qsnVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String e = l5i.e(str2);
        int i4 = z ? dscVar.h : -1;
        int i5 = z ? dscVar.i : -1;
        bsc bscVar = new bsc();
        bscVar.a = dscVar.a;
        bscVar.b = str3;
        bscVar.c = yde.v(ydeVar);
        bscVar.l = l5i.p(dscVar.m);
        bscVar.m = l5i.p(e);
        bscVar.j = str2;
        bscVar.k = u2iVar;
        bscVar.h = i4;
        bscVar.i = i5;
        bscVar.C = i2;
        bscVar.e = i;
        bscVar.f = i3;
        bscVar.d = str;
        return new dsc(bscVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011e, code lost:
    
        if (r44 != r3.v0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.woh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        aoo[] aooVarArr2;
        int[] iArr;
        boolean z;
        ?? r9;
        lzd lzdVar;
        int i;
        int i2;
        aoo[] aooVarArr3;
        int i3;
        int[] iArr2;
        t0e[] t0eVarArr;
        t0e t0eVar;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        ?? r10;
        int i7;
        int i8;
        zsb[] zsbVarArr2;
        int[] iArr3 = new int[zsbVarArr.length];
        int[] iArr4 = new int[zsbVarArr.length];
        int i9 = 0;
        while (true) {
            int length = zsbVarArr.length;
            identityHashMap = this.j;
            if (i9 >= length) {
                break;
            }
            aoo aooVar = aooVarArr[i9];
            iArr3[i9] = aooVar == null ? -1 : ((Integer) identityHashMap.get(aooVar)).intValue();
            iArr4[i9] = -1;
            zsb zsbVar = zsbVarArr[i9];
            if (zsbVar != null) {
                xvs n = zsbVar.n();
                int i10 = 0;
                while (true) {
                    t0e[] t0eVarArr2 = this.t;
                    if (i10 < t0eVarArr2.length) {
                        t0e t0eVar2 = t0eVarArr2[i10];
                        t0eVar2.p();
                        if (t0eVar2.I.b(n) != -1) {
                            iArr4[i9] = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = zsbVarArr.length;
        aoo[] aooVarArr4 = new aoo[length2];
        int length3 = zsbVarArr.length;
        aoo[] aooVarArr5 = new aoo[length3];
        int length4 = zsbVarArr.length;
        zsb[] zsbVarArr3 = new zsb[length4];
        boolean z5 = false;
        t0e[] t0eVarArr3 = new t0e[this.t.length];
        int i11 = length3;
        int i12 = 0;
        int i13 = 0;
        boolean z6 = false;
        while (i12 < this.t.length) {
            int i14 = length2;
            ?? r7 = z5;
            while (true) {
                aooVarArr2 = aooVarArr4;
                if (r7 >= zsbVarArr.length) {
                    break;
                }
                aooVarArr5[r7] = iArr3[r7] == i12 ? aooVarArr[r7] : null;
                zsbVarArr3[r7] = iArr4[r7] == i12 ? zsbVarArr[r7] : null;
                aooVarArr4 = aooVarArr2;
                r7++;
            }
            t0e t0eVar3 = this.t[i12];
            osh oshVar = t0eVar3.j;
            int i15 = i12;
            lzd lzdVar2 = t0eVar3.d;
            Uri[] uriArr = lzdVar2.e;
            ym7 ym7Var = lzdVar2.g;
            ArrayList arrayList = t0eVar3.n;
            t0eVar3.p();
            int i16 = t0eVar3.E;
            ?? r29 = aooVarArr5;
            ?? r72 = z5;
            while (r72 < length4) {
                p0e p0eVar = (p0e) r29[r72];
                if (p0eVar == null || (zsbVarArr3[r72] != null && zArr[r72])) {
                    i8 = r72;
                    zsbVarArr2 = zsbVarArr3;
                } else {
                    i8 = r72;
                    t0eVar3.E--;
                    zsbVarArr2 = zsbVarArr3;
                    if (p0eVar.c != -1) {
                        t0e t0eVar4 = p0eVar.b;
                        int i17 = p0eVar.a;
                        t0eVar4.p();
                        t0eVar4.K.getClass();
                        int i18 = t0eVar4.K[i17];
                        vq1.A(t0eVar4.Y[i18]);
                        t0eVar4.Y[i18] = z5;
                        p0eVar.c = -1;
                    }
                    r29[i8] = 0;
                }
                zsbVarArr3 = zsbVarArr2;
                r72 = i8 + 1;
            }
            zsb[] zsbVarArr4 = zsbVarArr3;
            boolean z7 = true;
            if (!z6) {
                if (!t0eVar3.y0) {
                    iArr = iArr3;
                } else if (i16 != 0) {
                    iArr = iArr3;
                }
                z = z5;
                zsb zsbVar2 = lzdVar2.q;
                boolean z8 = z;
                zsb zsbVar3 = zsbVar2;
                r9 = z5;
                while (r9 < length4) {
                    int i19 = r9;
                    zsb zsbVar4 = zsbVarArr4[i19];
                    if (zsbVar4 == null) {
                        i7 = length4;
                    } else {
                        i7 = length4;
                        boolean z9 = z8;
                        int b = t0eVar3.I.b(zsbVar4.n());
                        if (b == t0eVar3.L) {
                            xm7 xm7Var = (xm7) ym7Var.d.get(uriArr[lzdVar2.q.r()]);
                            if (xm7Var != null) {
                                xm7Var.k = z5;
                            }
                            lzdVar2.q = zsbVar4;
                            zsbVar3 = zsbVar4;
                        }
                        if (r29[i19] == 0) {
                            t0eVar3.E++;
                            p0e p0eVar2 = new p0e(t0eVar3, b);
                            r29[i19] = p0eVar2;
                            zArr2[i19] = z7;
                            if (t0eVar3.K != null) {
                                p0eVar2.a();
                                if (!z9) {
                                    s0e s0eVar = t0eVar3.v[t0eVar3.K[b]];
                                    z8 = (s0eVar.p() == 0 || s0eVar.C(j, z7)) ? false : true;
                                }
                            }
                        }
                        z8 = z9;
                    }
                    length4 = i7;
                    z5 = false;
                    z7 = true;
                    r9 = i19 + 1;
                }
                int i20 = length4;
                boolean z10 = z8;
                if (t0eVar3.E != 0) {
                    xm7 xm7Var2 = (xm7) ym7Var.d.get(uriArr[lzdVar2.q.r()]);
                    if (xm7Var2 != null) {
                        xm7Var2.k = false;
                    }
                    lzdVar2.n = null;
                    t0eVar3.G = null;
                    t0eVar3.x0 = true;
                    arrayList.clear();
                    if (oshVar.I()) {
                        if (t0eVar3.C) {
                            for (s0e s0eVar2 : t0eVar3.v) {
                                s0eVar2.h();
                            }
                        }
                        oshVar.w();
                    } else {
                        t0eVar3.F();
                    }
                    lzdVar = lzdVar2;
                    i4 = i11;
                    i2 = i14;
                    aooVarArr3 = aooVarArr2;
                    i3 = i15;
                    z3 = z10;
                    iArr2 = iArr4;
                    t0eVarArr = t0eVarArr3;
                    t0eVar = t0eVar3;
                } else {
                    boolean z11 = true;
                    if (arrayList.isEmpty() || Objects.equals(zsbVar3, zsbVar2)) {
                        lzdVar = lzdVar2;
                        i = i11;
                        i2 = i14;
                        aooVarArr3 = aooVarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        t0eVarArr = t0eVarArr3;
                        t0eVar = t0eVar3;
                    } else {
                        if (t0eVar3.y0) {
                            lzdVar = lzdVar2;
                            i = i11;
                            i2 = i14;
                            aooVarArr3 = aooVarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            t0eVarArr = t0eVarArr3;
                            t0eVar = t0eVar3;
                        } else {
                            long j2 = j < 0 ? -j : 0L;
                            ozd y = t0eVar3.y();
                            long j3 = j2;
                            eih[] a = lzdVar2.a(y, j);
                            lzdVar = lzdVar2;
                            List list = t0eVar3.o;
                            i = i11;
                            i2 = i14;
                            aooVarArr3 = aooVarArr2;
                            i3 = i15;
                            iArr2 = iArr4;
                            t0eVarArr = t0eVarArr3;
                            t0eVar = t0eVar3;
                            zsb zsbVar5 = zsbVar3;
                            zsbVar5.m(j, j3, -9223372036854775807L, list, a);
                            if (zsbVar5.r() != lzdVar.h.b(y.d)) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                        }
                        t0eVar.x0 = z11;
                        z2 = z11;
                        z3 = z2;
                        if (z3) {
                            i4 = i;
                        } else {
                            t0eVar.G(j, z2);
                            i4 = i;
                            int i21 = 0;
                            while (i21 < i4) {
                                if (r29[i21] != 0) {
                                    zArr2[i21] = z11;
                                }
                                i21++;
                                z11 = true;
                            }
                        }
                    }
                    z2 = z6;
                    z3 = z10;
                    if (z3) {
                    }
                }
                ArrayList arrayList2 = t0eVar.s;
                arrayList2.clear();
                for (i5 = 0; i5 < i4; i5++) {
                    ?? r8 = r29[i5];
                    if (r8 != 0) {
                        arrayList2.add((p0e) r8);
                    }
                }
                t0eVar.y0 = true;
                i6 = 0;
                z4 = false;
                while (i6 < zsbVarArr.length) {
                    ?? r82 = r29[i6];
                    int i22 = i3;
                    if (iArr2[i6] == i22) {
                        r82.getClass();
                        r10 = aooVarArr3;
                        r10[i6] = r82;
                        identityHashMap.put(r82, Integer.valueOf(i22));
                        z4 = true;
                    } else {
                        r10 = aooVarArr3;
                        if (iArr[i6] == i22) {
                            vq1.A(r82 == 0);
                        }
                    }
                    i6++;
                    aooVarArr3 = r10;
                    i3 = i22;
                }
                aoo[] aooVarArr6 = aooVarArr3;
                int i23 = i3;
                int i24 = i13;
                if (!z4) {
                    t0eVarArr[i24] = t0eVar;
                    i13 = i24 + 1;
                    if (i24 == 0) {
                        lzdVar.l = true;
                        if (!z3) {
                            t0e[] t0eVarArr4 = this.u;
                            if (t0eVarArr4.length != 0 && t0eVar == t0eVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.k.b).clear();
                        z6 = true;
                    } else {
                        lzdVar.l = i23 < this.v;
                    }
                }
                i12 = i23 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                t0eVarArr3 = t0eVarArr;
                aooVarArr5 = r29;
                zsbVarArr3 = zsbVarArr4;
                length2 = i2;
                z5 = false;
                i11 = i4;
                aooVarArr4 = aooVarArr6;
                length4 = i20;
            }
            iArr = iArr3;
            z = true;
            zsb zsbVar22 = lzdVar2.q;
            boolean z82 = z;
            zsb zsbVar32 = zsbVar22;
            r9 = z5;
            while (r9 < length4) {
            }
            int i202 = length4;
            boolean z102 = z82;
            if (t0eVar3.E != 0) {
            }
            ArrayList arrayList22 = t0eVar.s;
            arrayList22.clear();
            while (i5 < i4) {
            }
            t0eVar.y0 = true;
            i6 = 0;
            z4 = false;
            while (i6 < zsbVarArr.length) {
            }
            aoo[] aooVarArr62 = aooVarArr3;
            int i232 = i3;
            int i242 = i13;
            if (!z4) {
            }
            i12 = i232 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            t0eVarArr3 = t0eVarArr;
            aooVarArr5 = r29;
            zsbVarArr3 = zsbVarArr4;
            length2 = i2;
            z5 = false;
            i11 = i4;
            aooVarArr4 = aooVarArr62;
            length4 = i202;
        }
        boolean z12 = z5;
        System.arraycopy(aooVarArr4, z12 ? 1 : 0, aooVarArr, z12 ? 1 : 0, length2);
        t0e[] t0eVarArr5 = (t0e[]) dvt.a0(i13, t0eVarArr3);
        this.u = t0eVarArr5;
        qsn w = yde.w(t0eVarArr5);
        AbstractList O = ldg.O(new kac(27), w);
        this.l.getClass();
        this.w = new qr5(w, O);
        return j;
    }

    @Override // defpackage.m0e
    public final void b() {
        for (t0e t0eVar : this.t) {
            osh oshVar = t0eVar.j;
            ArrayList arrayList = t0eVar.n;
            if (!arrayList.isEmpty()) {
                ozd ozdVar = (ozd) ild.x(arrayList);
                int b = t0eVar.d.b(ozdVar);
                if (b == 1) {
                    ozdVar.K = true;
                } else if (b == 0) {
                    t0eVar.r.post(new juc(3, t0eVar, ozdVar));
                } else if (b == 2 && !t0eVar.z0 && oshVar.I()) {
                    oshVar.w();
                }
            }
        }
        this.q.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        t0e[] t0eVarArr = this.u;
        int length = t0eVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            t0e t0eVar = t0eVarArr[i];
            if (t0eVar.A == 2) {
                lzd lzdVar = t0eVar.d;
                ym7 ym7Var = lzdVar.g;
                int b = lzdVar.q.b();
                Uri[] uriArr = lzdVar.e;
                xzd a = (b >= uriArr.length || b == -1) ? null : ym7Var.a(true, uriArr[lzdVar.q.r()]);
                if (a != null) {
                    yde ydeVar = a.r;
                    if (!ydeVar.isEmpty()) {
                        long j2 = a.h - ym7Var.n;
                        long j3 = j - j2;
                        int c = dvt.c(ydeVar, Long.valueOf(j3), true);
                        long j4 = ((uzd) ydeVar.get(c)).e;
                        return hapVar.a(j3, j4, (!a.c || c == ydeVar.size() - 1) ? j4 : ((uzd) ydeVar.get(c + 1)).e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if ((r8 != null ? defpackage.xm7.a(r8, r4) ^ r13 : false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0058 A[SYNTHETIC] */
    @Override // defpackage.m0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Uri uri, j4x j4xVar, boolean z) {
        boolean z2;
        long j;
        int i;
        int l;
        boolean z3;
        boolean z4;
        mdr L;
        boolean z5 = true;
        for (t0e t0eVar : this.t) {
            lzd lzdVar = t0eVar.d;
            Uri[] uriArr = lzdVar.e;
            if (dvt.l(uriArr, uri)) {
                if (!z && (L = t0eVar.i.L(wxf.r(lzdVar.q), j4xVar)) != null && L.a == 2) {
                    z2 = true;
                    j = L.b;
                    i = 0;
                    while (true) {
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1 && (l = lzdVar.q.l(i)) != -1) {
                        lzdVar.s |= uri.equals(lzdVar.o);
                        if (j != -9223372036854775807L) {
                            if (lzdVar.q.h(l, j)) {
                                xm7 xm7Var = (xm7) lzdVar.g.d.get(uri);
                            }
                            z3 = false;
                            z4 = (z3 || j == -9223372036854775807L) ? false : z2;
                        }
                    }
                    z3 = z2;
                    if (z3) {
                    }
                }
                z2 = true;
                j = -9223372036854775807L;
                i = 0;
                while (true) {
                    if (i < uriArr.length) {
                    }
                    i++;
                }
                if (i != -1) {
                    lzdVar.s |= uri.equals(lzdVar.o);
                    if (j != -9223372036854775807L) {
                    }
                }
                z3 = z2;
                if (z3) {
                }
            } else {
                z4 = true;
            }
            z5 &= z4;
        }
        this.q.b(this);
        return z5;
    }

    @Override // defpackage.ahp
    public final long e() {
        return this.w.e();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.w.f();
    }

    public final t0e g(String str, int i, Uri[] uriArr, dsc[] dscVarArr, dsc dscVar, List list, Map map, long j) {
        return new t0e(str, i, this.p, new lzd(this.a, this.b, uriArr, dscVarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, dscVar, this.e, this.f, this.g, this.h, this.n);
    }

    @Override // defpackage.woh
    public final long h(long j) {
        t0e[] t0eVarArr = this.u;
        if (t0eVarArr.length > 0) {
            boolean G = t0eVarArr[0].G(j, false);
            int i = 1;
            while (true) {
                t0e[] t0eVarArr2 = this.u;
                if (i >= t0eVarArr2.length) {
                    break;
                }
                t0eVarArr2[i].G(j, G);
                i++;
            }
            if (G) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }

    @Override // defpackage.woh
    public final long i() {
        return -9223372036854775807L;
    }

    @Override // defpackage.woh
    public final void k() {
        for (t0e t0eVar : this.t) {
            t0eVar.C();
            if (t0eVar.z0 && !t0eVar.D) {
                throw r7k.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        vm7 vm7Var;
        boolean z;
        List list;
        List list2;
        t0e[] t0eVarArr;
        HashSet hashSet;
        int i;
        boolean z2;
        vm7 vm7Var2;
        int i2;
        boolean z3;
        Uri[] uriArr;
        this.q = vohVar;
        ym7 ym7Var = this.b;
        ym7Var.getClass();
        ym7Var.e.add(this);
        h0e h0eVar = ym7Var.j;
        h0eVar.getClass();
        List list3 = h0eVar.f;
        List list4 = h0eVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = h0eVar.g;
        int i3 = 0;
        this.r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        vm7 vm7Var3 = this.a;
        boolean z4 = this.m;
        if (isEmpty) {
            vm7Var = vm7Var3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            dsc dscVar = h0eVar.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                list2 = list5;
                if (i4 >= list4.size()) {
                    break;
                }
                dsc dscVar2 = ((g0e) list4.get(i4)).b;
                int i6 = dscVar2.v;
                String str = dscVar2.k;
                if (i6 > 0 || dvt.y(2, str) != null) {
                    iArr[i4] = 2;
                    i5++;
                } else if (dvt.y(1, str) != null) {
                    iArr[i4] = 1;
                    i3++;
                } else {
                    iArr[i4] = -1;
                }
                i4++;
                list5 = list2;
            }
            if (i5 > 0) {
                z3 = false;
                vm7Var2 = vm7Var3;
                i2 = i5;
                z2 = true;
            } else if (i3 < size) {
                z2 = false;
                vm7Var2 = vm7Var3;
                i2 = size - i3;
                z3 = true;
            } else {
                z2 = false;
                vm7Var2 = vm7Var3;
                i2 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i2];
            dsc[] dscVarArr = new dsc[i2];
            int[] iArr2 = new int[i2];
            int i7 = 0;
            int i8 = 0;
            while (i7 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i7] != 2) {
                        i7++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i7] != 1) {
                    g0e g0eVar = (g0e) list4.get(i7);
                    uriArr[i8] = g0eVar.a;
                    dscVarArr[i8] = g0eVar.b;
                    iArr2[i8] = i7;
                    i8++;
                }
                i7++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = dscVarArr[0].k;
            int x = dvt.x(2, str2);
            int x2 = dvt.x(1, str2);
            boolean z5 = (x2 == 1 || (x2 == 0 && list3.isEmpty())) && x <= 1 && x2 + x > 0;
            vm7 vm7Var4 = vm7Var2;
            list = list3;
            z = z4;
            t0e g = g("main", (z2 || x2 <= 0) ? 0 : 1, uriArr3, dscVarArr, h0eVar.h, h0eVar.i, map, j);
            arrayList.add(g);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (x > 0) {
                    dsc[] dscVarArr2 = new dsc[i2];
                    int i9 = 0;
                    while (i9 < i2) {
                        dsc dscVar3 = dscVarArr[i9];
                        String y = dvt.y(2, dscVar3.k);
                        String e = l5i.e(y);
                        bsc bscVar = new bsc();
                        bscVar.a = dscVar3.a;
                        bscVar.b = dscVar3.b;
                        bscVar.c = yde.v(dscVar3.c);
                        bscVar.l = l5i.p(dscVar3.m);
                        bscVar.m = l5i.p(e);
                        bscVar.j = y;
                        bscVar.k = dscVar3.l;
                        bscVar.h = dscVar3.h;
                        bscVar.i = dscVar3.i;
                        bscVar.t = dscVar3.u;
                        bscVar.u = dscVar3.v;
                        bscVar.v = dscVar3.w;
                        bscVar.e = dscVar3.e;
                        bscVar.f = dscVar3.f;
                        dscVarArr2[i9] = new dsc(bscVar);
                        i9++;
                        dscVarArr = dscVarArr;
                    }
                    dsc[] dscVarArr3 = dscVarArr;
                    arrayList3.add(new xvs("main", dscVarArr2));
                    if (x2 > 0 && (dscVar != null || list.isEmpty())) {
                        arrayList3.add(new xvs("main:audio", j(dscVarArr3[0], dscVar, false)));
                    }
                    List list6 = h0eVar.i;
                    if (list6 != null) {
                        for (int i10 = 0; i10 < list6.size(); i10++) {
                            arrayList3.add(new xvs(k5r.i(i10, "main:cc:"), vm7Var4.d((dsc) list6.get(i10))));
                        }
                    }
                    vm7Var = vm7Var4;
                } else {
                    vm7Var = vm7Var4;
                    dsc[] dscVarArr4 = new dsc[i2];
                    for (int i11 = 0; i11 < i2; i11++) {
                        dscVarArr4[i11] = j(dscVarArr[i11], dscVar, true);
                    }
                    arrayList3.add(new xvs("main", dscVarArr4));
                }
                bsc bscVar2 = new bsc();
                bscVar2.a = "ID3";
                bscVar2.m = l5i.p("application/id3");
                xvs xvsVar = new xvs("main:id3", new dsc(bscVar2));
                arrayList3.add(xvsVar);
                g.D((xvs[]) arrayList3.toArray(new xvs[0]), arrayList3.indexOf(xvsVar));
            } else {
                vm7Var = vm7Var4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        while (i12 < list.size()) {
            List list7 = list;
            String str3 = ((f0e) list7.get(i12)).c;
            if (hashSet2.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (str3.equals(((f0e) list7.get(i13)).c)) {
                        f0e f0eVar = (f0e) list7.get(i13);
                        arrayList6.add(Integer.valueOf(i13));
                        Uri uri = f0eVar.a;
                        dsc dscVar4 = f0eVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(dscVar4);
                        z6 &= dvt.x(1, dscVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                int i14 = dvt.a;
                list = list7;
                hashSet = hashSet2;
                i = i12;
                t0e g2 = g(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (dsc[]) arrayList5.toArray(new dsc[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(zc4.Y(arrayList6));
                arrayList.add(g2);
                if (z && z6) {
                    g2.D(new xvs[]{new xvs(concat, (dsc[]) arrayList5.toArray(new dsc[0]))}, new int[0]);
                }
            } else {
                hashSet = hashSet2;
                i = i12;
                list = list7;
            }
            i12 = i + 1;
            hashSet2 = hashSet;
        }
        this.v = arrayList.size();
        for (int i15 = 0; i15 < list2.size(); i15++) {
            f0e f0eVar2 = (f0e) list2.get(i15);
            StringBuilder q = k5r.q(i15, "subtitle:", StringUtils.PROCESS_POSTFIX_DELIMITER);
            q.append(f0eVar2.c);
            String sb = q.toString();
            dsc dscVar5 = f0eVar2.b;
            t0e g3 = g(sb, 3, new Uri[]{f0eVar2.a}, new dsc[]{dscVar5}, null, Collections.EMPTY_LIST, map, j);
            arrayList2.add(new int[]{i15});
            arrayList.add(g3);
            g3.D(new xvs[]{new xvs(sb, vm7Var.d(dscVar5))}, new int[0]);
        }
        this.t = (t0e[]) arrayList.toArray(new t0e[0]);
        this.r = this.t.length;
        int i16 = 0;
        while (true) {
            int i17 = this.v;
            t0eVarArr = this.t;
            if (i16 >= i17) {
                break;
            }
            t0eVarArr[i16].d.l = true;
            i16++;
        }
        for (t0e t0eVar : t0eVarArr) {
            if (!t0eVar.D) {
                chg chgVar = new chg();
                chgVar.a = t0eVar.v0;
                t0eVar.n(new dhg(chgVar));
            }
        }
        this.u = this.t;
    }

    @Override // defpackage.woh
    public final yvs m() {
        yvs yvsVar = this.s;
        yvsVar.getClass();
        return yvsVar;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        if (this.s != null) {
            return this.w.n(dhgVar);
        }
        for (t0e t0eVar : this.t) {
            if (!t0eVar.D) {
                chg chgVar = new chg();
                chgVar.a = t0eVar.v0;
                t0eVar.n(new dhg(chgVar));
            }
        }
        return false;
    }

    @Override // defpackage.ahp
    public final long r() {
        return this.w.r();
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        for (t0e t0eVar : this.u) {
            if (t0eVar.C && !t0eVar.A()) {
                int length = t0eVar.v.length;
                for (int i = 0; i < length; i++) {
                    t0eVar.v[i].g(j, z, t0eVar.Y[i]);
                }
            }
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        this.w.t(j);
    }
}
