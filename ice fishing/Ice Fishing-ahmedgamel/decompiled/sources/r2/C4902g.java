package r2;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;

/* renamed from: r2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4902g extends S2.a {
    public static final Parcelable.Creator<C4902g> CREATOR = new C4614c(6);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40169A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f40170B;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40171n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40172u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40173v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40174w;

    /* renamed from: x, reason: collision with root package name */
    public final float f40175x;

    /* renamed from: y, reason: collision with root package name */
    public final int f40176y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f40177z;

    public C4902g(boolean z6, boolean z9, String str, boolean z10, float f2, int i, boolean z11, boolean z12, boolean z13) {
        this.f40171n = z6;
        this.f40172u = z9;
        this.f40173v = str;
        this.f40174w = z10;
        this.f40175x = f2;
        this.f40176y = i;
        this.f40177z = z11;
        this.f40169A = z12;
        this.f40170B = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40171n ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f40172u ? 1 : 0);
        com.bumptech.glide.e.r(parcel, 4, this.f40173v);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f40174w ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeFloat(this.f40175x);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f40176y);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f40177z ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 9, 4);
        parcel.writeInt(this.f40169A ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 10, 4);
        parcel.writeInt(this.f40170B ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public C4902g(boolean z6, boolean z9, boolean z10, float f2, boolean z11, boolean z12, boolean z13) {
        this(z6, z9, null, z10, f2, -1, z11, z12, z13);
    }
}
