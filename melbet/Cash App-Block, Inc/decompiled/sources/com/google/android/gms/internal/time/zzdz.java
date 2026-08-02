package com.google.android.gms.internal.time;

import androidx.camera.core.impl.utils.Exif;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzdz extends zzdw {
    public static final zzct zzb = new zzct(3);
    public static final Exif.AnonymousClass1 zze = new Exif.AnonymousClass1(9);
    public final AtomicInteger zza = new AtomicInteger();

    @Override // com.google.android.gms.internal.time.zzdw
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
