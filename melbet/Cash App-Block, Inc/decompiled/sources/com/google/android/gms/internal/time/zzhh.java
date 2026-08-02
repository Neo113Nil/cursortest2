package com.google.android.gms.internal.time;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class zzhh implements Closeable {
    public static final Exif.AnonymousClass1 zza = new Exif.AnonymousClass1(10);
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
