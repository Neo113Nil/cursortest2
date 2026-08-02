package com.yandex.passport.data.network.core;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class x extends com.yandex.passport.common.domain.a {
    public final s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.yandex.passport.common.coroutine.a aVar, s sVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        sVar.getClass();
        this.b = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(v vVar, cg6 cg6Var) {
        w wVar;
        Object obj;
        int i;
        int i2;
        Object t7oVar;
        Object obj2;
        Object obj3;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i3 = wVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wVar.o = i3 - Integer.MIN_VALUE;
                obj = wVar.m;
                nm6 nm6Var = nm6.a;
                i = wVar.o;
                s sVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = vVar.a.a();
                    wVar.j = vVar;
                    i2 = 0;
                    wVar.l = 0;
                    wVar.o = 1;
                    obj = ((com.yandex.passport.internal.network.l) sVar).c(a, wVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = wVar.k;
                        qgg.h0(obj);
                        t7oVar = obj3;
                        return new z7o(t7oVar);
                    }
                    int i4 = wVar.l;
                    v vVar2 = wVar.j;
                    qgg.h0(obj);
                    i2 = i4;
                    vVar = vVar2;
                }
                if (((Boolean) obj).booleanValue()) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Blocked request with invalid master token", 8);
                    }
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(new com.yandex.passport.common.exception.a());
                } else {
                    Function1 function1 = vVar.c;
                    u uVar = vVar.a;
                    t7oVar = ((z7o) function1.invoke(uVar)).a;
                    Throwable a2 = z7o.a(t7oVar);
                    if (a2 != null) {
                        String a3 = uVar.a();
                        String str = vVar.b;
                        wVar.j = null;
                        wVar.k = t7oVar;
                        wVar.l = i2;
                        wVar.o = 2;
                        if (a2 instanceof com.yandex.passport.common.exception.a) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Found response with invalid token exception, blocking used masterToken from ".concat(str), 8);
                            }
                            obj2 = ((com.yandex.passport.internal.network.l) sVar).a(a3, str, wVar);
                            if (obj2 != nm6Var) {
                                obj2 = Unit.a;
                            }
                        } else {
                            obj2 = Unit.a;
                        }
                        if (obj2 != nm6Var) {
                            obj3 = t7oVar;
                            t7oVar = obj3;
                        }
                        return nm6Var;
                    }
                }
                return new z7o(t7oVar);
            }
        }
        wVar = new w(this, cg6Var);
        obj = wVar.m;
        nm6 nm6Var2 = nm6.a;
        i = wVar.o;
        s sVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return new z7o(t7oVar);
    }
}
