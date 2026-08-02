package com.yandex.passport.internal.push;

import android.content.Context;
import defpackage.b6e;
import defpackage.cmd;
import defpackage.x97;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d1 {
    public final Context a;
    public final com.yandex.passport.common.coroutine.e b;
    public final com.yandex.passport.common.coroutine.a c;
    public final z d;

    public d1(Context context, com.yandex.passport.common.coroutine.e eVar, com.yandex.passport.common.coroutine.a aVar, z zVar) {
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        zVar.getClass();
        this.a = context;
        this.b = eVar;
        this.c = aVar;
        this.d = zVar;
    }

    public final void a(a aVar, m0 m0Var) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            androidx.core.app.y0.a(this.a, PassportPushRegistrationService.class, 542961, m0Var.a());
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            this.b.getClass();
            x97.y(cmd.a, ((com.yandex.passport.common.coroutine.b) this.c).d, null, new com.yandex.passport.internal.provider.communication.c(this, m0Var, (Continuation) null, 3), 2);
        }
    }
}
