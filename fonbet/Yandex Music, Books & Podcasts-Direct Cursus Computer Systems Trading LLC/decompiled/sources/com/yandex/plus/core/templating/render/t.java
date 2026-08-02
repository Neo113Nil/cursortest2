package com.yandex.plus.core.templating.render;

import defpackage.hrg;

/* loaded from: classes4.dex */
public final class t implements y {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.a == ((t) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("Int(value=", this.a, ')');
    }
}
