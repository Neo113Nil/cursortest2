package defpackage;

/* loaded from: classes.dex */
public final class wl1 extends defpackage.vl1 {
    public final int AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final android.util.SparseIntArray F7NU4MC0GW;
    public int SH1y5HwkJhh;
    public final android.os.Parcel adDC3e2L;
    public int ez2rX8ReCYw;
    public int riuEU0zW4;
    public final int xiZrDbcSW0;

    public wl1(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new defpackage.r6(), new defpackage.r6(), new defpackage.r6());
    }

    @Override // defpackage.vl1
    public final void EXtogiMhuM(int i) {
        int i2 = this.riuEU0zW4;
        android.util.SparseIntArray sparseIntArray = this.F7NU4MC0GW;
        android.os.Parcel parcel = this.adDC3e2L;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.riuEU0zW4 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.vl1
    public final defpackage.wl1 IHQe1A4L2xu() {
        android.os.Parcel parcel = this.adDC3e2L;
        int dataPosition = parcel.dataPosition();
        int i = this.SH1y5HwkJhh;
        if (i == this.xiZrDbcSW0) {
            i = this.AARZUJiTa;
        }
        return new defpackage.wl1(parcel, dataPosition, i, this.EXtogiMhuM + "  ", this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF);
    }

    @Override // defpackage.vl1
    public final boolean adDC3e2L(int i) {
        while (true) {
            int i2 = this.SH1y5HwkJhh;
            int i3 = this.ez2rX8ReCYw;
            if (i2 >= this.AARZUJiTa) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i3).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.SH1y5HwkJhh;
            android.os.Parcel parcel = this.adDC3e2L;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.ez2rX8ReCYw = parcel.readInt();
            this.SH1y5HwkJhh += readInt;
        }
    }

    public wl1(android.os.Parcel parcel, int i, int i2, java.lang.String str, defpackage.r6 r6Var, defpackage.r6 r6Var2, defpackage.r6 r6Var3) {
        super(r6Var, r6Var2, r6Var3);
        this.F7NU4MC0GW = new android.util.SparseIntArray();
        this.riuEU0zW4 = -1;
        this.ez2rX8ReCYw = -1;
        this.adDC3e2L = parcel;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
        this.SH1y5HwkJhh = i;
        this.EXtogiMhuM = str;
    }
}
