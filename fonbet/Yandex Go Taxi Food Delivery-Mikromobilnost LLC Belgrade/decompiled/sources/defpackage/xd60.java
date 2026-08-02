package defpackage;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xd60 extends ee60 {
    public final e530 c;
    public s f;
    public tvd0 g;
    public boolean h;
    public final yvd0 d = new yvd0();
    public final rnz e = new rnz(2);
    public boolean i = true;
    public boolean j = true;

    public xd60(e530 e530Var) {
        this.c = e530Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.ee60
    public final boolean a(rnz rnzVar, rzx rzxVar, tis0 tis0Var, boolean z) {
        yvd0 yvd0Var;
        rnz rnzVar2;
        Object obj;
        boolean z2;
        boolean z3;
        tvd0 tvd0Var;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        int i3;
        boolean a = super.a(rnzVar, rzxVar, tis0Var, z);
        lqh lqhVar = this.c;
        boolean z6 = true;
        if (lqhVar.isAttached()) {
            ?? r8 = 0;
            while (lqhVar != 0) {
                if (lqhVar instanceof gwd0) {
                    this.f = py91.f((gwd0) lqhVar);
                } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                    e530 e530Var = lqhVar.b;
                    int i4 = 0;
                    lqhVar = lqhVar;
                    r8 = r8;
                    while (e530Var != null) {
                        if ((e530Var.getKindSet$ui() & 16) != 0) {
                            i4++;
                            r8 = r8;
                            if (i4 == 1) {
                                lqhVar = e530Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new wz40(new e530[16]);
                                }
                                if (lqhVar != 0) {
                                    r8.b(lqhVar);
                                    lqhVar = 0;
                                }
                                r8.b(e530Var);
                            }
                        }
                        e530Var = e530Var.getChild$ui();
                        lqhVar = lqhVar;
                        r8 = r8;
                    }
                    if (i4 == 1) {
                    }
                }
                lqhVar = qje.c(r8);
            }
            if (this.f != null) {
                int j = rnzVar.j();
                int i5 = 0;
                while (true) {
                    yvd0Var = this.d;
                    rnzVar2 = this.e;
                    if (i5 >= j) {
                        break;
                    }
                    long g = rnzVar.g(i5);
                    zvd0 zvd0Var = (zvd0) rnzVar.l(i5);
                    if (yvd0Var.c(g)) {
                        long g2 = zvd0Var.g();
                        z5 = z6;
                        long e = zvd0Var.e();
                        if ((((g2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((e & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(zvd0Var.c().size());
                            List c = zvd0Var.c();
                            z4 = a;
                            int size = c.size();
                            i = j;
                            int i6 = 0;
                            while (i6 < size) {
                                plu pluVar = (plu) c.get(i6);
                                int i7 = size;
                                int i8 = i6;
                                long c2 = pluVar.c();
                                if ((((c2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    i3 = i5;
                                    arrayList.add(new plu(pluVar.e(), this.f.U(rzxVar, c2), pluVar.d(), pluVar.b(), pluVar.a()));
                                } else {
                                    i3 = i5;
                                }
                                i6 = i8 + 1;
                                size = i7;
                                i5 = i3;
                            }
                            i2 = i5;
                            rnzVar2.h(g, zvd0.b(zvd0Var, this.f.U(rzxVar, e), this.f.U(rzxVar, g2), arrayList));
                            i5 = i2 + 1;
                            z6 = z5;
                            a = z4;
                            j = i;
                        } else {
                            z4 = a;
                            i = j;
                        }
                    } else {
                        z4 = a;
                        i = j;
                        z5 = z6;
                    }
                    i2 = i5;
                    i5 = i2 + 1;
                    z6 = z5;
                    a = z4;
                    j = i;
                }
                boolean z7 = a;
                boolean z8 = z6;
                if (rnzVar2.f()) {
                    yvd0Var.b();
                    this.a.g();
                    return z8;
                }
                int e2 = yvd0Var.e();
                while (true) {
                    e2--;
                    if (-1 >= e2) {
                        break;
                    }
                    if (rnzVar.e(yvd0Var.d(e2)) < 0) {
                        yvd0Var.h(e2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(rnzVar2.j());
                int j2 = rnzVar2.j();
                for (int i9 = 0; i9 < j2; i9++) {
                    arrayList2.add(rnzVar2.l(i9));
                }
                tvd0 tvd0Var2 = new tvd0(arrayList2, tis0Var);
                List a2 = tvd0Var2.a();
                int size2 = a2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = a2.get(i10);
                    if (tis0Var.C(((zvd0) obj).d())) {
                        break;
                    }
                    i10++;
                }
                zvd0 zvd0Var2 = (zvd0) obj;
                if (zvd0Var2 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.i && (zvd0Var2.f() || zvd0Var2.h())) {
                            this.i = !kx91.e(this.f.c, zvd0Var2);
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    if (this.i != this.h && (rx91.e(tvd0Var2.d(), 3) || rx91.e(tvd0Var2.d(), 4) || rx91.e(tvd0Var2.d(), 5))) {
                        tvd0Var2.e(this.i ? 4 : 5);
                    } else if (rx91.e(tvd0Var2.d(), 4) && this.h && !this.j) {
                        tvd0Var2.e(3);
                    } else if (rx91.e(tvd0Var2.d(), 5) && this.i && zvd0Var2.f()) {
                        tvd0Var2.e(3);
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && rx91.e(tvd0Var2.d(), 3) && (tvd0Var = this.g) != null && tvd0Var.a().size() == tvd0Var2.a().size()) {
                    int size3 = tvd0Var2.a().size();
                    for (?? r5 = z2; r5 < size3; r5++) {
                        if (wu60.c(((zvd0) tvd0Var.a().get(r5)).e(), ((zvd0) tvd0Var2.a().get(r5)).e())) {
                        }
                    }
                    z3 = z2;
                    this.g = tvd0Var2;
                    return z3;
                }
                z3 = z8;
                this.g = tvd0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.ee60
    public final void b(tis0 tis0Var) {
        super.b(tis0Var);
        tvd0 tvd0Var = this.g;
        if (tvd0Var == null) {
            return;
        }
        this.h = this.i;
        List a = tvd0Var.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            zvd0 zvd0Var = (zvd0) a.get(i);
            boolean f = zvd0Var.f();
            boolean C = tis0Var.C(zvd0Var.d());
            boolean z = this.i;
            if ((!f && !C) || (!f && !z)) {
                this.d.g(zvd0Var.d());
            }
        }
        this.i = false;
        this.j = rx91.e(tvd0Var.d(), 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wz40] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [wz40] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e530] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [e530] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        wz40 wz40Var = this.a;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((xd60) objArr[i2]).c();
        }
        lqh lqhVar = this.c;
        ?? r1 = 0;
        while (lqhVar != 0) {
            if (lqhVar instanceof gwd0) {
                ((gwd0) lqhVar).D();
            } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                e530 e530Var = lqhVar.b;
                int i3 = 0;
                r1 = r1;
                lqhVar = lqhVar;
                while (e530Var != null) {
                    if ((e530Var.getKindSet$ui() & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            lqhVar = e530Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new wz40(new e530[16]);
                            }
                            if (lqhVar != 0) {
                                r1.b(lqhVar);
                                lqhVar = 0;
                            }
                            r1.b(e530Var);
                        }
                    }
                    e530Var = e530Var.getChild$ui();
                    r1 = r1;
                    lqhVar = lqhVar;
                }
                if (i3 == 1) {
                }
            }
            lqhVar = qje.c(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(tis0 tis0Var) {
        LayoutNode layoutNode;
        rnz rnzVar = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!rnzVar.f()) {
            e530 e530Var = this.c;
            if (e530Var.isAttached()) {
                s coordinator$ui = e530Var.getCoordinator$ui();
                if ((coordinator$ui == null || (layoutNode = coordinator$ui.I) == null) ? false : layoutNode.G()) {
                    tvd0 tvd0Var = this.g;
                    long j = this.f.c;
                    lqh lqhVar = e530Var;
                    ?? r8 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof gwd0) {
                            ((gwd0) lqhVar).m0(tvd0Var, PointerEventPass.Final, j);
                        } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var2 = lqhVar.b;
                            int i = 0;
                            lqhVar = lqhVar;
                            r8 = r8;
                            while (e530Var2 != null) {
                                if ((e530Var2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        lqhVar = e530Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new wz40(new e530[16]);
                                        }
                                        if (lqhVar != 0) {
                                            r8.b(lqhVar);
                                            lqhVar = 0;
                                        }
                                        r8.b(e530Var2);
                                    }
                                }
                                e530Var2 = e530Var2.getChild$ui();
                                lqhVar = lqhVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        lqhVar = qje.c(r8);
                    }
                    if (e530Var.isAttached()) {
                        wz40 wz40Var = this.a;
                        Object[] objArr = wz40Var.a;
                        int i2 = wz40Var.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((xd60) objArr[i3]).d(tis0Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(tis0Var);
        rnzVar.clear();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e530] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e530] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [e530] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [wz40] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [wz40] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [wz40] */
    public final boolean e(tis0 tis0Var, boolean z) {
        LayoutNode layoutNode;
        if (!this.e.f()) {
            lqh lqhVar = this.c;
            if (lqhVar.isAttached()) {
                s coordinator$ui = lqhVar.getCoordinator$ui();
                if ((coordinator$ui == null || (layoutNode = coordinator$ui.I) == null) ? false : layoutNode.G()) {
                    tvd0 tvd0Var = this.g;
                    long j = this.f.c;
                    lqh lqhVar2 = lqhVar;
                    ?? r7 = 0;
                    while (lqhVar2 != 0) {
                        if (lqhVar2 instanceof gwd0) {
                            ((gwd0) lqhVar2).m0(tvd0Var, PointerEventPass.Initial, j);
                        } else if ((lqhVar2.getKindSet$ui() & 16) != 0 && (lqhVar2 instanceof lqh)) {
                            e530 e530Var = lqhVar2.b;
                            int i = 0;
                            lqhVar2 = lqhVar2;
                            r7 = r7;
                            while (e530Var != null) {
                                if ((e530Var.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r7 = r7;
                                    if (i == 1) {
                                        lqhVar2 = e530Var;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new wz40(new e530[16]);
                                        }
                                        if (lqhVar2 != 0) {
                                            r7.b(lqhVar2);
                                            lqhVar2 = 0;
                                        }
                                        r7.b(e530Var);
                                    }
                                }
                                e530Var = e530Var.getChild$ui();
                                lqhVar2 = lqhVar2;
                                r7 = r7;
                            }
                            if (i == 1) {
                            }
                        }
                        lqhVar2 = qje.c(r7);
                    }
                    if (lqhVar.isAttached()) {
                        wz40 wz40Var = this.a;
                        Object[] objArr = wz40Var.a;
                        int i2 = wz40Var.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((xd60) objArr[i3]).e(tis0Var, z);
                        }
                    }
                    if (lqhVar.isAttached()) {
                        ?? r13 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof gwd0) {
                                ((gwd0) lqhVar).m0(tvd0Var, PointerEventPass.Main, j);
                            } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var2 = lqhVar.b;
                                int i4 = 0;
                                lqhVar = lqhVar;
                                r13 = r13;
                                while (e530Var2 != null) {
                                    if ((e530Var2.getKindSet$ui() & 16) != 0) {
                                        i4++;
                                        r13 = r13;
                                        if (i4 == 1) {
                                            lqhVar = e530Var2;
                                        } else {
                                            if (r13 == 0) {
                                                r13 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r13.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r13.b(e530Var2);
                                        }
                                    }
                                    e530Var2 = e530Var2.getChild$ui();
                                    lqhVar = lqhVar;
                                    r13 = r13;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lqhVar = qje.c(r13);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, xy40 xy40Var) {
        yvd0 yvd0Var = this.d;
        if (yvd0Var.c(j) && xy40Var.c(this) < 0) {
            yvd0Var.g(j);
            this.e.i(j);
        }
        wz40 wz40Var = this.a;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((xd60) objArr[i2]).f(j, xy40Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
