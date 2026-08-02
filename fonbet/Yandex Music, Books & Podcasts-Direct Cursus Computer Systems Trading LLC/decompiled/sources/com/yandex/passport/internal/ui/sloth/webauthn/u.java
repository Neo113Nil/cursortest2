package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.sloth.ui.e1;

/* loaded from: classes4.dex */
public final class u implements w {
    public final e1 a;

    public u(e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
