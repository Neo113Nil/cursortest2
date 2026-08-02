package androidx.media3.exoplayer.text;

import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.tracing.Trace;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class MergingCuesResolver implements CuesResolver {
    public static final CompoundOrdering CUES_DISPLAY_PRIORITY_COMPARATOR = new CompoundOrdering(new ByFunctionOrdering(new Format$$ExternalSyntheticLambda1(6), NaturalOrdering.INSTANCE), new ByFunctionOrdering(new Format$$ExternalSyntheticLambda1(7), NaturalOrdering.INSTANCE$2));
    public final ArrayList cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        long j2 = cuesWithTiming.startTimeUs;
        Trace.checkArgument(j2 != -9223372036854775807L);
        Trace.checkArgument(cuesWithTiming.durationUs != -9223372036854775807L);
        boolean z = j2 <= j && j < cuesWithTiming.endTimeUs;
        ArrayList arrayList = this.cuesWithTimingList;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((CuesWithTiming) arrayList.get(size)).startTimeUs) {
                arrayList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        arrayList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.cuesWithTimingList;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i)).startTimeUs;
            if (j > j2 && j > ((CuesWithTiming) arrayList.get(i)).endTimeUs) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final ImmutableList getCuesAtTimeUs(long j) {
        ArrayList arrayList = this.cuesWithTimingList;
        if (!arrayList.isEmpty()) {
            if (j >= ((CuesWithTiming) arrayList.get(0)).startTimeUs) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList2.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                RegularImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList2);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i2 = 0; i2 < sortedCopyOf.size; i2++) {
                    builder.addAll(((CuesWithTiming) sortedCopyOf.get(i2)).cues);
                }
                return builder.build();
            }
        }
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        return RegularImmutableList.EMPTY;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.cuesWithTimingList;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((CuesWithTiming) arrayList.get(i)).startTimeUs;
            long j4 = ((CuesWithTiming) arrayList.get(i)).endTimeUs;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long getPreviousCueChangeTimeUs(long j) {
        ArrayList arrayList = this.cuesWithTimingList;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).startTimeUs) {
            return -9223372036854775807L;
        }
        long j2 = ((CuesWithTiming) arrayList.get(0)).startTimeUs;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((CuesWithTiming) arrayList.get(i)).startTimeUs;
            long j4 = ((CuesWithTiming) arrayList.get(i)).endTimeUs;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }
}
