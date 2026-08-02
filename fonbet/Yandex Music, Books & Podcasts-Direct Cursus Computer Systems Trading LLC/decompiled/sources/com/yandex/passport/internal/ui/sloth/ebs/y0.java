package com.yandex.passport.internal.ui.sloth.ebs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 implements e1 {
    public final com.yandex.passport.api.exception.j a;

    public y0(com.yandex.passport.api.exception.j jVar) {
        this.a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.a, ((y0) obj).a);
    }

    public final int hashCode() {
        com.yandex.passport.api.exception.j jVar = this.a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public final String toString() {
        return "EsiaBindFailed(exception=" + this.a + ')';
    }
}
