package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbvo extends zzbwi {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvo(com.google.android.gms.maps.zzah zzahVar) {
        super(((zzbvq) zzahVar.zzc).zzg, 0);
        this.zza = zzahVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwi
    public final void zza() {
        List list;
        switch (this.$r8$classId) {
            case 0:
                com.google.android.gms.maps.zzah zzahVar = (com.google.android.gms.maps.zzah) this.zza;
                int i = zzclf.$r8$clinit;
                if (((zzbtx) zzahVar.zzb) == null) {
                    try {
                        ((zzboz) zzahVar.f68zza).zzd();
                        return;
                    } catch (Throwable th) {
                        zzbtx zze = zzbtx.zzb.zzd(th).zze("Failed to call onReady.");
                        zzahVar.zzb = zze;
                        ((zzbvq) zzahVar.zzc).zzk.zzl(zze);
                        return;
                    }
                }
                return;
            case 1:
                ((zzcbr) this.zza).zzp$1();
                return;
            default:
                zzbwy zzbwyVar = (zzbwy) this.zza;
                zzbwyVar.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (zzbwyVar) {
                        try {
                            if (zzbwyVar.zzc.isEmpty()) {
                                zzbwyVar.zzc = null;
                                zzbwyVar.zzb = true;
                                return;
                            } else {
                                list = zzbwyVar.zzc;
                                zzbwyVar.zzc = arrayList;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvo(zzcbr zzcbrVar, zzbpv zzbpvVar) {
        super(zzbpvVar, 0);
        Objects.requireNonNull(zzcbrVar);
        this.zza = zzcbrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvo(zzcbr zzcbrVar, zzbwy zzbwyVar) {
        super(zzcbrVar.zzc$1, 0);
        this.zza = zzbwyVar;
    }
}
