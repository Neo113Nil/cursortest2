package com.google.android.gms.common.internal.service;

import coil3.memory.MemoryCacheService;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes.dex */
public final class zat extends GoogleApi {
    public static final Api zae = new Api("ClientTelemetry.API", new zzbf(1), new Api.ClientKey());

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final zzw log(TelemetryData telemetryData) {
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zad.zaa};
        builder.zab = false;
        builder.zaa = new MemoryCacheService(telemetryData, 25);
        return zae(2, builder.build());
    }
}
