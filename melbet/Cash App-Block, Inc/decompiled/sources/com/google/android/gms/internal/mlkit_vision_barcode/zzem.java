package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzem implements zzet {
    public final Float zzb;

    static {
        new com.google.android.gms.internal.mlkit_genai_prompt.zzkr(zzem.class, 1);
    }

    public zzem(Float f) {
        this.zzb = f;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(super.toString(), "[status=SUCCESS, result=[", this.zzb.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb;
    }
}
