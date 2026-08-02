package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class Ordering implements Comparator {

    final class IncomparableValueException extends ClassCastException {
    }

    public static Ordering from(Comparator comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public Ordering reverse() {
        return new ReverseOrdering(this);
    }
}
