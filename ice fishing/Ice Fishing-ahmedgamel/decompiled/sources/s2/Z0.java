package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z0 extends S2.a {
    public static final Parcelable.Creator<Z0> CREATOR = new C4936i0(7);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40385n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40386u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f40387v;

    public Z0(m2.w wVar) {
        this(wVar.f39408a, wVar.f39409b, wVar.f39410c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40385n ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f40386u ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f40387v ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public Z0(boolean z6, boolean z9, boolean z10) {
        this.f40385n = z6;
        this.f40386u = z9;
        this.f40387v = z10;
    }
}
