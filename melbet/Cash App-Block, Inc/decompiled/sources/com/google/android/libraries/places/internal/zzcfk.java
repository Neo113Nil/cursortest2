package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationManagerCompat;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzcfk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final AtomicInteger zzd;

    public zzcfk(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.zza = i;
        this.zzb = i / 2;
        atomicInteger.set(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcfk)) {
            return false;
        }
        zzcfk zzcfkVar = (zzcfk) obj;
        return this.zza == zzcfkVar.zza && this.zzc == zzcfkVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzc));
    }

    public final boolean zzb() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.zzd;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.zzb;
    }
}
