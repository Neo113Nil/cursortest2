package com.yandex.plus.home.plaque.repository.api.model;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class g implements s {
    public final boolean a;

    public g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("BooleanLiteral(value="), this.a, ')');
    }
}
