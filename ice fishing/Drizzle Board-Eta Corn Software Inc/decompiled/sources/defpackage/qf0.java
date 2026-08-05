package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qf0 extends pf0 {
    public final int P7K7Inc8;
    public final String Qr9iLBAD;
    public final Parcel VgvYg0wo;
    public final int b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public int k3x7lurq;
    public final SparseIntArray wxUZMvaN;

    public qf0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new x0(0), new x0(0), new x0(0));
    }

    @Override // defpackage.pf0
    public final void Qr9iLBAD(int i) {
        int i2 = this.jb9XjC4I;
        SparseIntArray sparseIntArray = this.wxUZMvaN;
        Parcel parcel = this.VgvYg0wo;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.jb9XjC4I = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.pf0
    public final boolean VgvYg0wo(int i) {
        while (true) {
            int i2 = this.eVhOlqcC;
            int i3 = this.k3x7lurq;
            if (i2 >= this.b2ZJblxo) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.eVhOlqcC;
            Parcel parcel = this.VgvYg0wo;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.k3x7lurq = parcel.readInt();
            this.eVhOlqcC += readInt;
        }
    }

    @Override // defpackage.pf0
    public final qf0 qoPGr6Ce() {
        Parcel parcel = this.VgvYg0wo;
        int dataPosition = parcel.dataPosition();
        int i = this.eVhOlqcC;
        if (i == this.P7K7Inc8) {
            i = this.b2ZJblxo;
        }
        return new qf0(parcel, dataPosition, i, this.Qr9iLBAD + "  ", this.qoPGr6Ce, this.NCTxEWno, this.MdtA4re8);
    }

    public qf0(Parcel parcel, int i, int i2, String str, x0 x0Var, x0 x0Var2, x0 x0Var3) {
        super(x0Var, x0Var2, x0Var3);
        this.wxUZMvaN = new SparseIntArray();
        this.jb9XjC4I = -1;
        this.k3x7lurq = -1;
        this.VgvYg0wo = parcel;
        this.P7K7Inc8 = i;
        this.b2ZJblxo = i2;
        this.eVhOlqcC = i;
        this.Qr9iLBAD = str;
    }
}
