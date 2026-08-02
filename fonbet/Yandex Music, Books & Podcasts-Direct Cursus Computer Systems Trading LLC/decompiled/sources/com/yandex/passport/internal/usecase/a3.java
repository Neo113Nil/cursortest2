package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class a3 extends com.yandex.passport.common.domain.a {
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(kotlinx.coroutines.a aVar) {
        super(aVar);
        aVar.getClass();
        this.b = y0q.b(0, 0, null, 7);
        this.c = ydr.a(Boolean.FALSE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(5:21|22|(1:24)|15|16))(1:27))(3:31|(1:33)|35)|28|(5:30|22|(0)|15|16)|26))|38|6|7|(0)(0)|28|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r2.g(r10, r3) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r1 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #0 {all -> 0x00de, blocks: (B:12:0x0030, B:13:0x00d5, B:24:0x00ab), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable v(a3 a3Var, com.yandex.passport.internal.usecase.authorize.s sVar, cg6 cg6Var) {
        com.yandex.passport.internal.usecase.authorize.t tVar;
        nm6 nm6Var;
        int i;
        Object t7oVar;
        int i2;
        com.yandex.passport.internal.usecase.authorize.s sVar2;
        Object u;
        a3 a3Var2;
        int i3;
        com.yandex.passport.internal.usecase.authorize.s sVar3;
        a3 a3Var3 = a3Var;
        com.yandex.passport.internal.usecase.authorize.s sVar4 = sVar;
        if (cg6Var instanceof com.yandex.passport.internal.usecase.authorize.t) {
            tVar = (com.yandex.passport.internal.usecase.authorize.t) cg6Var;
            int i4 = tVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.p = i4 - Integer.MIN_VALUE;
                Object obj = tVar.n;
                nm6Var = nm6.a;
                i = tVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = 0;
                    if (sVar4.c() != 0) {
                        k kVar = (k) a3Var3.b;
                        i iVar = new i(sVar4.a(), sVar4.c());
                        tVar.j = a3Var3;
                        tVar.k = sVar4;
                        tVar.l = sVar4;
                        tVar.m = 0;
                        tVar.p = 1;
                    }
                    sVar2 = sVar4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            Object obj2 = ((z7o) obj).a;
                            qgg.h0(obj2);
                            t7oVar = obj2;
                            return new z7o(t7oVar);
                        }
                        i3 = tVar.m;
                        sVar3 = tVar.l;
                        a3Var2 = tVar.j;
                        qgg.h0(obj);
                        t7oVar = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        if (!(t7oVar instanceof t7o)) {
                            com.yandex.passport.common.account.a aVar = (com.yandex.passport.common.account.a) t7oVar;
                            r rVar = (r) a3Var2.c;
                            s sVar5 = new s(sVar3.a(), sVar3.c(), aVar, null, sVar3.b());
                            tVar.j = null;
                            tVar.k = null;
                            tVar.l = null;
                            tVar.m = i3;
                            tVar.p = 3;
                            obj = rVar.g(sVar5, tVar);
                        }
                        return new z7o(t7oVar);
                    }
                    int i5 = tVar.m;
                    com.yandex.passport.internal.usecase.authorize.s sVar6 = tVar.l;
                    com.yandex.passport.internal.usecase.authorize.s sVar7 = tVar.k;
                    a3 a3Var4 = tVar.j;
                    qgg.h0(obj);
                    sVar2 = sVar6;
                    sVar4 = sVar7;
                    i2 = i5;
                    a3Var3 = a3Var4;
                }
                tVar.j = a3Var3;
                tVar.k = null;
                tVar.l = sVar2;
                tVar.m = i2;
                tVar.p = 2;
                u = a3Var3.u(sVar4, tVar);
                if (u != nm6Var) {
                    int i6 = i2;
                    a3Var2 = a3Var3;
                    i3 = i6;
                    com.yandex.passport.internal.usecase.authorize.s sVar8 = sVar2;
                    t7oVar = u;
                    sVar3 = sVar8;
                    r7o r7oVar2 = z7o.b;
                    if (!(t7oVar instanceof t7o)) {
                    }
                    return new z7o(t7oVar);
                }
                return nm6Var;
            }
        }
        tVar = new com.yandex.passport.internal.usecase.authorize.t(a3Var3, cg6Var);
        Object obj3 = tVar.n;
        nm6Var = nm6.a;
        i = tVar.p;
        if (i != 0) {
        }
        tVar.j = a3Var3;
        tVar.k = null;
        tVar.l = sVar2;
        tVar.m = i2;
        tVar.p = 2;
        u = a3Var3.u(sVar4, tVar);
        if (u != nm6Var) {
        }
        return nm6Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public Object x(Object obj, rhw rhwVar) {
        return v(this, (com.yandex.passport.internal.usecase.authorize.s) obj, rhwVar);
    }

    public abstract Object u(com.yandex.passport.internal.usecase.authorize.s sVar, com.yandex.passport.internal.usecase.authorize.t tVar);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.yandex.passport.common.coroutine.a aVar, k kVar, r rVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        this.b = kVar;
        this.c = rVar;
    }
}
