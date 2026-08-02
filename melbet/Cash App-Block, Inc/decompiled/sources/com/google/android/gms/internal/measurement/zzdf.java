package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdf extends zzeo {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzez zzezVar, Boolean bool) {
        super(zzezVar, true);
        this.$r8$classId = 2;
        this.zzc = bool;
        Objects.requireNonNull(zzezVar);
        this.zze = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.setUserProperty("fcm", "_ln", new ObjectWrapper(this.zzc), true, this.zzi);
                break;
            case 1:
                zzcp zzcpVar2 = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.setConditionalUserProperty((Bundle) this.zzc, this.zzi);
                break;
            case 2:
                zzcp zzcpVar3 = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar3);
                zzcpVar3.setMeasurementEnabled(((Boolean) this.zzc).booleanValue(), this.zzi);
                break;
            case 3:
                zzcp zzcpVar4 = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar4);
                zzcpVar4.retrieveAndUploadBatches(new zzds(this, (com.google.android.gms.tasks.zzc) this.zzc));
                break;
            default:
                zzcp zzcpVar5 = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar5);
                zzcpVar5.logHealthData(5, "Error with data collection. Data lost.", new ObjectWrapper((Exception) this.zzc), new ObjectWrapper(null), new ObjectWrapper(null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdf(zzez zzezVar, Object obj, int i) {
        super(zzezVar, true);
        this.$r8$classId = i;
        this.zzc = obj;
        this.zze = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzez zzezVar, Exception exc) {
        super(zzezVar, false);
        this.$r8$classId = 4;
        this.zzc = exc;
        this.zze = zzezVar;
    }
}
