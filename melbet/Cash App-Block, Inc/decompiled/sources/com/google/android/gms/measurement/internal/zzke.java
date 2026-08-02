package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.fillr.profile.adapter.ProfileAdapter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzke implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzlj zzb;

    public zzke(zzlj zzljVar, AtomicReference atomicReference, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
            case 2:
                this.zza = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
            case 3:
                this.zza = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
            case 4:
                this.zza = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
            default:
                this.zza = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
        }
    }

    private final void run$com$google$android$gms$measurement$internal$zzkr() {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzic zzicVar = (zzic) this.zzb.$$delegate_0;
                    atomicReference.set(Double.valueOf(zzicVar.zzg.zzo(zzicVar.zzv().zzj(), zzfy.zzae)));
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AtomicReference atomicReference = this.zza;
                synchronized (atomicReference) {
                    try {
                        try {
                            zzic zzicVar = (zzic) this.zzb.$$delegate_0;
                            atomicReference.set(Boolean.valueOf(zzicVar.zzg.zzp(zzicVar.zzv().zzj(), zzfy.zzaa)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.zza;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zzic zzicVar2 = (zzic) this.zzb.$$delegate_0;
                            atomicReference2.set(zzicVar2.zzg.zzk(zzicVar2.zzv().zzj(), zzfy.zzab));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.zza;
                synchronized (atomicReference3) {
                    try {
                        try {
                            zzic zzicVar3 = (zzic) this.zzb.$$delegate_0;
                            atomicReference3.set(Long.valueOf(zzicVar3.zzg.zzl(zzicVar3.zzv().zzj(), zzfy.zzac)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.zza;
                synchronized (atomicReference4) {
                    try {
                        try {
                            zzic zzicVar4 = (zzic) this.zzb.$$delegate_0;
                            atomicReference4.set(Integer.valueOf(zzicVar4.zzg.zzm(zzicVar4.zzv().zzj(), zzfy.zzad)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                run$com$google$android$gms$measurement$internal$zzkr();
                return;
            case 5:
                zzlj zzljVar = this.zzb;
                zzhh zzhhVar = ((zzic) zzljVar.$$delegate_0).zzh;
                zzic.zzN(zzhhVar);
                Bundle zza = zzhhVar.zzi.zza();
                zznl zzt = ((zzic) zzljVar.$$delegate_0).zzt();
                AtomicReference atomicReference5 = this.zza;
                zzt.zzg();
                zzt.zzb$1();
                zzt.zzaf(new ProfileAdapter.AnonymousClass8(zzt, atomicReference5, zzt.zzah(false), false, zza, 15));
                return;
            default:
                zznl zzt2 = ((zzic) this.zzb.$$delegate_0).zzt();
                zzoo zza2 = zzoo.zza(zzls.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.zza;
                zzt2.zzg();
                zzt2.zzb$1();
                zzt2.zzaf(new ProfileAdapter.AnonymousClass8(zzt2, atomicReference6, zzt2.zzah(false), false, zza2, 16));
                return;
        }
    }

    public /* synthetic */ zzke(zzlj zzljVar, AtomicReference atomicReference, int i, boolean z) {
        this.$r8$classId = i;
        this.zzb = zzljVar;
        this.zza = atomicReference;
    }
}
