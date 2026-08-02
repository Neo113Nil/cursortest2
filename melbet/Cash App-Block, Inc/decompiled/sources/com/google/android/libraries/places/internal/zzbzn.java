package com.google.android.libraries.places.internal;

import dagger.internal.Providers;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzbzn implements zzcgm {
    @Override // com.google.android.libraries.places.internal.zzcgm
    public final long zza() {
        return Providers.saturatedAdd(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r4.getNano());
    }
}
