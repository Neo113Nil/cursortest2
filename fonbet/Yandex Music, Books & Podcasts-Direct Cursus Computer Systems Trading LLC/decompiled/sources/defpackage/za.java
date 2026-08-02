package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class za extends b6 {
    public static za f;
    public static final i2o g = i2o.b;
    public static final i2o h = i2o.a;
    public cds d;
    public qfp e;

    @Override // defpackage.b6
    public final int[] G(int i) {
        int i2;
        if (t().length() > 0 && i > 0) {
            try {
                qfp qfpVar = this.e;
                if (qfpVar == null) {
                    Intrinsics.j("node");
                    throw null;
                }
                ynn e = qfpVar.e();
                int round = Math.round(e.d - e.b);
                int length = t().length();
                if (length <= i) {
                    i = length;
                }
                cds cdsVar = this.d;
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                int e2 = cdsVar.b.e(i);
                cds cdsVar2 = this.d;
                if (cdsVar2 == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                float h2 = cdsVar2.b.h(e2) - round;
                if (h2 > 0.0f) {
                    cds cdsVar3 = this.d;
                    if (cdsVar3 == null) {
                        Intrinsics.j("layoutResult");
                        throw null;
                    }
                    i2 = cdsVar3.b.f(h2);
                } else {
                    i2 = 0;
                }
                if (i == t().length() && i2 < e2) {
                    i2++;
                }
                return s(O(i2, g), i);
            } catch (IllegalStateException unused) {
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
        int e = cdsVar.e(i);
        cds cdsVar2 = this.d;
        if (cdsVar2 == null) {
            Intrinsics.j("layoutResult");
            throw null;
        }
        i2o f2 = cdsVar2.f(e);
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
            try {
                qfp qfpVar = this.e;
                if (qfpVar == null) {
                    Intrinsics.j("node");
                    throw null;
                }
                ynn e = qfpVar.e();
                int round = Math.round(e.d - e.b);
                if (i <= 0) {
                    i = 0;
                }
                cds cdsVar = this.d;
                if (cdsVar == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                int e2 = cdsVar.b.e(i);
                cds cdsVar2 = this.d;
                if (cdsVar2 == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                float h2 = cdsVar2.b.h(e2) + round;
                cds cdsVar3 = this.d;
                if (cdsVar3 == null) {
                    Intrinsics.j("layoutResult");
                    throw null;
                }
                float h3 = cdsVar3.b.h(r0.f - 1);
                cds cdsVar4 = this.d;
                if (h2 < h3) {
                    if (cdsVar4 == null) {
                        Intrinsics.j("layoutResult");
                        throw null;
                    }
                    i2 = cdsVar4.b.f(h2);
                } else {
                    if (cdsVar4 == null) {
                        Intrinsics.j("layoutResult");
                        throw null;
                    }
                    i2 = cdsVar4.b.f;
                }
                return s(i, O(i2 - 1, h) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
