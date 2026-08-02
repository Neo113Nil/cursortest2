package androidx.media3.extractor.text;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class CuesWithTiming {
    public final ImmutableList cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(long j, long j2, List list) {
        this.cues = ImmutableList.copyOf((Collection) list);
        this.startTimeUs = j;
        this.durationUs = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.endTimeUs = j3;
    }
}
