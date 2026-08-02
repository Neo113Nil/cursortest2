package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzazj extends zzbqh {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final zzbpa zza$1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzazj(zzaze zzazeVar) {
        this((zzbpa) zzazeVar);
        this.$r8$classId = 0;
        this.zza = new AtomicReference(new zzazi(1, null));
    }

    @Override // com.google.android.libraries.places.internal.zzbqh, com.google.android.libraries.places.internal.zzbpa
    public final void zza(zzboz zzbozVar, zzbsn zzbsnVar) {
        int i = this.$r8$classId;
        zzbpa zzbpaVar = this.zza$1;
        Object obj = this.zza;
        switch (i) {
            case 0:
                break;
            default:
                zzbsnVar.zzf((zzbsn) ((zzayi) obj).zza);
                zzbpaVar.zza(zzbozVar, zzbsnVar);
                return;
        }
        while (true) {
            AtomicReference atomicReference = (AtomicReference) obj;
            zzazi zzaziVar = (zzazi) atomicReference.get();
            zzazi zzaziVar2 = zzaziVar.zzb == 1 ? new zzazi(2, null) : zzaziVar;
            while (!atomicReference.compareAndSet(zzaziVar, zzaziVar2)) {
                if (atomicReference.get() != zzaziVar) {
                    break;
                }
            }
            int i2 = zzaziVar.zzb;
            if (i2 == 1) {
                zzbpaVar.zza(zzbozVar, zzbsnVar);
                return;
            } else if (i2 == 4) {
                zzbozVar.zzc(zzaziVar.zza, new zzbsn());
                return;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Already started");
                zzbpaVar.zze("start() called more than once", illegalStateException);
                throw illegalStateException;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqh, com.google.android.libraries.places.internal.zzbpa
    public void zzb(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Trace.checkNotNull(obj, "Message must be non-null");
                int i = ((zzazi) ((AtomicReference) this.zza).get()).zzb;
                if (i != 2) {
                    if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$1("Call was either not started or already half-closed.");
                        break;
                    }
                } else {
                    this.zza$1.zzb(obj);
                    break;
                }
                break;
            default:
                super.zzb(obj);
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl, com.google.android.libraries.places.internal.zzbpa
    public void zzc(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = ((zzazi) ((AtomicReference) this.zza).get()).zzb;
                if (i2 != 1 && i2 != 4) {
                    this.zza$1.zzc(i);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Not started");
                    break;
                }
                break;
            default:
                super.zzc(i);
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl, com.google.android.libraries.places.internal.zzbpa
    public void zzd() {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                super.zzd();
                return;
        }
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.zza;
            zzazi zzaziVar = (zzazi) atomicReference.get();
            if (zzaziVar.zzb != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("Call was either not started or already half-closed.");
                return;
            }
            zzazi zzaziVar2 = new zzazi(3, null);
            while (!atomicReference.compareAndSet(zzaziVar, zzaziVar2)) {
                if (atomicReference.get() != zzaziVar) {
                    break;
                }
            }
            this.zza$1.zzd();
            return;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl, com.google.android.libraries.places.internal.zzbpa
    public void zze(String str, Throwable th) {
        zzazi zzaziVar;
        switch (this.$r8$classId) {
            case 0:
                zzbtx zzbtxVar = zzbtx.zzb;
                if (str != null) {
                    zzbtxVar = zzbtxVar.zze(str);
                }
                if (th != null) {
                    zzbtxVar = zzbtxVar.zzd(th);
                }
                while (true) {
                    AtomicReference atomicReference = (AtomicReference) this.zza;
                    zzazi zzaziVar2 = (zzazi) atomicReference.get();
                    int i = zzaziVar2.zzb;
                    if (i == 4) {
                        zzaziVar = zzaziVar2;
                    } else if (i == 1) {
                        zzbtxVar.getClass();
                        zzaziVar = new zzazi(4, zzbtxVar);
                    } else {
                        zzbtxVar.getClass();
                        zzaziVar = new zzazi(5, zzbtxVar);
                    }
                    while (!atomicReference.compareAndSet(zzaziVar2, zzaziVar)) {
                        if (atomicReference.get() != zzaziVar2) {
                            break;
                        }
                    }
                    this.zza$1.zze(str, th);
                    break;
                }
            default:
                super.zze(str, th);
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final zzbpa zzf() {
        return this.zza$1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzazj(zzayi zzayiVar, zzbpa zzbpaVar) {
        this(zzbpaVar);
        this.$r8$classId = 1;
        this.zza = zzayiVar;
    }

    public zzazj(zzbpa zzbpaVar) {
        this.zza$1 = zzbpaVar;
    }
}
