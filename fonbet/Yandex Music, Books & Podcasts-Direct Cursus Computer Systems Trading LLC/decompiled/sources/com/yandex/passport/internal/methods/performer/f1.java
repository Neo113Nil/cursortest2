package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.d5;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class f1 implements z0 {
    public final com.yandex.passport.internal.provider.communication.q a;

    public f1(com.yandex.passport.internal.provider.communication.q qVar) {
        qVar.getClass();
        this.a = qVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        d5 d5Var = (d5) v5Var;
        try {
            r7o r7oVar = z7o.b;
            com.yandex.passport.internal.provider.communication.q qVar = this.a;
            List list = (List) d5Var.c.c;
            qVar.getClass();
            list.getClass();
            qVar.a = list;
            return Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
