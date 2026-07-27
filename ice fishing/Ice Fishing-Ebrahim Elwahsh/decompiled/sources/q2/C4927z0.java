package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k2.C4630a;
import k2.C4643n;

/* renamed from: q2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4927z0 extends P2.a {
    public static final Parcelable.Creator<C4927z0> CREATOR = new C4894i0(2);

    /* renamed from: n, reason: collision with root package name */
    public final int f40122n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40123u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40124v;

    /* renamed from: w, reason: collision with root package name */
    public C4927z0 f40125w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f40126x;

    public C4927z0(int i, String str, String str2, C4927z0 c4927z0, IBinder iBinder) {
        this.f40122n = i;
        this.f40123u = str;
        this.f40124v = str2;
        this.f40125w = c4927z0;
        this.f40126x = iBinder;
    }

    public final C4630a a() {
        C4927z0 c4927z0 = this.f40125w;
        return new C4630a(this.f40122n, this.f40123u, this.f40124v, c4927z0 != null ? new C4630a(c4927z0.f40122n, c4927z0.f40123u, c4927z0.f40124v, null) : null);
    }

    public final C4643n b() {
        InterfaceC4921w0 c4919v0;
        C4927z0 c4927z0 = this.f40125w;
        C4630a c4630a = c4927z0 == null ? null : new C4630a(c4927z0.f40122n, c4927z0.f40123u, c4927z0.f40124v, null);
        IBinder iBinder = this.f40126x;
        if (iBinder == null) {
            c4919v0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4919v0 = queryLocalInterface instanceof InterfaceC4921w0 ? (InterfaceC4921w0) queryLocalInterface : new C4919v0(iBinder);
        }
        return new C4643n(this.f40122n, this.f40123u, this.f40124v, c4630a, c4919v0 != null ? new k2.s(c4919v0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f40122n);
        S0.f.u(parcel, 2, this.f40123u);
        S0.f.u(parcel, 3, this.f40124v);
        S0.f.t(parcel, 4, this.f40125w, i);
        S0.f.s(parcel, 5, this.f40126x);
        S0.f.C(parcel, B8);
    }
}
