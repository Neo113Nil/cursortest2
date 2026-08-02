package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class ComparatorOrdering extends Ordering implements Serializable {
    public final Comparator comparator;

    public ComparatorOrdering(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
