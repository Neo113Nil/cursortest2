package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzsd implements zzsx {
    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final zzsl zzd(Uri uri) {
        File zza = zzjx.zza(uri);
        return new zzsl(new FileInputStream(zza), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean zze(Uri uri) {
        return zzjx.zza(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File zzg(Uri uri) {
        return zzjx.zza(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream zzj(Uri uri) {
        File zza = zzjx.zza(uri);
        Files.createParentDirs(zza);
        return new zzsm(new FileOutputStream(zza), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzk(Uri uri) {
        File zza = zzjx.zza(uri);
        if (zza.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (zza.delete()) {
            return;
        }
        if (!zza.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzl(Uri uri, Uri uri2) {
        File zza = zzjx.zza(uri);
        File zza2 = zzjx.zza(uri2);
        Files.createParentDirs(zza2);
        if (!zza.renameTo(zza2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
