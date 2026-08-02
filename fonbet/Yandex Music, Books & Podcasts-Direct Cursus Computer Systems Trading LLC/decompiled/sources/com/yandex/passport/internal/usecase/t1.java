package com.yandex.passport.internal.usecase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.response.c b;
    public final com.yandex.passport.internal.analytics.a c;

    public t1(com.yandex.passport.common.core.b bVar, com.yandex.passport.internal.network.response.c cVar, com.yandex.passport.internal.analytics.a aVar) {
        aVar.getClass();
        this.a = bVar;
        this.b = cVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a == t1Var.a && this.b.equals(t1Var.b) && Intrinsics.d(this.c, t1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", result=" + this.b + ", overriddenAccountName=null, analyticsFromValue=" + this.c + ')';
    }
}
