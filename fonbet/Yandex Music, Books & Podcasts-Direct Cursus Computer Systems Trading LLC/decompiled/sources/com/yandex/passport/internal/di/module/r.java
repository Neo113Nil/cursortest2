package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.internal.push.u0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class r implements rzm {
    public final /* synthetic */ int a;
    public final p b;
    public final rzm c;
    public final rzm d;

    public /* synthetic */ r(p pVar, rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = pVar;
        this.c = rzmVar;
        this.d = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.core.accounts.p pVar = (com.yandex.passport.internal.core.accounts.p) this.c.get();
                com.yandex.passport.internal.helper.c cVar = (com.yandex.passport.internal.helper.c) this.d.get();
                this.b.getClass();
                pVar.getClass();
                cVar.getClass();
                return new com.yandex.passport.internal.core.accounts.e(pVar, cVar);
            default:
                u0 u0Var = (u0) this.c.get();
                Context context = (Context) this.d.get();
                this.b.getClass();
                u0Var.getClass();
                context.getClass();
                return new com.yandex.passport.internal.push.h(new androidx.core.app.u0(context));
        }
    }
}
