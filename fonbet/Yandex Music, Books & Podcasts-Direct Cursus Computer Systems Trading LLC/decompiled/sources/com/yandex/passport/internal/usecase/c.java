package com.yandex.passport.internal.usecase;

import defpackage.k5r;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final com.yandex.passport.common.core.f a;
    public final String b;
    public final String c;
    public final int d;

    public c(int i, com.yandex.passport.common.core.f fVar, String str, String str2) {
        fVar.getClass();
        str2.getClass();
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", flowId=");
        sb.append(this.b);
        sb.append(", biometricSessionId=");
        sb.append(this.c);
        sb.append(", attemptNumber=");
        return vz1.r(sb, this.d, ')');
    }
}
