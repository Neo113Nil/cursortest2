package com.yandex.passport.internal.usecase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.internal.credentials.e c;

    public l0(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, com.yandex.passport.internal.credentials.e eVar) {
        eVar.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a.equals(l0Var.a) && this.b.equals(l0Var.b) && Intrinsics.d(this.c, l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Params(childUid=" + this.a + ", parentUid=" + this.b + ", credentialsProvider=" + this.c + ')';
    }
}
