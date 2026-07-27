package androidx.versionedparcelable;

import B8.d;
import F0.b;
import F0.c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new d(1);

    /* renamed from: n, reason: collision with root package name */
    public final c f5302n;

    public ParcelImpl(Parcel parcel) {
        this.f5302n = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.f5302n);
    }
}
