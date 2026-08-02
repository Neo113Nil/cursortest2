package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.tracing.Trace;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public abstract class BaseRenderer implements PlayerMessage.Target {
    public SystemClock clock;
    public RendererConfiguration configuration;
    public int index;
    public long lastResetPositionUs;
    public MediaSource$MediaPeriodId mediaPeriodId;
    public PlayerId playerId;
    public DefaultTrackSelector rendererCapabilitiesListener;
    public int state;
    public SampleStream stream;
    public Format[] streamFormats;
    public boolean streamIsFinal;
    public long streamOffsetUs;
    public boolean throwRendererExceptionIsExecuting;
    public final int trackType;
    public final Object lock = new Object();
    public final AndroidSvg formatHolder = new AndroidSvg(1, false);
    public long readingPositionUs = Long.MIN_VALUE;
    public Timeline timeline = Timeline.EMPTY;

    public BaseRenderer(int i) {
        this.trackType = i;
    }

    public static int create(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean isFormatSupported(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExoPlaybackException createRendererException(Exception exc, Format format2, boolean z, int i) {
        int i2;
        if (format2 != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                i2 = supportsFormat(format2) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
            return new ExoPlaybackException(1, exc, i, getName(), this.index, format2, format2 != null ? 4 : i2, this.mediaPeriodId, z);
        }
        i2 = 4;
        return new ExoPlaybackException(1, exc, i, getName(), this.index, format2, format2 != null ? 4 : i2, this.mediaPeriodId, z);
    }

    public void enableMayRenderStartOfStream() {
    }

    public long getDurationToProgressUs(long j, long j2) {
        if (this.state == 1) {
            return (isReady() || isEnded()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public MediaClock getMediaClock() {
        return null;
    }

    public abstract String getName();

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
    }

    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    public abstract boolean isEnded();

    public abstract boolean isReady();

    public abstract void onDisabled();

    public void onEnabled(boolean z, boolean z2) {
    }

    public abstract void onPositionReset(long j, boolean z, boolean z2);

    public void onRelease() {
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
    }

    public void onTimelineChanged() {
    }

    public final int readSource(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i) {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        int readData = sampleStream.readData(androidSvg, decoderInputBuffer, i);
        if (readData == -4) {
            if (decoderInputBuffer.getFlag(4)) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            long j = decoderInputBuffer.timeUs + this.streamOffsetUs;
            decoderInputBuffer.timeUs = j;
            this.readingPositionUs = Math.max(this.readingPositionUs, j);
            return readData;
        }
        if (readData == -5) {
            Format format2 = (Format) androidSvg.renderOptions;
            format2.getClass();
            long j2 = format2.subsampleOffsetUs;
            if (j2 != Long.MAX_VALUE) {
                Format.Builder buildUpon = format2.buildUpon();
                buildUpon.subsampleOffsetUs = j2 + this.streamOffsetUs;
                androidSvg.renderOptions = new Format(buildUpon);
            }
        }
        return readData;
    }

    public abstract void render(long j, long j2);

    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        Trace.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        this.mediaPeriodId = mediaSource$MediaPeriodId;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j2;
        onStreamChanged(formatArr, j, j2, mediaSource$MediaPeriodId);
    }

    public final void resetPosition(long j, boolean z, boolean z2) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        if (!z2) {
            SampleStream sampleStream = this.stream;
            sampleStream.getClass();
            z2 = sampleStream.skipData(j - this.streamOffsetUs) != 0;
        }
        onPositionReset(j, z, z2);
    }

    public void setPlaybackSpeed(float f, float f2) {
    }

    public abstract int supportsFormat(Format format2);

    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return false;
    }
}
