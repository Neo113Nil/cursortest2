package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzbsl extends zzbsj {
    public final zzbsm zzb;

    public /* synthetic */ zzbsl(String str, boolean z, zzbsm zzbsmVar) {
        super(str, z);
        Trace.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.zzb = zzbsmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final byte[] zza(Object obj) {
        byte[] zza = this.zzb.zza(obj);
        Trace.checkNotNull(zza, "null marshaller.toAsciiString()");
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Object zzb(byte[] bArr) {
        return this.zzb.zzb(bArr);
    }
}
