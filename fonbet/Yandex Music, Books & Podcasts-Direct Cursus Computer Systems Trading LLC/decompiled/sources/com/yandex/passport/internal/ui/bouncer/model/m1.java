package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 implements v1 {
    public final com.yandex.passport.internal.ui.challenge.c0 a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.api.y1 c;

    public m1(com.yandex.passport.internal.ui.challenge.c0 c0Var, com.yandex.passport.common.core.f fVar, com.yandex.passport.api.y1 y1Var) {
        fVar.getClass();
        y1Var.getClass();
        this.a = c0Var;
        this.b = fVar;
        this.c = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.a.equals(m1Var.a) && Intrinsics.d(this.b, m1Var.b) && this.c == m1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Challenge(webCase=" + this.a + ", uid=" + this.b + ", theme=" + this.c + ')';
    }
}
