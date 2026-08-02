package com.google.common.collect;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class CompoundOrdering extends Ordering implements Serializable {
    public final Comparator[] comparators;

    public CompoundOrdering(ByFunctionOrdering byFunctionOrdering, ByFunctionOrdering byFunctionOrdering2) {
        this.comparators = new Comparator[]{byFunctionOrdering, byFunctionOrdering2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), ")");
    }
}
