package androidx.versionedparcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new defpackage.nMM9nLv63p(2);
    public final defpackage.xl1 adDC3e2L;

    public ParcelImpl(android.os.Parcel parcel) {
        this.adDC3e2L = new defpackage.wl1(parcel).AARZUJiTa();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new defpackage.wl1(parcel).riuEU0zW4(this.adDC3e2L);
    }
}
