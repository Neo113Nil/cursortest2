package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 {
    public final int a;
    public final com.yandex.passport.common.core.f b;
    public final String c;

    public c2(int i, com.yandex.passport.common.core.f fVar, String str) {
        fVar.getClass();
        str.getClass();
        this.a = i;
        this.b = fVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.a == c2Var.a && Intrinsics.d(this.b, c2Var.b) && Intrinsics.d(this.c, c2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(selectedPicture=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", trackId=");
        return dfi.i(sb, this.c, ')');
    }
}
