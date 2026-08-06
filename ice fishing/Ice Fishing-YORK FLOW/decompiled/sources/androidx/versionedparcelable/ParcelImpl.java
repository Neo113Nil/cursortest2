package androidx.versionedparcelable;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new defpackage.K0gkXZrJwRZi(2);
    public final defpackage.pt1 WDYagTQQm9ns;

    public ParcelImpl(android.os.Parcel parcel) {
        this.WDYagTQQm9ns = new defpackage.ot1(parcel).QiMR8OkAhezm();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new defpackage.ot1(parcel).e6mdH7fiFuta(this.WDYagTQQm9ns);
    }
}
