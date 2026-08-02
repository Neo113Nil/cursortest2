package com.google.common.collect;

import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public abstract class CollectCollectors {
    public static final Collector TO_IMMUTABLE_LIST;

    static {
        final int i = 1;
        TO_IMMUTABLE_LIST = Collector.of(new CollectCollectors$$ExternalSyntheticLambda0(), new CollectCollectors$$ExternalSyntheticLambda3(0), new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                        builder.getClass();
                        Iterator it = ((ImmutableRangeSet.Builder) obj2).ranges.iterator();
                        while (it.hasNext()) {
                            Range range = (Range) it.next();
                            Trace.checkArgument("range must not be empty, but was %s", range, !range.lowerBound.equals(range.upperBound));
                            builder.ranges.add(range);
                        }
                        return builder;
                    case 1:
                        ImmutableList.Builder builder2 = (ImmutableList.Builder) obj;
                        ImmutableList.Builder builder3 = (ImmutableList.Builder) obj2;
                        builder2.getClass();
                        builder2.addAll(builder3.size, builder3.contents);
                        return builder2;
                    default:
                        return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
                }
            }
        }, new d4$$ExternalSyntheticLambda0(4), new Collector.Characteristics[0]);
        final int i2 = 0;
        final int i3 = 2;
        Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i2) {
                    case 0:
                        int i4 = ImmutableSet.$r8$clinit;
                        return new ImmutableSet.Builder(4);
                    default:
                        ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.EMPTY;
                        return new ImmutableRangeSet.Builder();
                }
            }
        }, new CollectCollectors$$ExternalSyntheticLambda3(2), new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                        builder.getClass();
                        Iterator it = ((ImmutableRangeSet.Builder) obj2).ranges.iterator();
                        while (it.hasNext()) {
                            Range range = (Range) it.next();
                            Trace.checkArgument("range must not be empty, but was %s", range, !range.lowerBound.equals(range.upperBound));
                            builder.ranges.add(range);
                        }
                        return builder;
                    case 1:
                        ImmutableList.Builder builder2 = (ImmutableList.Builder) obj;
                        ImmutableList.Builder builder3 = (ImmutableList.Builder) obj2;
                        builder2.getClass();
                        builder2.addAll(builder3.size, builder3.contents);
                        return builder2;
                    default:
                        return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
                }
            }
        }, new d4$$ExternalSyntheticLambda0(5), new Collector.Characteristics[0]);
        final int i4 = 1;
        final int i5 = 0;
        Collector.of(new Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i4) {
                    case 0:
                        int i42 = ImmutableSet.$r8$clinit;
                        return new ImmutableSet.Builder(4);
                    default:
                        ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.EMPTY;
                        return new ImmutableRangeSet.Builder();
                }
            }
        }, new CollectCollectors$$ExternalSyntheticLambda3(1), new BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                        builder.getClass();
                        Iterator it = ((ImmutableRangeSet.Builder) obj2).ranges.iterator();
                        while (it.hasNext()) {
                            Range range = (Range) it.next();
                            Trace.checkArgument("range must not be empty, but was %s", range, !range.lowerBound.equals(range.upperBound));
                            builder.ranges.add(range);
                        }
                        return builder;
                    case 1:
                        ImmutableList.Builder builder2 = (ImmutableList.Builder) obj;
                        ImmutableList.Builder builder3 = (ImmutableList.Builder) obj2;
                        builder2.getClass();
                        builder2.addAll(builder3.size, builder3.contents);
                        return builder2;
                    default:
                        return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
                }
            }
        }, new d4$$ExternalSyntheticLambda0(3), new Collector.Characteristics[0]);
    }
}
