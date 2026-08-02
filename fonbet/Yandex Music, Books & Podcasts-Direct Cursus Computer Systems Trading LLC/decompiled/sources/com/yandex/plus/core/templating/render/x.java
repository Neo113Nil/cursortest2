package com.yandex.plus.core.templating.render;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class x implements y {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Template(template=" + this.a + ')';
    }
}
