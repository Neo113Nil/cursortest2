package R2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t extends S2.a {
    public static final Parcelable.Creator<t> CREATOR = new B8.d(13);

    /* renamed from: n, reason: collision with root package name */
    public final int f2863n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f2864u;

    /* renamed from: v, reason: collision with root package name */
    public final O2.b f2865v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2866w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2867x;

    public t(int i, IBinder iBinder, O2.b bVar, boolean z6, boolean z9) {
        this.f2863n = i;
        this.f2864u = iBinder;
        this.f2865v = bVar;
        this.f2866w = z6;
        this.f2867x = z9;
    }

    public final boolean equals(Object obj) {
        Object k9;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f2865v.equals(tVar.f2865v)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f2864u;
        if (iBinder == null) {
            k9 = null;
        } else {
            int i = AbstractBinderC0375a.f2772u;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            k9 = queryLocalInterface instanceof InterfaceC0384j ? (InterfaceC0384j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = tVar.f2864u;
        if (iBinder2 != null) {
            int i4 = AbstractBinderC0375a.f2772u;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC0384j ? (InterfaceC0384j) queryLocalInterface2 : new K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return w.l(k9, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2863n);
        com.bumptech.glide.e.p(parcel, 2, this.f2864u);
        com.bumptech.glide.e.q(parcel, 3, this.f2865v, i);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f2866w ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f2867x ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
