package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzbuz implements zzcan {
    public final AtomicLong zza = new AtomicLong();

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zza() {
        this.zza.getAndAdd(1L);
    }
}
