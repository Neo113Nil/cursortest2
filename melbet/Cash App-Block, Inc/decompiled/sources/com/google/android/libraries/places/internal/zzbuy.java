package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbuy {
    public static final Logger zza = Logger.getLogger(zzbuy.class.getName());
    public final String zzb;
    public final AtomicLong zzc;

    public zzbuy() {
        AtomicLong atomicLong = new AtomicLong();
        this.zzc = atomicLong;
        this.zzb = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}
