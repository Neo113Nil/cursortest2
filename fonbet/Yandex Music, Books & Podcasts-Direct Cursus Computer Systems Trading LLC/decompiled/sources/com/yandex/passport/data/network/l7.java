package com.yandex.passport.data.network;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l7 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public l7(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return this.a.equals(l7Var.a) && Intrinsics.d(this.b, l7Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", qrPath=");
        return dfi.i(sb, this.b, ')');
    }
}
