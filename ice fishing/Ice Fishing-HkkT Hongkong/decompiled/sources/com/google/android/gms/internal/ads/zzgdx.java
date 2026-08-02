package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
abstract class zzgdx extends zzgdm {

    @CheckForNull
    private List zza;

    zzgdx(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z, true);
        List emptyList = zzfzvVar.isEmpty() ? Collections.emptyList() : zzgao.zza(zzfzvVar.size());
        for (int i = 0; i < zzfzvVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgdw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
