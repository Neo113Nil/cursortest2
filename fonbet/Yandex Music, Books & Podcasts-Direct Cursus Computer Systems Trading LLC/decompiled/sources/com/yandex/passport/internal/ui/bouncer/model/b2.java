package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 implements g2 {
    public final com.yandex.passport.common.core.f a;
    public final boolean b;
    public final com.yandex.passport.api.y1 c;

    public b2(com.yandex.passport.common.core.f fVar, boolean z, com.yandex.passport.api.y1 y1Var) {
        fVar.getClass();
        y1Var.getClass();
        this.a = fVar;
        this.b = z;
        this.c = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.a, b2Var.a) && this.b == b2Var.b && this.c == b2Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "OnChallengeResult(uid=" + this.a + ", result=" + this.b + ", theme=" + this.c + ')';
    }
}
