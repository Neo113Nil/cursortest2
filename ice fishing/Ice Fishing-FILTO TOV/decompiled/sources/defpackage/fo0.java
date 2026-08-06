package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fo0 extends t51 implements Parcelable, i41 {
    public static final Parcelable.Creator<fo0> CREATOR = new eo0();
    public j41 AvO7iQsrTN;
    public final k41 EljAMC1QTz;

    public fo0(Object obj, k41 k41Var) {
        this.EljAMC1QTz = k41Var;
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        j41 j41Var = new j41(JFJ3QoxA.AvO7iQsrTN(), obj);
        if (!(JFJ3QoxA instanceof jy)) {
            j41Var.Yi7zF1RB1 = new j41(1L, obj);
        }
        this.AvO7iQsrTN = j41Var;
    }

    @Override // defpackage.s51
    public final u51 GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.s51
    public final void X1lG3V04pd(u51 u51Var) {
        u51Var.getClass();
        this.AvO7iQsrTN = (j41) u51Var;
    }

    @Override // defpackage.s51
    public final u51 Yi7zF1RB1(u51 u51Var, u51 u51Var2, u51 u51Var3) {
        if (this.EljAMC1QTz.X1lG3V04pd(((j41) u51Var2).X1lG3V04pd, ((j41) u51Var3).X1lG3V04pd)) {
            return u51Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return ((j41) e41.jivtDDk9H(this.AvO7iQsrTN, this)).X1lG3V04pd;
    }

    @Override // defpackage.mg0
    public final void setValue(Object obj) {
        y31 JFJ3QoxA;
        j41 j41Var = (j41) e41.encWxUiV2(this.AvO7iQsrTN);
        if (this.EljAMC1QTz.X1lG3V04pd(j41Var.X1lG3V04pd, obj)) {
            return;
        }
        j41 j41Var2 = this.AvO7iQsrTN;
        synchronized (e41.X1lG3V04pd) {
            JFJ3QoxA = e41.JFJ3QoxA();
            ((j41) e41.iwATDS1i01k(j41Var2, this, JFJ3QoxA, j41Var)).X1lG3V04pd = obj;
        }
        e41.uFEq9NpZ(JFJ3QoxA, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((j41) e41.encWxUiV2(this.AvO7iQsrTN)).X1lG3V04pd + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        b9xEq24R1 b9xeq24r1 = b9xEq24R1.qugwajBSa59j;
        k41 k41Var = this.EljAMC1QTz;
        if (o30.rQPn8YBR(k41Var, b9xeq24r1)) {
            i2 = 0;
        } else if (o30.rQPn8YBR(k41Var, k61.EljAMC1QTz)) {
            i2 = 1;
        } else {
            if (!o30.rQPn8YBR(k41Var, b9xEq24R1.Uxq83abb04)) {
                o4.jivtDDk9H("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    @Override // defpackage.i41
    public final k41 xqGvceK5x() {
        return this.EljAMC1QTz;
    }
}
