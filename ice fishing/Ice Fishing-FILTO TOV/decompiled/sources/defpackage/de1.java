package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class de1 extends ce1 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public int JFJ3QoxA;
    public final Parcel OOA6hdeuvCS;
    public final String encWxUiV2;
    public int mOu10nynGul;
    public int rQPn8YBR;
    public final SparseIntArray xqGvceK5x;

    public de1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b5(), new b5(), new b5());
    }

    @Override // defpackage.ce1
    public final de1 GWasM1elztuh() {
        Parcel parcel = this.OOA6hdeuvCS;
        int dataPosition = parcel.dataPosition();
        int i = this.JFJ3QoxA;
        if (i == this.EljAMC1QTz) {
            i = this.AvO7iQsrTN;
        }
        return new de1(parcel, dataPosition, i, this.encWxUiV2 + "  ", this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd);
    }

    @Override // defpackage.ce1
    public final boolean OOA6hdeuvCS(int i) {
        while (true) {
            int i2 = this.JFJ3QoxA;
            int i3 = this.rQPn8YBR;
            if (i2 >= this.AvO7iQsrTN) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.JFJ3QoxA;
            Parcel parcel = this.OOA6hdeuvCS;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.rQPn8YBR = parcel.readInt();
            this.JFJ3QoxA += readInt;
        }
    }

    @Override // defpackage.ce1
    public final void encWxUiV2(int i) {
        int i2 = this.mOu10nynGul;
        SparseIntArray sparseIntArray = this.xqGvceK5x;
        Parcel parcel = this.OOA6hdeuvCS;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.mOu10nynGul = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public de1(Parcel parcel, int i, int i2, String str, b5 b5Var, b5 b5Var2, b5 b5Var3) {
        super(b5Var, b5Var2, b5Var3);
        this.xqGvceK5x = new SparseIntArray();
        this.mOu10nynGul = -1;
        this.rQPn8YBR = -1;
        this.OOA6hdeuvCS = parcel;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
        this.JFJ3QoxA = i;
        this.encWxUiV2 = str;
    }
}
