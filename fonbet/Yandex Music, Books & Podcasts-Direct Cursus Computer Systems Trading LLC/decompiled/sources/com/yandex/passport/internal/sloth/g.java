package com.yandex.passport.internal.sloth;

import com.yandex.passport.sloth.l0;
import defpackage.cg6;
import defpackage.my1;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class g {
    public final com.yandex.passport.internal.usecase.ui.z a;

    public g(com.yandex.passport.internal.usecase.ui.z zVar) {
        zVar.getClass();
        this.a = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        f fVar2;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof f) {
            fVar2 = (f) cg6Var;
            int i2 = fVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar2.l = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar2.j;
                nm6 nm6Var = nm6.a;
                i = fVar2.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.usecase.ui.x xVar = new com.yandex.passport.internal.usecase.ui.x(fVar, str);
                    fVar2.l = 1;
                    obj2 = this.a.g(xVar, fVar2);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    obj = new com.yandex.passport.sloth.dependencies.a(((com.yandex.passport.internal.entities.c) obj).b);
                }
                a = z7o.a(obj);
                if (a != null) {
                    return obj;
                }
                try {
                    if (a instanceof com.yandex.passport.common.exception.a) {
                        throw new l0("Invalid token");
                    }
                    if (a instanceof com.yandex.passport.api.exception.c) {
                        throw new my1("Action is forbidden");
                    }
                    throw a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    return new t7o(th);
                }
            }
        }
        fVar2 = new f(this, cg6Var);
        Object obj22 = fVar2.j;
        nm6 nm6Var2 = nm6.a;
        i = fVar2.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
    }
}
