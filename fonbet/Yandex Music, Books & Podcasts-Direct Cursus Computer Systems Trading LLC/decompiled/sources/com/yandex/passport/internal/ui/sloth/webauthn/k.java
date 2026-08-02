package com.yandex.passport.internal.ui.sloth.webauthn;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.report.ke;
import com.yandex.passport.internal.report.le;
import com.yandex.passport.internal.report.me;
import com.yandex.passport.internal.report.ne;
import com.yandex.passport.internal.report.reporters.p1;
import com.yandex.passport.sloth.a0;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.c0;
import com.yandex.passport.sloth.h0;
import com.yandex.passport.sloth.i0;
import defpackage.b6e;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class k extends com.yandex.passport.common.mvi.h {
    public final f c;
    public final com.yandex.passport.internal.core.accounts.e d;
    public final p1 e;

    public k(f fVar, com.yandex.passport.internal.core.accounts.e eVar, p1 p1Var) {
        fVar.getClass();
        eVar.getClass();
        p1Var.getClass();
        this.c = fVar;
        this.d = eVar;
        this.e = p1Var;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        com.yandex.passport.common.core.f fVar = this.c.a;
        p1 p1Var = this.e;
        p1Var.getClass();
        fVar.getClass();
        p1Var.n(me.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)));
        Object k = k(gVar);
        return k == nm6.a ? k : Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        Unit unit;
        w wVar = (w) obj;
        if (wVar instanceof t) {
            h0 h0Var = ((t) wVar).a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "New slothExternalRequest " + h0Var, 8);
            }
            if (h0Var instanceof a0) {
                unit = f(((a0) h0Var).a);
                if (unit != nm6.a) {
                    unit = Unit.a;
                }
            } else {
                if (h0Var instanceof c0) {
                    j(NetworkRequestException.EXPIRED_SIGNATURE, "invalid_token", null);
                }
                unit = Unit.a;
            }
            return unit == nm6.a ? unit : Unit.a;
        }
        boolean z = wVar instanceof u;
        f fVar = this.c;
        p1 p1Var = this.e;
        if (z) {
            int ordinal = ((u) wVar).a.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                com.yandex.passport.common.core.f fVar2 = fVar.a;
                p1Var.getClass();
                fVar2.getClass();
                p1Var.n(ke.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)));
                g(q.a);
            } else if (ordinal != 2) {
                b6e.s();
                return null;
            }
        } else {
            if (!(wVar instanceof v)) {
                b6e.s();
                return null;
            }
            b1 b1Var = ((v) wVar).a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New slothResult: " + b1Var, 8);
            }
            if (Intrinsics.d(b1Var, i0.b)) {
                com.yandex.passport.common.core.f fVar3 = fVar.a;
                p1Var.getClass();
                fVar3.getClass();
                p1Var.n(ne.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)));
                a(new l(-1, null));
            } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                Set set = com.yandex.passport.sloth.k.b;
                List list = ((com.yandex.passport.sloth.m) b1Var).a;
                list.getClass();
                String X = CollectionsKt.X(list, StringUtils.COMMA, null, null, com.yandex.passport.sloth.j.b, 30);
                Intent intent = new Intent();
                intent.putExtra("webauthn_errors", X);
                j(601, X, intent);
            }
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        if (th instanceof com.yandex.passport.common.exception.a) {
            j(NetworkRequestException.EXPIRED_SIGNATURE, "invalid_token", null);
        } else if (th instanceof com.yandex.passport.api.exception.b) {
            i();
        } else {
            j(1112, String.valueOf(th.getMessage()), null);
        }
        return Unit.a;
    }

    public final void i() {
        Intent intent = new Intent();
        z1 J = com.yandex.plus.pay.ui.core.b.J(this.c.a);
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", J);
        intent.putExtras(bundle);
        j(501, "account_not_found", intent);
    }

    public final void j(int i, String str, Intent intent) {
        com.yandex.passport.common.core.f fVar = this.c.a;
        p1 p1Var = this.e;
        p1Var.getClass();
        fVar.getClass();
        p1Var.n(le.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 28));
        a(new l(i, intent));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.passport.internal.l lVar;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                Continuation continuation = null;
                f fVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f fVar2 = fVar.a;
                    jVar.l = 1;
                    dq7 dq7Var = ca8.a;
                    obj = x97.V(mn7.d, new com.yandex.passport.internal.storage.a(this, fVar2, continuation, 21), jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                lVar = (com.yandex.passport.internal.l) obj;
                if (lVar != null) {
                    i();
                    return Unit.a;
                }
                a(new m(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.h0(lVar.h(), fVar.a, com.yandex.plus.core.network.api.utils.a.T(fVar.b)), fVar.a.a, new com.yandex.passport.common.properties.a(15, false, false), 4)));
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        Continuation continuation2 = null;
        f fVar3 = this.c;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj2;
        if (lVar != null) {
        }
    }
}
