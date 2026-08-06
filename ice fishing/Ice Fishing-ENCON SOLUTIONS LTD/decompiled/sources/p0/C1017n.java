package p0;

import a.AbstractC0083a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* renamed from: p0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017n extends AbstractC1035a {
    public static final Parcelable.Creator<C1017n> CREATOR = new C.l(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f8394a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f8395b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.b f8396c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8397d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8398e;

    public C1017n(int i2, IBinder iBinder, m0.b bVar, boolean z2, boolean z3) {
        this.f8394a = i2;
        this.f8395b = iBinder;
        this.f8396c = bVar;
        this.f8397d = z2;
        this.f8398e = z3;
    }

    public final boolean equals(Object obj) {
        Object c1003c;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017n)) {
            return false;
        }
        C1017n c1017n = (C1017n) obj;
        if (this.f8396c.equals(c1017n.f8396c)) {
            Object obj2 = null;
            IBinder iBinder = this.f8395b;
            if (iBinder == null) {
                c1003c = null;
            } else {
                int i2 = AbstractBinderC1004a.f8342b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c1003c = queryLocalInterface instanceof InterfaceC1008e ? (InterfaceC1008e) queryLocalInterface : new C1003C(iBinder);
            }
            IBinder iBinder2 = c1017n.f8395b;
            if (iBinder2 != null) {
                int i3 = AbstractBinderC1004a.f8342b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC1008e ? (InterfaceC1008e) queryLocalInterface2 : new C1003C(iBinder2);
            }
            if (AbstractC1021r.e(c1003c, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8394a);
        IBinder iBinder = this.f8395b;
        if (iBinder != null) {
            int y3 = AbstractC0083a.y(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC0083a.z(parcel, y3);
        }
        AbstractC0083a.u(parcel, 3, this.f8396c, i2);
        AbstractC0083a.A(parcel, 4, 4);
        parcel.writeInt(this.f8397d ? 1 : 0);
        AbstractC0083a.A(parcel, 5, 4);
        parcel.writeInt(this.f8398e ? 1 : 0);
        AbstractC0083a.z(parcel, y2);
    }
}
