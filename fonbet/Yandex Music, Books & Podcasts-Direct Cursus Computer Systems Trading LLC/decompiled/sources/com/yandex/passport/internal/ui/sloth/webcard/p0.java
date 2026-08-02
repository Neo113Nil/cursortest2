package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class p0 implements s0 {
    public final Throwable a;

    public p0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.a.equals(((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
