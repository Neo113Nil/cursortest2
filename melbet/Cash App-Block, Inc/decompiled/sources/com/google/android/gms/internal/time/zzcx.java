package com.google.android.gms.internal.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzcx extends zzdw {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AtomicLong zzb = new AtomicLong(-1);

    static {
        new zzct(1);
    }

    @Override // com.google.android.gms.internal.time.zzdw
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
