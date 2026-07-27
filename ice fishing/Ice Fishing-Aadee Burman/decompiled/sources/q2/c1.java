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
    public final boolean f40094A;

    /* renamed from: B, reason: collision with root package name */
    public final String f40095B;

    /* renamed from: C, reason: collision with root package name */
    public final X0 f40096C;

    /* renamed from: D, reason: collision with root package name */
    public final Location f40097D;

    /* renamed from: E, reason: collision with root package name */
    public final String f40098E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f40099F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f40100G;

    /* renamed from: H, reason: collision with root package name */
    public final List f40101H;

    /* renamed from: I, reason: collision with root package name */
    public final String f40102I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f40103K;

    /* renamed from: L, reason: collision with root package name */
    public final O f40104L;

    /* renamed from: M, reason: collision with root package name */
    public final int f40105M;

    /* renamed from: N, reason: collision with root package name */
    public final String f40106N;

    /* renamed from: O, reason: collision with root package name */
    public final List f40107O;

    /* renamed from: P, reason: collision with root package name */
    public final int f40108P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f40109Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f40110R;

    /* renamed from: S, reason: collision with root package name */
    public final long f40111S;

    /* renamed from: T, reason: collision with root package name */
    public final long f40112T;

    /* renamed from: U, reason: collision with root package name */
    public final int f40113U;

    /* renamed from: V, reason: collision with root package name */
    public final Bundle f40114V = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    public final int f40115n;

    /* renamed from: u, reason: collision with root package name */
    public final long f40116u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f40117v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40118w;

    /* renamed from: x, reason: collision with root package name */
    public final List f40119x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40120y;

    /* renamed from: z, reason: collision with root package name */
    public final int f40121z;

    public c1(int i, long j6, Bundle bundle, int i6, List list, boolean z3, int i9, boolean z6, String str, X0 x02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, O o6, int i10, String str5, List list3, int i11, String str6, int i12, long j9, long j10, int i13) {
        this.f40115n = i;
        this.f40116u = j6;
        this.f40117v = bundle == null ? new Bundle() : bundle;
        this.f40118w = i6;
        this.f40119x = list;
        this.f40120y = z3;
        this.f40121z = i9;
        this.f40094A = z6;
        this.f40095B = str;
        this.f40096C = x02;
        this.f40097D = location;
        this.f40098E = str2;
        this.f40099F = bundle2 == null ? new Bundle() : bundle2;
        this.f40100G = bundle3;
        this.f40101H = list2;
        this.f40102I = str3;
        this.J = str4;
        this.f40103K = z9;
        this.f40104L = o6;
        this.f40105M = i10;
        this.f40106N = str5;
        this.f40107O = list3 == null ? new ArrayList() : list3;
        this.f40108P = i11;
        this.f40109Q = str6;
        this.f40110R = i12;
        this.f40111S = j9;
        this.f40112T = j10;
        this.f40113U = i13;
    }

    public final boolean a(c1 c1Var) {
        if (c1Var == null) {
            return false;
        }
        return this.f40115n == c1Var.f40115n && this.f40116u == c1Var.f40116u && com.bumptech.glide.e.j(this.f40117v, c1Var.f40117v) && this.f40118w == c1Var.f40118w && P2.w.l(this.f40119x, c1Var.f40119x) && this.f40120y == c1Var.f40120y && this.f40121z == c1Var.f40121z && this.f40094A == c1Var.f40094A && P2.w.l(this.f40095B, c1Var.f40095B) && P2.w.l(this.f40096C, c1Var.f40096C) && P2.w.l(this.f40097D, c1Var.f40097D) && P2.w.l(this.f40098E, c1Var.f40098E) && com.bumptech.glide.e.j(this.f40099F, c1Var.f40099F) && com.bumptech.glide.e.j(this.f40100G, c1Var.f40100G) && P2.w.l(this.f40101H, c1Var.f40101H) && P2.w.l(this.f40102I, c1Var.f40102I) && P2.w.l(this.J, c1Var.J) && this.f40103K == c1Var.f40103K && this.f40105M == c1Var.f40105M && P2.w.l(this.f40106N, c1Var.f40106N) && P2.w.l(this.f40107O, c1Var.f40107O) && this.f40108P == c1Var.f40108P && P2.w.l(this.f40109Q, c1Var.f40109Q) && this.f40110R == c1Var.f40110R && this.f40113U == c1Var.f40113U;
    }

    public final boolean b() {
        Bundle bundle = this.f40117v;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return a((c1) obj) && this.f40111S == ((c1) obj).f40111S;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40115n), Long.valueOf(this.f40116u), this.f40117v, Integer.valueOf(this.f40118w), this.f40119x, Boolean.valueOf(this.f40120y), Integer.valueOf(this.f40121z), Boolean.valueOf(this.f40094A), this.f40095B, this.f40096C, this.f40097D, this.f40098E, this.f40099F, this.f40100G, this.f40101H, this.f40102I, this.J, Boolean.valueOf(this.f40103K), Integer.valueOf(this.f40105M), this.f40106N, this.f40107O, Integer.valueOf(this.f40108P), this.f40109Q, Integer.valueOf(this.f40110R), Long.valueOf(this.f40111S), Long.valueOf(this.f40112T), Integer.valueOf(this.f40113U)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40115n);
        A8.b.F(parcel, 2, 8);
        parcel.writeLong(this.f40116u);
        A8.b.v(parcel, 3, this.f40117v);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f40118w);
        A8.b.B(parcel, 5, this.f40119x);
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(this.f40120y ? 1 : 0);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f40121z);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f40094A ? 1 : 0);
        A8.b.z(parcel, 9, this.f40095B);
        A8.b.y(parcel, 10, this.f40096C, i);
        A8.b.y(parcel, 11, this.f40097D, i);
        A8.b.z(parcel, 12, this.f40098E);
        A8.b.v(parcel, 13, this.f40099F);
        A8.b.v(parcel, 14, this.f40100G);
        A8.b.B(parcel, 15, this.f40101H);
        A8.b.z(parcel, 16, this.f40102I);
        A8.b.z(parcel, 17, this.J);
        A8.b.F(parcel, 18, 4);
        parcel.writeInt(this.f40103K ? 1 : 0);
        A8.b.y(parcel, 19, this.f40104L, i);
        A8.b.F(parcel, 20, 4);
        parcel.writeInt(this.f40105M);
        A8.b.z(parcel, 21, this.f40106N);
        A8.b.B(parcel, 22, this.f40107O);
        A8.b.F(parcel, 23, 4);
        parcel.writeInt(this.f40108P);
        A8.b.z(parcel, 24, this.f40109Q);
        A8.b.F(parcel, 25, 4);
        parcel.writeInt(this.f40110R);
        A8.b.F(parcel, 26, 8);
        parcel.writeLong(this.f40111S);
        A8.b.F(parcel, 27, 8);
        parcel.writeLong(this.f40112T);
        A8.b.F(parcel, 28, 4);
        parcel.writeInt(this.f40113U);
        A8.b.I(parcel, G7);
    }
}
