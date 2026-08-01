package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k2.C4631a;

/* renamed from: q2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4920z0 extends Q2.a {
    public static final Parcelable.Creator<C4920z0> CREATOR = new C4887i0(2);

    /* renamed from: n, reason: collision with root package name */
    public final int f40213n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40214u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40215v;

    /* renamed from: w, reason: collision with root package name */
    public C4920z0 f40216w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f40217x;

    public C4920z0(int i, String str, String str2, C4920z0 c4920z0, IBinder iBinder) {
        this.f40213n = i;
        this.f40214u = str;
        this.f40215v = str2;
        this.f40216w = c4920z0;
        this.f40217x = iBinder;
    }

    public final C4631a a() {
        C4920z0 c4920z0 = this.f40216w;
        return new C4631a(this.f40213n, this.f40214u, this.f40215v, c4920z0 != null ? new C4631a(c4920z0.f40213n, c4920z0.f40214u, c4920z0.f40215v, null) : null);
    }

    public final k2.n b() {
        InterfaceC4914w0 c4912v0;
        C4920z0 c4920z0 = this.f40216w;
        C4631a c4631a = c4920z0 == null ? null : new C4631a(c4920z0.f40213n, c4920z0.f40214u, c4920z0.f40215v, null);
        IBinder iBinder = this.f40217x;
        if (iBinder == null) {
            c4912v0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4912v0 = queryLocalInterface instanceof InterfaceC4914w0 ? (InterfaceC4914w0) queryLocalInterface : new C4912v0(iBinder);
        }
        return new k2.n(this.f40213n, this.f40214u, this.f40215v, c4631a, c4912v0 != null ? new k2.s(c4912v0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40213n);
        A8.b.z(parcel, 2, this.f40214u);
        A8.b.z(parcel, 3, this.f40215v);
        A8.b.y(parcel, 4, this.f40216w, i);
        A8.b.x(parcel, 5, this.f40217x);
        A8.b.I(parcel, G7);
    }
}
