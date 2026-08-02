package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pgj;
import defpackage.y0u;
import defpackage.z0u;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new pgj(5);
    public final z0u a;

    public ParcelImpl(Parcel parcel) {
        this.a = new y0u(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new y0u(parcel).l(this.a);
    }

    public ParcelImpl(z0u z0uVar) {
        this.a = z0uVar;
    }
}
