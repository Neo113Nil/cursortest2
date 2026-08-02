package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ImmutableRangeSet extends AbstractRangeSet implements Serializable {
    public static final ImmutableRangeSet ALL;
    public static final ImmutableRangeSet EMPTY;
    public final transient ImmutableList ranges;

    public final class Builder {
        public final ArrayList ranges = new ArrayList();
    }

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        EMPTY = new ImmutableRangeSet(RegularImmutableList.EMPTY);
        ALL = new ImmutableRangeSet(ImmutableList.of((Object) Range.ALL));
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.ranges = immutableList;
    }

    @Override // com.google.common.collect.AbstractRangeSet
    public final ImmutableSet asRanges() {
        ImmutableList immutableList = this.ranges;
        if (immutableList.isEmpty()) {
            int i = ImmutableSet.$r8$clinit;
            return RegularImmutableSet.EMPTY;
        }
        Range range = Range.ALL;
        return new RegularImmutableSortedSet(immutableList, NaturalOrdering.INSTANCE$1);
    }
}
