package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class zzbsh extends zzbsj {
    public final zzbsi zzb;

    public /* synthetic */ zzbsh(String str, zzbsi zzbsiVar) {
        super(str, false);
        Trace.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        Trace.checkNotNull(zzbsiVar, "marshaller");
        this.zzb = zzbsiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final byte[] zza(Object obj) {
        String zzb = this.zzb.zzb(obj);
        Trace.checkNotNull(zzb, "null marshaller.toAsciiString()");
        return zzb.getBytes(StandardCharsets.US_ASCII);
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Object zzb(byte[] bArr) {
        return this.zzb.zza(new String(bArr, StandardCharsets.US_ASCII));
    }
}
