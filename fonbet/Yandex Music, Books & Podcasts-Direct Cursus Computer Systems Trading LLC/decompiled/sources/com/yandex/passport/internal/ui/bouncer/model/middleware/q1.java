package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.report.gf;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.rjc;
import defpackage.x0q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ q1(t1 t1Var, int i) {
        this.a = i;
        this.b = t1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object emit;
        Object emit2;
        switch (this.a) {
            case 0:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth commandRequest: " + h0Var, 8);
                }
                com.yandex.passport.internal.ui.bouncer.model.x0 x0Var = this.b.b;
                x0q x0qVar = x0Var.c;
                if (h0Var instanceof com.yandex.passport.sloth.c0) {
                    emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.r0(((com.yandex.passport.sloth.c0) h0Var).a), continuation);
                    if (emit != nm6.a) {
                        emit = Unit.a;
                    }
                } else if (Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a)) {
                    emit = x0qVar.emit(com.yandex.passport.internal.ui.bouncer.model.l0.b, continuation);
                    if (emit != nm6.a) {
                        emit = Unit.a;
                    }
                } else if (h0Var instanceof com.yandex.passport.sloth.d0) {
                    emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.t0(((com.yandex.passport.sloth.d0) h0Var).a), continuation);
                    if (emit != nm6.a) {
                        emit = Unit.a;
                    }
                } else if (h0Var instanceof com.yandex.passport.sloth.f0) {
                    emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.u0(((com.yandex.passport.sloth.f0) h0Var).a), continuation);
                    if (emit != nm6.a) {
                        emit = Unit.a;
                    }
                } else {
                    if (h0Var instanceof com.yandex.passport.sloth.g0) {
                        x0Var.a.a = ((com.yandex.passport.sloth.g0) h0Var).a;
                    } else if (h0Var instanceof com.yandex.passport.sloth.z) {
                        emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.n0(((com.yandex.passport.sloth.z) h0Var).a), continuation);
                        if (emit != nm6.a) {
                            emit = Unit.a;
                        }
                    } else if (h0Var instanceof com.yandex.passport.sloth.a0) {
                        com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) h0Var;
                        emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.o0(a0Var.a, a0Var.b), continuation);
                        if (emit != nm6.a) {
                            emit = Unit.a;
                        }
                    } else if (h0Var instanceof com.yandex.passport.sloth.y) {
                        emit = x0qVar.emit(new com.yandex.passport.internal.ui.bouncer.model.m0(((com.yandex.passport.sloth.y) h0Var).a), continuation);
                        if (emit != nm6.a) {
                            emit = Unit.a;
                        }
                    } else if (!(h0Var instanceof com.yandex.passport.sloth.e0) && !(h0Var instanceof com.yandex.passport.sloth.b0)) {
                        b6e.s();
                        return null;
                    }
                    emit = Unit.a;
                }
                return emit == nm6.a ? emit : Unit.a;
            case 1:
                com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth result: " + b1Var, 8);
                }
                com.yandex.passport.internal.ui.bouncer.model.x0 x0Var2 = this.b.b;
                com.yandex.passport.internal.ui.bouncer.model.l0 l0Var = com.yandex.passport.internal.ui.bouncer.model.l0.c;
                com.yandex.passport.internal.ui.bouncer.model.l0 l0Var2 = com.yandex.passport.internal.ui.bouncer.model.l0.a;
                x0q x0qVar2 = x0Var2.c;
                if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                    emit2 = x0qVar2.emit(l0Var2, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.i0.a)) {
                    emit2 = x0qVar2.emit(l0Var2, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.i0.b)) {
                    emit2 = x0qVar2.emit(l0Var2, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (b1Var instanceof com.yandex.passport.sloth.m0) {
                    com.yandex.passport.sloth.m0 m0Var = (com.yandex.passport.sloth.m0) b1Var;
                    emit2 = x0qVar2.emit(new com.yandex.passport.internal.ui.bouncer.model.q0(m0Var.a, m0Var.b, com.yandex.plus.core.network.api.utils.a.Q(m0Var.c), m0Var.d, x0Var2.a.a), continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.c.a)) {
                    emit2 = x0qVar2.emit(l0Var, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                    emit2 = x0qVar2.emit(new com.yandex.passport.internal.ui.bouncer.model.s0(((com.yandex.passport.sloth.m) b1Var).a), continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (b1Var instanceof com.yandex.passport.sloth.y0) {
                    com.yandex.passport.sloth.y0 y0Var = (com.yandex.passport.sloth.y0) b1Var;
                    emit2 = x0qVar2.emit(new com.yandex.passport.internal.ui.bouncer.model.p0(y0Var.a, y0Var.b), continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (b1Var instanceof com.yandex.passport.sloth.d) {
                    emit2 = x0qVar2.emit(l0Var, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else if (b1Var instanceof com.yandex.passport.sloth.w) {
                    emit2 = x0qVar2.emit(l0Var, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                } else {
                    if (!(b1Var instanceof com.yandex.passport.sloth.b)) {
                        b6e.s();
                        return null;
                    }
                    emit2 = x0qVar2.emit(l0Var2, continuation);
                    if (emit2 != nm6.a) {
                        emit2 = Unit.a;
                    }
                }
                return emit2 == nm6.a ? emit2 : Unit.a;
            default:
                com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                gf gfVar = this.b.b.b;
                uVar.getClass();
                if (uVar instanceof com.yandex.passport.sloth.q) {
                    gfVar.e("native.show_webview");
                } else if (uVar instanceof com.yandex.passport.sloth.r) {
                    gfVar.e("webview.".concat(((com.yandex.passport.sloth.r) uVar).a));
                }
                return Unit.a;
        }
    }
}
