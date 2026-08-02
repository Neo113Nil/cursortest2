package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wg3 implements kfh {
    public final g40 a;
    public final boolean b;

    public wg3(g40 g40Var, boolean z) {
        this.a = g40Var;
        this.b = z;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        int k;
        int j2;
        ksk M;
        if (list.isEmpty()) {
            return mfh.m0(mfhVar, ga6.k(j), ga6.j(j), rq1.w0);
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            ffh ffhVar = (ffh) list.get(0);
            Object n = ffhVar.n();
            qg3 qg3Var = n instanceof qg3 ? (qg3) n : null;
            if (qg3Var != null ? qg3Var.p : false) {
                k = ga6.k(j);
                j2 = ga6.j(j);
                int k2 = ga6.k(j);
                int j4 = ga6.j(j);
                if (!((j4 >= 0) & (k2 >= 0))) {
                    ume.a("width and height must be >= 0");
                }
                M = ffhVar.M(ia6.h(k2, k2, j4, j4));
            } else {
                M = ffhVar.M(j3);
                k = Math.max(ga6.k(j), M.a);
                j2 = Math.max(ga6.j(j), M.b);
            }
            int i = j2;
            int i2 = k;
            return mfh.m0(mfhVar, i2, i, new vg3(M, ffhVar, mfhVar, i2, i, this));
        }
        ksk[] kskVarArr = new ksk[list.size()];
        vqn vqnVar = new vqn();
        vqnVar.a = ga6.k(j);
        vqn vqnVar2 = new vqn();
        vqnVar2.a = ga6.j(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            ffh ffhVar2 = (ffh) list.get(i3);
            Object n2 = ffhVar2.n();
            qg3 qg3Var2 = n2 instanceof qg3 ? (qg3) n2 : null;
            if (qg3Var2 != null ? qg3Var2.p : false) {
                z = true;
            } else {
                ksk M2 = ffhVar2.M(j3);
                kskVarArr[i3] = M2;
                vqnVar.a = Math.max(vqnVar.a, M2.a);
                vqnVar2.a = Math.max(vqnVar2.a, M2.b);
            }
        }
        if (z) {
            int i4 = vqnVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = vqnVar2.a;
            long a = ia6.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ffh ffhVar3 = (ffh) list.get(i7);
                Object n3 = ffhVar3.n();
                qg3 qg3Var3 = n3 instanceof qg3 ? (qg3) n3 : null;
                if (qg3Var3 != null ? qg3Var3.p : false) {
                    kskVarArr[i7] = ffhVar3.M(a);
                }
            }
        }
        return mfh.m0(mfhVar, vqnVar.a, vqnVar2.a, new a03(kskVarArr, list, mfhVar, vqnVar, vqnVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg3)) {
            return false;
        }
        wg3 wg3Var = (wg3) obj;
        return Intrinsics.d(this.a, wg3Var.a) && this.b == wg3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return dfi.j(sb, this.b, ')');
    }
}
