package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class zzfg {
    public static final HashSet zzb;

    static {
        ((zzzo) zzzg.zza).getClass();
        AtomicReference atomicReference = zzzt.zzd;
        String str = "com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs";
        if (atomicReference.get() != null) {
            zzzv zzzvVar = (zzzv) atomicReference.get();
            new zzzx("com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs", zzzvVar.zzb, zzzvVar.zzc, zzzvVar.zzd);
        } else {
            int i = 73;
            while (true) {
                if (i >= 0) {
                    char charAt = "com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs".charAt(i);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        str = "com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            zzzt zzztVar = new zzzt(str);
            if (zzzt.zza || zzzt.zzb) {
                Level level = Level.ALL;
                zzzv zzzvVar2 = zzzx.zzd;
            } else if (zzzt.zzc) {
                zzzv zzzvVar3 = zzzx.zzd;
                new zzzx(str, Level.OFF, zzzvVar3.zzc, zzzvVar3.zzd);
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = zzzr.zza;
            concurrentLinkedQueue.offer(zzztVar);
            if (atomicReference.get() != null) {
                while (true) {
                    zzzt zzztVar2 = (zzzt) concurrentLinkedQueue.poll();
                    if (zzztVar2 == null) {
                        break;
                    }
                    zzzv zzzvVar4 = (zzzv) atomicReference.get();
                    new zzzx((String) zzztVar2.zza, zzzvVar4.zzb, zzzvVar4.zzc, zzzvVar4.zzd);
                }
            }
        }
        zzb = new HashSet();
    }
}
