package androidx.media3.exoplayer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedInputBufferCount;
    public int droppedToKeyframeCount;
    public int maxConsecutiveDroppedBufferCount;
    public int queuedInputBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;
    public long totalVideoFrameProcessingOffsetUs;
    public int videoFrameProcessingOffsetCount;

    public final String toString() {
        int i = this.decoderInitCount;
        int i2 = this.decoderReleaseCount;
        int i3 = this.queuedInputBufferCount;
        int i4 = this.skippedInputBufferCount;
        int i5 = this.renderedOutputBufferCount;
        int i6 = this.skippedOutputBufferCount;
        int i7 = this.droppedBufferCount;
        int i8 = this.droppedInputBufferCount;
        int i9 = this.maxConsecutiveDroppedBufferCount;
        int i10 = this.droppedToKeyframeCount;
        long j = this.totalVideoFrameProcessingOffsetUs;
        int i11 = this.videoFrameProcessingOffsetCount;
        String str = Util.DEVICE_DEBUG_INFO;
        Locale locale = Locale.US;
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", m107m);
        Recorder$$ExternalSyntheticOutline1.m105m(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", m107m);
        Recorder$$ExternalSyntheticOutline1.m105m(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", m107m);
        Recorder$$ExternalSyntheticOutline1.m105m(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", m107m);
        m107m.append(j);
        m107m.append("\n videoFrameProcessingOffsetCount=");
        m107m.append(i11);
        m107m.append("\n}");
        return m107m.toString();
    }
}
