package com.bumptech.glide.provider;

import androidx.compose.ui.graphics.vector.PathNode;
import androidx.media3.exoplayer.text.CuesResolver;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.tracing.Trace;
import com.bumptech.glide.load.Encoder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class EncoderRegistry implements CuesResolver {
    public final ArrayList encoders;

    public final class Entry {
        public final Class dataClass;
        public final Encoder encoder;

        public Entry(Class cls, Encoder encoder) {
            this.dataClass = cls;
            this.encoder = encoder;
        }
    }

    public EncoderRegistry(int i) {
        switch (i) {
            case 1:
                this.encoders = new ArrayList(32);
                break;
            case 2:
                this.encoders = new ArrayList();
                break;
            default:
                this.encoders = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        boolean z;
        int size;
        long j2 = cuesWithTiming.startTimeUs;
        Trace.checkArgument(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = cuesWithTiming.endTimeUs;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.encoders;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((CuesWithTiming) arrayList.get(size)).startTimeUs) {
                        arrayList.add(size + 1, cuesWithTiming);
                        return z;
                    }
                    if (((CuesWithTiming) arrayList.get(size)).startTimeUs <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, cuesWithTiming);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.encoders;
        while (size >= 0) {
        }
        arrayList2.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.encoders.clear();
    }

    public void close() {
        this.encoders.add(PathNode.Close.INSTANCE);
    }

    public void curveToRelative(float f, float f2, float f3, float f4, float f5, float f6) {
        this.encoders.add(new PathNode.RelativeCurveTo(f, f2, f3, f4, f5, f6));
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        ArrayList arrayList = this.encoders;
        long j2 = ((CuesWithTiming) arrayList.get(indexOfCuesStartingAfter - 1)).endTimeUs;
        if (j2 == -9223372036854775807L || j2 >= j) {
            indexOfCuesStartingAfter--;
        }
        arrayList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            return RegularImmutableList.EMPTY;
        }
        CuesWithTiming cuesWithTiming = (CuesWithTiming) this.encoders.get(indexOfCuesStartingAfter - 1);
        long j2 = cuesWithTiming.endTimeUs;
        if (j2 == -9223372036854775807L || j < j2) {
            return cuesWithTiming.cues;
        }
        ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
        return RegularImmutableList.EMPTY;
    }

    public int getIndexOfCuesStartingAfter(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.encoders;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((CuesWithTiming) arrayList.get(i)).startTimeUs) {
                return i;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        ArrayList arrayList = this.encoders;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).startTimeUs) {
            return ((CuesWithTiming) arrayList.get(0)).startTimeUs;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i);
            long j2 = cuesWithTiming.startTimeUs;
            long j3 = cuesWithTiming.startTimeUs;
            if (j < j2) {
                long j4 = ((CuesWithTiming) arrayList.get(i - 1)).endTimeUs;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((CuesWithTiming) Maps.getLast(arrayList)).endTimeUs;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        ArrayList arrayList = this.encoders;
        if (arrayList.isEmpty() || j < ((CuesWithTiming) arrayList.get(0)).startTimeUs) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((CuesWithTiming) arrayList.get(i)).startTimeUs;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i - 1);
                long j3 = cuesWithTiming.endTimeUs;
                return (j3 == -9223372036854775807L || j3 > j) ? cuesWithTiming.startTimeUs : j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Maps.getLast(arrayList);
        long j4 = cuesWithTiming2.endTimeUs;
        return (j4 == -9223372036854775807L || j < j4) ? cuesWithTiming2.startTimeUs : j4;
    }

    public void horizontalLineToRelative(float f) {
        this.encoders.add(new PathNode.RelativeHorizontalTo(f));
    }

    public void lineTo(float f, float f2) {
        this.encoders.add(new PathNode.LineTo(f, f2));
    }

    public void lineToRelative(float f, float f2) {
        this.encoders.add(new PathNode.RelativeLineTo(f, f2));
    }

    public void moveTo(float f, float f2) {
        this.encoders.add(new PathNode.MoveTo(f, f2));
    }

    public void verticalLineToRelative(float f) {
        this.encoders.add(new PathNode.RelativeVerticalTo(f));
    }
}
