package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class do0 extends t51 implements Parcelable, i41, m51, mg0 {
    public static final Parcelable.Creator<do0> CREATOR = new kbVzROOfKK(4);
    public h41 EljAMC1QTz;

    public do0(long j) {
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        h41 h41Var = new h41(JFJ3QoxA.AvO7iQsrTN(), j);
        if (!(JFJ3QoxA instanceof jy)) {
            h41Var.Yi7zF1RB1 = new h41(1L, j);
        }
        this.EljAMC1QTz = h41Var;
    }

    public final long AvO7iQsrTN() {
        return ((h41) e41.jivtDDk9H(this.EljAMC1QTz, this)).X1lG3V04pd;
    }

    @Override // defpackage.s51
    public final u51 GWasM1elztuh() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.s51
    public final void X1lG3V04pd(u51 u51Var) {
        u51Var.getClass();
        this.EljAMC1QTz = (h41) u51Var;
    }

    @Override // defpackage.s51
    public final u51 Yi7zF1RB1(u51 u51Var, u51 u51Var2, u51 u51Var3) {
        if (((h41) u51Var2).X1lG3V04pd == ((h41) u51Var3).X1lG3V04pd) {
            return u51Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void encWxUiV2(long j) {
        y31 JFJ3QoxA;
        h41 h41Var = (h41) e41.encWxUiV2(this.EljAMC1QTz);
        if (h41Var.X1lG3V04pd != j) {
            h41 h41Var2 = this.EljAMC1QTz;
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                ((h41) e41.iwATDS1i01k(h41Var2, this, JFJ3QoxA, h41Var)).X1lG3V04pd = j;
            }
            e41.uFEq9NpZ(JFJ3QoxA, this);
        }
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return Long.valueOf(AvO7iQsrTN());
    }

    @Override // defpackage.mg0
    public final void setValue(Object obj) {
        encWxUiV2(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((h41) e41.encWxUiV2(this.EljAMC1QTz)).X1lG3V04pd + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(AvO7iQsrTN());
    }

    @Override // defpackage.i41
    public final k41 xqGvceK5x() {
        return k61.EljAMC1QTz;
    }
}
