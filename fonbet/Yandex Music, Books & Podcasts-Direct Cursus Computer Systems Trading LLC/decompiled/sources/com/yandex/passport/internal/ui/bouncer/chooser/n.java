package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.j2;

/* loaded from: classes4.dex */
public final class n implements p {
    public final j2 a;

    public n(j2 j2Var) {
        this.a = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a.equals(((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetCreateProfileData(value=" + this.a + ')';
    }
}
