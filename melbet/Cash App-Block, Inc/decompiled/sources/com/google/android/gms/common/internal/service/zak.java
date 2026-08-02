package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes4.dex */
public final class zak extends zaa {
    public zak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    public final void zae(TelemetryData telemetryData) {
        Parcel zaa = zaa();
        zac.zab(zaa, telemetryData);
        try {
            this.zaa.transact(1, zaa, null, 1);
        } finally {
            zaa.recycle();
        }
    }
}
