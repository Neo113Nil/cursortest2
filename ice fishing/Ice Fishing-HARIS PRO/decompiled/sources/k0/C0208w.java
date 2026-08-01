package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208w implements Parcelable {
    public static final Parcelable.Creator<C0208w> CREATOR = new F0.b(14);

    /* renamed from: a, reason: collision with root package name */
    public int f3611a;

    /* renamed from: b, reason: collision with root package name */
    public int f3612b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3613c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3611a);
        parcel.writeInt(this.f3612b);
        parcel.writeInt(this.f3613c ? 1 : 0);
    }
}
