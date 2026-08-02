package com.yandex.passport.internal.usecase.vpn;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final String a;

    public f(String str) {
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
        return Intrinsics.d(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (com.yandex.passport.common.core.b.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(com.yandex.passport.common.core.b.c);
        sb.append(", placemark=");
        return dfi.i(sb, this.a, ')');
    }
}
