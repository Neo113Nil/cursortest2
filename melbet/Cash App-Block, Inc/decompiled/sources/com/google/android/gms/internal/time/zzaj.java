package com.google.android.gms.internal.time;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class zzaj {
    public static final zze zza;

    static {
        zzef zzefVar;
        ((zzfv) zzfn.zza).getClass();
        AtomicReference atomicReference = zzga.zzd;
        String str = "TrustedTimeClient";
        if (atomicReference.get() != null) {
            zzgc zzgcVar = (zzgc) atomicReference.get();
            zzefVar = new zzgf(str, zzgcVar.zzb, zzgcVar.zzc, zzgcVar.zzd);
        } else {
            int i = 16;
            while (true) {
                if (i >= 0) {
                    char charAt = "TrustedTimeClient".charAt(i);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        str = "TrustedTimeClient".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            zzga zzgaVar = new zzga(str);
            if (zzga.zza || zzga.zzb) {
                zzgaVar.zzg = new zzgd(str);
            } else if (zzga.zzc) {
                zzgc zzgcVar2 = zzgf.zzc;
                zzgaVar.zzg = new zzgf(str, Level.OFF, zzgcVar2.zzc, zzgcVar2.zzd);
            } else {
                zzgaVar.zzg = null;
            }
            zzfy.zza.offer(zzgaVar);
            zzefVar = zzgaVar;
            if (zzga.zzd.get() != null) {
                while (true) {
                    zzga zzgaVar2 = (zzga) zzfy.zza.poll();
                    if (zzgaVar2 == null) {
                        break;
                    }
                    zzgc zzgcVar3 = (zzgc) zzga.zzd.get();
                    zzgaVar2.zzg = new zzgf((String) zzgaVar2.zza, zzgcVar3.zzb, zzgcVar3.zzc, zzgcVar3.zzd);
                }
                zzga.zzf();
                zzefVar = zzgaVar;
            }
        }
        zze zzeVar = new zze(zzefVar);
        zzeVar.zzc = -1;
        zza = zzeVar;
    }
}
