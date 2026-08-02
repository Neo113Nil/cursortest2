package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements v {
    public final y0 a;

    public t(y0 y0Var) {
        y0Var.getClass();
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountPhoneNumber(masterAccount=" + this.a + ')';
    }
}
