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
public final class k1 extends androidx.core.app.n0 {
    public final com.yandex.passport.common.coroutine.a b;
    public final com.yandex.passport.common.a c;
    public final com.yandex.passport.internal.report.reporters.t0 d;
    public final SharedPreferences e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.report.reporters.t0 t0Var) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        t0Var.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = t0Var;
        this.e = context.getSharedPreferences("update_properties", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(8:16|17|(2:22|(1:24))|25|(1:27)|28|(1:30)(1:33)|(1:32))|11|12))|38|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Error ReportUpdatedProperties: " + r13, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.internal.properties.i0 i0Var, cg6 cg6Var) {
        j1 j1Var;
        int i;
        if (cg6Var instanceof j1) {
            j1Var = (j1) cg6Var;
            int i2 = j1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = j1Var.j;
                Object obj2 = nm6.a;
                i = j1Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    long j = this.e.getLong("last_update", 0L);
                    this.c.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 86400000) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Last ReportUpdatedProperties was earlier than 1 day ago", 8);
                        }
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Starting ReportUpdatedProperties", 8);
                    }
                    this.d.E(i0Var);
                    j1Var.l = 1;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) this.b).d, new pjt(this, continuation, 21), j1Var);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        j1Var = new j1(this, cg6Var);
        Object obj3 = j1Var.j;
        Object obj22 = nm6.a;
        i = j1Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
