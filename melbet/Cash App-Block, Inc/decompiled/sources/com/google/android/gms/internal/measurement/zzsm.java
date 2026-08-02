package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes4.dex */
public final class zzsm extends zzso implements zzsf {
    public final FileOutputStream zza;
    public final File zzb;

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.zza = fileOutputStream;
        this.zzb = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.zzb;
    }
}
