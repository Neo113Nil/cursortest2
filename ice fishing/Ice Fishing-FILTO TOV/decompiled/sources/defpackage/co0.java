package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class co0 extends t51 implements Parcelable, i41, m51, mg0 {
    public static final Parcelable.Creator<co0> CREATOR = new kbVzROOfKK(3);
    public g41 EljAMC1QTz;

    public co0(int i) {
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        g41 g41Var = new g41(i, JFJ3QoxA.AvO7iQsrTN());
        if (!(JFJ3QoxA instanceof jy)) {
            g41Var.Yi7zF1RB1 = new g41(i, 1L);
        }
        this.EljAMC1QTz = g41Var;
    }

    public final int AvO7iQsrTN() {
        return ((g41) e41.jivtDDk9H(this.EljAMC1QTz, this)).X1lG3V04pd;
    }

    @Override // defpackage.s51
    public final u51 GWasM1elztuh() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.s51
    public final void X1lG3V04pd(u51 u51Var) {
        u51Var.getClass();
        this.EljAMC1QTz = (g41) u51Var;
    }

    @Override // defpackage.s51
    public final u51 Yi7zF1RB1(u51 u51Var, u51 u51Var2, u51 u51Var3) {
        if (((g41) u51Var2).X1lG3V04pd == ((g41) u51Var3).X1lG3V04pd) {
            return u51Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void encWxUiV2(int i) {
        y31 JFJ3QoxA;
        g41 g41Var = (g41) e41.encWxUiV2(this.EljAMC1QTz);
        if (g41Var.X1lG3V04pd != i) {
            g41 g41Var2 = this.EljAMC1QTz;
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                ((g41) e41.iwATDS1i01k(g41Var2, this, JFJ3QoxA, g41Var)).X1lG3V04pd = i;
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        }
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return Integer.valueOf(AvO7iQsrTN());
    }

    @Override // defpackage.mg0
    public final void setValue(Object obj) {
        encWxUiV2(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((g41) e41.encWxUiV2(this.EljAMC1QTz)).X1lG3V04pd + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AvO7iQsrTN());
    }

    @Override // defpackage.i41
    public final k41 xqGvceK5x() {
        return k61.EljAMC1QTz;
    }
}
