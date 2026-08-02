package com.yandex.passport.api;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class i0 implements j0 {
    public final Throwable a;

    public i0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.a.equals(((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
