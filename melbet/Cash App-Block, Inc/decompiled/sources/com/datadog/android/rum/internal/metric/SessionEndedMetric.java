package com.datadog.android.rum.internal.metric;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SessionEndedMetric {
    public final LinkedHashMap errorKindFrequencies;
    public TrackedView firstTrackedView;
    public final boolean hasTrackBackgroundEventsEnabled;
    public TrackedView lastTrackedView;
    public final LinkedHashMap missedEventCountByType;
    public final long ntpOffsetAtStartMs;
    public final String sessionId;
    public final AtomicInteger sessionReplaySkippedFramesCount;
    public final int startReason;
    public final LinkedHashMap trackedViewsById;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MissedEventType {
        public static final /* synthetic */ MissedEventType[] $VALUES;
        public static final MissedEventType ACTION;
        public static final MissedEventType ERROR;
        public static final MissedEventType LONG_TASK;
        public static final MissedEventType RESOURCE;

        static {
            MissedEventType missedEventType = new MissedEventType("ACTION", 0);
            ACTION = missedEventType;
            MissedEventType missedEventType2 = new MissedEventType("RESOURCE", 1);
            RESOURCE = missedEventType2;
            MissedEventType missedEventType3 = new MissedEventType("ERROR", 2);
            ERROR = missedEventType3;
            MissedEventType missedEventType4 = new MissedEventType("LONG_TASK", 3);
            LONG_TASK = missedEventType4;
            $VALUES = new MissedEventType[]{missedEventType, missedEventType2, missedEventType3, missedEventType4};
        }

        public static MissedEventType valueOf(String str) {
            return (MissedEventType) Enum.valueOf(MissedEventType.class, str);
        }

        public static MissedEventType[] values() {
            return (MissedEventType[]) $VALUES.clone();
        }
    }

    public final class TrackedView {
        public final long durationNs;
        public final boolean hasReplay;
        public final long startMs;
        public final String viewUrl;

        public TrackedView(long j, long j2, String str, boolean z) {
            str.getClass();
            this.viewUrl = str;
            this.startMs = j;
            this.durationNs = j2;
            this.hasReplay = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackedView)) {
                return false;
            }
            TrackedView trackedView = (TrackedView) obj;
            return Intrinsics.areEqual(this.viewUrl, trackedView.viewUrl) && this.startMs == trackedView.startMs && this.durationNs == trackedView.durationNs && this.hasReplay == trackedView.hasReplay;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasReplay) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.viewUrl.hashCode() * 31, 31, this.startMs), 31, this.durationNs);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("TrackedView(viewUrl=", this.viewUrl, ", startMs=", this.startMs);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.durationNs, ", durationNs=", ", hasReplay=", m);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasReplay, ")");
        }
    }

    public SessionEndedMetric(String str, int i, long j, boolean z) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.sessionId = str;
        this.startReason = i;
        this.ntpOffsetAtStartMs = j;
        this.hasTrackBackgroundEventsEnabled = z;
        this.trackedViewsById = new LinkedHashMap();
        this.errorKindFrequencies = new LinkedHashMap();
        this.missedEventCountByType = new LinkedHashMap();
        this.sessionReplaySkippedFramesCount = new AtomicInteger(0);
    }
}
