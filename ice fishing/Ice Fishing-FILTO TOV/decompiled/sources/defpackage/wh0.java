package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wh0 implements Comparable {
    public final boolean AvO7iQsrTN;
    public final Bundle EljAMC1QTz;
    public final xh0 OOA6hdeuvCS;
    public final int encWxUiV2;
    public final boolean mOu10nynGul;

    public wh0(xh0 xh0Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.OOA6hdeuvCS = xh0Var;
        this.EljAMC1QTz = bundle;
        this.AvO7iQsrTN = z;
        this.encWxUiV2 = i;
        this.mOu10nynGul = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: GWasM1elztuh, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wh0 wh0Var) {
        wh0Var.getClass();
        boolean z = wh0Var.mOu10nynGul;
        boolean z2 = wh0Var.AvO7iQsrTN;
        Bundle bundle = wh0Var.EljAMC1QTz;
        boolean z3 = this.AvO7iQsrTN;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.encWxUiV2 - wh0Var.encWxUiV2;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.EljAMC1QTz;
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
        boolean z4 = this.mOu10nynGul;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
