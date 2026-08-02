package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class y implements z {
    public final Throwable a;

    public y(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a.equals(((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("SetError(value="), this.a, ')');
    }
}
