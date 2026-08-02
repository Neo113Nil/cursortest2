package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class zzabt implements Closeable {
    public static final com.google.android.gms.dynamite.zze zza = new com.google.android.gms.dynamite.zze(3);
    public int zzb;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
