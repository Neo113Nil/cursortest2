package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzxy implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzyg zza;

    zzxy(zzxz zzxzVar, zzyg zzygVar) {
        this.zza = zzygVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzv();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzv();
    }
}
