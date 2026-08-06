package defpackage;

/* loaded from: classes.dex */
public final class fn0 implements java.lang.Comparable {
    public final boolean AARZUJiTa;
    public final int EXtogiMhuM;
    public final defpackage.gn0 adDC3e2L;
    public final boolean riuEU0zW4;
    public final android.os.Bundle xiZrDbcSW0;

    public fn0(defpackage.gn0 gn0Var, android.os.Bundle bundle, boolean z, int i, boolean z2) {
        this.adDC3e2L = gn0Var;
        this.xiZrDbcSW0 = bundle;
        this.AARZUJiTa = z;
        this.EXtogiMhuM = i;
        this.riuEU0zW4 = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: IHQe1A4L2xu, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.fn0 fn0Var) {
        fn0Var.getClass();
        boolean z = fn0Var.riuEU0zW4;
        boolean z2 = fn0Var.AARZUJiTa;
        android.os.Bundle bundle = fn0Var.xiZrDbcSW0;
        boolean z3 = this.AARZUJiTa;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.EXtogiMhuM - fn0Var.EXtogiMhuM;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        android.os.Bundle bundle2 = this.xiZrDbcSW0;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.riuEU0zW4;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
