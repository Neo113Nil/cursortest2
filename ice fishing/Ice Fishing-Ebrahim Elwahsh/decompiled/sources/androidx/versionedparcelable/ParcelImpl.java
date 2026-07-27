package androidx.versionedparcelable;

import F0.a;
import F0.c;
import F0.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: n, reason: collision with root package name */
    public final d f5414n;

    public ParcelImpl(Parcel parcel) {
        this.f5414n = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new c(parcel).i(this.f5414n);
    }
}
