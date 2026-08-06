package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ot1 extends defpackage.nt1 {
    public int GE9mJIPrb8gP;
    public final android.util.SparseIntArray JhCgjQRTAOCT;
    public int Ns0WNyEWdPsk;
    public final java.lang.String P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final android.os.Parcel WDYagTQQm9ns;
    public int e6mdH7fiFuta;
    public final int oh71FJcDz6S2;

    public ot1(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new defpackage.w7(), new defpackage.w7(), new defpackage.w7());
    }

    @Override // defpackage.nt1
    public final void P05cfTpS5W5L(int i) {
        int i2 = this.e6mdH7fiFuta;
        android.util.SparseIntArray sparseIntArray = this.JhCgjQRTAOCT;
        android.os.Parcel parcel = this.WDYagTQQm9ns;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.e6mdH7fiFuta = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.nt1
    public final boolean WDYagTQQm9ns(int i) {
        while (true) {
            int i2 = this.GE9mJIPrb8gP;
            int i3 = this.Ns0WNyEWdPsk;
            if (i2 >= this.QiMR8OkAhezm) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i3).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.GE9mJIPrb8gP;
            android.os.Parcel parcel = this.WDYagTQQm9ns;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.Ns0WNyEWdPsk = parcel.readInt();
            this.GE9mJIPrb8gP += readInt;
        }
    }

    @Override // defpackage.nt1
    public final defpackage.ot1 ZpBGe2uQfcn8() {
        android.os.Parcel parcel = this.WDYagTQQm9ns;
        int dataPosition = parcel.dataPosition();
        int i = this.GE9mJIPrb8gP;
        if (i == this.oh71FJcDz6S2) {
            i = this.QiMR8OkAhezm;
        }
        return new defpackage.ot1(parcel, dataPosition, i, this.P05cfTpS5W5L + "  ", this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    public ot1(android.os.Parcel parcel, int i, int i2, java.lang.String str, defpackage.w7 w7Var, defpackage.w7 w7Var2, defpackage.w7 w7Var3) {
        super(w7Var, w7Var2, w7Var3);
        this.JhCgjQRTAOCT = new android.util.SparseIntArray();
        this.e6mdH7fiFuta = -1;
        this.Ns0WNyEWdPsk = -1;
        this.WDYagTQQm9ns = parcel;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = i2;
        this.GE9mJIPrb8gP = i;
        this.P05cfTpS5W5L = str;
    }
}
