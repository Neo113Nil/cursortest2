package com.yandex.passport.internal.usecase.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 {
    public final String a;
    public final com.yandex.passport.common.core.f b;

    public x0(com.yandex.passport.common.core.f fVar, String str) {
        str.getClass();
        fVar.getClass();
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.a, x0Var.a) && Intrinsics.d(this.b, x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", uid=");
        return com.appsflyer.internal.k.n(sb, this.b, ')');
    }
}
