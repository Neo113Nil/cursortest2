package com.yandex.passport.api;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class a1 implements d1 {
    public final Throwable a;

    public a1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.a.equals(((a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
