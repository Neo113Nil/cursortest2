package com.yandex.passport.internal.ui.sloth.ebs;

/* loaded from: classes4.dex */
public final class c1 implements e1 {
    public final com.yandex.passport.sloth.ui.e1 a;

    public c1(com.yandex.passport.sloth.ui.e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.a == ((c1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
