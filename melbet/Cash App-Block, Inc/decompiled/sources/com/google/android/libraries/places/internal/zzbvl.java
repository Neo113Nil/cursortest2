package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbvl extends zzbwi {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ com.google.android.gms.maps.zzah zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvl(com.google.android.gms.maps.zzah zzahVar, zzfv zzfvVar) {
        super(((zzbvq) zzahVar.zzc).zzg, 0);
        this.zza = zzfvVar;
        this.zzb = zzahVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwi
    public final void zza() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        com.google.android.gms.maps.zzah zzahVar = this.zzb;
        switch (i) {
            case 0:
                int i2 = zzclf.$r8$clinit;
                if (((zzbtx) zzahVar.zzb) == null) {
                    try {
                        ((zzboz) zzahVar.f68zza).zza((zzbsn) obj);
                        break;
                    } catch (Throwable th) {
                        zzbtx zze = zzbtx.zzb.zzd(th).zze("Failed to read headers");
                        zzahVar.zzb = zze;
                        ((zzbvq) zzahVar.zzc).zzk.zzl(zze);
                        return;
                    }
                }
                break;
            default:
                zzfv zzfvVar = (zzfv) obj;
                int i3 = zzclf.$r8$clinit;
                zzbvq zzbvqVar = (zzbvq) zzahVar.zzc;
                if (((zzbtx) zzahVar.zzb) != null) {
                    Logger logger = zzbzg.zzp;
                    while (true) {
                        InputStream inputStream = (InputStream) zzfvVar.zza;
                        zzfvVar.zza = null;
                        if (inputStream == null) {
                            break;
                        } else {
                            zzbzg.zzh(inputStream);
                        }
                    }
                } else {
                    while (true) {
                        try {
                            InputStream inputStream2 = (InputStream) zzfvVar.zza;
                            zzfvVar.zza = null;
                            if (inputStream2 == null) {
                                break;
                            } else {
                                try {
                                    ((zzboz) zzahVar.f68zza).zzb(zzbvqVar.zzc.zzd(inputStream2));
                                    inputStream2.close();
                                } catch (Throwable th2) {
                                    zzbzg.zzh(inputStream2);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            Logger logger2 = zzbzg.zzp;
                            while (true) {
                                InputStream inputStream3 = (InputStream) zzfvVar.zza;
                                zzfvVar.zza = null;
                                if (inputStream3 == null) {
                                    zzbtx zze2 = zzbtx.zzb.zzd(th3).zze("Failed to read message.");
                                    zzahVar.zzb = zze2;
                                    ((zzbvq) zzahVar.zzc).zzk.zzl(zze2);
                                }
                                zzbzg.zzh(inputStream3);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvl(com.google.android.gms.maps.zzah zzahVar, zzbsn zzbsnVar) {
        super(((zzbvq) zzahVar.zzc).zzg, 0);
        this.zza = zzbsnVar;
        this.zzb = zzahVar;
    }
}
