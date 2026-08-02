package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements j {
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.api.w0 b;
    public final com.yandex.passport.common.core.f c;

    public h(com.yandex.passport.internal.l lVar, com.yandex.passport.api.w0 w0Var) {
        lVar.getClass();
        this.a = lVar;
        this.b = w0Var;
        this.c = lVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && this.b == hVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Account(modernAccount=" + this.a + ", loginAction=" + this.b + ')';
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final com.yandex.passport.api.w0 w() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final com.yandex.passport.common.core.f x() {
        return this.c;
    }
}
