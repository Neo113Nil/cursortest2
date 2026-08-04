package com.gamericefishpro.space.i9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends com.gamericefishpro.space.f9.a implements l0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // com.gamericefishpro.space.i9.l0
    public final void h(Bundle bundle) {
        Parcel parcelH = H();
        y.b(parcelH, bundle);
        I(parcelH, 1);
    }
}
