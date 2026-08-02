package com.yandex.passport.data.network.core;

import com.yandex.passport.common.network.j0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class o extends b {
    public final /* synthetic */ int f = 1;
    public final s g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.b bVar, com.yandex.passport.common.domain.a aVar2, e eVar, f fVar, s sVar, String str) {
        super(aVar, bVar, aVar2, eVar, fVar);
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        fVar.getClass();
        sVar.getClass();
        this.g = sVar;
        this.h = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable y(o oVar, u uVar, cg6 cg6Var) {
        r rVar;
        int i;
        Object obj;
        Object obj2;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = rVar.m;
                nm6 nm6Var = nm6.a;
                i = rVar.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    rVar.j = oVar;
                    rVar.k = uVar;
                    rVar.o = 1;
                    obj3 = b.w(oVar, uVar, rVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = rVar.l;
                        qgg.h0(obj3);
                        obj = obj2;
                        return new z7o(obj);
                    }
                    uVar = rVar.k;
                    oVar = rVar.j;
                    qgg.h0(obj3);
                }
                obj = ((z7o) obj3).a;
                if (!(obj instanceof t7o)) {
                    s sVar = oVar.g;
                    String a = uVar.a();
                    String str = oVar.h;
                    rVar.j = null;
                    rVar.k = null;
                    rVar.l = obj;
                    rVar.o = 2;
                    if (((com.yandex.passport.internal.network.l) sVar).b(a, str, rVar) != nm6Var) {
                        obj2 = obj;
                        obj = obj2;
                    }
                    return nm6Var;
                }
                return new z7o(obj);
            }
        }
        rVar = new r(oVar, cg6Var);
        Object obj32 = rVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rVar.o;
        if (i != 0) {
        }
        obj = ((z7o) obj32).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable z(o oVar, Object obj, cg6 cg6Var) {
        n nVar;
        int i;
        Object obj2;
        Object obj3;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.n = i2 - Integer.MIN_VALUE;
                Object obj4 = nVar.l;
                nm6 nm6Var = nm6.a;
                i = nVar.n;
                if (i != 0) {
                    qgg.h0(obj4);
                    nVar.j = oVar;
                    nVar.n = 1;
                    obj4 = b.w(oVar, obj, nVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = nVar.k;
                        qgg.h0(obj4);
                        obj2 = obj3;
                        return new z7o(obj2);
                    }
                    oVar = nVar.j;
                    qgg.h0(obj4);
                }
                obj2 = ((z7o) obj4).a;
                if (!(obj2 instanceof t7o)) {
                    s sVar = oVar.g;
                    String str = ((com.yandex.passport.common.account.a) obj2).a;
                    String str2 = oVar.h;
                    nVar.j = null;
                    nVar.k = obj2;
                    nVar.n = 2;
                    if (((com.yandex.passport.internal.network.l) sVar).b(str, str2, nVar) != nm6Var) {
                        obj3 = obj2;
                        obj2 = obj3;
                    }
                    return nm6Var;
                }
                return new z7o(obj2);
            }
        }
        nVar = new n(oVar, cg6Var);
        Object obj42 = nVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nVar.n;
        if (i != 0) {
        }
        obj2 = ((z7o) obj42).a;
        if (!(obj2 instanceof t7o)) {
        }
        return new z7o(obj2);
    }

    @Override // com.yandex.passport.data.network.core.b, androidx.core.app.n0
    public Object s(Object obj, rhw rhwVar) {
        switch (this.f) {
            case 0:
                return z(this, obj, rhwVar);
            default:
                return x((u) obj, rhwVar);
        }
    }

    @Override // com.yandex.passport.data.network.core.b
    /* renamed from: v */
    public Object s(Object obj, rhw rhwVar) {
        switch (this.f) {
            case 0:
                return z(this, obj, rhwVar);
            default:
                return x((u) obj, rhwVar);
        }
    }

    public Object x(u uVar, rhw rhwVar) {
        return y(this, uVar, rhwVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.b bVar, j0 j0Var, e eVar, f fVar, s sVar, String str) {
        super(aVar, bVar, j0Var, eVar, fVar);
        aVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        eVar.getClass();
        fVar.getClass();
        sVar.getClass();
        this.g = sVar;
        this.h = str;
    }
}
