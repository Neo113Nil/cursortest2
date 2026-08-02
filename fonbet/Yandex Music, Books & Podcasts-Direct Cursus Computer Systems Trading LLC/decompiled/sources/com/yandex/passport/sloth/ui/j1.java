package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 implements n1 {
    public final String a;
    public final com.yandex.passport.sloth.p b;
    public final com.yandex.passport.common.core.f c;

    public j1(String str, com.yandex.passport.sloth.p pVar, com.yandex.passport.common.core.f fVar) {
        str.getClass();
        pVar.getClass();
        this.a = str;
        this.b = pVar;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.a, j1Var.a) && Intrinsics.d(this.b, j1Var.b) && Intrinsics.d(this.c, j1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        com.yandex.passport.common.core.f fVar = this.c;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalUrl(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", event=");
        sb.append(this.b);
        sb.append(", uid=");
        return com.appsflyer.internal.k.n(sb, this.c, ')');
    }
}
