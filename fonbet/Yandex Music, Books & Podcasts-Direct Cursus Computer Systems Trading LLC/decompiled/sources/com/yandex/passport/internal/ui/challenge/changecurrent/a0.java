package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class a0 implements e0 {
    public final Throwable a;

    public a0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a.equals(((a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
