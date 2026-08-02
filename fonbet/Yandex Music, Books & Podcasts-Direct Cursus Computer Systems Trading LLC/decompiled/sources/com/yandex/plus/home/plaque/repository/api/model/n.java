package com.yandex.plus.home.plaque.repository.api.model;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class n implements r {
    public final boolean a;

    public n(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("Boolean(value="), this.a, ')');
    }
}
