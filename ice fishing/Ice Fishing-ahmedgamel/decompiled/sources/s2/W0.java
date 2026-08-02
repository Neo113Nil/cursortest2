package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W0 extends S2.a {
    public static final Parcelable.Creator<W0> CREATOR = new C4936i0(5);

    /* renamed from: n, reason: collision with root package name */
    public final int f40381n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40382u;

    public W0(int i, int i4) {
        this.f40381n = i;
        this.f40382u = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f40381n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40382u);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public W0(m2.r rVar) {
        this.f40381n = rVar.f39396a;
        this.f40382u = -1;
    }
}
