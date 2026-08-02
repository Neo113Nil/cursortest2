package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes4.dex */
public final class y implements k0 {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.internal.properties.l b;

    public y(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.properties.l lVar) {
        this.a = fVar;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && this.b.equals(yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectAccountByUid(uid=" + this.a + ", loginProperties=" + this.b + ')';
    }
}
