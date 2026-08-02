package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzbwh {
    public ArrayList zza = new ArrayList();
    public volatile zzbpq zzb = zzbpq.zzd;

    public final void zza(zzbpq zzbpqVar) {
        Trace.checkNotNull(zzbpqVar, "newState");
        if (this.zzb == zzbpqVar || this.zzb == zzbpq.zze) {
            return;
        }
        this.zzb = zzbpqVar;
        if (this.zza.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.zza;
        this.zza = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        a$$ExternalSyntheticBUOutline0.m$1();
    }
}
