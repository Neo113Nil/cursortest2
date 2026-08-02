package com.yandex.passport.internal.usecase.ui;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 {
    public final com.yandex.passport.internal.ui.domik.a0 a;
    public final String b;
    public final com.yandex.passport.data.network.l c;

    public j1(com.yandex.passport.internal.ui.domik.a0 a0Var, String str, com.yandex.passport.data.network.l lVar) {
        lVar.getClass();
        this.a = a0Var;
        this.b = str;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a.equals(j1Var.a) && this.b.equals(j1Var.b) && Intrinsics.d(this.c, j1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(regTrack=" + this.a + ", phone=" + this.b + ", callback=" + this.c + ')';
    }
}
