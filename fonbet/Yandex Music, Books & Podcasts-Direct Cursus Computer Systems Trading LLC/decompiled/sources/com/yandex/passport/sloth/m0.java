package com.yandex.passport.sloth;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 implements b1 {
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.sloth.data.j c;
    public final String d;

    public m0(com.yandex.passport.internal.l lVar, com.yandex.passport.common.core.f fVar, com.yandex.passport.sloth.data.j jVar, String str) {
        fVar.getClass();
        this.a = lVar;
        this.b = fVar;
        this.c = jVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a.equals(m0Var.a) && Intrinsics.d(this.b, m0Var.b) && this.c == m0Var.c && Intrinsics.d(this.d, m0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothLoginResult(account=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        return dfi.i(sb, this.d, ')');
    }
}
