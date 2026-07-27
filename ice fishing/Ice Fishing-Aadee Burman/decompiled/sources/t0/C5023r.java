package t0;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: t0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5023r implements Parcelable {
    public static final Parcelable.Creator<C5023r> CREATOR = new C4566c(9);

    /* renamed from: n, reason: collision with root package name */
    public int f40754n;

    /* renamed from: u, reason: collision with root package name */
    public int f40755u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40756v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40754n);
        parcel.writeInt(this.f40755u);
        parcel.writeInt(this.f40756v ? 1 : 0);
    }
}
