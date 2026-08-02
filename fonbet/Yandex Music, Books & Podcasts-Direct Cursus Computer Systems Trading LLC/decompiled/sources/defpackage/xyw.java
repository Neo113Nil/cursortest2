package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xyw extends l9 {
    public static final Parcelable.Creator<xyw> CREATOR = new onv(13);
    public final int a;
    public final IBinder b;
    public final h66 c;
    public final boolean d;
    public final boolean e;

    public xyw(int i, IBinder iBinder, h66 h66Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = h66Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object snxVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyw)) {
            return false;
        }
        xyw xywVar = (xyw) obj;
        if (!this.c.equals(xywVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            snxVar = null;
        } else {
            int i = qc.h;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            snxVar = queryLocalInterface instanceof g8e ? (g8e) queryLocalInterface : new snx(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = xywVar.b;
        if (iBinder2 != null) {
            int i2 = qc.h;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof g8e ? (g8e) queryLocalInterface2 : new snx(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return ldg.s(snxVar, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.d0(parcel, 2, this.b);
        o8g.i0(parcel, 3, this.c, i);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d ? 1 : 0);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.e ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
