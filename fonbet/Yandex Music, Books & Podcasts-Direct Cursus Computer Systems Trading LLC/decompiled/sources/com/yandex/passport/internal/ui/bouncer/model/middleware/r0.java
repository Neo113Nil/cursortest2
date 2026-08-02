package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class r0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.bouncer.model.x0 a;
    public final com.yandex.passport.internal.report.reporters.m b;

    public r0(com.yandex.passport.internal.ui.bouncer.model.x0 x0Var, com.yandex.passport.internal.report.reporters.m mVar) {
        x0Var.getClass();
        mVar.getClass();
        this.a = x0Var;
        this.b = mVar;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 12), this, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.ui.bouncer.model.u uVar, cg6 cg6Var) {
        q0 q0Var;
        int i;
        Bundle extras;
        com.yandex.passport.internal.ui.domik.t tVar;
        if (cg6Var instanceof q0) {
            q0Var = (q0) cg6Var;
            int i2 = q0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = q0Var.k;
                nm6 nm6Var = nm6.a;
                i = q0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Intent intent = uVar.b;
                    if (intent == null || (extras = intent.getExtras()) == null) {
                        return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.e1("ProcessFallbackResultMiddleware", "No data in result"));
                    }
                    tVar = (com.yandex.passport.internal.ui.domik.t) extras.getParcelable("domik-result");
                    if (tVar == null) {
                        xq0.q("no domik-result in the bundle");
                        return null;
                    }
                    if (tVar instanceof com.yandex.passport.internal.ui.domik.x) {
                        com.yandex.passport.internal.ui.domik.x xVar = (com.yandex.passport.internal.ui.domik.x) tVar;
                        com.yandex.passport.internal.ui.bouncer.model.v0 v0Var = new com.yandex.passport.internal.ui.bouncer.model.v0(xVar.b);
                        q0Var.j = xVar;
                        q0Var.m = 1;
                        Object emit = this.a.c.emit(v0Var, q0Var);
                        if (emit != nm6Var) {
                            emit = Unit.a;
                        }
                        if (emit == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tVar = q0Var.j;
                    qgg.h0(obj);
                }
                return new com.yandex.passport.internal.ui.bouncer.model.i0(new com.yandex.passport.internal.ui.bouncer.model.j1(tVar.D(), tVar.Y(), tVar.w(), tVar.H(), null, tVar.E(), 16));
            }
        }
        q0Var = new q0(this, cg6Var);
        Object obj2 = q0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = q0Var.m;
        if (i != 0) {
        }
        return new com.yandex.passport.internal.ui.bouncer.model.i0(new com.yandex.passport.internal.ui.bouncer.model.j1(tVar.D(), tVar.Y(), tVar.w(), tVar.H(), null, tVar.E(), 16));
    }
}
