package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class t0 implements u0 {
    public final Throwable a;

    public t0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && this.a.equals(((t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("ReloginFailed(th="), this.a, ')');
    }
}
