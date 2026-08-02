package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes4.dex */
public final class p implements k0 {
    public final p1 a;

    public p(p1 p1Var) {
        this.a = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a.equals(((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fallback(fallback=" + this.a + ')';
    }
}
