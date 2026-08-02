package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class zzbpk implements zzbpl {
    public static final zzbpk zza = new zzbpk();

    private zzbpk() {
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final String zza() {
        return "identity";
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final OutputStream zzb(zzccp zzccpVar) {
        return zzccpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final InputStream zzc(zzcdv zzcdvVar) {
        return zzcdvVar;
    }
}
