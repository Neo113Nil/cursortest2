package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class zzlx {
    public static final zzxs zza;

    static {
        zzaag zzaagVar;
        ((zzaaj) zzaab.zza).getClass();
        AtomicReference atomicReference = zzaao.zzd;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            zzaaq zzaaqVar = (zzaaq) atomicReference.get();
            zzaagVar = new zzaas(str, zzaaqVar.zzb, zzaaqVar.zzc, zzaaqVar.zzd);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char charAt = "Phlogger".charAt(i);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        str = "Phlogger".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            zzaao zzaaoVar = new zzaao(str);
            if (zzaao.zza || zzaao.zzb) {
                zzaaoVar.zze = new zzaar(str);
            } else if (zzaao.zzc) {
                zzaaq zzaaqVar2 = zzaas.zzd;
                zzaaoVar.zze = new zzaas(str, Level.OFF, zzaaqVar2.zzc, zzaaqVar2.zzd);
            } else {
                zzaaoVar.zze = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = zzaam.zza;
            concurrentLinkedQueue.offer(zzaaoVar);
            zzaagVar = zzaaoVar;
            if (atomicReference.get() != null) {
                while (true) {
                    zzaao zzaaoVar2 = (zzaao) concurrentLinkedQueue.poll();
                    if (zzaaoVar2 == null) {
                        break;
                    }
                    zzaaq zzaaqVar3 = (zzaaq) atomicReference.get();
                    zzaaoVar2.zze = new zzaas(zzaaoVar2.zza, zzaaqVar3.zzb, zzaaqVar3.zzc, zzaaqVar3.zzd);
                }
                zzaao.zzf();
                zzaagVar = zzaaoVar;
            }
        }
        zza = new zzxs(zzaagVar);
    }
}
