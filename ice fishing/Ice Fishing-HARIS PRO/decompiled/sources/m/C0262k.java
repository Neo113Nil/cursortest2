package m;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262k implements Parcelable {
    public static final Parcelable.Creator<C0262k> CREATOR = new F0.b(17);

    /* renamed from: a, reason: collision with root package name */
    public int f3958a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3958a);
    }
}
