package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* loaded from: classes4.dex */
public final class x implements z {
    public final h0 a;

    public x(h0 h0Var) {
        this.a = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a.equals(((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetBottomSheetParameters(value=" + this.a + ')';
    }
}
