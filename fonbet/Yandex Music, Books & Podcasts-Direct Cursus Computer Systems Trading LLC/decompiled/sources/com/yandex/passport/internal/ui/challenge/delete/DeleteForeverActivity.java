package com.yandex.passport.internal.ui.challenge.delete;

import android.os.Bundle;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.b1b;
import defpackage.b6;
import defpackage.cg6;
import defpackage.er0;
import defpackage.ern;
import defpackage.gi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ub7;
import defpackage.vh;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zh;
import defpackage.zsd;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DeleteForeverActivity extends com.yandex.passport.internal.ui.challenge.e {
    public static final /* synthetic */ int j = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final zh h = registerForActivityResult(new vh(16), new gi(15, this));
    public final ybf i = new ybf(ern.a(q1.class), new l0(this, 1), new l0(this, 0), new l0(this, 2));

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final com.yandex.passport.internal.ui.challenge.f l(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        passportProcessGlobalComponent.getClass();
        return passportProcessGlobalComponent.createDeleteForeverActivityComponent(new p0(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.e, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b1b.b(this);
        super.onCreate(bundle);
        com.yandex.passport.sloth.data.o S = com.yandex.plus.core.network.api.utils.a.S(((o0) m()).getProperties().c);
        int v = com.yandex.passport.internal.ui.a.v(S);
        Continuation continuation = null;
        if (v != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + S + " with nightMode=" + v + ", was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(v);
        }
        if (isFinishing() || isChangingConfigurations() || this.e) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.e, 8);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 17), 3);
        }
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Object p(b6 b6Var, com.yandex.passport.internal.ui.k kVar) {
        return com.yandex.passport.internal.ui.challenge.e.r(this, (com.yandex.passport.internal.ui.challenge.o) b6Var, kVar);
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Object q(b6 b6Var, com.yandex.passport.internal.ui.k kVar) {
        return com.yandex.passport.internal.ui.challenge.e.r(this, (com.yandex.passport.internal.ui.challenge.o) b6Var, kVar);
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.e = true;
        super.recreate();
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final b6 t(Bundle bundle) {
        com.yandex.passport.internal.properties.r rVar = (com.yandex.passport.internal.properties.r) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-delete-account-properties");
        if (rVar != null) {
            return new com.yandex.passport.internal.ui.challenge.o(com.yandex.plus.pay.ui.core.b.L(rVar.a), rVar.c);
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.r.class));
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final int u(Object obj) {
        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
        j0Var.getClass();
        return com.yandex.plus.pay.ui.core.b.F(j0Var).a;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Bundle v(Object obj) {
        ((com.yandex.passport.api.j0) obj).getClass();
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final /* bridge */ /* synthetic */ Object w(boolean z, b6 b6Var, com.yandex.passport.internal.ui.challenge.a aVar) {
        return y(z, aVar);
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final q1 n() {
        return (q1) this.i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(boolean z, Continuation continuation) {
        n0 n0Var;
        int i;
        if (continuation instanceof n0) {
            n0Var = (n0) continuation;
            int i2 = n0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = n0Var.j;
                nm6 nm6Var = nm6.a;
                i = n0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    h1 h1Var = n().l;
                    if (h1Var == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    com.yandex.passport.internal.ui.challenge.d dVar = new com.yandex.passport.internal.ui.challenge.d(new ub7(12, h1Var.j, new com.yandex.passport.internal.ui.challenge.b(2, this, DeleteForeverActivity.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/delete/DeleteForeverModel$State;)V", 4, 1)), 1);
                    n0Var.l = 1;
                    obj = zsd.g0(dVar, n0Var);
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
                return ((z0) obj).a;
            }
        }
        n0Var = new n0(this, (cg6) continuation);
        Object obj2 = n0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = n0Var.l;
        if (i != 0) {
        }
        return ((z0) obj2).a;
    }
}
