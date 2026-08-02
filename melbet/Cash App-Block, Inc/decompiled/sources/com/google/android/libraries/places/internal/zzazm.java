package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final class zzazm {
    public static final zzazm zza = new zzazm(1, null);
    public final int zzb;
    public final ListenableFuture zzc;

    static {
        new zzazm(5, null);
    }

    public zzazm(int i, AbstractTransformFuture.TransformFuture transformFuture) {
        if (i == 0) {
            throw null;
        }
        this.zzb = i;
        this.zzc = transformFuture;
    }

    public final ListenableFuture zzd() {
        Trace.checkState(this.zzb == 4);
        return this.zzc;
    }
}
