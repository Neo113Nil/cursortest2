package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.sloth.b1;
import defpackage.nm6;
import defpackage.rjc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassportProcessGlobalComponent b;
    public final /* synthetic */ com.yandex.passport.sloth.data.c0 c;
    public final /* synthetic */ t d;

    public /* synthetic */ q(PassportProcessGlobalComponent passportProcessGlobalComponent, com.yandex.passport.sloth.data.c0 c0Var, t tVar, int i) {
        this.a = i;
        this.b = passportProcessGlobalComponent;
        this.c = c0Var;
        this.d = tVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New event: " + b1Var, 8);
                }
                if (b1Var instanceof com.yandex.passport.sloth.b) {
                    com.yandex.passport.internal.report.reporters.j0 managingPlusDevicesReporter = this.b.getManagingPlusDevicesReporter();
                    com.yandex.passport.sloth.data.c0 c0Var = this.c;
                    managingPlusDevicesReporter.x(c0Var != null ? c0Var.b : null, c0Var != null ? c0Var.e : null, c0Var != null ? c0Var.f : null, ((com.yandex.passport.sloth.b) b1Var).a);
                    Object emit = this.d.k.emit(new Integer(-1), continuation);
                    if (emit == nm6.a) {
                    }
                }
                break;
            default:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New request: " + h0Var, 8);
                }
                if (h0Var instanceof com.yandex.passport.sloth.a0) {
                    com.yandex.passport.internal.report.reporters.j0 managingPlusDevicesReporter2 = this.b.getManagingPlusDevicesReporter();
                    com.yandex.passport.sloth.data.c0 c0Var2 = this.c;
                    com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) h0Var;
                    managingPlusDevicesReporter2.u(c0Var2 != null ? c0Var2.b : null, c0Var2 != null ? c0Var2.e : null, c0Var2 != null ? c0Var2.f : null, a0Var.b);
                    Object emit2 = this.d.k.emit(new Integer(a0Var.a instanceof com.yandex.passport.common.exception.a ? NetworkRequestException.EXPIRED_SIGNATURE : 1112), continuation);
                    if (emit2 == nm6.a) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
