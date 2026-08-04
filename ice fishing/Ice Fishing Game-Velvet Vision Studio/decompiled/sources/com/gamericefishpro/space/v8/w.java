package com.gamericefishpro.space.v8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<w> CREATOR = new v(1);
    public final int d;
    public final IBinder e;
    public final com.gamericefishpro.space.s8.b i;
    public final boolean v;
    public final boolean w;

    public w(int i, IBinder iBinder, com.gamericefishpro.space.s8.b bVar, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.i = bVar;
        this.v = z;
        this.w = z2;
    }

    public final boolean equals(Object obj) {
        Object o0Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            if (!this.i.equals(wVar.i)) {
                return false;
            }
            Object o0Var2 = null;
            IBinder iBinder = this.e;
            if (iBinder == null) {
                o0Var = null;
            } else {
                int i = a.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                o0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new o0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = wVar.e;
            if (iBinder2 != null) {
                int i2 = a.e;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                o0Var2 = iInterfaceQueryLocalInterface2 instanceof j ? (j) iInterfaceQueryLocalInterface2 : new o0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!c0.j(o0Var, o0Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.O(parcel, 2, this.e);
        y3.P(parcel, 3, this.i, i);
        y3.U(parcel, 4, 4);
        parcel.writeInt(this.v ? 1 : 0);
        y3.U(parcel, 5, 4);
        parcel.writeInt(this.w ? 1 : 0);
        y3.W(parcel, iV);
    }
}
