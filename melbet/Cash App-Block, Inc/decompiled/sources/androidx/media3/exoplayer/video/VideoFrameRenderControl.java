package androidx.media3.exoplayer.video;

import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import okio.internal.EocdRecord;

/* loaded from: classes3.dex */
public final class VideoFrameRenderControl {
    public final CallResult frameRenderer;
    public long lastPresentationTimeUs;
    public long latestInputPresentationTimeUs;
    public long latestOutputPresentationTimeUs;
    public long outputStreamStartPositionUs;
    public VideoSize outputVideoSize;
    public final LongArrayQueue presentationTimestampsUs;
    public final VideoFrameReleaseControl videoFrameReleaseControl;
    public final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    public final EocdRecord videoFrameReleaseInfo = new EocdRecord();
    public final TimedValueQueue videoSizes = new TimedValueQueue((byte) 0, 0);
    public final TimedValueQueue streamStartPositionsUs = new TimedValueQueue((byte) 0, 0);

    public VideoFrameRenderControl(CallResult callResult, VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster) {
        this.frameRenderer = callResult;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        LongArrayQueue longArrayQueue = new LongArrayQueue();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        longArrayQueue.headIndex = 0;
        longArrayQueue.tailIndex = -1;
        longArrayQueue.size = 0;
        longArrayQueue.data = new long[highestOneBit];
        longArrayQueue.wrapAroundMask = highestOneBit - 1;
        this.presentationTimestampsUs = longArrayQueue;
        this.latestInputPresentationTimeUs = -9223372036854775807L;
        this.outputVideoSize = VideoSize.UNKNOWN;
        this.latestOutputPresentationTimeUs = -9223372036854775807L;
        this.lastPresentationTimeUs = -9223372036854775807L;
    }

    public final void render(long j, long j2) {
        final CallResult callResult = this.frameRenderer;
        DefaultVideoSink defaultVideoSink = (DefaultVideoSink) callResult.serviceNames;
        while (true) {
            LongArrayQueue longArrayQueue = this.presentationTimestampsUs;
            int i = longArrayQueue.size;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            long j3 = ((long[]) longArrayQueue.data)[longArrayQueue.headIndex];
            Long l = (Long) this.streamStartPositionsUs.pollFloor(j3);
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            if (l != null && l.longValue() != this.outputStreamStartPositionUs) {
                this.outputStreamStartPositionUs = l.longValue();
                videoFrameReleaseControl.onStreamChanged(2);
            }
            long j4 = this.outputStreamStartPositionUs;
            VideoFrameReleaseControl videoFrameReleaseControl2 = this.videoFrameReleaseControl;
            EocdRecord eocdRecord = this.videoFrameReleaseInfo;
            int frameReleaseAction = videoFrameReleaseControl2.getFrameReleaseAction(j3, j, j2, j4, false, false, eocdRecord);
            if (frameReleaseAction != 5 && frameReleaseAction != 4) {
                this.videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(j3, eocdRecord.entryCount);
            }
            final int i2 = 0;
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.latestOutputPresentationTimeUs = j3;
                boolean z = frameReleaseAction == 0;
                long remove = longArrayQueue.remove();
                VideoSize videoSize = (VideoSize) this.videoSizes.pollFloor(remove);
                if (videoSize != null && !videoSize.equals(VideoSize.UNKNOWN) && !videoSize.equals(this.outputVideoSize)) {
                    this.outputVideoSize = videoSize;
                    Format.Builder builder = new Format.Builder();
                    builder.width = videoSize.width;
                    builder.height = videoSize.height;
                    builder.sampleMimeType = MimeTypes.normalizeMimeType("video/raw");
                    callResult.result = new Format(builder);
                    defaultVideoSink.listenerExecutor.execute(new q4$$ExternalSyntheticLambda0(2, callResult, videoSize));
                }
                long nanoTime = z ? System.nanoTime() : eocdRecord.centralDirectoryOffset;
                r14 = videoFrameReleaseControl.firstFrameState == 3 ? 0 : 1;
                videoFrameReleaseControl.firstFrameState = 3;
                videoFrameReleaseControl.clock.getClass();
                videoFrameReleaseControl.lastReleaseRealtimeUs = Util.msToUs(SystemClock.elapsedRealtime());
                if (r14 != 0 && defaultVideoSink.outputSurface != null) {
                    defaultVideoSink.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$FrameRendererImpl$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            CallResult callResult2 = callResult;
                            switch (i3) {
                                case 0:
                                    ((DefaultVideoSink) callResult2.serviceNames).listener.onFirstFrameRendered();
                                    break;
                                default:
                                    ((DefaultVideoSink) callResult2.serviceNames).listener.onFrameDropped();
                                    break;
                            }
                        }
                    });
                }
                Format format2 = (Format) callResult.result;
                defaultVideoSink.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(remove, nanoTime, format2 == null ? new Format(new Format.Builder()) : format2, null);
                MediaCodecVideoRenderer.AnonymousClass2 anonymousClass2 = (MediaCodecVideoRenderer.AnonymousClass2) defaultVideoSink.videoFrameHandlers.remove();
                MediaCodecVideoRenderer.this.renderOutputBufferV21(anonymousClass2.val$codec, anonymousClass2.val$bufferIndex, nanoTime);
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                this.latestOutputPresentationTimeUs = j3;
                longArrayQueue.remove();
                defaultVideoSink.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.DefaultVideoSink$FrameRendererImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = r2;
                        CallResult callResult2 = callResult;
                        switch (i3) {
                            case 0:
                                ((DefaultVideoSink) callResult2.serviceNames).listener.onFirstFrameRendered();
                                break;
                            default:
                                ((DefaultVideoSink) callResult2.serviceNames).listener.onFrameDropped();
                                break;
                        }
                    }
                });
                MediaCodecVideoRenderer.AnonymousClass2 anonymousClass22 = (MediaCodecVideoRenderer.AnonymousClass2) defaultVideoSink.videoFrameHandlers.remove();
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                MediaCodecAdapter mediaCodecAdapter = anonymousClass22.val$codec;
                int i3 = anonymousClass22.val$bufferIndex;
                Trace.beginSection("dropVideoBuffer");
                mediaCodecAdapter.releaseOutputBuffer(i3);
                Trace.endSection();
                mediaCodecVideoRenderer.updateDroppedBufferCounters(0, 1);
            } else {
                if (frameReleaseAction != 4) {
                    if (frameReleaseAction == 5) {
                        return;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1(String.valueOf(frameReleaseAction));
                    return;
                }
                this.latestOutputPresentationTimeUs = j3;
            }
        }
    }
}
