package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SlowMotionData implements Metadata.Entry {
    public final ArrayList segments;

    public final class Segment {
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(int i, long j, long j2) {
            Trace.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public final String toString() {
            String str = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.US;
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.startTimeMs, "Segment: startTimeMs=", ", endTimeMs=");
            m1149m.append(this.endTimeMs);
            m1149m.append(", speedDivisor=");
            m1149m.append(this.speedDivisor);
            return m1149m.toString();
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.segments = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).endTimeMs;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i)).startTimeMs < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).endTimeMs;
                    i++;
                }
            }
        }
        Trace.checkArgument(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public final int hashCode() {
        return this.segments.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.segments;
    }
}
