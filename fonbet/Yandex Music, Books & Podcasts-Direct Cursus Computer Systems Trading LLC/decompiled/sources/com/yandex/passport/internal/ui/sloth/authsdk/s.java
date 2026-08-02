package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.sloth.b1;
import defpackage.b6e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends com.yandex.passport.common.mvi.h {
    public final o1 c;
    public final com.yandex.passport.common.core.f d;

    public s(o1 o1Var, com.yandex.passport.common.core.f fVar) {
        o1Var.getClass();
        fVar.getClass();
        this.c = o1Var;
        this.d = fVar;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        d0 d0Var = (d0) obj;
        boolean equals = d0Var.equals(z.a);
        b bVar = b.a;
        if (equals) {
            a(new u(bVar));
        } else {
            boolean z = d0Var instanceof a0;
            o1 o1Var = this.c;
            if (z) {
                com.yandex.passport.sloth.h0 h0Var = ((a0) d0Var).a;
                boolean d = Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a);
                com.yandex.passport.common.core.f fVar = this.d;
                if (d) {
                    a(new u(new a(fVar)));
                } else if (h0Var instanceof com.yandex.passport.sloth.c0) {
                    a(new u(new e(fVar)));
                } else if (h0Var instanceof com.yandex.passport.sloth.a0) {
                    Throwable th = ((com.yandex.passport.sloth.a0) h0Var).a;
                    if (!com.yandex.plus.core.locale.b.q(th)) {
                        a(new u(new d(th)));
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Internet connection is lost in Sloth.", 8);
                    }
                } else {
                    o1Var.u(h0Var.toString(), n1.AUTH_SDK);
                }
            } else if (d0Var instanceof b0) {
                int ordinal = ((b0) d0Var).a.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    a(new u(bVar));
                } else if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
            } else {
                if (!(d0Var instanceof c0)) {
                    b6e.s();
                    return null;
                }
                b1 b1Var = ((c0) d0Var).a;
                if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                    a(new u(bVar));
                } else if (b1Var instanceof com.yandex.passport.sloth.d) {
                    com.yandex.passport.sloth.d dVar = (com.yandex.passport.sloth.d) b1Var;
                    a(new u(new f(dVar.c, dVar.a, dVar.b)));
                } else if (b1Var instanceof com.yandex.passport.sloth.c) {
                    a(new t(new Exception("Failed to process current auth.")));
                } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                    com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                    List list = ((com.yandex.passport.sloth.m) b1Var).a;
                    nVar.getClass();
                    a(new u(new d(com.yandex.passport.api.exception.n.a(list))));
                } else {
                    o1Var.u(com.yandex.passport.sloth.g.a(b1Var), n1.AUTH_SDK);
                }
            }
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        a(new t(th));
        return Unit.a;
    }
}
