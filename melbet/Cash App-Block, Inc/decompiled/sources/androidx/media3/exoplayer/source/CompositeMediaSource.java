package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.tracing.Trace;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class CompositeMediaSource extends BaseMediaSource {
    public final HashMap childSources = new HashMap();
    public Handler eventHandler;
    public DefaultBandwidthMeter mediaTransferListener;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public final Object id;
        public DrmSessionEventListener.EventDispatcher mediaSourceEventDispatcher;

        public ForwardingEventListener(Object obj) {
            this.mediaSourceEventDispatcher = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.eventDispatcher.listenerAndHandlers, 0, null);
            this.drmEventDispatcher = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.drmEventDispatcher.listenerAndHandlers, 0, null);
            this.id = obj;
        }

        public final boolean maybeUpdateEventDispatcher(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2;
            Object obj = this.id;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            if (mediaSource$MediaPeriodId != null) {
                mediaSource$MediaPeriodId2 = compositeMediaSource.getMediaPeriodIdForChildMediaPeriodId(obj, mediaSource$MediaPeriodId);
                if (mediaSource$MediaPeriodId2 == null) {
                    return false;
                }
            } else {
                mediaSource$MediaPeriodId2 = null;
            }
            int windowIndexForChildWindowIndex = compositeMediaSource.getWindowIndexForChildWindowIndex(i, obj);
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Objects.equals(eventDispatcher.mediaPeriodId, mediaSource$MediaPeriodId2)) {
                this.mediaSourceEventDispatcher = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.eventDispatcher.listenerAndHandlers, windowIndexForChildWindowIndex, mediaSource$MediaPeriodId2);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.drmEventDispatcher;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Objects.equals(eventDispatcher2.mediaPeriodId, mediaSource$MediaPeriodId2)) {
                return true;
            }
            this.drmEventDispatcher = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.drmEventDispatcher.listenerAndHandlers, windowIndexForChildWindowIndex, mediaSource$MediaPeriodId2);
            return true;
        }

        public final MediaLoadData maybeUpdateMediaLoadData(MediaLoadData mediaLoadData, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
            long j = mediaLoadData.mediaStartTimeMs;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            Object obj = this.id;
            long mediaTimeForChildMediaTime = compositeMediaSource.getMediaTimeForChildMediaTime(obj, j);
            long j2 = mediaLoadData.mediaEndTimeMs;
            long mediaTimeForChildMediaTime2 = compositeMediaSource.getMediaTimeForChildMediaTime(obj, j2);
            return (mediaTimeForChildMediaTime == j && mediaTimeForChildMediaTime2 == j2) ? mediaLoadData : new MediaLoadData(mediaLoadData.trackType, (Format) mediaLoadData.trackFormat, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onDownstreamFormatChanged(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
                DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
                MediaLoadData maybeUpdateMediaLoadData = maybeUpdateMediaLoadData(mediaLoadData, mediaSource$MediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.dispatchEvent(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(16, eventDispatcher, maybeUpdateMediaLoadData));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadCanceled(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
                DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
                MediaLoadData maybeUpdateMediaLoadData = maybeUpdateMediaLoadData(mediaLoadData, mediaSource$MediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(eventDispatcher, loadEventInfo, maybeUpdateMediaLoadData, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadCompleted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
                DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
                MediaLoadData maybeUpdateMediaLoadData = maybeUpdateMediaLoadData(mediaLoadData, mediaSource$MediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(eventDispatcher, loadEventInfo, maybeUpdateMediaLoadData, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadError(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
                DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
                MediaLoadData maybeUpdateMediaLoadData = maybeUpdateMediaLoadData(mediaLoadData, mediaSource$MediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3(eventDispatcher, loadEventInfo, maybeUpdateMediaLoadData, iOException, z));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadStarted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
            if (maybeUpdateEventDispatcher(i, mediaSource$MediaPeriodId)) {
                DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
                MediaLoadData maybeUpdateMediaLoadData = maybeUpdateMediaLoadData(mediaLoadData, mediaSource$MediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1(eventDispatcher, loadEventInfo, maybeUpdateMediaLoadData, i2));
            }
        }
    }

    public final class MediaSourceAndListener {
        public final CompositeMediaSource$$ExternalSyntheticLambda0 caller;
        public final ForwardingEventListener eventListener;
        public final BaseMediaSource mediaSource;

        public MediaSourceAndListener(BaseMediaSource baseMediaSource, CompositeMediaSource$$ExternalSyntheticLambda0 compositeMediaSource$$ExternalSyntheticLambda0, ForwardingEventListener forwardingEventListener) {
            this.mediaSource = baseMediaSource;
            this.caller = compositeMediaSource$$ExternalSyntheticLambda0;
            this.eventListener = forwardingEventListener;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void disableInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void enableInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    public abstract MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, MediaSource$MediaPeriodId mediaSource$MediaPeriodId);

    public long getMediaTimeForChildMediaTime(Object obj, long j) {
        return j;
    }

    public int getWindowIndexForChildWindowIndex(int i, Object obj) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.childSources.values().iterator();
        while (it.hasNext()) {
            ((MediaSourceAndListener) it.next()).mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    public abstract void onChildSourceInfoRefreshed(Object obj, BaseMediaSource baseMediaSource, Timeline timeline);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.CompositeMediaSource$$ExternalSyntheticLambda0, androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller] */
    public final void prepareChildSource(final Integer num, BaseMediaSource baseMediaSource) {
        HashMap hashMap = this.childSources;
        Trace.checkArgument(!hashMap.containsKey(num));
        ?? r1 = new MediaSource$MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.CompositeMediaSource$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
            public final void onSourceInfoRefreshed(BaseMediaSource baseMediaSource2, Timeline timeline) {
                CompositeMediaSource.this.onChildSourceInfoRefreshed(num, baseMediaSource2, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(num);
        hashMap.put(num, new MediaSourceAndListener(baseMediaSource, r1, forwardingEventListener));
        Handler handler = this.eventHandler;
        handler.getClass();
        baseMediaSource.getClass();
        DrmSessionEventListener.EventDispatcher eventDispatcher = baseMediaSource.eventDispatcher;
        eventDispatcher.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eventDispatcher.listenerAndHandlers;
        MediaSourceEventListener$EventDispatcher$ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler = new MediaSourceEventListener$EventDispatcher$ListenerAndHandler();
        mediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler = handler;
        mediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener = forwardingEventListener;
        copyOnWriteArrayList.add(mediaSourceEventListener$EventDispatcher$ListenerAndHandler);
        this.eventHandler.getClass();
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = baseMediaSource.drmEventDispatcher;
        eventDispatcher2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eventDispatcher2.listenerAndHandlers;
        DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new DrmSessionEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.listener = forwardingEventListener;
        copyOnWriteArrayList2.add(listenerAndHandler);
        DefaultBandwidthMeter defaultBandwidthMeter = this.mediaTransferListener;
        PlayerId playerId = this.playerId;
        playerId.getClass();
        baseMediaSource.prepareSource(r1, defaultBandwidthMeter, playerId);
        if (this.enabledMediaSourceCallers.isEmpty()) {
            baseMediaSource.disable(r1);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        HashMap hashMap = this.childSources;
        for (MediaSourceAndListener mediaSourceAndListener : hashMap.values()) {
            BaseMediaSource baseMediaSource = mediaSourceAndListener.mediaSource;
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.eventListener;
            baseMediaSource.releaseSource(mediaSourceAndListener.caller);
            baseMediaSource.removeEventListener(forwardingEventListener);
            baseMediaSource.removeDrmEventListener(forwardingEventListener);
        }
        hashMap.clear();
    }
}
