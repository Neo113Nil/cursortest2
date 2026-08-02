package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.e3;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.gb;
import com.yandex.passport.internal.report.ve;
import defpackage.r7o;
import defpackage.z7o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements z0 {
    public final com.yandex.passport.internal.push.i0 a;
    public final com.yandex.passport.internal.push.l0 b;
    public final com.yandex.passport.internal.report.reporters.z0 c;

    public m(com.yandex.passport.internal.push.i0 i0Var, com.yandex.passport.internal.push.l0 l0Var, com.yandex.passport.internal.report.reporters.z0 z0Var) {
        i0Var.getClass();
        l0Var.getClass();
        z0Var.getClass();
        this.a = i0Var;
        this.b = l0Var;
        this.c = z0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        boolean z;
        com.yandex.passport.internal.methods.b bVar = ((e3) v5Var).c;
        com.yandex.passport.internal.push.l0 l0Var = this.b;
        l0Var.getClass();
        Bundle a = l0Var.a();
        if (a == null || !Intrinsics.d(this.a.a(a).g, (String) bVar.c)) {
            z = false;
        } else {
            l0Var.b().clear();
            z = true;
        }
        if (z) {
            String str = (String) bVar.c;
            com.yandex.passport.internal.report.reporters.z0 z0Var = this.c;
            z0Var.getClass();
            z0Var.n(gb.d, new ve(str, 11));
        }
        r7o r7oVar = z7o.b;
        return Boolean.valueOf(z);
    }
}
