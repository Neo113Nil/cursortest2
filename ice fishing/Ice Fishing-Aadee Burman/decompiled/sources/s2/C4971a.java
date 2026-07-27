package s2;

import A8.b;
import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4971a extends Q2.a {
    public static final Parcelable.Creator<C4971a> CREATOR = new C4566c(7);

    /* renamed from: n, reason: collision with root package name */
    public final String f40457n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40458u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40459v;

    public C4971a(String str, String str2, String str3) {
        this.f40457n = str;
        this.f40458u = str2;
        this.f40459v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = b.G(parcel, 20293);
        b.z(parcel, 1, this.f40457n);
        b.z(parcel, 2, this.f40458u);
        b.z(parcel, 3, this.f40459v);
        b.I(parcel, G7);
    }
}
