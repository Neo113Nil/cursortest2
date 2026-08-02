package com.yandex.plus.core.theme;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class a extends c {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Color(color="), this.a, ')');
    }
}
