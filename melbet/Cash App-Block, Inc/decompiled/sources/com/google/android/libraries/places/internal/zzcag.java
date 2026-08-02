package com.google.android.libraries.places.internal;

import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzcag extends zzboy {
    public zzbra zza;

    @Override // com.google.android.libraries.places.internal.zzboy
    public final void zza(int i, String str) {
        zzbra zzbraVar = this.zza;
        Level zzf = zzbvi.zzf(2);
        if (zzbvj.zza.isLoggable(zzf)) {
            zzbvj.zzc(zzbraVar, zzf, str);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboy
    public final void zzb(String str, int i, Object... objArr) {
        zzbra zzbraVar = this.zza;
        Level zzf = zzbvi.zzf(2);
        if (zzbvj.zza.isLoggable(zzf)) {
            zzbvj.zzc(zzbraVar, zzf, MessageFormat.format(str, objArr));
        }
    }
}
