package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class NaturalOrdering extends Ordering implements Serializable {
    public static final NaturalOrdering INSTANCE = new NaturalOrdering(0);
    public static final NaturalOrdering INSTANCE$1 = new NaturalOrdering(1);
    public static final NaturalOrdering INSTANCE$2 = new NaturalOrdering(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NaturalOrdering(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 1:
                Range range = (Range) obj;
                Range range2 = (Range) obj2;
                return ComparisonChain.ACTIVE.compare(range.lowerBound, range2.lowerBound).compare(range.upperBound, range2.upperBound).result();
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // com.google.common.collect.Ordering
    public Ordering reverse() {
        switch (this.$r8$classId) {
            case 0:
                return INSTANCE$2;
            case 1:
            default:
                return super.reverse();
            case 2:
                return INSTANCE;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Ordering.natural()";
            case 1:
            default:
                return super.toString();
            case 2:
                return "Ordering.natural().reverse()";
        }
    }
}
