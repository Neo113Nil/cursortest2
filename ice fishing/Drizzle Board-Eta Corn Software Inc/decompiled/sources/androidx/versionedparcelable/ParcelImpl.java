package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.SMax8wMR;
import defpackage.qf0;
import defpackage.rf0;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new SMax8wMR(13);
    public final rf0 NCTxEWno;

    public ParcelImpl(Parcel parcel) {
        this.NCTxEWno = new qf0(parcel).b2ZJblxo();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new qf0(parcel).jb9XjC4I(this.NCTxEWno);
    }
}
