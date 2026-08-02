package com.google.android.gms.measurement.internal;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class zzpd {
    public final String zza;
    public final long zzb;

    public zzpd(zzpg zzpgVar, String str) {
        this.zza = str;
        zzpgVar.zzba().getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ zzpd(zzpg zzpgVar) {
        this(zzpgVar, zzpgVar.zzt().zzaz());
    }

    public /* synthetic */ zzpd(zzpg zzpgVar, String str, int i) {
        this(zzpgVar, str);
    }
}
