package t0;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* renamed from: t0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5055r implements Parcelable {
    public static final Parcelable.Creator<C5055r> CREATOR = new C4509h(9);

    /* renamed from: n, reason: collision with root package name */
    public int f40776n;

    /* renamed from: u, reason: collision with root package name */
    public int f40777u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40778v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40776n);
        parcel.writeInt(this.f40777u);
        parcel.writeInt(this.f40778v ? 1 : 0);
    }
}
