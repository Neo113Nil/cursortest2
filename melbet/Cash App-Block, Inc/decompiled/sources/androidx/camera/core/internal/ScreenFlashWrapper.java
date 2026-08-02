package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {
    public boolean isClearScreenFlashPending;
    public final Object lock = new Object();
    public StreamSharing$$ExternalSyntheticLambda1 pendingListener;
    public final ImageCapture.ScreenFlash screenFlash;

    public ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void apply(long j, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = streamSharing$$ExternalSyntheticLambda1;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j, new StreamSharing$$ExternalSyntheticLambda1(this, 10));
        } else {
            StringUtilsKt.e("ScreenFlashWrapper", "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingScreenFlashClear() {
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                    if (screenFlash != null) {
                        screenFlash.clear();
                    } else {
                        StringUtilsKt.e("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    StringUtilsKt.w("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            try {
                StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = this.pendingListener;
                if (streamSharing$$ExternalSyntheticLambda1 != null) {
                    streamSharing$$ExternalSyntheticLambda1.onCompleted();
                }
                this.pendingListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
