package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.internal.methods.e5;
import com.yandex.passport.internal.methods.v5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class h1 implements z0 {
    public static final String[] e = {"ru.yandex.mail", "ru.yandex.disk", "yandex.auto"};
    public final Context a;
    public final com.yandex.passport.internal.analytics.o0 b;
    public final com.yandex.passport.internal.core.accounts.y c;
    public final com.yandex.passport.internal.core.accounts.p d;

    public h1(Context context, com.yandex.passport.internal.analytics.o0 o0Var, com.yandex.passport.internal.core.accounts.y yVar, com.yandex.passport.internal.core.accounts.p pVar) {
        context.getClass();
        o0Var.getClass();
        yVar.getClass();
        pVar.getClass();
        this.a = context;
        this.b = o0Var;
        this.c = yVar;
        this.d = pVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new b((e5) v5Var, this, null, 22));
        Throwable a = z7o.a(z);
        if (a != null && com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "removeAccountUseCase executing failed: " + a.getMessage(), 8);
        }
        return z;
    }
}
