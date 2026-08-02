package com.yandex.plus.home.repository.api.model;

import defpackage.f1d;

/* loaded from: classes5.dex */
public final class b implements d {
    public final Throwable a;

    public b(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
