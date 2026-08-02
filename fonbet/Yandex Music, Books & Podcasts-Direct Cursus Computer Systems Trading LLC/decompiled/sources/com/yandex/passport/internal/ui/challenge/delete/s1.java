package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class s1 implements v1 {
    public final Throwable a;

    public s1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
