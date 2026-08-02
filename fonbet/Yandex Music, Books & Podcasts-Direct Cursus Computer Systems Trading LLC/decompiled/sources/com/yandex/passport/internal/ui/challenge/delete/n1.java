package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.xq0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ n1(q1 q1Var, int i) {
        this.a = i;
        this.b = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        m1 m1Var;
        int i;
        switch (this.a) {
            case 0:
                if (continuation instanceof m1) {
                    m1Var = (m1) continuation;
                    int i2 = m1Var.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        m1Var.k = i2 - Integer.MIN_VALUE;
                        Object obj2 = m1Var.j;
                        nm6 nm6Var = nm6.a;
                        i = m1Var.k;
                        q1 q1Var = this.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth event: " + uVar, 8);
                            }
                            if (uVar instanceof com.yandex.passport.sloth.p) {
                                h1 h1Var = q1Var.l;
                                if (h1Var == null) {
                                    Intrinsics.j(CommonUrlParts.MODEL);
                                    throw null;
                                }
                                m1Var.k = 1;
                                Object emit = h1Var.j.emit(x0.a, m1Var);
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
                            qgg.h0(obj2);
                        }
                        ((com.yandex.passport.internal.ui.lang.a) q1Var.m.getUiLanguageProvider()).b();
                        return Unit.a;
                    }
                }
                m1Var = new m1(this, continuation);
                Object obj22 = m1Var.j;
                nm6 nm6Var2 = nm6.a;
                i = m1Var.k;
                q1 q1Var2 = this.b;
                if (i != 0) {
                }
                ((com.yandex.passport.internal.ui.lang.a) q1Var2.m.getUiLanguageProvider()).b();
                return Unit.a;
            case 1:
                com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth result: " + b1Var, 8);
                }
                boolean d = Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a);
                q1 q1Var3 = this.b;
                if (d) {
                    h1 h1Var2 = q1Var3.l;
                    if (h1Var2 == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    Object k0 = h1Var2.k0(v0.b, continuation);
                    if (k0 == nm6.a) {
                        return k0;
                    }
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.i0.a)) {
                    h1 h1Var3 = q1Var3.l;
                    if (h1Var3 == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    Object k02 = h1Var3.k0(v0.c, continuation);
                    if (k02 == nm6.a) {
                        return k02;
                    }
                } else {
                    q1Var3.n.u(com.yandex.passport.sloth.g.a(b1Var), com.yandex.passport.internal.report.reporters.n1.DELETE_FOREVER_ACCOUNT);
                }
                return Unit.a;
            default:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth external request: " + h0Var, 8);
                }
                boolean z = h0Var instanceof com.yandex.passport.sloth.c0;
                q1 q1Var4 = this.b;
                if (z) {
                    h1 h1Var4 = q1Var4.l;
                    if (h1Var4 == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    Object k03 = h1Var4.k0(v0.d, continuation);
                    if (k03 == nm6.a) {
                        return k03;
                    }
                } else {
                    q1Var4.n.u(h0Var.toString(), com.yandex.passport.internal.report.reporters.n1.DELETE_FOREVER_ACCOUNT);
                }
                return Unit.a;
        }
    }
}
