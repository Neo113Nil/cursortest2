package com.yandex.passport.internal.ui.sloth.webcard;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements a0 {
    public final com.yandex.passport.internal.ui.d a;

    public y(com.yandex.passport.internal.ui.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangePassword(data=" + this.a + ')';
    }
}
