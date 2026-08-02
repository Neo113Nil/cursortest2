package com.yandex.passport.common.ui;

import defpackage.hrg;

/* loaded from: classes4.dex */
public final class b {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a == ((b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("Colour(value=", this.a, ')');
    }
}
