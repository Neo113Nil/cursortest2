package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class t implements v {
    public final Throwable a;

    public t(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a.equals(((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("SetError(error="), this.a, ')');
    }
}
