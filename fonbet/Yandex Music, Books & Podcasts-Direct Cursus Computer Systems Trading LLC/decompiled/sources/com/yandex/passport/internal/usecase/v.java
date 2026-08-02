package com.yandex.passport.internal.usecase;

import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wis;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class v extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // androidx.core.app.n0
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(Object obj, rhw rhwVar) {
        t7o t7oVar;
        Object obj2;
        Throwable a;
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
        try {
            r7o r7oVar = z7o.b;
            obj2 = this.b.a().e(fVar);
        } catch (wis e) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e);
            obj2 = t7oVar;
            a = z7o.a(obj2);
            if (a != null) {
            }
            if (!(obj2 instanceof t7o)) {
            }
            return new z7o(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            a = z7o.a(obj2);
            if (a != null) {
            }
            if (!(obj2 instanceof t7o)) {
            }
            return new z7o(obj2);
        }
        a = z7o.a(obj2);
        if (a != null) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error searching master account for uid: " + fVar, a);
            }
        }
        if (!(obj2 instanceof t7o)) {
            try {
                obj2 = (com.yandex.passport.internal.l) obj2;
                if (obj2 == null) {
                    throw new com.yandex.passport.api.exception.b(fVar);
                }
            } catch (Throwable th2) {
                r7o r7oVar4 = z7o.b;
                obj2 = new t7o(th2);
            }
        }
        return new z7o(obj2);
    }
}
