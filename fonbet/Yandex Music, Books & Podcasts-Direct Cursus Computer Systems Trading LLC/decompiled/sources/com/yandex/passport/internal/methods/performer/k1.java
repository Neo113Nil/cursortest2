package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.usecase.f2;
import defpackage.cg6;
import defpackage.ern;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class k1 implements z0 {
    public final com.yandex.passport.internal.usecase.k0 a;
    public final com.yandex.passport.internal.account.a b;
    public final f2 c;

    public k1(com.yandex.passport.internal.usecase.k0 k0Var, com.yandex.passport.internal.account.a aVar, f2 f2Var) {
        k0Var.getClass();
        aVar.getClass();
        f2Var.getClass();
        this.a = k0Var;
        this.b = aVar;
        this.c = f2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:9)(2:47|48))(3:49|(1:51)(1:60)|(2:58|59)(2:55|(1:57)))|10|11|(2:28|(4:30|(1:32)(1:38)|33|(1:35)(2:36|37))(2:39|(2:41|42)(2:43|44)))(1:13)|14|(3:16|17|(2:19|20)(2:22|23))(1:27)))|61|6|(0)(0)|10|11|(0)(0)|14|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r7 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[Catch: all -> 0x00b9, TryCatch #1 {all -> 0x00b9, blocks: (B:11:0x0054, B:28:0x005b, B:30:0x005f, B:33:0x006d, B:36:0x0073, B:37:0x009a, B:39:0x009b, B:41:0x009f, B:42:0x00a1, B:43:0x00a2, B:44:0x00b8), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k1 k1Var, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        j1 j1Var;
        Object obj;
        int i;
        if (cg6Var instanceof j1) {
            j1Var = (j1) cg6Var;
            int i2 = j1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j1Var.l = i2 - Integer.MIN_VALUE;
                obj = j1Var.j;
                nm6 nm6Var = nm6.a;
                i = j1Var.l;
                Object obj2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.l a = k1Var.b.a();
                    com.yandex.passport.common.core.f fVar2 = a != null ? a.b : null;
                    if (fVar2 == null || fVar2.equals(fVar)) {
                        r7o r7oVar = z7o.b;
                        return Unit.a;
                    }
                    com.yandex.passport.internal.usecase.k0 k0Var = k1Var.a;
                    j1Var.l = 1;
                    obj = k0Var.g(fVar2, j1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (!(obj instanceof com.yandex.passport.internal.usecase.i0)) {
                    if (!(obj instanceof z7o)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                        declaredField.setAccessible(true);
                        Object obj3 = declaredField.get(obj);
                        obj3.getClass();
                        throw ((Throwable) obj3);
                    }
                    Object obj4 = ((z7o) obj).a;
                    qgg.h0(obj4);
                    if (obj4 instanceof com.yandex.passport.internal.usecase.i0) {
                        obj2 = obj4;
                    }
                    com.yandex.passport.internal.usecase.i0 i0Var = (com.yandex.passport.internal.usecase.i0) obj2;
                    if (i0Var == null) {
                        throw new ClassCastException("Can't cast " + ((Object) z7o.b(((z7o) obj).a)) + " to " + ern.a(com.yandex.passport.internal.usecase.i0.class));
                    }
                    obj = i0Var;
                }
                if (!(obj instanceof t7o)) {
                    return obj;
                }
                try {
                    if (((com.yandex.passport.internal.usecase.i0) obj) instanceof com.yandex.passport.internal.usecase.h0) {
                        return Unit.a;
                    }
                    throw new com.yandex.passport.api.exception.f();
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    return new t7o(th);
                }
            }
        }
        j1Var = new j1(k1Var, cg6Var);
        obj = j1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = j1Var.l;
        Object obj22 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (!(obj instanceof com.yandex.passport.internal.usecase.i0)) {
        }
        if (!(obj instanceof t7o)) {
        }
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new wzv((k5) v5Var, this, null, 25));
    }
}
