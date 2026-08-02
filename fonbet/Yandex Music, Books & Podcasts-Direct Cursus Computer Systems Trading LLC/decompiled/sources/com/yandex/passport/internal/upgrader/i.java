package com.yandex.passport.internal.upgrader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.passport.common.core.f a;
    public final o b;

    public i(com.yandex.passport.common.core.f fVar, o oVar) {
        fVar.getClass();
        oVar.getClass();
        this.a = fVar;
        this.b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(uid=" + this.a + ", source=" + this.b + ')';
    }
}
