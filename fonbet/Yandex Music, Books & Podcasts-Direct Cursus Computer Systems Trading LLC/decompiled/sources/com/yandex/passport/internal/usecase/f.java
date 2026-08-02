package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final com.yandex.passport.common.core.f a;
    public final String b;
    public final String c;
    public final String d;

    public f(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && this.c.equals(fVar.c) && Intrinsics.d(this.d, fVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", biometricSessionId=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", flowId=");
        return dfi.i(sb, this.d, ')');
    }
}
