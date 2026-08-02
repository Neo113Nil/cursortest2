package com.google.android.gms.internal.time;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzak {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzak(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public final void zza(zzaw zzawVar) {
        switch (this.$r8$classId) {
            case 0:
                zzu zzuVar = (zzu) this.zza;
                synchronized (zzuVar.zzd) {
                    try {
                        if (zzuVar.zzf) {
                            zze zzeVar = zzaj.zza;
                            zzeVar.getClass();
                            zzeVar.zza(Level.FINE).zzn("%s: Discarding timeSignal=%s, instance is disposed()", (String) zzuVar.zza, zzawVar);
                            return;
                        } else {
                            zze zzeVar2 = zzaj.zza;
                            zzeVar2.getClass();
                            zzeVar2.zza(Level.FINE).zzn("%s: Notifying listener about timeSignal=%s", (String) zzuVar.zza, zzawVar);
                            zzs zzsVar = zzuVar.zze;
                            Objects.requireNonNull(zzsVar);
                            zzsVar.zzf(zzawVar);
                            return;
                        }
                    } finally {
                    }
                }
            case 1:
                ((zzs) this.zza).zzf(zzawVar);
                return;
            case 2:
                zzbt zzbtVar = (zzbt) this.zza;
                synchronized (zzbtVar.zzc) {
                    try {
                        if (zzbtVar.zze) {
                            return;
                        }
                        zzbo zzboVar = new zzbo(zzawVar);
                        zzs zzsVar2 = zzbtVar.zzb;
                        Objects.requireNonNull(zzsVar2);
                        zzsVar2.zzf(zzboVar);
                        return;
                    } finally {
                    }
                }
            default:
                zzby zzbyVar = (zzby) this.zza;
                synchronized (zzbyVar.zzb) {
                    try {
                        WeakReference weakReference = zzbyVar.zzd;
                        if (weakReference == null) {
                            return;
                        }
                        zzak zzakVar = (zzak) weakReference.get();
                        if (zzakVar != null) {
                            zzakVar.zza(zzawVar);
                            return;
                        }
                        zze zzeVar3 = zzaj.zza;
                        zzeVar3.getClass();
                        zzeVar3.zza(Level.FINE).zzl("Not forwarding timeSignal: listener has been garbage collected");
                        return;
                    } finally {
                    }
                }
        }
    }
}
