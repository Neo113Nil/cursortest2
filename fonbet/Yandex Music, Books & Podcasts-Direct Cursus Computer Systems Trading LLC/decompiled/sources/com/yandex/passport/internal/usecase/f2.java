package com.yandex.passport.internal.usecase;

import defpackage.jp0;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.wis;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class f2 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.account.b c;
    public final com.yandex.passport.internal.analytics.o0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.analytics.o0 o0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        bVar.getClass();
        o0Var.getClass();
        this.b = eVar;
        this.c = bVar;
        this.d = o0Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        t7o t7oVar;
        Object obj2;
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
        try {
            r7o r7oVar = z7o.b;
            com.yandex.passport.internal.analytics.o0 o0Var = this.d;
            com.yandex.passport.internal.account.b bVar = this.c;
            if (fVar != null) {
                com.yandex.passport.internal.l e = this.b.a().e(fVar);
                if (e == null) {
                    throw new com.yandex.passport.api.exception.b(fVar);
                }
                bVar.b(fVar);
                o0Var.e(e);
            } else {
                com.yandex.passport.internal.storage.m mVar = bVar.a;
                jp0 jp0Var = mVar.c;
                s9f[] s9fVarArr = com.yandex.passport.internal.storage.m.m;
                jp0Var.setValue(mVar, s9fVarArr[1], null);
                mVar.d.setValue(mVar, s9fVarArr[2], null);
                bVar.b.a(Unit.a);
                o0Var.d();
            }
            obj2 = Unit.a;
        } catch (wis e2) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e2);
            obj2 = t7oVar;
            return new z7o(obj2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            return new z7o(obj2);
        }
        return new z7o(obj2);
    }
}
