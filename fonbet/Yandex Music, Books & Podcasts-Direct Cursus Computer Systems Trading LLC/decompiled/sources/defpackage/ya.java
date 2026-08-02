package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ya extends b6 {
    public static ya e;
    public static final i2o f = i2o.b;
    public static final i2o g = i2o.a;
    public cds d;

    @Override // defpackage.b6
    public final int[] G(int i) {
        int i2;
        if (t().length() > 0 && i > 0) {
            int length = t().length();
            cds cdsVar = this.d;
            i2o i2oVar = g;
            if (i > length) {
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                i2 = cdsVar.b.e(t().length());
            } else {
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                int e2 = cdsVar.b.e(i);
                i2 = O(e2, i2oVar) + 1 == i ? e2 : e2 - 1;
            }
            if (i2 >= 0) {
                return s(O(i2, f), O(i2, i2oVar) + 1);
            }
        }
        return null;
    }

    public final int O(int i, i2o i2oVar) {
        cds cdsVar = this.d;
        if (cdsVar == null) {
            Intrinsics.j("layoutResult");
            throw null;
        }
        int e2 = cdsVar.e(i);
        cds cdsVar2 = this.d;
        if (cdsVar2 == null) {
            Intrinsics.j("layoutResult");
            throw null;
        }
        i2o f2 = cdsVar2.f(e2);
        cds cdsVar3 = this.d;
        if (i2oVar != f2) {
            if (cdsVar3 != null) {
                return cdsVar3.e(i);
            }
            Intrinsics.j("layoutResult");
            throw null;
        }
        if (cdsVar3 != null) {
            return cdsVar3.b.d(i, false) - 1;
        }
        Intrinsics.j("layoutResult");
        throw null;
    }

    @Override // defpackage.b6
    public final int[] o(int i) {
        int i2;
        if (t().length() > 0 && i < t().length()) {
            cds cdsVar = this.d;
            i2o i2oVar = f;
            if (i < 0) {
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                i2 = cdsVar.b.e(0);
            } else {
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                int e2 = cdsVar.b.e(i);
                i2 = O(e2, i2oVar) == i ? e2 : e2 + 1;
            }
            cds cdsVar2 = this.d;
            if (cdsVar2 == null) {
                Intrinsics.j("layoutResult");
                throw null;
            }
            if (i2 < cdsVar2.b.f) {
                return s(O(i2, i2oVar), O(i2, g) + 1);
            }
        }
        return null;
    }
}
