package com.yandex.passport.internal.ui.challenge.delete;

/* loaded from: classes4.dex */
public final class h0 implements i0 {
    public final com.yandex.passport.sloth.ui.e1 a;

    public h0(com.yandex.passport.sloth.ui.e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.a == ((h0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothUiWish(externalWish=" + this.a + ')';
    }
}
