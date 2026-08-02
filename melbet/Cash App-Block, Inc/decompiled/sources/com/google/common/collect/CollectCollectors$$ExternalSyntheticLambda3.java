package com.google.common.collect;

import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import java.nio.IntBuffer;
import java.util.function.BiConsumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda3 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ImmutableList.Builder) obj).m2032add(obj2);
                break;
            case 1:
                ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                Range range = (Range) obj2;
                builder.getClass();
                Trace.checkArgument("range must not be empty, but was %s", range, !range.lowerBound.equals(range.upperBound));
                builder.ranges.add(range);
                break;
            case 2:
                ((ImmutableSet.Builder) obj).add(obj2);
                break;
            default:
                ((IntBuffer) obj).put((IntBuffer) obj2);
                break;
        }
    }
}
