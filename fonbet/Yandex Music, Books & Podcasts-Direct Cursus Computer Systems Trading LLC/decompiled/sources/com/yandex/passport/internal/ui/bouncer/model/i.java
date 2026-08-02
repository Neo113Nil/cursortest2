package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements j {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.api.w0 c;

    public i(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, com.yandex.passport.api.w0 w0Var) {
        fVar2.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && Intrinsics.d(this.b, iVar.b) && this.c == iVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MemberAccount(accountUid=" + this.a + ", masterUid=" + this.b + ", loginAction=" + this.c + ')';
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final com.yandex.passport.api.w0 w() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final com.yandex.passport.common.core.f x() {
        return this.a;
    }
}
