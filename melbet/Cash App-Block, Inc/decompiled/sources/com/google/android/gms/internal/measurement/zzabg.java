package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public final class zzabg extends zzabh {
    public final zzabf zza;

    public zzabg(int i, zzabf zzabfVar, zzza zzzaVar) {
        super(zzzaVar, i);
        this.zza = zzabfVar;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.zzl(sb);
        sb.append(true != zzzaVar.zzk() ? 't' : 'T');
        sb.append(zzabfVar.zzG);
    }

    public static zzabg zza(int i, zzabf zzabfVar, zzza zzzaVar) {
        return new zzabg(i, zzabfVar, zzzaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void zzb(zzyy zzyyVar, Object obj) {
        zzza zzzaVar = (zzza) this.zzb;
        StringBuilder sb = zzyyVar.zzb;
        boolean z = obj instanceof Date;
        zzabf zzabfVar = this.zza;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.zzl(sb2);
            sb2.append(true != zzzaVar.zzk() ? 't' : 'T');
            sb2.append(zzabfVar.zzG);
            sb.append(String.format(zzzh.zza, sb2.toString(), obj));
            return;
        }
        char c = zzabfVar.zzG;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        zzyy.zzm(sb, obj, sb3.toString());
    }
}
