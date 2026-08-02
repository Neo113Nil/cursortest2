package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzan extends zzai {
    public final ArrayList zza;
    public final ArrayList zzb;
    public final UnleashContext zzc;

    public zzan(String str, ArrayList arrayList, List list, UnleashContext unleashContext) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = unleashContext;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.zza.add(((zzao) it.next()).zzc());
            }
        }
        this.zzb = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(UnleashContext unleashContext, List list) {
        zzat zzatVar;
        UnleashContext zzc = this.zzc.zzc();
        zzz zzzVar = (zzz) zzc.sessionId;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            zzatVar = zzao.zzf;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                zzc.zzf((String) arrayList.get(i), ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(i)));
            } else {
                zzc.zzf((String) arrayList.get(i), zzatVar);
            }
            i++;
        }
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            zzao zzaoVar = (zzao) it.next();
            zzao zzb = zzzVar.zzb(zzc, zzaoVar);
            if (zzb instanceof zzap) {
                zzb = zzzVar.zzb(zzc, zzaoVar);
            }
            if (zzb instanceof zzag) {
                return ((zzag) zzb).zza;
            }
        }
        return zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzan(this);
    }

    public zzan(zzan zzanVar) {
        super(zzanVar.zzd);
        ArrayList arrayList = new ArrayList(zzanVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzanVar.zza);
        ArrayList arrayList2 = new ArrayList(zzanVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzanVar.zzb);
        this.zzc = zzanVar.zzc;
    }
}
