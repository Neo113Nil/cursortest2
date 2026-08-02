package com.google.common.base;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class Predicates$AndPredicate implements Predicate, Serializable {
    public final List components;

    public Predicates$AndPredicate(List list) {
        this.components = list;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.components;
            if (i >= list.size()) {
                return true;
            }
            if (!((Predicate) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.components.equals(((Predicates$AndPredicate) obj).components);
        }
        return false;
    }

    public final int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.components) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
