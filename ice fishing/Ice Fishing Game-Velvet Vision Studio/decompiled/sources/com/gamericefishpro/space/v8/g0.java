package com.gamericefishpro.space.v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.h9.h {
    public f e;
    public final int f;

    public g0(f fVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.e = fVar;
        this.f = i;
    }

    @Override // com.gamericefishpro.space.h9.h
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.gamericefishpro.space.h9.i.a(parcel, Bundle.CREATOR);
            com.gamericefishpro.space.h9.i.c(parcel);
            c0.h(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.e;
            int i3 = this.f;
            fVar.getClass();
            i0 i0Var = new i0(fVar, i2, strongBinder, bundle);
            f0 f0Var = fVar.D;
            f0Var.sendMessage(f0Var.obtainMessage(1, i3, -1, i0Var));
            this.e = null;
        } else if (i == 2) {
            parcel.readInt();
            com.gamericefishpro.space.h9.i.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) com.gamericefishpro.space.h9.i.a(parcel, k0.CREATOR);
            com.gamericefishpro.space.h9.i.c(parcel);
            f fVar2 = this.e;
            c0.h(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            c0.g(k0Var);
            fVar2.T = k0Var;
            Bundle bundle2 = k0Var.d;
            c0.h(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.e;
            int i5 = this.f;
            fVar3.getClass();
            i0 i0Var2 = new i0(fVar3, i4, strongBinder2, bundle2);
            f0 f0Var2 = fVar3.D;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i5, -1, i0Var2));
            this.e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
