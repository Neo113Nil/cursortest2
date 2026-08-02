package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes3.dex */
public final class DefaultPlaybackSessionManager {
    public static final ExoPlayer$Builder$$ExternalSyntheticLambda3 DEFAULT_SESSION_ID_GENERATOR = new ExoPlayer$Builder$$ExternalSyntheticLambda3(1);
    public static final Random RANDOM = new Random();
    public String currentSessionId;
    public MediaMetricsListener listener;
    public final Timeline.Window window = new Timeline.Window();
    public final Timeline.Period period = new Timeline.Period();
    public final HashMap sessions = new HashMap();
    public Timeline currentTimeline = Timeline.EMPTY;
    public long lastRemovedCurrentWindowSequenceNumber = -1;

    public final class SessionDescriptor {
        public final MediaSource$MediaPeriodId adMediaPeriodId;
        public boolean isActive;
        public boolean isCreated;
        public final String sessionId;
        public int windowIndex;
        public long windowSequenceNumber;

        public SessionDescriptor(String str, int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaSource$MediaPeriodId == null ? -1L : mediaSource$MediaPeriodId.windowSequenceNumber;
            if (mediaSource$MediaPeriodId == null || !mediaSource$MediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaSource$MediaPeriodId;
        }

        public final boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
            Timeline timeline = eventTime.timeline;
            if (mediaSource$MediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            if (mediaSource$MediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = this.adMediaPeriodId;
            if (mediaSource$MediaPeriodId2 == null) {
                return false;
            }
            int i = mediaSource$MediaPeriodId2.adGroupIndex;
            int indexOfPeriod = timeline.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid);
            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaSource$MediaPeriodId2.periodUid);
            if (mediaSource$MediaPeriodId.windowSequenceNumber < mediaSource$MediaPeriodId2.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaSource$MediaPeriodId.isAd()) {
                int i2 = mediaSource$MediaPeriodId.nextAdGroupIndex;
                return i2 == -1 || i2 > i;
            }
            int i3 = mediaSource$MediaPeriodId.adGroupIndex;
            int i4 = mediaSource$MediaPeriodId.adIndexInAdGroup;
            if (i3 <= i) {
                return i3 == i && i4 > mediaSource$MediaPeriodId2.adIndexInAdGroup;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r0 < r8.getWindowCount()) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
            int i = this.windowIndex;
            if (i < timeline.getWindowCount()) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                Timeline.Window window = defaultPlaybackSessionManager.window;
                timeline.getWindow(i, window);
                for (int i2 = window.firstPeriodIndex; i2 <= window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        i = timeline2.getPeriod(indexOfPeriod, defaultPlaybackSessionManager.period, false).windowIndex;
                        break;
                    }
                }
                i = -1;
            }
            this.windowIndex = i;
            return i != -1 && ((mediaSource$MediaPeriodId = this.adMediaPeriodId) == null || timeline2.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid) != -1);
        }
    }

    public final void clearCurrentSession(SessionDescriptor sessionDescriptor) {
        long j = sessionDescriptor.windowSequenceNumber;
        if (j != -1 && sessionDescriptor.isCreated) {
            this.lastRemovedCurrentWindowSequenceNumber = j;
        }
        this.currentSessionId = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionDescriptor getOrAddSession(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.sessions;
        SessionDescriptor sessionDescriptor = null;
        long j4 = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : hashMap.values()) {
            long j5 = sessionDescriptor2.windowSequenceNumber;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = sessionDescriptor2.adMediaPeriodId;
            if (j5 == -1 && i == sessionDescriptor2.windowIndex && mediaSource$MediaPeriodId != null) {
                long j6 = mediaSource$MediaPeriodId.windowSequenceNumber;
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                j = -1;
                SessionDescriptor sessionDescriptor3 = (SessionDescriptor) defaultPlaybackSessionManager.sessions.get(defaultPlaybackSessionManager.currentSessionId);
                if (sessionDescriptor3 != null) {
                    j3 = sessionDescriptor3.windowSequenceNumber;
                }
                j3 = defaultPlaybackSessionManager.lastRemovedCurrentWindowSequenceNumber + 1;
                if (j6 >= j3) {
                    sessionDescriptor2.windowSequenceNumber = j6;
                }
            } else {
                j = -1;
            }
            if (mediaSource$MediaPeriodId != null) {
                long j7 = mediaSource$MediaPeriodId.windowSequenceNumber;
                if (j7 != j) {
                    if (mediaSource$MediaPeriodId2 == null) {
                        if (!mediaSource$MediaPeriodId.isAd() && j7 == sessionDescriptor2.windowSequenceNumber) {
                            j2 = sessionDescriptor2.windowSequenceNumber;
                            if (j2 == j || j2 < j4) {
                                sessionDescriptor = sessionDescriptor2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = Util.DEVICE_DEBUG_INFO;
                                if (sessionDescriptor.adMediaPeriodId != null && mediaSource$MediaPeriodId2 != null) {
                                    sessionDescriptor = sessionDescriptor2;
                                }
                            }
                        }
                    } else if (j7 == mediaSource$MediaPeriodId2.windowSequenceNumber && mediaSource$MediaPeriodId.adGroupIndex == mediaSource$MediaPeriodId2.adGroupIndex && mediaSource$MediaPeriodId.adIndexInAdGroup == mediaSource$MediaPeriodId2.adIndexInAdGroup) {
                        j2 = sessionDescriptor2.windowSequenceNumber;
                        if (j2 == j) {
                        }
                        sessionDescriptor = sessionDescriptor2;
                        j4 = j2;
                    }
                }
            }
            if (i == sessionDescriptor2.windowIndex) {
                j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == j) {
                }
                sessionDescriptor = sessionDescriptor2;
                j4 = j2;
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str2 = (String) DEFAULT_SESSION_ID_GENERATOR.get();
        SessionDescriptor sessionDescriptor4 = new SessionDescriptor(str2, i, mediaSource$MediaPeriodId);
        hashMap.put(str2, sessionDescriptor4);
        return sessionDescriptor4;
    }

    public final synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, this.period).windowIndex, mediaSource$MediaPeriodId).sessionId;
    }

    public final void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        Timeline timeline = eventTime.timeline;
        int i = eventTime.windowIndex;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = eventTime.mediaPeriodId;
        boolean isEmpty = timeline.isEmpty();
        String str = this.currentSessionId;
        HashMap hashMap = this.sessions;
        if (isEmpty) {
            if (str != null) {
                SessionDescriptor sessionDescriptor = (SessionDescriptor) hashMap.get(str);
                sessionDescriptor.getClass();
                clearCurrentSession(sessionDescriptor);
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor2 = (SessionDescriptor) hashMap.get(str);
        this.currentSessionId = getOrAddSession(i, mediaSource$MediaPeriodId2).sessionId;
        updateSessions(eventTime);
        if (mediaSource$MediaPeriodId2 != null) {
            long j = mediaSource$MediaPeriodId2.windowSequenceNumber;
            if (mediaSource$MediaPeriodId2.isAd()) {
                if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == j && (mediaSource$MediaPeriodId = sessionDescriptor2.adMediaPeriodId) != null && mediaSource$MediaPeriodId.adGroupIndex == mediaSource$MediaPeriodId2.adGroupIndex && mediaSource$MediaPeriodId.adIndexInAdGroup == mediaSource$MediaPeriodId2.adIndexInAdGroup) {
                    return;
                }
                getOrAddSession(i, new MediaSource$MediaPeriodId(mediaSource$MediaPeriodId2.periodUid, j));
                this.listener.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        long j;
        this.listener.getClass();
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
        if (mediaSource$MediaPeriodId != null) {
            long j2 = mediaSource$MediaPeriodId.windowSequenceNumber;
            if (j2 != -1) {
                SessionDescriptor sessionDescriptor = (SessionDescriptor) this.sessions.get(this.currentSessionId);
                if (sessionDescriptor != null) {
                    j = sessionDescriptor.windowSequenceNumber;
                    if (j != -1) {
                        if (j2 < j) {
                            return;
                        }
                    }
                }
                j = this.lastRemovedCurrentWindowSequenceNumber + 1;
                if (j2 < j) {
                }
            }
            SessionDescriptor sessionDescriptor2 = (SessionDescriptor) this.sessions.get(this.currentSessionId);
            if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == -1 && sessionDescriptor2.windowIndex != eventTime.windowIndex) {
                return;
            }
        }
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = eventTime.mediaPeriodId;
        if (mediaSource$MediaPeriodId2 != null && mediaSource$MediaPeriodId2.isAd()) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = eventTime.mediaPeriodId;
            SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, new MediaSource$MediaPeriodId(mediaSource$MediaPeriodId3.periodUid, mediaSource$MediaPeriodId3.windowSequenceNumber, mediaSource$MediaPeriodId3.adGroupIndex));
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
                Math.max(0L, Util.usToMs(0L) + Util.usToMs(this.period.positionInWindowUs));
                this.listener.getClass();
            }
        }
        if (!orAddSession.isCreated) {
            orAddSession.isCreated = true;
            this.listener.getClass();
        }
        if (orAddSession.sessionId.equals(this.currentSessionId) && !orAddSession.isActive) {
            orAddSession.isActive = true;
            this.listener.onSessionActive(eventTime, orAddSession.sessionId);
        }
    }
}
