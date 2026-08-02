package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.SeekMap;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.Client;
import com.google.android.libraries.places.internal.zzayv;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ProgressiveMediaSource extends BaseMediaSource {
    public final int continueLoadingCheckIntervalBytes;
    public final DataSource.Factory dataSourceFactory;
    public final DrmSessionManager drmSessionManager;
    public boolean hasSeenNonEstimatedSeekMap;
    public final HurlStack loadableLoadErrorHandlingPolicy;
    public MediaItem mediaItem;
    public final ExoPlayerImplInternal$$ExternalSyntheticLambda2 progressiveMediaExtractorFactory;
    public final Format singleTrackFormat;
    public boolean timelineIsLive;
    public boolean timelineIsSeekable;
    public DefaultBandwidthMeter transferListener;
    public boolean timelineIsPlaceholder = true;
    public long timelineDurationUs = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.source.ProgressiveMediaSource$1, reason: invalid class name */
    public final class AnonymousClass1 extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            super.getPeriod(i, period, z);
            period.isPlaceholder = true;
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            super.getWindow(i, window, j);
            window.isPlaceholder = true;
            return window;
        }
    }

    public final class Factory implements MediaSource$Factory {
        public final int continueLoadingCheckIntervalBytes;
        public final DataSource.Factory dataSourceFactory;
        public final DefaultDrmSessionManagerProvider drmSessionManagerProvider;
        public final HurlStack loadErrorHandlingPolicy;
        public final ExoPlayerImplInternal$$ExternalSyntheticLambda2 progressiveMediaExtractorFactory;

        public Factory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(extractorsFactory, 7);
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            HurlStack hurlStack = new HurlStack(13);
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = exoPlayerImplInternal$$ExternalSyntheticLambda2;
            this.drmSessionManagerProvider = defaultDrmSessionManagerProvider;
            this.loadErrorHandlingPolicy = hurlStack;
            this.continueLoadingCheckIntervalBytes = PKIFailureInfo.badCertTemplate;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource$Factory
        public final ProgressiveMediaSource createMediaSource(MediaItem mediaItem) {
            mediaItem.localConfiguration.getClass();
            this.drmSessionManagerProvider.getClass();
            mediaItem.localConfiguration.getClass();
            mediaItem.localConfiguration.getClass();
            return new ProgressiveMediaSource(mediaItem, this.dataSourceFactory, this.progressiveMediaExtractorFactory, DrmSessionManager.DRM_UNSUPPORTED, this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes, null);
        }
    }

    public ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2, DrmSessionManager drmSessionManager, HurlStack hurlStack, int i, Format format2) {
        this.mediaItem = mediaItem;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = exoPlayerImplInternal$$ExternalSyntheticLambda2;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = hurlStack;
        this.continueLoadingCheckIntervalBytes = i;
        this.singleTrackFormat = format2;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final MediaPeriod createPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Recorder.AnonymousClass3 anonymousClass3, long j) {
        DataSource createDataSource = this.dataSourceFactory.createDataSource();
        DefaultBandwidthMeter defaultBandwidthMeter = this.transferListener;
        if (defaultBandwidthMeter != null) {
            createDataSource.addTransferListener(defaultBandwidthMeter);
        }
        MediaItem.LocalConfiguration localConfiguration = getMediaItem().localConfiguration;
        localConfiguration.getClass();
        Uri uri = localConfiguration.uri;
        this.playerId.getClass();
        return new ProgressiveMediaPeriod(uri, createDataSource, new Recorder.AnonymousClass3((ExtractorsFactory) this.progressiveMediaExtractorFactory.f$0, 28), this.drmSessionManager, new DrmSessionEventListener.EventDispatcher(this.drmEventDispatcher.listenerAndHandlers, 0, mediaSource$MediaPeriodId), this.loadableLoadErrorHandlingPolicy, new DrmSessionEventListener.EventDispatcher(this.eventDispatcher.listenerAndHandlers, 0, mediaSource$MediaPeriodId), this, anonymousClass3, this.continueLoadingCheckIntervalBytes, this.singleTrackFormat, Util.msToUs(localConfiguration.imageDurationMs), null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }

    public final void notifySourceInfoRefreshed() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, this.timelineIsLive, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new AnonymousClass1(singlePeriodTimeline);
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    public final void onSourceInfoRefreshed(long j, SeekMap seekMap, boolean z) {
        if (this.hasSeenNonEstimatedSeekMap && seekMap.isEstimated()) {
            return;
        }
        this.hasSeenNonEstimatedSeekMap = !seekMap.isEstimated();
        if (j == -9223372036854775807L) {
            j = this.timelineDurationUs;
        }
        boolean isSeekable = seekMap.isSeekable();
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j && this.timelineIsSeekable == isSeekable && this.timelineIsLive == z) {
            return;
        }
        this.timelineDurationUs = j;
        this.timelineIsSeekable = isSeekable;
        this.timelineIsLive = z;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void prepareSourceInternal(DefaultBandwidthMeter defaultBandwidthMeter) {
        this.transferListener = defaultBandwidthMeter;
        Looper.myLooper().getClass();
        this.playerId.getClass();
        this.drmSessionManager.getClass();
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.prepared) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.sampleQueues) {
                sampleQueue.discardToEnd();
                Toolbar.AnonymousClass1 anonymousClass1 = sampleQueue.currentDrmSession;
                if (anonymousClass1 != null) {
                    anonymousClass1.release(sampleQueue.drmEventDispatcher);
                    sampleQueue.currentDrmSession = null;
                    sampleQueue.downstreamFormat = null;
                }
            }
        }
        Loader loader = progressiveMediaPeriod.loader;
        zzayv zzayvVar = loader.downloadExecutor;
        Loader.LoadTask loadTask = loader.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        zzayvVar.execute(new Client.AnonymousClass7(progressiveMediaPeriod, 12));
        ((Id3Peeker$$ExternalSyntheticBUOutline0) zzayvVar.zzb).accept((Executor) zzayvVar.zza);
        progressiveMediaPeriod.handler.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.callback = null;
        progressiveMediaPeriod.released = true;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void releaseSourceInternal() {
        this.drmSessionManager.getClass();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }
}
