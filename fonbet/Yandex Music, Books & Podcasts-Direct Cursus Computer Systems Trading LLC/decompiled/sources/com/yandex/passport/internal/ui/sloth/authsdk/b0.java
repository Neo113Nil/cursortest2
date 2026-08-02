package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.sloth.ui.e1;

/* loaded from: classes4.dex */
public final class b0 implements d0 {
    public final e1 a;

    public b0(e1 e1Var) {
        e1Var.getClass();
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a == ((b0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
