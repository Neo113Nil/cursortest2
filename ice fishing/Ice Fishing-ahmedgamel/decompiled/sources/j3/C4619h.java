package j3;

import R2.t;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4619h extends S2.a {
    public static final Parcelable.Creator<C4619h> CREATOR = new C4614c(2);

    /* renamed from: n, reason: collision with root package name */
    public final int f38484n;

    /* renamed from: u, reason: collision with root package name */
    public final O2.b f38485u;

    /* renamed from: v, reason: collision with root package name */
    public final t f38486v;

    public C4619h(int i, O2.b bVar, t tVar) {
        this.f38484n = i;
        this.f38485u = bVar;
        this.f38486v = tVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f38484n);
        com.bumptech.glide.e.q(parcel, 2, this.f38485u, i);
        com.bumptech.glide.e.q(parcel, 3, this.f38486v, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
