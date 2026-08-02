package s2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 extends S2.a {
    public static final Parcelable.Creator<h1> CREATOR = new C4936i0(11);

    /* renamed from: A, reason: collision with root package name */
    public final String f40462A;

    /* renamed from: n, reason: collision with root package name */
    public final String f40463n;

    /* renamed from: u, reason: collision with root package name */
    public long f40464u;

    /* renamed from: v, reason: collision with root package name */
    public C4969z0 f40465v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f40466w;

    /* renamed from: x, reason: collision with root package name */
    public final String f40467x;

    /* renamed from: y, reason: collision with root package name */
    public final String f40468y;

    /* renamed from: z, reason: collision with root package name */
    public final String f40469z;

    public h1(String str, long j6, C4969z0 c4969z0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f40463n = str;
        this.f40464u = j6;
        this.f40465v = c4969z0;
        this.f40466w = bundle;
        this.f40467x = str2;
        this.f40468y = str3;
        this.f40469z = str4;
        this.f40462A = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f40463n);
        long j6 = this.f40464u;
        com.bumptech.glide.e.w(parcel, 2, 8);
        parcel.writeLong(j6);
        com.bumptech.glide.e.q(parcel, 3, this.f40465v, i);
        com.bumptech.glide.e.n(parcel, 4, this.f40466w);
        com.bumptech.glide.e.r(parcel, 5, this.f40467x);
        com.bumptech.glide.e.r(parcel, 6, this.f40468y);
        com.bumptech.glide.e.r(parcel, 7, this.f40469z);
        com.bumptech.glide.e.r(parcel, 8, this.f40462A);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
