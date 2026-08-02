package com.google.android.gms.internal.measurement;

import android.os.Trace;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzvy {
    public static final AtomicReference zzd;
    public static final WeakHashMap zze;
    public static final com.google.android.gms.dynamite.zze zzf;

    static {
        ImmutableSet.construct(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        zzd = new AtomicReference(RegularImmutableSet.EMPTY);
        zze = new WeakHashMap();
        zzf = new com.google.android.gms.dynamite.zze(4);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static zzws zzb() {
        zzwq zzd2 = zzd();
        zzws zzwsVar = zzd2.zzb;
        if (zzwsVar != null && zzwsVar != zzwg.zza) {
            return zzwsVar;
        }
        zzvr zzvrVar = zzwd.zza;
        UUID zzc = zzvz.zza.zzc();
        String zzcL = zzvn.zzcL(zzc);
        ImmutableSet immutableSet = (ImmutableSet) zzd.get();
        if (!immutableSet.isEmpty()) {
            immutableSet.forEach(new zzwc(0));
        }
        return new zzwd(zzc, zzcL, zzwd.zza, zzd2);
    }

    public static zzws zzc(zzwq zzwqVar, zzws zzwsVar) {
        zzwqVar.getClass();
        zzws zzwsVar2 = zzwqVar.zzb;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                zzwqVar.zza = Trace.isEnabled();
            }
            if (zzwqVar.zza) {
                zzh.zza(zzwsVar2, zzwsVar);
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.zzb = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }

    public static zzwq zzd() {
        return (zzwq) zzf.get();
    }
}
