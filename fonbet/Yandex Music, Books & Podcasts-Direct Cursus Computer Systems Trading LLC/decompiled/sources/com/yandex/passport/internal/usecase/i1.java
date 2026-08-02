package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i1 extends androidx.core.app.n0 {
    public final com.yandex.passport.common.coroutine.a b;
    public final com.yandex.passport.common.a c;
    public final com.yandex.passport.internal.report.reporters.t0 d;
    public final SharedPreferences e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.report.reporters.t0 t0Var) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        t0Var.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = t0Var;
        this.e = context.getSharedPreferences("passport_init", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(7:24|25|(4:30|(1:32)|12|13)|33|(1:35)|36|(2:38|22))|18|(1:20)(1:23)))|43|6|7|(0)(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r0 != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Error PassportInitReport: " + r0, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:17:0x003e, B:18:0x0092, B:23:0x00ab, B:25:0x0045, B:30:0x0065, B:32:0x006d, B:33:0x0075, B:35:0x007d, B:36:0x0084), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.api.q1 q1Var, cg6 cg6Var) {
        h1 h1Var;
        Object obj;
        int i;
        Object V;
        if (cg6Var instanceof h1) {
            h1Var = (h1) cg6Var;
            int i2 = h1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = h1Var.j;
                obj = nm6.a;
                i = h1Var.l;
                Continuation continuation = null;
                com.yandex.passport.internal.report.reporters.t0 t0Var = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    long j = this.e.getLong("last_update", 0L);
                    this.c.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 86400000) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Last PassportInitReport was earlier than 1 day ago", 8);
                        }
                        return Unit.a;
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Starting PassportInitReport", 8);
                    }
                    t0Var.B(q1Var);
                    h1Var.l = 1;
                    if (t0Var.A(h1Var) == obj) {
                        return obj;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                t0Var.C();
                h1Var.l = 2;
                V = x97.V(((com.yandex.passport.common.coroutine.b) this.b).d, new pjt(this, continuation, 20), h1Var);
                if (V == obj) {
                    V = Unit.a;
                }
            }
        }
        h1Var = new h1(this, cg6Var);
        Object obj22 = h1Var.j;
        obj = nm6.a;
        i = h1Var.l;
        Continuation continuation2 = null;
        com.yandex.passport.internal.report.reporters.t0 t0Var2 = this.d;
        if (i != 0) {
        }
        t0Var2.C();
        h1Var.l = 2;
        V = x97.V(((com.yandex.passport.common.coroutine.b) this.b).d, new pjt(this, continuation2, 20), h1Var);
        if (V == obj) {
        }
    }
}
