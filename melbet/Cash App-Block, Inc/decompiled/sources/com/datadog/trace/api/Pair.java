package com.datadog.trace.api;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class Pair {
    public final Object left;
    public final Object right;

    public Pair(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            if (Objects.equals(this.left, pair.left) && Objects.equals(this.right, pair.right)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.left;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.right;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
