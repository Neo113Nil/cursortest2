package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import m2.C4741a;

/* renamed from: s2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4969z0 extends S2.a {
    public static final Parcelable.Creator<C4969z0> CREATOR = new C4936i0(2);

    /* renamed from: n, reason: collision with root package name */
    public final int f40512n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40513u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40514v;

    /* renamed from: w, reason: collision with root package name */
    public C4969z0 f40515w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f40516x;

    public C4969z0(int i, String str, String str2, C4969z0 c4969z0, IBinder iBinder) {
        this.f40512n = i;
        this.f40513u = str;
        this.f40514v = str2;
        this.f40515w = c4969z0;
        this.f40516x = iBinder;
    }

    public final C4741a a() {
        C4969z0 c4969z0 = this.f40515w;
        return new C4741a(this.f40512n, this.f40513u, this.f40514v, c4969z0 != null ? new C4741a(c4969z0.f40512n, c4969z0.f40513u, c4969z0.f40514v, null) : null);
    }

    public final m2.n b() {
        InterfaceC4963w0 c4961v0;
        C4969z0 c4969z0 = this.f40515w;
        C4741a c4741a = c4969z0 == null ? null : new C4741a(c4969z0.f40512n, c4969z0.f40513u, c4969z0.f40514v, null);
        IBinder iBinder = this.f40516x;
        if (iBinder == null) {
            c4961v0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4961v0 = queryLocalInterface instanceof InterfaceC4963w0 ? (InterfaceC4963w0) queryLocalInterface : new C4961v0(iBinder);
        }
        return new m2.n(this.f40512n, this.f40513u, this.f40514v, c4741a, c4961v0 != null ? new m2.s(c4961v0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f40512n);
        com.bumptech.glide.e.r(parcel, 2, this.f40513u);
        com.bumptech.glide.e.r(parcel, 3, this.f40514v);
        com.bumptech.glide.e.q(parcel, 4, this.f40515w, i);
        com.bumptech.glide.e.p(parcel, 5, this.f40516x);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
