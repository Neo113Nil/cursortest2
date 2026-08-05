package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class VgvYg0wo implements Parcelable {
    public final Parcelable NCTxEWno;
    public static final MdtA4re8 MdtA4re8 = new MdtA4re8();
    public static final Parcelable.Creator<VgvYg0wo> CREATOR = new wxUZMvaN(0);

    public VgvYg0wo(Parcelable parcelable) {
        if (parcelable != null) {
            this.NCTxEWno = parcelable == MdtA4re8 ? null : parcelable;
        } else {
            m1.sjUBp5pO("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.NCTxEWno, i);
    }

    public VgvYg0wo() {
        this.NCTxEWno = null;
    }

    public VgvYg0wo(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.NCTxEWno = readParcelable == null ? MdtA4re8 : readParcelable;
    }
}
