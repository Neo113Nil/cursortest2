package s2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 extends S2.a {
    public static final Parcelable.Creator<c1> CREATOR = new C4936i0(8);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40396A;

    /* renamed from: B, reason: collision with root package name */
    public final String f40397B;

    /* renamed from: C, reason: collision with root package name */
    public final X0 f40398C;

    /* renamed from: D, reason: collision with root package name */
    public final Location f40399D;

    /* renamed from: E, reason: collision with root package name */
    public final String f40400E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f40401F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f40402G;

    /* renamed from: H, reason: collision with root package name */
    public final List f40403H;

    /* renamed from: I, reason: collision with root package name */
    public final String f40404I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f40405K;

    /* renamed from: L, reason: collision with root package name */
    public final O f40406L;

    /* renamed from: M, reason: collision with root package name */
    public final int f40407M;

    /* renamed from: N, reason: collision with root package name */
    public final String f40408N;

    /* renamed from: O, reason: collision with root package name */
    public final List f40409O;

    /* renamed from: P, reason: collision with root package name */
    public final int f40410P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f40411Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f40412R;

    /* renamed from: S, reason: collision with root package name */
    public final long f40413S;

    /* renamed from: T, reason: collision with root package name */
    public final long f40414T;

    /* renamed from: U, reason: collision with root package name */
    public final int f40415U;

    /* renamed from: V, reason: collision with root package name */
    public final Bundle f40416V = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    public final int f40417n;

    /* renamed from: u, reason: collision with root package name */
    public final long f40418u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f40419v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40420w;

    /* renamed from: x, reason: collision with root package name */
    public final List f40421x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40422y;

    /* renamed from: z, reason: collision with root package name */
    public final int f40423z;

    public c1(int i, long j6, Bundle bundle, int i4, List list, boolean z6, int i6, boolean z9, String str, X0 x02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z10, O o4, int i9, String str5, List list3, int i10, String str6, int i11, long j9, long j10, int i12) {
        this.f40417n = i;
        this.f40418u = j6;
        this.f40419v = bundle == null ? new Bundle() : bundle;
        this.f40420w = i4;
        this.f40421x = list;
        this.f40422y = z6;
        this.f40423z = i6;
        this.f40396A = z9;
        this.f40397B = str;
        this.f40398C = x02;
        this.f40399D = location;
        this.f40400E = str2;
        this.f40401F = bundle2 == null ? new Bundle() : bundle2;
        this.f40402G = bundle3;
        this.f40403H = list2;
        this.f40404I = str3;
        this.J = str4;
        this.f40405K = z10;
        this.f40406L = o4;
        this.f40407M = i9;
        this.f40408N = str5;
        this.f40409O = list3 == null ? new ArrayList() : list3;
        this.f40410P = i10;
        this.f40411Q = str6;
        this.f40412R = i11;
        this.f40413S = j9;
        this.f40414T = j10;
        this.f40415U = i12;
    }

    public final boolean a(c1 c1Var) {
        if (c1Var == null) {
            return false;
        }
        return this.f40417n == c1Var.f40417n && this.f40418u == c1Var.f40418u && com.bumptech.glide.d.O(this.f40419v, c1Var.f40419v) && this.f40420w == c1Var.f40420w && R2.w.l(this.f40421x, c1Var.f40421x) && this.f40422y == c1Var.f40422y && this.f40423z == c1Var.f40423z && this.f40396A == c1Var.f40396A && R2.w.l(this.f40397B, c1Var.f40397B) && R2.w.l(this.f40398C, c1Var.f40398C) && R2.w.l(this.f40399D, c1Var.f40399D) && R2.w.l(this.f40400E, c1Var.f40400E) && com.bumptech.glide.d.O(this.f40401F, c1Var.f40401F) && com.bumptech.glide.d.O(this.f40402G, c1Var.f40402G) && R2.w.l(this.f40403H, c1Var.f40403H) && R2.w.l(this.f40404I, c1Var.f40404I) && R2.w.l(this.J, c1Var.J) && this.f40405K == c1Var.f40405K && this.f40407M == c1Var.f40407M && R2.w.l(this.f40408N, c1Var.f40408N) && R2.w.l(this.f40409O, c1Var.f40409O) && this.f40410P == c1Var.f40410P && R2.w.l(this.f40411Q, c1Var.f40411Q) && this.f40412R == c1Var.f40412R && this.f40415U == c1Var.f40415U;
    }

    public final boolean b() {
        Bundle bundle = this.f40419v;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return a((c1) obj) && this.f40413S == ((c1) obj).f40413S;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40417n), Long.valueOf(this.f40418u), this.f40419v, Integer.valueOf(this.f40420w), this.f40421x, Boolean.valueOf(this.f40422y), Integer.valueOf(this.f40423z), Boolean.valueOf(this.f40396A), this.f40397B, this.f40398C, this.f40399D, this.f40400E, this.f40401F, this.f40402G, this.f40403H, this.f40404I, this.J, Boolean.valueOf(this.f40405K), Integer.valueOf(this.f40407M), this.f40408N, this.f40409O, Integer.valueOf(this.f40410P), this.f40411Q, Integer.valueOf(this.f40412R), Long.valueOf(this.f40413S), Long.valueOf(this.f40414T), Integer.valueOf(this.f40415U)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f40417n);
        com.bumptech.glide.e.w(parcel, 2, 8);
        parcel.writeLong(this.f40418u);
        com.bumptech.glide.e.n(parcel, 3, this.f40419v);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f40420w);
        com.bumptech.glide.e.t(parcel, 5, this.f40421x);
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeInt(this.f40422y ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f40423z);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f40396A ? 1 : 0);
        com.bumptech.glide.e.r(parcel, 9, this.f40397B);
        com.bumptech.glide.e.q(parcel, 10, this.f40398C, i);
        com.bumptech.glide.e.q(parcel, 11, this.f40399D, i);
        com.bumptech.glide.e.r(parcel, 12, this.f40400E);
        com.bumptech.glide.e.n(parcel, 13, this.f40401F);
        com.bumptech.glide.e.n(parcel, 14, this.f40402G);
        com.bumptech.glide.e.t(parcel, 15, this.f40403H);
        com.bumptech.glide.e.r(parcel, 16, this.f40404I);
        com.bumptech.glide.e.r(parcel, 17, this.J);
        com.bumptech.glide.e.w(parcel, 18, 4);
        parcel.writeInt(this.f40405K ? 1 : 0);
        com.bumptech.glide.e.q(parcel, 19, this.f40406L, i);
        com.bumptech.glide.e.w(parcel, 20, 4);
        parcel.writeInt(this.f40407M);
        com.bumptech.glide.e.r(parcel, 21, this.f40408N);
        com.bumptech.glide.e.t(parcel, 22, this.f40409O);
        com.bumptech.glide.e.w(parcel, 23, 4);
        parcel.writeInt(this.f40410P);
        com.bumptech.glide.e.r(parcel, 24, this.f40411Q);
        com.bumptech.glide.e.w(parcel, 25, 4);
        parcel.writeInt(this.f40412R);
        com.bumptech.glide.e.w(parcel, 26, 8);
        parcel.writeLong(this.f40413S);
        com.bumptech.glide.e.w(parcel, 27, 8);
        parcel.writeLong(this.f40414T);
        com.bumptech.glide.e.w(parcel, 28, 4);
        parcel.writeInt(this.f40415U);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
