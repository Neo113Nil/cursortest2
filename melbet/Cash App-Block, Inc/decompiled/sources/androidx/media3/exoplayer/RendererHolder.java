package androidx.media3.exoplayer;

import android.opengl.GLES20;
import android.opengl.GLES30;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.tracing.Trace;
import com.google.mlkit.vision.text.internal.zzd;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RendererHolder {
    public int index;
    public int prewarmingState;
    public boolean primaryRequiresReset;
    public boolean secondaryRequiresReset;
    public Object primaryRenderer = new int[4];
    public Object secondaryRenderer = new int[1];

    public static void ensureStopped(BaseRenderer baseRenderer) {
        int i = baseRenderer.state;
        if (i == 2) {
            Trace.checkState(i == 2);
            baseRenderer.state = 1;
            baseRenderer.onStopped();
        }
    }

    public static void setCurrentStreamFinalInternal(BaseRenderer baseRenderer, long j) {
        baseRenderer.streamIsFinal = true;
        if (baseRenderer instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) baseRenderer;
            Trace.checkState(textRenderer.streamIsFinal);
            textRenderer.finalStreamEndPositionUs = j;
        }
    }

    public void bindForWriting() {
        GLES20.glGetIntegerv(36006, (int[]) this.secondaryRenderer, 0);
        GLES20.glGetIntegerv(2978, (int[]) this.primaryRenderer, 0);
        GLES20.glBindFramebuffer(36160, this.prewarmingState);
        GLES20.glViewport(0, 0, 2048, 2048);
        GLES20.glDepthMask(true);
        GLES20.glClear(256);
    }

    public void disableRenderer(BaseRenderer baseRenderer, zzd zzdVar) {
        Trace.checkState(((BaseRenderer) this.primaryRenderer) == baseRenderer || ((BaseRenderer) this.secondaryRenderer) == baseRenderer);
        if (isRendererEnabled(baseRenderer)) {
            if (baseRenderer == ((BaseRenderer) zzdVar.zze)) {
                zzdVar.zzf = null;
                zzdVar.zze = null;
                zzdVar.zzc = true;
            }
            ensureStopped(baseRenderer);
            Trace.checkState(baseRenderer.state == 1);
            baseRenderer.formatHolder.clear();
            baseRenderer.state = 0;
            baseRenderer.stream = null;
            baseRenderer.streamFormats = null;
            baseRenderer.streamIsFinal = false;
            baseRenderer.onDisabled();
            baseRenderer.mediaPeriodId = null;
        }
    }

    public void dispose() {
        int i = this.index;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.index = 0;
        }
        int i2 = this.prewarmingState;
        if (i2 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            this.prewarmingState = 0;
        }
        this.primaryRequiresReset = false;
    }

    public int getEnabledRendererCount() {
        boolean isRendererEnabled = isRendererEnabled((BaseRenderer) this.primaryRenderer);
        BaseRenderer baseRenderer = (BaseRenderer) this.secondaryRenderer;
        return (isRendererEnabled ? 1 : 0) + ((baseRenderer == null || !isRendererEnabled(baseRenderer)) ? 0 : 1);
    }

    public BaseRenderer getRendererReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        SampleStream sampleStream;
        if (mediaPeriodHolder != null && (sampleStream = mediaPeriodHolder.sampleStreams[this.index]) != null) {
            BaseRenderer baseRenderer = (BaseRenderer) this.primaryRenderer;
            if (baseRenderer.stream == sampleStream) {
                return baseRenderer;
            }
            BaseRenderer baseRenderer2 = (BaseRenderer) this.secondaryRenderer;
            if (baseRenderer2 != null && baseRenderer2.stream == sampleStream) {
                return baseRenderer2;
            }
        }
        return null;
    }

    public boolean hasFinishedReadingFromPeriodInternal(MediaPeriodHolder mediaPeriodHolder, BaseRenderer baseRenderer) {
        int i = this.index;
        if (baseRenderer == null) {
            return true;
        }
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[i];
        SampleStream sampleStream2 = baseRenderer.stream;
        if (sampleStream2 == null) {
            return true;
        }
        if (sampleStream2 == sampleStream) {
            if (sampleStream == null || baseRenderer.hasReadStreamToEnd()) {
                return true;
            }
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.next;
            if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && mediaPeriodHolder2 != null && mediaPeriodHolder2.prepared && ((baseRenderer instanceof TextRenderer) || (baseRenderer instanceof MetadataRenderer) || baseRenderer.readingPositionUs >= mediaPeriodHolder2.getStartPositionRendererTime())) {
                return true;
            }
        }
        MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolder.next;
        return mediaPeriodHolder3 != null && mediaPeriodHolder3.sampleStreams[i] == baseRenderer.stream;
    }

    public void initialize() {
        if (this.prewarmingState != 0 || this.secondaryRequiresReset) {
            return;
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        this.index = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 33190, 2048, 2048, 0, 6402, 5125, null);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        int i2 = iArr2[0];
        this.prewarmingState = i2;
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36096, 3553, this.index, 0);
        GLES30.glDrawBuffers(1, new int[]{0}, 0);
        GLES30.glReadBuffer(0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        int[] iArr3 = new int[1];
        GLES20.glGetFramebufferAttachmentParameteriv(36160, 36096, 33302, iArr3, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        if (glCheckFramebufferStatus == 36053) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("ShadowMap");
            forest.i("Shadow FBO ready: %dx%d depth=%d bits", 2048, 2048, Integer.valueOf(iArr3[0]));
            this.primaryRequiresReset = true;
            return;
        }
        Timber.Forest forest2 = Timber.Forest;
        forest2.tag("ShadowMap");
        forest2.e(Recorder$$ExternalSyntheticOutline2.m("Shadow FBO incomplete: 0x", Integer.toHexString(glCheckFramebufferStatus)), new Object[0]);
        dispose();
        this.secondaryRequiresReset = true;
    }

    public boolean isPrewarming() {
        int i = this.prewarmingState;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean isRendererEnabled() {
        int i = this.prewarmingState;
        if (i == 0 || i == 2 || i == 4) {
            return isRendererEnabled((BaseRenderer) this.primaryRenderer);
        }
        BaseRenderer baseRenderer = (BaseRenderer) this.secondaryRenderer;
        baseRenderer.getClass();
        return baseRenderer.state != 0;
    }

    public void maybeResetRenderer(boolean z) {
        if (z) {
            if (this.primaryRequiresReset) {
                BaseRenderer baseRenderer = (BaseRenderer) this.primaryRenderer;
                Trace.checkState(baseRenderer.state == 0);
                baseRenderer.formatHolder.clear();
                baseRenderer.onReset();
                this.primaryRequiresReset = false;
                return;
            }
            return;
        }
        if (this.secondaryRequiresReset) {
            BaseRenderer baseRenderer2 = (BaseRenderer) this.secondaryRenderer;
            baseRenderer2.getClass();
            Trace.checkState(baseRenderer2.state == 0);
            baseRenderer2.formatHolder.clear();
            baseRenderer2.onReset();
            this.secondaryRequiresReset = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int replaceStreamsOrDisableRendererForTransitionInternal(BaseRenderer baseRenderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, zzd zzdVar) {
        int i;
        BaseRenderer baseRenderer2 = (BaseRenderer) this.primaryRenderer;
        int i2 = this.index;
        if (baseRenderer == null || baseRenderer.state == 0 || (baseRenderer == baseRenderer2 && ((i = this.prewarmingState) == 2 || i == 4))) {
            return 1;
        }
        if (baseRenderer == ((BaseRenderer) this.secondaryRenderer) && this.prewarmingState == 3) {
            return 1;
        }
        Object[] objArr = baseRenderer.stream != mediaPeriodHolder.sampleStreams[i2];
        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
        if (!isRendererEnabled || objArr != false) {
            if (!baseRenderer.streamIsFinal) {
                ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i2];
                int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
                Format[] formatArr = new Format[length];
                for (int i3 = 0; i3 < length; i3++) {
                    exoTrackSelection.getClass();
                    formatArr[i3] = exoTrackSelection.getFormat(i3);
                }
                SampleStream sampleStream = mediaPeriodHolder.sampleStreams[i2];
                sampleStream.getClass();
                baseRenderer.replaceStream(formatArr, sampleStream, mediaPeriodHolder.getStartPositionRendererTime(), mediaPeriodHolder.rendererPositionOffsetUs, mediaPeriodHolder.info.id);
                return 3;
            }
            if (!baseRenderer.isEnded()) {
                return 0;
            }
            disableRenderer(baseRenderer, zzdVar);
            if (!isRendererEnabled || isPrewarming()) {
                maybeResetRenderer(baseRenderer == baseRenderer2);
                return 1;
            }
        }
        return 1;
    }

    public void reset() {
        if (!isRendererEnabled((BaseRenderer) this.primaryRenderer)) {
            maybeResetRenderer(true);
        }
        BaseRenderer baseRenderer = (BaseRenderer) this.secondaryRenderer;
        if (baseRenderer == null || baseRenderer.state != 0) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void start() {
        int i;
        BaseRenderer baseRenderer = (BaseRenderer) this.primaryRenderer;
        int i2 = baseRenderer.state;
        if (i2 == 1 && this.prewarmingState != 4) {
            Trace.checkState(i2 == 1);
            baseRenderer.state = 2;
            baseRenderer.onStarted();
            return;
        }
        BaseRenderer baseRenderer2 = (BaseRenderer) this.secondaryRenderer;
        if (baseRenderer2 == null || (i = baseRenderer2.state) != 1 || this.prewarmingState == 3) {
            return;
        }
        Trace.checkState(i == 1);
        baseRenderer2.state = 2;
        baseRenderer2.onStarted();
    }

    public static boolean isRendererEnabled(BaseRenderer baseRenderer) {
        return baseRenderer.state != 0;
    }
}
