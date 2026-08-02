package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.y1;
import defpackage.b6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends b6 {
    public final com.yandex.passport.common.core.f d;
    public final y1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.yandex.passport.common.core.f fVar, y1 y1Var) {
        super(15, fVar, y1Var);
        y1Var.getClass();
        this.d = fVar;
        this.e = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.d, nVar.d) && this.e == nVar.e;
    }

    public final int hashCode() {
        com.yandex.passport.common.core.f fVar = this.d;
        return this.e.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    @Override // defpackage.b6
    public final String toString() {
        return "NullableChallengeUid(uid=" + this.d + ", theme=" + this.e + ')';
    }
}
