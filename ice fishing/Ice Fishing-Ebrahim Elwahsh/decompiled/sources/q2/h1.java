package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 extends P2.a {
    public static final Parcelable.Creator<h1> CREATOR = new C4894i0(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f40068n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40069u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40070v;

    /* renamed from: w, reason: collision with root package name */
    public final long f40071w;

    public h1(int i, int i4, String str, long j9) {
        this.f40068n = i;
        this.f40069u = i4;
        this.f40070v = str;
        this.f40071w = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f40068n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f40069u);
        S0.f.u(parcel, 3, this.f40070v);
        S0.f.A(parcel, 4, 8);
        parcel.writeLong(this.f40071w);
        S0.f.C(parcel, B8);
    }
}
