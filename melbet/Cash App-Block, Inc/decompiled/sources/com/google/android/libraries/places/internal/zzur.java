package com.google.android.libraries.places.internal;

import android.os.Trace;
import androidx.camera.core.impl.utils.Exif;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class zzur {
    public static final AtomicReference zzc;
    public static final WeakHashMap zzd;
    public static final Exif.AnonymousClass1 zze;

    static {
        ImmutableSet.construct(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        zzc = new AtomicReference(RegularImmutableSet.EMPTY);
        zzd = new WeakHashMap();
        zze = new Exif.AnonymousClass1(12);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static zzuh zzb() {
        zzvd zzd2 = zzd();
        zzuh zzuhVar = zzd2.zzb;
        if (zzuhVar != null && zzuhVar != zzuv.zza) {
            return zzuhVar;
        }
        int i = zzuu.$r8$clinit;
        zzus zzusVar = zzus.zza;
        long zzb = zzusVar.zzb() & (-61441);
        long zzb2 = zzusVar.zzb() >>> 2;
        UUID uuid = zzusVar.zzb;
        UUID uuid2 = new UUID(zzb ^ uuid.getMostSignificantBits(), zzb2 ^ uuid.getLeastSignificantBits());
        String concat = "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid2.getLeastSignificantBits() >>> 1, 36)));
        ImmutableSet immutableSet = (ImmutableSet) zzc.get();
        if (!immutableSet.isEmpty()) {
            immutableSet.forEach(new zzut());
        }
        return new zzuu("<missing root>", uuid2, concat, zzd2);
    }

    public static zzuh zzc(zzvd zzvdVar, zzuh zzuhVar) {
        zzuh zzuhVar2;
        zzvdVar.getClass();
        zzuh zzuhVar3 = zzvdVar.zzb;
        if (zzuhVar3 != zzuhVar) {
            if (zzuhVar3 == null) {
                zzvdVar.zza = Trace.isEnabled();
            }
            if (zzvdVar.zza) {
                if (zzuhVar3 != null) {
                    zzuhVar2 = zzuhVar != null ? zzuhVar : null;
                    Thread.currentThread();
                    Trace.endSection();
                    Trace.endSection();
                } else {
                    zzuhVar2 = zzuhVar;
                }
                if (zzuhVar2 != null) {
                    Thread.currentThread();
                    Trace.beginSection(zzuhVar2.zzb);
                    String str = zzuhVar2.zzc;
                    if (str.length() > 127) {
                        str = str.substring(0, 127);
                    }
                    Trace.beginSection(str);
                }
            }
            if (zzuhVar3 != zzuhVar) {
                if (zzuhVar == null) {
                    zzuhVar = null;
                }
                zzvdVar.zzb = zzuhVar;
                return zzuhVar3;
            }
        }
        return zzuhVar;
    }

    public static zzvd zzd() {
        return (zzvd) zze.get();
    }
}
