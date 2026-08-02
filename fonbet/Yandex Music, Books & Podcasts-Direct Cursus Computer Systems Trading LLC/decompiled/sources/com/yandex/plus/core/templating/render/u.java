package com.yandex.plus.core.templating.render;

/* loaded from: classes4.dex */
public final class u implements y {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.a == ((u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Long(value=" + this.a + ')';
    }
}
