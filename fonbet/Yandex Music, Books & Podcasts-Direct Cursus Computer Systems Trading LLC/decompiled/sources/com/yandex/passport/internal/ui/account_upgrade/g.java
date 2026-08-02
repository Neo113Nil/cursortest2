package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class g implements i {
    public final Throwable a;

    public g(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Failed(throwable="), this.a, ')');
    }
}
