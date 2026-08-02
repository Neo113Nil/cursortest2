package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzck implements ThreadFactory {
    public final String zza;
    public final AtomicInteger zzb = new AtomicInteger(1);

    public zzck(String str) {
        this.zza = str.concat("-thread-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, Boxes$$ExternalSyntheticOutline1.m(this.zzb.getAndIncrement(), this.zza, new StringBuilder()));
    }
}
