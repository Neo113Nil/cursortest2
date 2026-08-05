package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fj implements Parcelable {
    public static final Parcelable.Creator<fj> CREATOR = new SMax8wMR(7);
    public ArrayList MdtA4re8;
    public ArrayList NCTxEWno;
    public String P7K7Inc8;
    public ArrayList Qr9iLBAD;
    public int VgvYg0wo;
    public ArrayList b2ZJblxo;
    public ArrayList jb9XjC4I;
    public o1[] wxUZMvaN;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.NCTxEWno);
        parcel.writeStringList(this.MdtA4re8);
        parcel.writeTypedArray(this.wxUZMvaN, i);
        parcel.writeInt(this.VgvYg0wo);
        parcel.writeString(this.P7K7Inc8);
        parcel.writeStringList(this.b2ZJblxo);
        parcel.writeTypedList(this.Qr9iLBAD);
        parcel.writeTypedList(this.jb9XjC4I);
    }
}
