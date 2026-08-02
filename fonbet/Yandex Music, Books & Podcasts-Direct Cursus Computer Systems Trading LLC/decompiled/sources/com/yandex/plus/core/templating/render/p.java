package com.yandex.plus.core.templating.render;

/* loaded from: classes4.dex */
public final class p implements y {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.a == ((p) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Boolean(value=" + this.a + ')';
    }
}
