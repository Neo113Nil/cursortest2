package t0;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5021q implements Parcelable {
    public static final Parcelable.Creator<C5021q> CREATOR = new C4614c(7);

    /* renamed from: n, reason: collision with root package name */
    public int f40804n;

    /* renamed from: u, reason: collision with root package name */
    public int f40805u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40806v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40804n);
        parcel.writeInt(this.f40805u);
        parcel.writeInt(this.f40806v ? 1 : 0);
    }
}
