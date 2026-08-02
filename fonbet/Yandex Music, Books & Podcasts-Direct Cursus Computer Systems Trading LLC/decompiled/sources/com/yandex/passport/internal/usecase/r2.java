package com.yandex.passport.internal.usecase;

/* loaded from: classes4.dex */
public final class r2 {
    public final com.yandex.passport.common.core.f a;
    public final String b;

    public r2(com.yandex.passport.common.core.f fVar, String str) {
        this.a = fVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.a.equals(r2Var.a) && this.b.equals(r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(uid=" + this.a + ", url=" + ((Object) com.yandex.passport.common.url.b.m(this.b)) + ')';
    }
}
