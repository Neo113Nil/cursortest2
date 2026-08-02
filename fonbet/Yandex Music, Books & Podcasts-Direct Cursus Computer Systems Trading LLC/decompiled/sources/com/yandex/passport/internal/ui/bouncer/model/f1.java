package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class f1 implements k1 {
    public final Throwable a;

    public f1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.a.equals(((f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Exception(throwable="), this.a, ')');
    }
}
