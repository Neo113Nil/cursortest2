package s2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V0 extends S2.a {
    public static final Parcelable.Creator<V0> CREATOR = new C4936i0(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f40376n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40377u;

    /* renamed from: v, reason: collision with root package name */
    public final c1 f40378v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40379w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40380x;

    public V0(String str, int i, c1 c1Var, int i4, boolean z6) {
        this.f40376n = str;
        this.f40377u = i;
        this.f40378v = c1Var;
        this.f40379w = i4;
        this.f40380x = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return this.f40376n.equals(v02.f40376n) && this.f40377u == v02.f40377u && this.f40378v.a(v02.f40378v);
    }

    public final int hashCode() {
        return Objects.hash(this.f40376n, Integer.valueOf(this.f40377u), this.f40378v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f40376n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40377u);
        com.bumptech.glide.e.q(parcel, 3, this.f40378v, i);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f40379w);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f40380x ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
