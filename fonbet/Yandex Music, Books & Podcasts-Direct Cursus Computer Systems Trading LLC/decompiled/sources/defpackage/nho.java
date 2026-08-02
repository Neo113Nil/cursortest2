package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nho implements kfh, fho {
    public final mx0 a;
    public final hz2 b;

    public nho(mx0 mx0Var, hz2 hz2Var) {
        this.a = mx0Var;
        this.b = hz2Var;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        int L = fxeVar.L(this.a.o());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ffh ffhVar = (ffh) list.get(i4);
            float J = u1g.J(u1g.I(ffhVar));
            int J2 = ffhVar.J(i);
            if (J == 0.0f) {
                i3 += J2;
            } else if (J > 0.0f) {
                f += J;
                i2 = Math.max(i2, Math.round(J2 / J));
            }
        }
        return ((list.size() - 1) * L) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        return w1g.x(this, ga6.k(j), ga6.j(j), ga6.i(j), ga6.h(j), mfhVar.L(this.a.o()), mfhVar, list, new ksk[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        int L = fxeVar.L(this.a.o());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ffh ffhVar = (ffh) list.get(i4);
            float J = u1g.J(u1g.I(ffhVar));
            int G = ffhVar.G(i);
            if (J == 0.0f) {
                i3 += G;
            } else if (J > 0.0f) {
                f += J;
                i2 = Math.max(i2, Math.round(G / J));
            }
        }
        return ((list.size() - 1) * L) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        int L = fxeVar.L(this.a.o());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * L, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ffh ffhVar = (ffh) list.get(i3);
            float J = u1g.J(u1g.I(ffhVar));
            if (J == 0.0f) {
                int min2 = Math.min(ffhVar.J(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, ffhVar.a(min2));
            } else if (J > 0.0f) {
                f += J;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ffh ffhVar2 = (ffh) list.get(i4);
            float J2 = u1g.J(u1g.I(ffhVar2));
            if (J2 > 0.0f) {
                i2 = Math.max(i2, ffhVar2.a(round != Integer.MAX_VALUE ? Math.round(round * J2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        int L = fxeVar.L(this.a.o());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * L, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ffh ffhVar = (ffh) list.get(i3);
            float J = u1g.J(u1g.I(ffhVar));
            if (J == 0.0f) {
                int min2 = Math.min(ffhVar.J(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, ffhVar.z(min2));
            } else if (J > 0.0f) {
                f += J;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ffh ffhVar2 = (ffh) list.get(i4);
            float J2 = u1g.J(u1g.I(ffhVar2));
            if (J2 > 0.0f) {
                i2 = Math.max(i2, ffhVar2.z(round != Integer.MAX_VALUE ? Math.round(round * J2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nho)) {
            return false;
        }
        nho nhoVar = (nho) obj;
        return Intrinsics.d(this.a, nhoVar.a) && Intrinsics.d(this.b, nhoVar.b);
    }

    @Override // defpackage.fho
    public final void f(int i, int[] iArr, int[] iArr2, mfh mfhVar) {
        this.a.w(mfhVar, i, iArr, mfhVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.fho
    public final lfh g(ksk[] kskVarArr, mfh mfhVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return mfh.m0(mfhVar, i2, i3, new mho(kskVarArr, this, i3, i, iArr));
    }

    @Override // defpackage.fho
    public final int h(ksk kskVar) {
        return kskVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.fho
    public final int i(ksk kskVar) {
        return kskVar.a;
    }

    @Override // defpackage.fho
    public final long j(int i, int i2, int i3, boolean z) {
        return !z ? ia6.a(i, i2, 0, i3) : qld.A(i, i2, 0, i3);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
