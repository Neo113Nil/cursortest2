package com.gamericefishpro.space.n9;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.gamericefishpro.space.v8.f {
    @Override // com.gamericefishpro.space.v8.f
    public final int f() {
        return 12451000;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinder);
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}
