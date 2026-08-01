package q2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 extends Q2.a {
    public static final Parcelable.Creator<c1> CREATOR = new C4887i0(8);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40097A;

    /* renamed from: B, reason: collision with root package name */
    public final String f40098B;

    /* renamed from: C, reason: collision with root package name */
    public final X0 f40099C;

    /* renamed from: D, reason: collision with root package name */
    public final Location f40100D;

    /* renamed from: E, reason: collision with root package name */
    public final String f40101E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f40102F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f40103G;

    /* renamed from: H, reason: collision with root package name */
    public final List f40104H;

    /* renamed from: I, reason: collision with root package name */
    public final String f40105I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f40106K;

    /* renamed from: L, reason: collision with root package name */
    public final O f40107L;

    /* renamed from: M, reason: collision with root package name */
    public final int f40108M;

    /* renamed from: N, reason: collision with root package name */
    public final String f40109N;

    /* renamed from: O, reason: collision with root package name */
    public final List f40110O;

    /* renamed from: P, reason: collision with root package name */
    public final int f40111P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f40112Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f40113R;

    /* renamed from: S, reason: collision with root package name */
    public final long f40114S;

    /* renamed from: T, reason: collision with root package name */
    public final long f40115T;

    /* renamed from: U, reason: collision with root package name */
    public final int f40116U;

    /* renamed from: V, reason: collision with root package name */
    public final Bundle f40117V = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    public final int f40118n;

    /* renamed from: u, reason: collision with root package name */
    public final long f40119u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f40120v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40121w;

    /* renamed from: x, reason: collision with root package name */
    public final List f40122x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40123y;

    /* renamed from: z, reason: collision with root package name */
    public final int f40124z;

    public c1(int i, long j6, Bundle bundle, int i6, List list, boolean z3, int i9, boolean z6, String str, X0 x02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, O o6, int i10, String str5, List list3, int i11, String str6, int i12, long j9, long j10, int i13) {
        this.f40118n = i;
        this.f40119u = j6;
        this.f40120v = bundle == null ? new Bundle() : bundle;
        this.f40121w = i6;
        this.f40122x = list;
        this.f40123y = z3;
        this.f40124z = i9;
        this.f40097A = z6;
        this.f40098B = str;
        this.f40099C = x02;
        this.f40100D = location;
        this.f40101E = str2;
        this.f40102F = bundle2 == null ? new Bundle() : bundle2;
        this.f40103G = bundle3;
        this.f40104H = list2;
        this.f40105I = str3;
        this.J = str4;
        this.f40106K = z9;
        this.f40107L = o6;
        this.f40108M = i10;
        this.f40109N = str5;
        this.f40110O = list3 == null ? new ArrayList() : list3;
        this.f40111P = i11;
        this.f40112Q = str6;
        this.f40113R = i12;
        this.f40114S = j9;
        this.f40115T = j10;
        this.f40116U = i13;
    }

    public final boolean a(c1 c1Var) {
        if (c1Var == null) {
            return false;
        }
        return this.f40118n == c1Var.f40118n && this.f40119u == c1Var.f40119u && com.bumptech.glide.e.j(this.f40120v, c1Var.f40120v) && this.f40121w == c1Var.f40121w && P2.w.l(this.f40122x, c1Var.f40122x) && this.f40123y == c1Var.f40123y && this.f40124z == c1Var.f40124z && this.f40097A == c1Var.f40097A && P2.w.l(this.f40098B, c1Var.f40098B) && P2.w.l(this.f40099C, c1Var.f40099C) && P2.w.l(this.f40100D, c1Var.f40100D) && P2.w.l(this.f40101E, c1Var.f40101E) && com.bumptech.glide.e.j(this.f40102F, c1Var.f40102F) && com.bumptech.glide.e.j(this.f40103G, c1Var.f40103G) && P2.w.l(this.f40104H, c1Var.f40104H) && P2.w.l(this.f40105I, c1Var.f40105I) && P2.w.l(this.J, c1Var.J) && this.f40106K == c1Var.f40106K && this.f40108M == c1Var.f40108M && P2.w.l(this.f40109N, c1Var.f40109N) && P2.w.l(this.f40110O, c1Var.f40110O) && this.f40111P == c1Var.f40111P && P2.w.l(this.f40112Q, c1Var.f40112Q) && this.f40113R == c1Var.f40113R && this.f40116U == c1Var.f40116U;
    }

    public final boolean b() {
        Bundle bundle = this.f40120v;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return a((c1) obj) && this.f40114S == ((c1) obj).f40114S;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40118n), Long.valueOf(this.f40119u), this.f40120v, Integer.valueOf(this.f40121w), this.f40122x, Boolean.valueOf(this.f40123y), Integer.valueOf(this.f40124z), Boolean.valueOf(this.f40097A), this.f40098B, this.f40099C, this.f40100D, this.f40101E, this.f40102F, this.f40103G, this.f40104H, this.f40105I, this.J, Boolean.valueOf(this.f40106K), Integer.valueOf(this.f40108M), this.f40109N, this.f40110O, Integer.valueOf(this.f40111P), this.f40112Q, Integer.valueOf(this.f40113R), Long.valueOf(this.f40114S), Long.valueOf(this.f40115T), Integer.valueOf(this.f40116U)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40118n);
        A8.b.F(parcel, 2, 8);
        parcel.writeLong(this.f40119u);
        A8.b.v(parcel, 3, this.f40120v);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f40121w);
        A8.b.B(parcel, 5, this.f40122x);
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(this.f40123y ? 1 : 0);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f40124z);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f40097A ? 1 : 0);
        A8.b.z(parcel, 9, this.f40098B);
        A8.b.y(parcel, 10, this.f40099C, i);
        A8.b.y(parcel, 11, this.f40100D, i);
        A8.b.z(parcel, 12, this.f40101E);
        A8.b.v(parcel, 13, this.f40102F);
        A8.b.v(parcel, 14, this.f40103G);
        A8.b.B(parcel, 15, this.f40104H);
        A8.b.z(parcel, 16, this.f40105I);
        A8.b.z(parcel, 17, this.J);
        A8.b.F(parcel, 18, 4);
        parcel.writeInt(this.f40106K ? 1 : 0);
        A8.b.y(parcel, 19, this.f40107L, i);
        A8.b.F(parcel, 20, 4);
        parcel.writeInt(this.f40108M);
        A8.b.z(parcel, 21, this.f40109N);
        A8.b.B(parcel, 22, this.f40110O);
        A8.b.F(parcel, 23, 4);
        parcel.writeInt(this.f40111P);
        A8.b.z(parcel, 24, this.f40112Q);
        A8.b.F(parcel, 25, 4);
        parcel.writeInt(this.f40113R);
        A8.b.F(parcel, 26, 8);
        parcel.writeLong(this.f40114S);
        A8.b.F(parcel, 27, 8);
        parcel.writeLong(this.f40115T);
        A8.b.F(parcel, 28, 4);
        parcel.writeInt(this.f40116U);
        A8.b.I(parcel, G7);
    }
}
