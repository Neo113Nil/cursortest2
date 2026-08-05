package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class aj implements Parcelable {
    public static final Parcelable.Creator<aj> CREATOR = new SMax8wMR(6);
    public int MdtA4re8;
    public String NCTxEWno;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.NCTxEWno);
        parcel.writeInt(this.MdtA4re8);
    }
}
