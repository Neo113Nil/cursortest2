package P2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t extends Q2.a {
    public static final Parcelable.Creator<t> CREATOR = new B8.d(13);

    /* renamed from: n, reason: collision with root package name */
    public final int f2542n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f2543u;

    /* renamed from: v, reason: collision with root package name */
    public final M2.b f2544v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2545w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2546x;

    public t(int i, IBinder iBinder, M2.b bVar, boolean z3, boolean z6) {
        this.f2542n = i;
        this.f2543u = iBinder;
        this.f2544v = bVar;
        this.f2545w = z3;
        this.f2546x = z6;
    }

    public final boolean equals(Object obj) {
        Object k9;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (!this.f2544v.equals(tVar.f2544v)) {
                return false;
            }
            Object obj2 = null;
            IBinder iBinder = this.f2543u;
            if (iBinder == null) {
                k9 = null;
            } else {
                int i = AbstractBinderC0371a.f2451u;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                k9 = queryLocalInterface instanceof InterfaceC0380j ? (InterfaceC0380j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = tVar.f2543u;
            if (iBinder2 != null) {
                int i6 = AbstractBinderC0371a.f2451u;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC0380j ? (InterfaceC0380j) queryLocalInterface2 : new K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!w.l(k9, obj2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f2542n);
        A8.b.x(parcel, 2, this.f2543u);
        A8.b.y(parcel, 3, this.f2544v, i);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f2545w ? 1 : 0);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f2546x ? 1 : 0);
        A8.b.I(parcel, G7);
    }
}
