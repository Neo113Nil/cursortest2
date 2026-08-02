package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class z implements c0 {
    public final Throwable a;

    public z(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a.equals(((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
