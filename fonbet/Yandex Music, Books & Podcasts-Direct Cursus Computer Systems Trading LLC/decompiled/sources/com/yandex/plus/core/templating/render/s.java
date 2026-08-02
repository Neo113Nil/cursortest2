package com.yandex.plus.core.templating.render;

/* loaded from: classes4.dex */
public final class s implements y {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Float.compare(this.a, ((s) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Float(value=" + this.a + ')';
    }
}
