package org.webrtc;

import defpackage.ny61;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    public interface AudioProcessing {
        void initialize(int i, int i2);

        void process(int i, int i2, ByteBuffer byteBuffer);

        void reset(int i);
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr != 0) {
            return;
        }
        ny61.r("ExternalAudioProcessor has been disposed.");
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean z);

    private static native void nativeSetBypassFlagForRenderPre(boolean z);

    private static native long nativeSetCapturePostProcessing(AudioProcessing audioProcessing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing audioProcessing);

    @Override // org.webrtc.AudioProcessingFactory
    public long createNative() {
        if (this.apmPtr == 0) {
            this.apmPtr = nativeGetDefaultApm();
        }
        return this.apmPtr;
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        long j2 = this.capturePostProcessingPtr;
        if (j2 != 0) {
            JniCommon.nativeReleaseRef(j2);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    public void setBypassFlagForCapturePost(boolean z) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(z);
    }

    public void setBypassFlagForRenderPre(boolean z) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(z);
    }

    public void setCapturePostProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long nativeSetCapturePostProcessing = nativeSetCapturePostProcessing(audioProcessing);
        long j = this.capturePostProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = nativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long nativeSetRenderPreProcessing = nativeSetRenderPreProcessing(audioProcessing);
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = nativeSetRenderPreProcessing;
    }
}
