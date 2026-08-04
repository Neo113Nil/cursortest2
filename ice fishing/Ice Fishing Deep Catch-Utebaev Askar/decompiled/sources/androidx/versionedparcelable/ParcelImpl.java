package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import c.a;
import c.c;
import c.d;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f45a;

    public ParcelImpl(Parcel parcel) {
        this.f45a = new c(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new c(parcel).j(this.f45a);
    }
}
