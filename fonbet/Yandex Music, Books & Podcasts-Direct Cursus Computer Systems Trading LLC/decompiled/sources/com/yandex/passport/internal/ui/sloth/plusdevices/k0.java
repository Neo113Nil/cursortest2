package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.ui.e1;

/* loaded from: classes4.dex */
public final class k0 implements m0 {
    public final e1 a;

    public k0(e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a == ((k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
