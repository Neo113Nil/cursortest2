package q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 extends Q2.a {
    public static final Parcelable.Creator<h1> CREATOR = new C4887i0(11);

    /* renamed from: A, reason: collision with root package name */
    public final String f40163A;

    /* renamed from: n, reason: collision with root package name */
    public final String f40164n;

    /* renamed from: u, reason: collision with root package name */
    public long f40165u;

    /* renamed from: v, reason: collision with root package name */
    public C4920z0 f40166v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f40167w;

    /* renamed from: x, reason: collision with root package name */
    public final String f40168x;

    /* renamed from: y, reason: collision with root package name */
    public final String f40169y;

    /* renamed from: z, reason: collision with root package name */
    public final String f40170z;

    public h1(String str, long j6, C4920z0 c4920z0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f40164n = str;
        this.f40165u = j6;
        this.f40166v = c4920z0;
        this.f40167w = bundle;
        this.f40168x = str2;
        this.f40169y = str3;
        this.f40170z = str4;
        this.f40163A = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f40164n);
        long j6 = this.f40165u;
        A8.b.F(parcel, 2, 8);
        parcel.writeLong(j6);
        A8.b.y(parcel, 3, this.f40166v, i);
        A8.b.v(parcel, 4, this.f40167w);
        A8.b.z(parcel, 5, this.f40168x);
        A8.b.z(parcel, 6, this.f40169y);
        A8.b.z(parcel, 7, this.f40170z);
        A8.b.z(parcel, 8, this.f40163A);
        A8.b.I(parcel, G7);
    }
}
