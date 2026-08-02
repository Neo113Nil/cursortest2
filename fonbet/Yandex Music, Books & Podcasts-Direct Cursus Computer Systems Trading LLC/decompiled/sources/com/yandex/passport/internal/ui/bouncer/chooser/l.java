package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class l implements p {
    public final Throwable a;

    public l(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(value="), this.a, ')');
    }
}
