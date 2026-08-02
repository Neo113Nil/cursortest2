package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.usecase.o2;
import com.yandex.passport.internal.usecase.x0;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class j extends bfu {
    public final PassportProcessGlobalComponent k;
    public final o2 l;
    public final x0 m;
    public final xdr n;

    public j() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.k = a;
        this.l = a.getTryAddPlusDeviceUseCase();
        this.m = a.getGetLocationIdUseCase();
        this.n = ydr.a(d.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        if (kotlin.Unit.a == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, com.yandex.passport.internal.properties.o oVar, cg6 cg6Var) {
        i iVar;
        int i;
        com.yandex.passport.internal.properties.o oVar2;
        Object obj;
        Object obj2;
        Throwable a;
        xdr xdrVar = jVar.n;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.n = i2 - Integer.MIN_VALUE;
                Object obj3 = iVar.l;
                nm6 nm6Var = nm6.a;
                i = iVar.n;
                if (i != 0) {
                    qgg.h0(obj3);
                    x0 x0Var = jVar.m;
                    com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(oVar.b);
                    iVar.j = oVar;
                    iVar.n = 1;
                    obj3 = x0Var.g(L, iVar);
                    if (obj3 != nm6Var) {
                        oVar2 = oVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj3);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = iVar.k;
                    qgg.h0(obj3);
                    obj = obj2;
                    a = z7o.a(obj);
                    if (a != null) {
                        c cVar = new c(a instanceof com.yandex.passport.data.exceptions.e ? 1111 : ((a instanceof com.yandex.passport.common.exception.a) || (a instanceof com.yandex.passport.api.exception.b)) ? NetworkRequestException.EXPIRED_SIGNATURE : 1112);
                        iVar.j = null;
                        iVar.k = obj;
                        iVar.n = 3;
                        xdrVar.getClass();
                        xdrVar.m(null, cVar);
                    }
                    return Unit.a;
                }
                oVar2 = iVar.j;
                qgg.h0(obj3);
                obj = ((z7o) obj3).a;
                if (!(obj instanceof t7o)) {
                    e eVar = new e(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.c0(com.yandex.plus.pay.ui.core.b.L(oVar2.b), ((Number) obj).longValue(), com.yandex.plus.core.network.api.utils.a.S(oVar2.a), oVar2.c, oVar2.d), com.yandex.plus.pay.ui.core.b.L(oVar2.b).a, new com.yandex.passport.common.properties.a(15, false, false), 4));
                    iVar.j = null;
                    iVar.k = obj;
                    iVar.n = 2;
                    xdrVar.getClass();
                    xdrVar.m(null, eVar);
                    if (Unit.a != nm6Var) {
                        obj2 = obj;
                        obj = obj2;
                    }
                    return nm6Var;
                }
                a = z7o.a(obj);
                if (a != null) {
                }
                return Unit.a;
            }
        }
        iVar = new i(jVar, cg6Var);
        Object obj32 = iVar.l;
        nm6 nm6Var2 = nm6.a;
        i = iVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj32).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    public final void G(com.yandex.plus.core.locale.b bVar) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.ui.sloth.q(bVar, this, (Continuation) null, 6), 3);
    }
}
