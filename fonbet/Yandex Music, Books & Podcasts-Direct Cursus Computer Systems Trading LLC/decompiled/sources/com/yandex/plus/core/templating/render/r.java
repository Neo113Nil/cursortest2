package com.yandex.plus.core.templating.render;

/* loaded from: classes4.dex */
public final class r implements y {
    public final double a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Double.compare(this.a, ((r) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "Double(value=" + this.a + ')';
    }
}
