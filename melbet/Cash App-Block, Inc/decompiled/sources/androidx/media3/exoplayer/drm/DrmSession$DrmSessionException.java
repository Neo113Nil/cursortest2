package androidx.media3.exoplayer.drm;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class DrmSession$DrmSessionException extends IOException {
    public final int errorCode;

    public DrmSession$DrmSessionException(Throwable th, int i) {
        super(th);
        this.errorCode = i;
    }
}
