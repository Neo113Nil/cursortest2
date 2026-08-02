package com.yandex.passport.api;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class e2 implements h2 {
    public final Throwable a;

    public e2(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && this.a.equals(((e2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
