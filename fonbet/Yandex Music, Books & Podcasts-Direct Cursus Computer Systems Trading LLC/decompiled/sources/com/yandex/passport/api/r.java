package com.yandex.passport.api;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class r implements v {
    public final Throwable a;

    public r(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a.equals(((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
