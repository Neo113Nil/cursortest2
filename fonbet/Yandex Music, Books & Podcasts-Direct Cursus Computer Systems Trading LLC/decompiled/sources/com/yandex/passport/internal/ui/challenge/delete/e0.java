package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class e0 implements i0 {
    public final Throwable a;

    public e0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("ReloginFailed(th="), this.a, ')');
    }
}
