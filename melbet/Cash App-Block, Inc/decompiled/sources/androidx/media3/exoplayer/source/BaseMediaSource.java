package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.camera.video.Recorder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class BaseMediaSource {
    public Looper looper;
    public PlayerId playerId;
    public Timeline timeline;
    public final ArrayList mediaSourceCallers = new ArrayList(1);
    public final HashSet enabledMediaSourceCallers = new HashSet(1);
    public final DrmSessionEventListener.EventDispatcher eventDispatcher = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public final DrmSessionEventListener.EventDispatcher drmEventDispatcher = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);

    public abstract MediaPeriod createPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Recorder.AnonymousClass3 anonymousClass3, long j);

    public final void disable(MediaSource$MediaSourceCaller mediaSource$MediaSourceCaller) {
        HashSet hashSet = this.enabledMediaSourceCallers;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(mediaSource$MediaSourceCaller);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        disableInternal();
    }

    public void disableInternal() {
    }

    public final void enable(MediaSource$MediaSourceCaller mediaSource$MediaSourceCaller) {
        this.looper.getClass();
        HashSet hashSet = this.enabledMediaSourceCallers;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(mediaSource$MediaSourceCaller);
        if (isEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    public Timeline getInitialTimeline() {
        return null;
    }

    public abstract MediaItem getMediaItem();

    public boolean isSingleWindow() {
        return true;
    }

    public abstract void maybeThrowSourceInfoRefreshError();

    public final void prepareSource(MediaSource$MediaSourceCaller mediaSource$MediaSourceCaller, DefaultBandwidthMeter defaultBandwidthMeter, PlayerId playerId) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.looper;
        Trace.checkArgument(looper == null || looper == myLooper);
        this.playerId = playerId;
        Timeline timeline = this.timeline;
        this.mediaSourceCallers.add(mediaSource$MediaSourceCaller);
        if (this.looper == null) {
            this.looper = myLooper;
            this.enabledMediaSourceCallers.add(mediaSource$MediaSourceCaller);
            prepareSourceInternal(defaultBandwidthMeter);
        } else if (timeline != null) {
            enable(mediaSource$MediaSourceCaller);
            mediaSource$MediaSourceCaller.onSourceInfoRefreshed(this, timeline);
        }
    }

    public abstract void prepareSourceInternal(DefaultBandwidthMeter defaultBandwidthMeter);

    public final void refreshSourceInfo(Timeline timeline) {
        this.timeline = timeline;
        Iterator it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            ((MediaSource$MediaSourceCaller) it.next()).onSourceInfoRefreshed(this, timeline);
        }
    }

    public abstract void releasePeriod(MediaPeriod mediaPeriod);

    public final void releaseSource(MediaSource$MediaSourceCaller mediaSource$MediaSourceCaller) {
        ArrayList arrayList = this.mediaSourceCallers;
        arrayList.remove(mediaSource$MediaSourceCaller);
        if (!arrayList.isEmpty()) {
            disable(mediaSource$MediaSourceCaller);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    public final void removeDrmEventListener(DrmSessionEventListener drmSessionEventListener) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.drmEventDispatcher.listenerAndHandlers;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = (DrmSessionEventListener.EventDispatcher.ListenerAndHandler) it.next();
            if (listenerAndHandler.listener == drmSessionEventListener) {
                copyOnWriteArrayList.remove(listenerAndHandler);
            }
        }
    }

    public final void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.eventDispatcher.listenerAndHandlers;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            MediaSourceEventListener$EventDispatcher$ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler = (MediaSourceEventListener$EventDispatcher$ListenerAndHandler) it.next();
            if (mediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener == mediaSourceEventListener) {
                copyOnWriteArrayList.remove(mediaSourceEventListener$EventDispatcher$ListenerAndHandler);
            }
        }
    }

    public abstract void updateMediaItem(MediaItem mediaItem);
}
