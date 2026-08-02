package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.report.gf;
import com.yandex.passport.sloth.b1;
import defpackage.nm6;
import defpackage.rjc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k0 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ k0(n0 n0Var, int i) {
        this.a = i;
        this.b = n0Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth commandRequest: " + h0Var, 8);
                }
                Object emit = this.b.m.emit(h0Var, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            case 1:
                b1 b1Var = (b1) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth result: " + b1Var, 8);
                }
                Object emit2 = this.b.n.emit(b1Var, continuation);
                if (emit2 != nm6.a) {
                    break;
                }
                break;
            default:
                gf gfVar = this.b.k;
                com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                if (uVar instanceof com.yandex.passport.sloth.q) {
                    gfVar.e("native.show_webview");
                } else if (uVar instanceof com.yandex.passport.sloth.r) {
                    gfVar.e("webview.".concat(((com.yandex.passport.sloth.r) uVar).a));
                }
                break;
        }
        return Unit.a;
    }
}
