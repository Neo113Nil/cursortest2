package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.network.BackendError;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class e2 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.helper.f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.helper.f fVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        fVar.getClass();
        this.b = fVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:30|31))(3:32|33|(1:35))|12|(3:18|19|(2:21|(2:23|24)(1:25))(1:26))|14|15|16))|46|6|7|8|(0)(0)|12|(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r9 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r9 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(c2 c2Var, cg6 cg6Var) {
        d2 d2Var;
        int i;
        Object b;
        Throwable a;
        if (cg6Var instanceof d2) {
            d2Var = (d2) cg6Var;
            int i2 = d2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d2Var.l = i2 - Integer.MIN_VALUE;
                d2 d2Var2 = d2Var;
                Object obj = d2Var2.j;
                nm6 nm6Var = nm6.a;
                i = d2Var2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.helper.f fVar = this.b;
                    com.yandex.passport.common.core.f fVar2 = c2Var.b;
                    String str = c2Var.c;
                    String valueOf = String.valueOf(c2Var.a);
                    d2Var2.l = 1;
                    b = fVar.b(fVar2, str, valueOf, "selected_2fa_picture", d2Var2);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = ((z7o) obj).a;
                }
                a = z7o.a(b);
                if (a != null) {
                    try {
                        if (!(a instanceof com.yandex.passport.data.exceptions.a)) {
                            throw a;
                        }
                        if (((com.yandex.passport.data.exceptions.a) a).a == BackendError.NUMBER_FOR_PICTURE_CHALLENGE_NEEDED) {
                            throw new com.yandex.passport.api.exception.f(com.yandex.passport.api.exception.g.b);
                        }
                        throw a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        b = new t7o(th);
                    }
                }
                qgg.h0(b);
                Object obj2 = Unit.a;
                return new z7o(obj2);
            }
        }
        d2Var = new d2(this, cg6Var);
        d2 d2Var22 = d2Var;
        Object obj3 = d2Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = d2Var22.l;
        if (i != 0) {
        }
        a = z7o.a(b);
        if (a != null) {
        }
        qgg.h0(b);
        Object obj22 = Unit.a;
        return new z7o(obj22);
    }
}
