package androidx.media3.extractor.text;

import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class CuesWithTimingSubtitle implements Subtitle {
    public static final ByFunctionOrdering CUES_BY_START_TIME_ASCENDING = new ByFunctionOrdering(new Format$$ExternalSyntheticLambda1(12), NaturalOrdering.INSTANCE);
    public final ImmutableList eventCues;
    public final long[] eventTimesUs;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuesWithTimingSubtitle(RegularImmutableList regularImmutableList) {
        long j;
        int i = regularImmutableList.size;
        int i2 = 0;
        long j2 = -9223372036854775807L;
        if (i == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) Maps.getOnlyElement(regularImmutableList);
            long j3 = cuesWithTiming.startTimeUs;
            long j4 = cuesWithTiming.durationUs;
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            ImmutableList immutableList = cuesWithTiming.cues;
            if (j4 == -9223372036854775807L) {
                this.eventCues = ImmutableList.of((Object) immutableList);
                this.eventTimesUs = new long[]{j5};
                return;
            } else {
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                this.eventCues = ImmutableList.of((Object) immutableList, (Object) RegularImmutableList.EMPTY);
                this.eventTimesUs = new long[]{j5, j4 + j5};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        RegularImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, regularImmutableList);
        int i3 = 0;
        while (i2 < sortedCopyOf.size) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) sortedCopyOf.get(i2);
            long j6 = cuesWithTiming2.startTimeUs;
            long j7 = cuesWithTiming2.durationUs;
            ImmutableList immutableList2 = cuesWithTiming2.cues;
            j6 = j6 == j2 ? 0L : j6;
            long j8 = j6 + j7;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j9 = this.eventTimesUs[i4];
                if (j9 >= j6) {
                    if (j9 == j6 && ((ImmutableList) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, immutableList2);
                        j = j2;
                    } else {
                        j = j2;
                        Log.w("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i4] = j6;
                        arrayList.set(i4, immutableList2);
                    }
                    if (j7 == j) {
                        this.eventTimesUs[i3] = j8;
                        arrayList.add(RegularImmutableList.EMPTY);
                        i3++;
                    }
                    i2++;
                    j2 = j;
                }
            }
            j = j2;
            this.eventTimesUs[i3] = j6;
            arrayList.add(immutableList2);
            i3++;
            if (j7 == j) {
            }
            i2++;
            j2 = j;
        }
        this.eventCues = ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, false);
        if (binarySearchFloor != -1) {
            return (ImmutableList) this.eventCues.get(binarySearchFloor);
        }
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        return RegularImmutableList.EMPTY;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i) {
        Trace.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false);
        if (binarySearchCeil < this.eventCues.size()) {
            return binarySearchCeil;
        }
        return -1;
    }
}
