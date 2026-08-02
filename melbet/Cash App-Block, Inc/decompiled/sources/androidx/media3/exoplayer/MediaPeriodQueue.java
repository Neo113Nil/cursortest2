package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.tracing.Trace;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class MediaPeriodQueue {
    public final DefaultAnalyticsCollector analyticsCollector;
    public final SystemHandlerWrapper analyticsCollectorHandler;
    public int length;
    public MediaPeriodHolder loading;
    public final ExoPlayerImplInternal$$ExternalSyntheticLambda2 mediaPeriodHolderFactory;
    public long nextWindowSequenceNumber;
    public Object oldFrontPeriodUid;
    public long oldFrontPeriodWindowSequenceNumber;
    public MediaPeriodHolder playing;
    public MediaPeriodHolder preloading;
    public MediaPeriodHolder prewarming;
    public MediaPeriodHolder reading;
    public int repeatMode;
    public boolean shuffleModeEnabled;
    public final Timeline.Period period = new Timeline.Period();
    public final Timeline.Window window = new Timeline.Window();
    public ArrayList preloadPriorityList = new ArrayList();

    public MediaPeriodQueue(DefaultAnalyticsCollector defaultAnalyticsCollector, SystemHandlerWrapper systemHandlerWrapper, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = defaultAnalyticsCollector;
        this.analyticsCollectorHandler = systemHandlerWrapper;
        this.mediaPeriodHolderFactory = exoPlayerImplInternal$$ExternalSyntheticLambda2;
    }

    public static MediaSource$MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j, long j2, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        timeline.getIndexOfPeriod(obj);
        int i = period.adPlaybackState.adGroupCount;
        if (i != 0) {
            if (i == 1) {
                period.isLivePostrollPlaceholder(0);
            }
            period.adPlaybackState.getClass();
            period.isServerSideInsertedAdGroup(0);
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j);
        return adGroupIndexForPositionUs == -1 ? new MediaSource$MediaPeriodId(obj, j2, period.getAdGroupIndexAfterPositionUs(j)) : new MediaSource$MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2, -1);
    }

    public final MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.next;
        }
        if (mediaPeriodHolder == this.prewarming) {
            this.prewarming = mediaPeriodHolder.next;
        }
        mediaPeriodHolder.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.id.windowSequenceNumber;
        }
        this.playing = this.playing.next;
        notifyQueueUpdate();
        return this.playing;
    }

    public final void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        mediaPeriodHolder.getClass();
        this.oldFrontPeriodUid = mediaPeriodHolder.uid;
        this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.id.windowSequenceNumber;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.release();
            mediaPeriodHolder = mediaPeriodHolder.next;
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.prewarming = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        Timeline timeline2;
        long j2;
        MediaPeriodInfo mediaPeriodInfo;
        Timeline.Period period;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        Object obj;
        long j3;
        long j4;
        long j5;
        long j6;
        Pair periodPositionUs;
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
        long j7 = (mediaPeriodHolder.rendererPositionOffsetUs + mediaPeriodInfo2.durationUs) - j;
        boolean z = mediaPeriodInfo2.isLastInTimelinePeriod;
        Timeline.Window window = this.window;
        long j8 = 0;
        long j9 = -9223372036854775807L;
        if (!z) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = mediaPeriodInfo2.id;
            Object obj2 = mediaSource$MediaPeriodId2.periodUid;
            int i = mediaSource$MediaPeriodId2.nextAdGroupIndex;
            Timeline.Period period2 = this.period;
            timeline.getPeriodByUid(obj2, period2);
            boolean z2 = mediaPeriodInfo2.isFollowedByTransitionToSameStream;
            if (!mediaSource$MediaPeriodId2.isAd()) {
                if (i != -1) {
                    period2.isLivePostrollPlaceholder(i);
                }
                int firstAdIndexToPlay = period2.getFirstAdIndexToPlay(i);
                period2.isServerSideInsertedAdGroup(i);
                if (firstAdIndexToPlay != period2.adPlaybackState.getAdGroup(i).count) {
                    return getMediaPeriodInfoForAd(timeline, mediaSource$MediaPeriodId2.periodUid, mediaSource$MediaPeriodId2.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo2.durationUs, mediaSource$MediaPeriodId2.windowSequenceNumber, z2);
                }
                timeline.getPeriodByUid(obj2, period2);
                period2.getAdGroupTimeUs(i);
                period2.adPlaybackState.getAdGroup(i).getClass();
                return getMediaPeriodInfoForContent(timeline, mediaSource$MediaPeriodId2.periodUid, 0L, -9223372036854775807L, mediaPeriodInfo2.durationUs, mediaSource$MediaPeriodId2.windowSequenceNumber, false);
            }
            int i2 = mediaSource$MediaPeriodId2.adGroupIndex;
            int i3 = period2.adPlaybackState.getAdGroup(i2).count;
            if (i3 != -1) {
                int nextAdIndexToPlay = period2.adPlaybackState.getAdGroup(i2).getNextAdIndexToPlay(mediaSource$MediaPeriodId2.adIndexInAdGroup);
                if (nextAdIndexToPlay < i3) {
                    return getMediaPeriodInfoForAd(timeline, mediaSource$MediaPeriodId2.periodUid, i2, nextAdIndexToPlay, mediaPeriodInfo2.requestedContentPositionUs, mediaSource$MediaPeriodId2.windowSequenceNumber, z2);
                }
                long j10 = mediaPeriodInfo2.requestedContentPositionUs;
                if (j10 == -9223372036854775807L) {
                    int i4 = period2.windowIndex;
                    if (period2.durationUs == -9223372036854775807L) {
                        timeline.getWindow(i4, window);
                        if (window.isDynamic && !window.isPlaceholder) {
                            j9 = Math.max(0L, j7);
                        }
                    }
                    long j11 = j9;
                    timeline2 = timeline;
                    Pair periodPositionUs2 = timeline2.getPeriodPositionUs(this.window, period2, period2.windowIndex, -9223372036854775807L, j11);
                    if (periodPositionUs2 != null) {
                        j10 = ((Long) periodPositionUs2.second).longValue();
                        j2 = j11;
                    }
                } else {
                    timeline2 = timeline;
                    j2 = -9223372036854775807L;
                }
                int i5 = mediaSource$MediaPeriodId2.adGroupIndex;
                timeline2.getPeriodByUid(obj2, period2);
                period2.getAdGroupTimeUs(i5);
                period2.adPlaybackState.getAdGroup(i5).getClass();
                return getMediaPeriodInfoForContent(timeline2, mediaSource$MediaPeriodId2.periodUid, Math.max(0L, j10), j2, mediaPeriodInfo2.requestedContentPositionUs, mediaSource$MediaPeriodId2.windowSequenceNumber, z2);
            }
            return null;
        }
        MediaPeriodInfo mediaPeriodInfo3 = mediaPeriodHolder.info;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = mediaPeriodInfo3.id;
        long j12 = mediaPeriodInfo3.requestedContentPositionUs;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaSource$MediaPeriodId3.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex != -1) {
            Timeline.Period period3 = this.period;
            int i6 = timeline.getPeriod(nextPeriodIndex, period3, true).windowIndex;
            Object obj3 = period3.uid;
            obj3.getClass();
            long j13 = mediaSource$MediaPeriodId3.windowSequenceNumber;
            mediaPeriodInfo = null;
            if (timeline.getWindow(i6, window, 0L).firstPeriodIndex == nextPeriodIndex) {
                int i7 = period3.windowIndex;
                if (period3.durationUs == -9223372036854775807L) {
                    timeline.getWindow(i7, window);
                    if (window.isDynamic && !window.isPlaceholder) {
                        j6 = Math.max(0L, j7);
                        mediaSource$MediaPeriodId = mediaSource$MediaPeriodId3;
                        long j14 = j6;
                        period = period3;
                        periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i6, -9223372036854775807L, j14);
                        if (periodPositionUs != null) {
                            Object obj4 = periodPositionUs.first;
                            long longValue = ((Long) periodPositionUs.second).longValue();
                            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.next;
                            if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.uid.equals(obj4)) {
                                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj4);
                                if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                                    resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                                    this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                                }
                            } else {
                                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = mediaPeriodHolder2.info.id.windowSequenceNumber;
                            }
                            obj = obj4;
                            j3 = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                            j5 = j14;
                            j4 = longValue;
                            j8 = -9223372036854775807L;
                        }
                    }
                }
                j6 = -9223372036854775807L;
                mediaSource$MediaPeriodId = mediaSource$MediaPeriodId3;
                long j142 = j6;
                period = period3;
                periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i6, -9223372036854775807L, j142);
                if (periodPositionUs != null) {
                }
            } else {
                period = period3;
                mediaSource$MediaPeriodId = mediaSource$MediaPeriodId3;
                obj = obj3;
                j3 = j13;
                j4 = 0;
                j5 = -9223372036854775807L;
            }
            MediaSource$MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j4, j3, this.window, this.period);
            if (j8 != -9223372036854775807L && j12 != -9223372036854775807L) {
                int i8 = timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, period).adPlaybackState.adGroupCount;
                period.adPlaybackState.getClass();
                if (i8 > 0) {
                    period.isServerSideInsertedAdGroup(0);
                }
            }
            return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j8, j4, j5);
        }
        mediaPeriodInfo = null;
        return mediaPeriodInfo;
    }

    public final MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, long j3) {
        timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, this.period);
        boolean isAd = mediaSource$MediaPeriodId.isAd();
        Object obj = mediaSource$MediaPeriodId.periodUid;
        return isAd ? getMediaPeriodInfoForAd(timeline, obj, mediaSource$MediaPeriodId.adGroupIndex, mediaSource$MediaPeriodId.adIndexInAdGroup, j, mediaSource$MediaPeriodId.windowSequenceNumber, false) : getMediaPeriodInfoForContent(timeline, obj, j2, j3, j, mediaSource$MediaPeriodId.windowSequenceNumber, false);
    }

    public final MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i, int i2, long j, long j2, boolean z) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = new MediaSource$MediaPeriodId(obj, i, i2, j2, -1);
        Timeline.Period period = this.period;
        long adDurationUs = timeline.getPeriodByUid(obj, period).getAdDurationUs(i, i2);
        if (i2 == period.getFirstAdIndexToPlay(i)) {
            period.adPlaybackState.getClass();
        }
        period.isServerSideInsertedAdGroup(i);
        long j3 = 0;
        if (adDurationUs != -9223372036854775807L && 0 >= adDurationUs) {
            j3 = Math.max(0L, adDurationUs - 1);
        }
        return new MediaPeriodInfo(mediaSource$MediaPeriodId, j3, -9223372036854775807L, j, -9223372036854775807L, adDurationUs, z, false, false, false, false);
    }

    public final MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexAfterPositionUs = period.getAdGroupIndexAfterPositionUs(j);
        boolean z2 = false;
        if (adGroupIndexAfterPositionUs != -1) {
            period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        } else if (period.adPlaybackState.adGroupCount > 0) {
            period.isServerSideInsertedAdGroup(0);
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = new MediaSource$MediaPeriodId(obj, j4, adGroupIndexAfterPositionUs);
        if (!mediaSource$MediaPeriodId.isAd() && adGroupIndexAfterPositionUs == -1) {
            z2 = true;
        }
        boolean isLastInWindow = isLastInWindow(timeline, mediaSource$MediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaSource$MediaPeriodId, z2);
        if (adGroupIndexAfterPositionUs != -1) {
            period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        }
        if (adGroupIndexAfterPositionUs != -1) {
            period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        }
        if (adGroupIndexAfterPositionUs != -1) {
            period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? period.durationUs : j5;
        return new MediaPeriodInfo(mediaSource$MediaPeriodId, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - 1), j2, j3, j5, j6, z, false, z2, isLastInWindow, isLastInTimeline);
    }

    public final MediaPeriodHolder getPrewarmingPeriod() {
        return this.prewarming;
    }

    public final MediaPeriodInfo getUpdatedMediaPeriodInfo(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long j;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodInfo.id;
        boolean isAd = mediaSource$MediaPeriodId.isAd();
        int i = mediaSource$MediaPeriodId.nextAdGroupIndex;
        boolean z = !isAd && i == -1;
        int i2 = mediaSource$MediaPeriodId.adGroupIndex;
        boolean isLastInWindow = isLastInWindow(timeline, mediaSource$MediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaSource$MediaPeriodId, z);
        Object obj = mediaSource$MediaPeriodId.periodUid;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        if (mediaSource$MediaPeriodId.isAd() || i == -1) {
            j = -9223372036854775807L;
        } else {
            period.getAdGroupTimeUs(i);
            j = 0;
        }
        long adDurationUs = mediaSource$MediaPeriodId.isAd() ? period.getAdDurationUs(i2, mediaSource$MediaPeriodId.adIndexInAdGroup) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? period.durationUs : j;
        if (mediaSource$MediaPeriodId.isAd()) {
            period.isServerSideInsertedAdGroup(i2);
        } else if (i != -1) {
            period.isServerSideInsertedAdGroup(i);
        }
        return new MediaPeriodInfo(mediaSource$MediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.liveStreamStartPositionProjectionUs, mediaPeriodInfo.requestedContentPositionUs, j, adDurationUs, mediaPeriodInfo.isPrecededByTransitionFromSameStream, false, z, isLastInWindow, isLastInTimeline);
    }

    public final boolean isLastInTimeline(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid);
        if (!timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period, false).windowIndex, this.window, 0L).isDynamic) {
            if (timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isLastInWindow(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        boolean z = !mediaSource$MediaPeriodId.isAd() && mediaSource$MediaPeriodId.nextAdGroupIndex == -1;
        Object obj = mediaSource$MediaPeriodId.periodUid;
        if (z) {
            if (timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window, 0L).lastPeriodIndex == timeline.getIndexOfPeriod(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i = 0; i < this.preloadPriorityList.size(); i++) {
                MediaPeriodHolder mediaPeriodHolder2 = (MediaPeriodHolder) this.preloadPriorityList.get(i);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public final void notifyQueueUpdate() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.next) {
            builder.m2032add((Object) mediaPeriodHolder.info.id);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        this.analyticsCollectorHandler.post(new AFd1wSDK$$ExternalSyntheticLambda2(23, this, builder, mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.info.id));
    }

    public final void reevaluateBuffer(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            Trace.checkState(mediaPeriodHolder.next == null);
            if (mediaPeriodHolder.prepared) {
                mediaPeriodHolder.mediaPeriod.reevaluateBuffer(j - mediaPeriodHolder.rendererPositionOffsetUs);
            }
        }
    }

    public final int removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        mediaPeriodHolder.getClass();
        int i = 0;
        if (mediaPeriodHolder != this.loading) {
            this.loading = mediaPeriodHolder;
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder.next;
                if (mediaPeriodHolder == null) {
                    break;
                }
                if (mediaPeriodHolder == this.reading) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                    this.reading = mediaPeriodHolder2;
                    this.prewarming = mediaPeriodHolder2;
                    i = 3;
                }
                if (mediaPeriodHolder == this.prewarming) {
                    this.prewarming = this.reading;
                    i |= 2;
                }
                mediaPeriodHolder.release();
                this.length--;
            }
            MediaPeriodHolder mediaPeriodHolder3 = this.loading;
            mediaPeriodHolder3.getClass();
            if (mediaPeriodHolder3.next != null) {
                mediaPeriodHolder3.disableTrackSelectionsInResult();
                mediaPeriodHolder3.next = null;
                mediaPeriodHolder3.enableTrackSelectionsInResult();
            }
            notifyQueueUpdate();
        }
        return i;
    }

    public final MediaSource$MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Timeline timeline, Object obj, long j) {
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        int indexOfPeriod;
        Object obj2 = obj;
        Timeline.Period period = this.period;
        int i = timeline.getPeriodByUid(obj2, period).windowIndex;
        Object obj3 = this.oldFrontPeriodUid;
        if (obj3 == null || (indexOfPeriod = timeline.getIndexOfPeriod(obj3)) == -1 || timeline.getPeriod(indexOfPeriod, period, false).windowIndex != i) {
            MediaPeriodHolder mediaPeriodHolder = this.playing;
            while (true) {
                if (mediaPeriodHolder == null) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                    while (true) {
                        if (mediaPeriodHolder2 != null) {
                            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
                            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, period, false).windowIndex == i) {
                                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = mediaPeriodHolder2.info.id.windowSequenceNumber;
                                break;
                            }
                            mediaPeriodHolder2 = mediaPeriodHolder2.next;
                        } else {
                            resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                            if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                                this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                                if (this.playing == null) {
                                    this.oldFrontPeriodUid = obj2;
                                    this.oldFrontPeriodWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                                }
                            }
                        }
                    }
                } else {
                    if (mediaPeriodHolder.uid.equals(obj2)) {
                        resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = mediaPeriodHolder.info.id.windowSequenceNumber;
                        break;
                    }
                    mediaPeriodHolder = mediaPeriodHolder.next;
                }
            }
        } else {
            resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.oldFrontPeriodWindowSequenceNumber;
        }
        timeline.getPeriodByUid(obj2, period);
        int i2 = period.windowIndex;
        Timeline.Window window = this.window;
        timeline.getWindow(i2, window);
        boolean z = false;
        for (int indexOfPeriod3 = timeline.getIndexOfPeriod(obj); indexOfPeriod3 >= window.firstPeriodIndex; indexOfPeriod3--) {
            timeline.getPeriod(indexOfPeriod3, period, true);
            boolean z2 = period.adPlaybackState.adGroupCount > 0;
            z |= z2;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj2 = period.uid;
                obj2.getClass();
            }
            if (z && (!z2 || period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj2, j, resolvePeriodUidToWindowSequenceNumberInPreloadPeriods, this.window, this.period);
    }

    public final long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    public final int updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.playing;
        if (mediaPeriodHolder2 == null) {
            return 0;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.next;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.info.isLastInTimelinePeriod) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (indexOfPeriod == -1 || mediaPeriodHolder == null || timeline2.getIndexOfPeriod(mediaPeriodHolder.uid) != indexOfPeriod) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            timeline = timeline2;
        }
        int removeAfter = removeAfter(mediaPeriodHolder2);
        mediaPeriodHolder2.info = getUpdatedMediaPeriodInfo(timeline2, mediaPeriodHolder2.info);
        return removeAfter;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int updateQueuedPeriods(Timeline timeline, long j, long j2, long j3) {
        long j4;
        int i;
        MediaPeriodInfo copyWithStartPositionUs;
        int i2;
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
            if (mediaPeriodHolder2 != null) {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder2, j);
                if (followingMediaPeriodInfo != null) {
                    long j5 = followingMediaPeriodInfo.startPositionUs;
                    MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodInfo.id;
                    long j6 = mediaPeriodInfo.liveStreamStartPositionProjectionUs;
                    j4 = -9223372036854775807L;
                    long j7 = mediaPeriodInfo.startPositionUs;
                    i = 0;
                    if (mediaSource$MediaPeriodId.equals(followingMediaPeriodInfo.id)) {
                        if (j7 != j5) {
                            if (j6 != -9223372036854775807L) {
                                long j8 = followingMediaPeriodInfo.liveStreamStartPositionProjectionUs;
                                if (j8 != -9223372036854775807L) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        copyWithStartPositionUs = j7 != j5 ? followingMediaPeriodInfo.copyWithStartPositionUs(j7, j6) : followingMediaPeriodInfo;
                    }
                }
                return removeAfter(mediaPeriodHolder2);
            }
            copyWithStartPositionUs = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo);
            j4 = -9223372036854775807L;
            i = 0;
            long j9 = copyWithStartPositionUs.durationUs;
            long j10 = mediaPeriodInfo.requestedContentPositionUs;
            long j11 = mediaPeriodInfo.durationUs;
            mediaPeriodHolder.info = copyWithStartPositionUs.copyWithRequestedContentPositionUs(j10);
            if (j11 != j9) {
                mediaPeriodHolder.updateClipping();
                long j12 = j9 == j4 ? Long.MAX_VALUE : j9 + mediaPeriodHolder.rendererPositionOffsetUs;
                int i3 = 1;
                int i4 = (mediaPeriodHolder != this.reading || mediaPeriodHolder.info.isFollowedByTransitionToSameStream || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i5 = (mediaPeriodHolder != this.prewarming || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int removeAfter = removeAfter(mediaPeriodHolder);
                if (removeAfter != 0) {
                    return removeAfter;
                }
                if (j11 == j4 && mediaPeriodInfo.endPositionUs == Long.MIN_VALUE) {
                    long j13 = copyWithStartPositionUs.endPositionUs;
                    if (j13 != j4 && j13 != Long.MIN_VALUE) {
                        i2 = 1;
                        if (i4 != 0 || (j11 == j4 && i2 == 0)) {
                            i3 = i;
                        }
                        return i5 == 0 ? i3 | 2 : i3;
                    }
                }
                i2 = i;
                if (i4 != 0) {
                }
                i3 = i;
                if (i5 == 0) {
                }
            } else {
                mediaPeriodHolder2 = mediaPeriodHolder;
                mediaPeriodHolder = mediaPeriodHolder.next;
            }
        }
        return 0;
    }
}
