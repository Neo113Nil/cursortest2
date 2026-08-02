package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.y1;
import defpackage.b6;

/* loaded from: classes4.dex */
public final class o extends b6 {
    public final com.yandex.passport.common.core.f d;
    public final y1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.core.f fVar, y1 y1Var) {
        super(15, fVar, y1Var);
        y1Var.getClass();
        this.d = fVar;
        this.e = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.d.equals(oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // defpackage.b6
    public final String toString() {
        return "RequiredChallengeUid(uid=" + this.d + ", theme=" + this.e + ')';
    }
}
