package com.google.android.gms.internal.time;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public final class zzgu extends zzgv {
    public final zzgt zza;

    public zzgu(zzek zzekVar, int i, zzgt zzgtVar) {
        super(zzekVar, i);
        this.zza = zzgtVar;
        StringBuilder sb = new StringBuilder("%");
        zzekVar.zzh(sb);
        sb.append(true != zzekVar.zzk() ? 't' : 'T');
        sb.append(zzgtVar.zzH);
    }

    @Override // com.google.android.gms.internal.time.zzgv
    public final void zzb(zzei zzeiVar, Object obj) {
        zzek zzekVar = (zzek) this.zzb;
        StringBuilder sb = (StringBuilder) zzeiVar.zzb;
        boolean z = obj instanceof Date;
        zzgt zzgtVar = this.zza;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            zzei.zzm(sb, obj, "%t" + zzgtVar.zzH);
            return;
        }
        StringBuilder sb2 = new StringBuilder("%");
        zzekVar.zzh(sb2);
        sb2.append(true != zzekVar.zzk() ? 't' : 'T');
        sb2.append(zzgtVar.zzH);
        sb.append(String.format(zzer.zza, sb2.toString(), obj));
    }
}
