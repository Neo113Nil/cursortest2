package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o90 implements Parcelable {
    public static final Parcelable.Creator<o90> CREATOR = new SMax8wMR(15);
    public int MdtA4re8;
    public int NCTxEWno;
    public int P7K7Inc8;
    public ArrayList Qr9iLBAD;
    public int[] VgvYg0wo;
    public int[] b2ZJblxo;
    public boolean eVhOlqcC;
    public boolean jb9XjC4I;
    public boolean k3x7lurq;
    public int wxUZMvaN;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.NCTxEWno);
        parcel.writeInt(this.MdtA4re8);
        parcel.writeInt(this.wxUZMvaN);
        if (this.wxUZMvaN > 0) {
            parcel.writeIntArray(this.VgvYg0wo);
        }
        parcel.writeInt(this.P7K7Inc8);
        if (this.P7K7Inc8 > 0) {
            parcel.writeIntArray(this.b2ZJblxo);
        }
        parcel.writeInt(this.jb9XjC4I ? 1 : 0);
        parcel.writeInt(this.eVhOlqcC ? 1 : 0);
        parcel.writeInt(this.k3x7lurq ? 1 : 0);
        parcel.writeList(this.Qr9iLBAD);
    }
}
