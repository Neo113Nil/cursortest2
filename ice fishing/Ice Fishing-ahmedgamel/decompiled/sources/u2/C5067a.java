package u2;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;
import j3.C4614c;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5067a extends S2.a {
    public static final Parcelable.Creator<C5067a> CREATOR = new C4614c(10);

    /* renamed from: n, reason: collision with root package name */
    public final String f41014n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41015u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41016v;

    public C5067a(String str, String str2, String str3) {
        this.f41014n = str;
        this.f41015u = str2;
        this.f41016v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.r(parcel, 1, this.f41014n);
        e.r(parcel, 2, this.f41015u);
        e.r(parcel, 3, this.f41016v);
        e.z(parcel, x9);
    }
}
