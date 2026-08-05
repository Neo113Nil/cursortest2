package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbz implements Channel.GetInputStreamResult {
    private final Status zza;
    private final InputStream zzb;

    @Override // com.google.android.gms.wearable.Channel.GetInputStreamResult
    public final InputStream getInputStream() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        InputStream inputStream = this.zzb;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    zzbz(Status status, InputStream inputStream) {
        status.getClass();
        this.zza = status;
        this.zzb = inputStream;
    }
}
