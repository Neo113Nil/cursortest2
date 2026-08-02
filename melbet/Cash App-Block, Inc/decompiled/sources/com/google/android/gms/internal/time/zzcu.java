package com.google.android.gms.internal.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzcu extends zzdw {
    public static final zzct zza = new zzct(0);
    public final AtomicLong zzb = new AtomicLong(2147483647L);

    @Override // com.google.android.gms.internal.time.zzdw
    public final void zzb() {
        this.zzb.set(0L);
    }
}
