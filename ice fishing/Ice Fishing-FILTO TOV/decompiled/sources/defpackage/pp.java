package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pp implements op {
    public final String EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ pp(String str, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = str;
    }

    @Override // defpackage.op
    public boolean AvO7iQsrTN(CharSequence charSequence, int i, int i2, qb1 qb1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.EljAMC1QTz)) {
            return true;
        }
        qb1Var.X1lG3V04pd = (qb1Var.X1lG3V04pd & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 1:
                return "<" + this.EljAMC1QTz + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.op
    public Object GWasM1elztuh() {
        return this;
    }
}
