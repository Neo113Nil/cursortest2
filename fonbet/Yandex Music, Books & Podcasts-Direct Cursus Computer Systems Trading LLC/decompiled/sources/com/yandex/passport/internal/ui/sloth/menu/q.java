package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.h0;
import defpackage.nm6;
import defpackage.rjc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ q(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.sloth.performers.usermenu.g gVar = (com.yandex.passport.internal.sloth.performers.usermenu.g) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New user menu event: " + gVar, 8);
                }
                Object emit = this.b.m.emit(gVar, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            case 1:
                h0 h0Var = (h0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth commandRequest: " + h0Var, 8);
                }
                Object emit2 = this.b.k.emit(h0Var, continuation);
                if (emit2 != nm6.a) {
                    break;
                }
                break;
            default:
                b1 b1Var = (b1) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth result: " + b1Var, 8);
                }
                Object emit3 = this.b.l.emit(b1Var, continuation);
                if (emit3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
