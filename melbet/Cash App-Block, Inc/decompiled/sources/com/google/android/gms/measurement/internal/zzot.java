package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzot {
    public final String zza;
    public final Map zzb;
    public final zzls zzc;
    public final zzis zzd;

    public zzot(String str, Map map, zzls zzlsVar, zzis zzisVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzlsVar;
        this.zzd = zzisVar;
    }

    public final String zza() {
        return this.zza;
    }

    public final Map zzb() {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final zzls zzc() {
        return this.zzc;
    }

    public final zzis zzd() {
        return this.zzd;
    }
}
