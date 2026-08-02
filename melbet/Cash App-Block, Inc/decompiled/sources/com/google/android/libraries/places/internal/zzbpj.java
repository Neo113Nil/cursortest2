package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
public final class zzbpj implements zzbpl {
    @Override // com.google.android.libraries.places.internal.zzbpl
    public final String zza() {
        return "gzip";
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final OutputStream zzb(zzccp zzccpVar) {
        return new GZIPOutputStream(zzccpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final InputStream zzc(zzcdv zzcdvVar) {
        return new GZIPInputStream(zzcdvVar);
    }
}
