package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k80 {
    public final u80 GWasM1elztuh;
    public final c70 X1lG3V04pd;
    public final i80 Yi7zF1RB1;
    public final x0 xqGvceK5x;

    public k80(u80 u80Var, i80 i80Var, c70 c70Var, x0 x0Var) {
        this.GWasM1elztuh = u80Var;
        this.Yi7zF1RB1 = i80Var;
        this.X1lG3V04pd = c70Var;
        this.xqGvceK5x = x0Var;
    }

    public final void GWasM1elztuh(final int i, Object obj, qx qxVar, int i2) {
        int i3;
        Object obj2;
        qx qxVar2;
        qxVar.Uxq83abb04(-462424778);
        int i4 = (qxVar.xqGvceK5x(i) ? 4 : 2) | i2 | (qxVar.encWxUiV2(obj) ? 32 : 16) | (qxVar.EljAMC1QTz(this) ? 256 : 128);
        if (qxVar.dqB83aoLBB(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            qxVar2 = qxVar;
            n4.GWasM1elztuh(obj2, i3, this.GWasM1elztuh.Mjvvu5DE, rj0.YZjbz8VdP5(-824725566, new lv() { // from class: j80
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj3, Object obj4) {
                    qx qxVar3 = (qx) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (qxVar3.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                        k80 k80Var = k80.this;
                        x0 x0Var = k80Var.Yi7zF1RB1.GWasM1elztuh;
                        int i5 = i;
                        j30 GWasM1elztuh = x0Var.GWasM1elztuh(i5);
                        ((jd) GWasM1elztuh.X1lG3V04pd.xqGvceK5x).XnEVoBF0td1l(k80Var.X1lG3V04pd, Integer.valueOf(i5 - GWasM1elztuh.GWasM1elztuh), qxVar3, 0);
                    } else {
                        qxVar3.YXi2hvwn7WL();
                    }
                    return kc1.GWasM1elztuh;
                }
            }, qxVar), qxVar2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new p70(this, i3, obj2, i2);
        }
    }

    public final int X1lG3V04pd() {
        i80 i80Var = this.Yi7zF1RB1;
        i80Var.getClass();
        return i80Var.GWasM1elztuh.GWasM1elztuh;
    }

    public final Object Yi7zF1RB1(int i) {
        i80 i80Var = this.Yi7zF1RB1;
        i80Var.getClass();
        j30 GWasM1elztuh = i80Var.GWasM1elztuh.GWasM1elztuh(i);
        ((i8) GWasM1elztuh.X1lG3V04pd.X1lG3V04pd).mOu10nynGul(Integer.valueOf(i - GWasM1elztuh.GWasM1elztuh));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        return o30.rQPn8YBR(this.Yi7zF1RB1, ((k80) obj).Yi7zF1RB1);
    }

    public final int hashCode() {
        return this.Yi7zF1RB1.hashCode();
    }

    public final Object xqGvceK5x(int i) {
        x0 x0Var = this.xqGvceK5x;
        Object[] objArr = (Object[]) x0Var.X1lG3V04pd;
        int i2 = i - x0Var.GWasM1elztuh;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        i80 i80Var = this.Yi7zF1RB1;
        i80Var.getClass();
        j30 GWasM1elztuh = i80Var.GWasM1elztuh.GWasM1elztuh(i);
        return ((iy) GWasM1elztuh.X1lG3V04pd.Yi7zF1RB1).mOu10nynGul(Integer.valueOf(i - GWasM1elztuh.GWasM1elztuh));
    }
}
