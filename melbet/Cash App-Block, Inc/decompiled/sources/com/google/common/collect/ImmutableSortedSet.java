package com.google.common.collect;

import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public abstract class ImmutableSortedSet extends ImmutableSet implements NavigableSet, Iterable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final transient Comparator comparator;
    public transient ImmutableSortedSet descendingSet;

    public ImmutableSortedSet(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.comparator;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.descendingSet;
        if (immutableSortedSet == null) {
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
            Comparator reverseOrder = Collections.reverseOrder(regularImmutableSortedSet.comparator);
            immutableSortedSet = regularImmutableSortedSet.isEmpty() ? NaturalOrdering.INSTANCE != reverseOrder ? new RegularImmutableSortedSet(RegularImmutableList.EMPTY, reverseOrder) : RegularImmutableSortedSet.NATURAL_EMPTY_SET : new RegularImmutableSortedSet(regularImmutableSortedSet.elements.reverse(), reverseOrder);
            this.descendingSet = immutableSortedSet;
            immutableSortedSet.descendingSet = this;
        }
        return immutableSortedSet;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.getSubSet(0, regularImmutableSortedSet.headIndex(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final RegularImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        Trace.checkArgument(this.comparator.compare(obj, obj2) <= 0);
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet subSet = regularImmutableSortedSet.getSubSet(regularImmutableSortedSet.tailIndex(obj, z), regularImmutableSortedSet.elements.size());
        return subSet.getSubSet(0, subSet.headIndex(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.getSubSet(regularImmutableSortedSet.tailIndex(obj, true), regularImmutableSortedSet.elements.size());
    }

    public final class Builder extends ImmutableSet.Builder {
        public final NaturalOrdering comparator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder() {
            super(4);
            NaturalOrdering naturalOrdering = NaturalOrdering.INSTANCE;
            this.comparator = naturalOrdering;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.ArrayBasedBuilder add(Object obj) {
            super.add(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final RegularImmutableSortedSet build() {
            RegularImmutableSortedSet regularImmutableSortedSet;
            Object[] objArr = this.contents;
            int i = this.size;
            NaturalOrdering naturalOrdering = this.comparator;
            if (i == 0) {
                regularImmutableSortedSet = NaturalOrdering.INSTANCE != naturalOrdering ? new RegularImmutableSortedSet(RegularImmutableList.EMPTY, naturalOrdering) : RegularImmutableSortedSet.NATURAL_EMPTY_SET;
            } else {
                PlatformKt.checkElementsNotNull(i, objArr);
                Arrays.sort(objArr, 0, i, naturalOrdering);
                int i2 = 1;
                for (int i3 = 1; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (naturalOrdering.compare(obj, objArr[i2 - 1]) != 0) {
                        objArr[i2] = obj;
                        i2++;
                    }
                }
                Arrays.fill(objArr, i2, i, (Object) null);
                if (i2 < objArr.length / 2) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.asImmutableList(i2, objArr), naturalOrdering);
            }
            this.size = regularImmutableSortedSet.elements.size();
            this.forceCopy = true;
            return regularImmutableSortedSet;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder combine(ImmutableSet.Builder builder) {
            super.combine(builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableSet.Builder add(Object obj) {
            super.add(obj);
            return this;
        }
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.getSubSet(0, regularImmutableSortedSet.headIndex(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.getSubSet(regularImmutableSortedSet.tailIndex(obj, z), regularImmutableSortedSet.elements.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }
}
