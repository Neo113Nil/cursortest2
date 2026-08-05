package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzca implements Channel.GetOutputStreamResult {
    private final Status zza;
    private final OutputStream zzb;

    @Override // com.google.android.gms.wearable.Channel.GetOutputStreamResult
    public final OutputStream getOutputStream() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        OutputStream outputStream = this.zzb;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    zzca(Status status, OutputStream outputStream) {
        status.getClass();
        this.zza = status;
        this.zzb = outputStream;
    }
}
