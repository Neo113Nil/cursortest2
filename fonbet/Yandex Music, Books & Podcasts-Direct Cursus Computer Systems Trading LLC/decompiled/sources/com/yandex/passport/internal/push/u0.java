package com.yandex.passport.internal.push;

import android.content.Context;
import defpackage.etn;

/* loaded from: classes4.dex */
public final class u0 {
    public final Context a;
    public final com.yandex.passport.internal.properties.x b;
    public final com.yandex.passport.common.permission.b c;
    public final com.yandex.passport.internal.flags.i d;
    public final d1 e;

    public u0(Context context, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.common.permission.b bVar, com.yandex.passport.internal.flags.i iVar, d1 d1Var) {
        context.getClass();
        xVar.getClass();
        bVar.getClass();
        iVar.getClass();
        d1Var.getClass();
        this.a = context;
        this.b = xVar;
        this.c = bVar;
        this.d = iVar;
        this.e = d1Var;
    }

    public final a a() {
        a.a.getClass();
        com.yandex.passport.internal.flags.i iVar = this.d;
        iVar.getClass();
        com.yandex.passport.common.permission.b bVar = this.c;
        bVar.getClass();
        if (((Boolean) iVar.b(com.yandex.passport.internal.flags.o.s)).booleanValue()) {
            return a.c;
        }
        com.yandex.passport.common.permission.a[] aVarArr = com.yandex.passport.common.permission.a.a;
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.permission.b.b;
        Context context = bVar.a;
        aVar.getClass();
        return etn.z(context, "android.permission.WAKE_LOCK") == 0 ? a.b : a.c;
    }

    public final void b(com.yandex.passport.common.core.f fVar) {
        if (this.b.a()) {
            this.e.a(a(), new b1(this.a, fVar, 0));
        }
    }
}
