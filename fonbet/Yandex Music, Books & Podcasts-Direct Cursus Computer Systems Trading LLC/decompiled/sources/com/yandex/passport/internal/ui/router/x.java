package com.yandex.passport.internal.ui.router;

import android.content.Context;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.usecase.ui.e0;
import com.yandex.passport.internal.usecase.ui.h0;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.gld;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.ocu;
import defpackage.ot0;
import defpackage.ou7;
import defpackage.pm6;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class x extends bfu {
    public final PassportProcessGlobalComponent k;
    public final h0 l;
    public final x0q m;

    public x() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.k = a;
        this.l = a.getLoadAccountsUseCase();
        this.m = y0q.b(0, 0, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(x xVar, Context context, com.yandex.passport.internal.properties.l lVar, cg6 cg6Var) {
        u uVar;
        Object obj;
        int i;
        ou7 ou7Var;
        com.yandex.passport.internal.properties.l lVar2;
        if (cg6Var instanceof u) {
            uVar = (u) cg6Var;
            int i2 = uVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.o = i2 - Integer.MIN_VALUE;
                obj = uVar.m;
                Object obj2 = nm6.a;
                i = uVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 p = x97.p(gld.e(uVar.getContext()), null, pm6.b, new com.yandex.passport.internal.provider.communication.c(xVar, lVar, continuation, 29), 1);
                    if (lVar.h && context.getPackageManager().hasSystemFeature("android.software.leanback")) {
                        return new y(lVar);
                    }
                    uVar.j = lVar;
                    uVar.k = p;
                    uVar.o = 1;
                    Object H = xVar.H(lVar, p, uVar);
                    if (H != obj2) {
                        obj = H;
                        ou7Var = p;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar2 = uVar.l;
                    qgg.h0(obj);
                    return new a0(lVar2, (com.yandex.passport.internal.l) obj);
                }
                ou7Var = uVar.k;
                lVar = uVar.j;
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    return new z(lVar);
                }
                uVar.j = null;
                uVar.k = null;
                uVar.l = lVar;
                uVar.o = 2;
                obj = xVar.G(ou7Var, lVar, uVar);
                if (obj != obj2) {
                    lVar2 = lVar;
                    return new a0(lVar2, (com.yandex.passport.internal.l) obj);
                }
                return obj2;
            }
        }
        uVar = new u(xVar, cg6Var);
        obj = uVar.m;
        Object obj22 = nm6.a;
        i = uVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(mu7 mu7Var, com.yandex.passport.internal.properties.l lVar, cg6 cg6Var) {
        v vVar;
        int i;
        x xVar;
        z1 z1Var;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vVar.l;
                Object obj2 = nm6.a;
                i = vVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    vVar.j = lVar;
                    vVar.k = this;
                    vVar.n = 1;
                    obj = mu7Var.H(vVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    xVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = vVar.k;
                    lVar = vVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.internal.d dVar = ((e0) obj).a;
                xVar.getClass();
                z1Var = lVar.g;
                if (z1Var == null) {
                    return dVar.e(com.yandex.plus.pay.ui.core.b.L(z1Var));
                }
                String str = lVar.k;
                if (str != null) {
                    return dVar.f(str);
                }
                return null;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj3 = vVar.l;
        Object obj22 = nm6.a;
        i = vVar.n;
        if (i != 0) {
        }
        com.yandex.passport.internal.d dVar2 = ((e0) obj3).a;
        xVar.getClass();
        z1Var = lVar.g;
        if (z1Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(com.yandex.passport.internal.properties.l lVar, ou7 ou7Var, cg6 cg6Var) {
        w wVar;
        int i;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i2 = wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wVar.j;
                Object obj2 = nm6.a;
                i = wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (lVar.j == w1.n) {
                        return Boolean.TRUE;
                    }
                    wVar.l = 1;
                    obj = G(ou7Var, lVar, wVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj;
                return Boolean.valueOf(lVar2 == null ? "OTHER".equals(lVar2.k()) : false);
            }
        }
        wVar = new w(this, cg6Var);
        Object obj3 = wVar.j;
        Object obj22 = nm6.a;
        i = wVar.l;
        if (i != 0) {
        }
        com.yandex.passport.internal.l lVar22 = (com.yandex.passport.internal.l) obj3;
        return Boolean.valueOf(lVar22 == null ? "OTHER".equals(lVar22.k()) : false);
    }

    public final void J(Context context, com.yandex.passport.internal.properties.l lVar) {
        context.getClass();
        lVar.getClass();
        x97.y(ot0.F(this), null, null, new ocu(this, context, lVar, (Continuation) null, 23), 3);
    }
}
