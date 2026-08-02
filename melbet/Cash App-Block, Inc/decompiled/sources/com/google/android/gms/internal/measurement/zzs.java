package com.google.android.gms.internal.measurement;

import coil3.memory.MemoryCacheService;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzs extends zzai {
    public final boolean zza;
    public final boolean zzb;
    public final /* synthetic */ zzk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzk zzkVar, boolean z, boolean z2) {
        super("log");
        this.zzc = zzkVar;
        this.zza = z;
        this.zzb = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(UnleashContext unleashContext, List list) {
        int i;
        int i2;
        zzh.zzb("log", list, 1);
        int size = list.size();
        zzat zzatVar = zzao.zzf;
        zzk zzkVar = this.zzc;
        if (size == 1) {
            ((MemoryCacheService) zzkVar.zza).zza(3, ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzatVar;
        }
        zzao zzaoVar = (zzao) list.get(0);
        zzz zzzVar = (zzz) unleashContext.sessionId;
        zzz zzzVar2 = (zzz) unleashContext.sessionId;
        int zzg = zzh.zzg(zzzVar.zzb(unleashContext, zzaoVar).zzd().doubleValue());
        if (zzg != 2) {
            i = 3;
            if (zzg == 3) {
                i2 = 1;
            } else if (zzg == 5) {
                i2 = 5;
            } else if (zzg == 6) {
                i2 = 2;
            }
            String zzc = zzzVar2.zzb(unleashContext, (zzao) list.get(1)).zzc();
            if (list.size() != 2) {
                ((MemoryCacheService) zzkVar.zza).zza(i2, zzc, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzatVar;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzzVar2.zzb(unleashContext, (zzao) list.get(i3)).zzc());
            }
            ((MemoryCacheService) zzkVar.zza).zza(i2, zzc, arrayList, this.zza, this.zzb);
            return zzatVar;
        }
        i = 4;
        i2 = i;
        String zzc2 = zzzVar2.zzb(unleashContext, (zzao) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
