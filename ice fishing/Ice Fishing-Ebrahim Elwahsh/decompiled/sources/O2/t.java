package O2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t extends P2.a {
    public static final Parcelable.Creator<t> CREATOR = new F0.a(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f2470n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f2471u;

    /* renamed from: v, reason: collision with root package name */
    public final L2.b f2472v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2473w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2474x;

    public t(int i, IBinder iBinder, L2.b bVar, boolean z8, boolean z9) {
        this.f2470n = i;
        this.f2471u = iBinder;
        this.f2472v = bVar;
        this.f2473w = z8;
        this.f2474x = z9;
    }

    public final boolean equals(Object obj) {
        Object k6;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (!this.f2472v.equals(tVar.f2472v)) {
                return false;
            }
            Object obj2 = null;
            IBinder iBinder = this.f2471u;
            if (iBinder == null) {
                k6 = null;
            } else {
                int i = AbstractBinderC0364a.f2379n;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                k6 = queryLocalInterface instanceof InterfaceC0373j ? (InterfaceC0373j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = tVar.f2471u;
            if (iBinder2 != null) {
                int i4 = AbstractBinderC0364a.f2379n;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC0373j ? (InterfaceC0373j) queryLocalInterface2 : new K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!w.l(k6, obj2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f2470n);
        S0.f.s(parcel, 2, this.f2471u);
        S0.f.t(parcel, 3, this.f2472v, i);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f2473w ? 1 : 0);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f2474x ? 1 : 0);
        S0.f.C(parcel, B8);
    }
}
