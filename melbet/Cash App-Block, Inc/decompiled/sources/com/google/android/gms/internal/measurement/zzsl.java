package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class zzsl extends zzsn implements zzsf {
    public final File zzb;

    public zzsl(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.zzb = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.zzb;
    }
}
