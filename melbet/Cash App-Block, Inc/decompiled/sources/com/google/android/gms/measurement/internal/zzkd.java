package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzkd implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzg zze;

    public zzkd(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j) {
        this.zza = bundle;
        this.zzb = zzluVar;
        this.zzc = zzluVar2;
        this.zzd = j;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.zzb;
        zzg zzgVar = this.zze;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                Object obj3 = this.zzc;
                ((zzlj) zzgVar).zzM(this.zzd, obj3, (String) obj2, (String) obj);
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                zzmb zzmbVar = (zzmb) zzgVar;
                zzpp zzppVar = ((zzic) zzmbVar.$$delegate_0).zzl;
                zzic.zzN(zzppVar);
                zzmbVar.zzm((zzlu) obj, (zzlu) this.zzc, this.zzd, true, zzppVar.zzH("screen_view", bundle, null, false));
                break;
        }
    }

    public zzkd(zzlj zzljVar, String str, String str2, Object obj, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j;
        this.zze = zzljVar;
    }
}
