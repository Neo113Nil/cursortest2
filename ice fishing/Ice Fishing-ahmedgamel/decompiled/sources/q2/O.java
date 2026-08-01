package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O extends Q2.a {
    public static final Parcelable.Creator<O> CREATOR = new C4887i0(0);

    /* renamed from: n, reason: collision with root package name */
    public final String f40070n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40071u;

    public O(String str, String str2) {
        this.f40070n = str;
        this.f40071u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f40070n);
        A8.b.z(parcel, 2, this.f40071u);
        A8.b.I(parcel, G7);
    }
}
