package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends q6.a {
    public static final Parcelable.Creator<q> CREATOR = new e7.c(15);

    /* renamed from: g, reason: collision with root package name */
    public final int f5631g;

    /* renamed from: h, reason: collision with root package name */
    public final IBinder f5632h;

    /* renamed from: i, reason: collision with root package name */
    public final m6.b f5633i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5634j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5635k;

    public q(int i10, IBinder iBinder, m6.b bVar, boolean z10, boolean z11) {
        this.f5631g = i10;
        this.f5632h = iBinder;
        this.f5633i = bVar;
        this.f5634j = z10;
        this.f5635k = z11;
    }

    public final boolean equals(Object obj) {
        Object e0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f5633i.equals(qVar.f5633i)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f5632h;
        if (iBinder == null) {
            e0Var = null;
        } else {
            int i10 = a.f5538d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            e0Var = queryLocalInterface instanceof g ? (g) queryLocalInterface : new e0(iBinder);
        }
        IBinder iBinder2 = qVar.f5632h;
        if (iBinder2 != null) {
            int i11 = a.f5538d;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new e0(iBinder2);
        }
        return u.j(e0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f5631g);
        IBinder iBinder = this.f5632h;
        if (iBinder != null) {
            int g03 = x4.f.g0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            x4.f.h0(parcel, g03);
        }
        x4.f.b0(parcel, 3, this.f5633i, i10);
        x4.f.i0(parcel, 4, 4);
        parcel.writeInt(this.f5634j ? 1 : 0);
        x4.f.i0(parcel, 5, 4);
        parcel.writeInt(this.f5635k ? 1 : 0);
        x4.f.h0(parcel, g02);
    }
}
