package com.google.common.collect;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Predicate;
import com.google.common.collect.Cut;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Range implements Predicate, Serializable {
    public static final Range ALL = new Range(Cut.AboveAll.INSTANCE$1, Cut.AboveAll.INSTANCE);
    public final Cut lowerBound;
    public final Cut upperBound;

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.lowerBound = cut;
        cut2.getClass();
        this.upperBound = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.INSTANCE || cut2 == Cut.AboveAll.INSTANCE$1) {
            StringBuilder sb = new StringBuilder(16);
            cut.describeAsLowerBound(sb);
            sb.append("..");
            cut2.describeAsUpperBound(sb);
            a$$ExternalSyntheticBUOutline0.m$3("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public static Range closed(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        Cut.AboveAll aboveAll = new Cut.AboveAll(comparable, 2);
        comparable2.getClass();
        return new Range(aboveAll, new Cut.AboveValue(comparable2));
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return contains((Comparable) obj);
    }

    public final boolean contains(Comparable comparable) {
        comparable.getClass();
        return this.lowerBound.isLessThan(comparable) && !this.upperBound.isLessThan(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.upperBound.hashCode() + (this.lowerBound.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.lowerBound.describeAsLowerBound(sb);
        sb.append("..");
        this.upperBound.describeAsUpperBound(sb);
        return sb.toString();
    }
}
