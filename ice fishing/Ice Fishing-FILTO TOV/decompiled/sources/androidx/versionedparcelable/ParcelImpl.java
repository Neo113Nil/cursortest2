package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.de1;
import defpackage.ee1;
import defpackage.kbVzROOfKK;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new kbVzROOfKK(1);
    public final ee1 OOA6hdeuvCS;

    public ParcelImpl(Parcel parcel) {
        this.OOA6hdeuvCS = new de1(parcel).AvO7iQsrTN();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new de1(parcel).mOu10nynGul(this.OOA6hdeuvCS);
    }
}
