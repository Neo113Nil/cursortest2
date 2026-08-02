package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzvz {
    public static final zzvz zza;
    public final UUID zzb;
    public final AtomicLong zzc;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzvz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public zzvz(UUID uuid, long j) {
        this.zzb = uuid;
        this.zzc = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final long zzb() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.zzc;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID zzc() {
        long zzb = zzb() & (-61441);
        long zzb2 = zzb() >>> 2;
        UUID uuid = this.zzb;
        return new UUID(zzb ^ uuid.getMostSignificantBits(), zzb2 ^ uuid.getLeastSignificantBits());
    }
}
