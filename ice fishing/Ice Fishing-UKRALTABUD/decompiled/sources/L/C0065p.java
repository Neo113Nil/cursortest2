package L;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: L.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065p implements Parcelable {
    public static final Parcelable.Creator<C0065p> CREATOR = new A.l(1);

    /* renamed from: a, reason: collision with root package name */
    public int f667a;

    /* renamed from: b, reason: collision with root package name */
    public int f668b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f669c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f667a);
        parcel.writeInt(this.f668b);
        parcel.writeInt(this.f669c ? 1 : 0);
    }
}
