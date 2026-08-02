package com.yandex.passport.internal.ui.sloth.webcard;

/* loaded from: classes4.dex */
public final class e0 implements g0 {
    public final com.yandex.passport.sloth.ui.e1 a;

    public e0(com.yandex.passport.sloth.ui.e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a == ((e0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
