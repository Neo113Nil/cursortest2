package com.yandex.passport.internal.usecase.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {
    public final String a;
    public final com.yandex.passport.common.core.f b;

    public x(com.yandex.passport.common.core.f fVar, String str) {
        str.getClass();
        fVar.getClass();
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && Intrinsics.d(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(host=");
        sb.append(this.a);
        sb.append(", uid=");
        return com.appsflyer.internal.k.n(sb, this.b, ')');
    }
}
