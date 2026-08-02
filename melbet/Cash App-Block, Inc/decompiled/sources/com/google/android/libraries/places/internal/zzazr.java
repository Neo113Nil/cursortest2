package com.google.android.libraries.places.internal;

import com.fillr.browsersdk.Fillr;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzazr extends zzboz {
    public final zzazg zza;
    public final zzfv zzb = new zzfv(zzur.zzb(), 16);

    public zzazr(zzazg zzazgVar) {
        this.zza = zzazgVar;
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zza(zzbsn zzbsnVar) {
        zzh(new com.google.android.gms.tasks.zzc(this, zzbsnVar, false, 15));
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzb(Object obj) {
        zzh(new com.google.android.gms.tasks.zzc(this, obj, false, 14));
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzc(zzbtx zzbtxVar, zzbsn zzbsnVar) {
        zzh(new Fillr.AnonymousClass2(21, this, zzbtxVar, zzbsnVar));
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzd() {
        zzazg zzazgVar = this.zza;
        Objects.requireNonNull(zzazgVar);
        zzh(new zzmu(zzazgVar, 3));
    }

    public final void zzh(Runnable runnable) {
        zzuh zzuhVar = zzur.zzd().zzb;
        if (zzuhVar != null && zzuhVar != zzuv.zza) {
            runnable.run();
            return;
        }
        zzuh zzuhVar2 = (zzuh) this.zzb.zza;
        int i = zzvm.$r8$clinit;
        zzuh zzc = zzur.zzc(zzur.zzd(), zzuhVar2);
        try {
            runnable.run();
        } finally {
        }
    }
}
