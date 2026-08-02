package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.x1;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class j {
    public final com.yandex.passport.common.core.b a;
    public final String b;
    public final x1 c;

    public j(com.yandex.passport.common.core.b bVar, String str, x1 x1Var) {
        this.a = bVar;
        this.b = str;
        this.c = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b.equals(jVar.b) && this.c == jVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", socialTaskId=" + this.b + ", socialCode=" + this.c + ')';
    }
}
