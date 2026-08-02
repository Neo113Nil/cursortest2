package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzus {
    public static final zzus zza;
    public final UUID zzb;
    public final AtomicLong zzc;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzus(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public zzus(UUID uuid, long j) {
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
}
