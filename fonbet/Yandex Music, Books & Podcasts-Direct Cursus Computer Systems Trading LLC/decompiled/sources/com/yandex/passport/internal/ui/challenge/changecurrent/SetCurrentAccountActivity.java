package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.b1b;
import defpackage.b6;
import defpackage.b6e;
import defpackage.er0;
import defpackage.ern;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class SetCurrentAccountActivity extends com.yandex.passport.internal.ui.challenge.e {
    public boolean e;
    public final ybf f = new ybf(ern.a(j.class), new a(this, 1), new a(this, 0), new a(this, 2));

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final void k(com.yandex.passport.internal.ui.challenge.a0 a0Var) {
        a0Var.getClass();
        if (a0Var instanceof com.yandex.passport.internal.ui.challenge.x) {
            com.yandex.passport.internal.ui.common.d delayedLoadingSlab = ((b) m()).getDelayedLoadingSlab();
            delayedLoadingSlab.e(a0Var);
            ((com.yandex.passport.internal.ui.challenge.w) this.b.getValue()).a.a(delayedLoadingSlab);
        } else if (a0Var instanceof com.yandex.passport.internal.ui.challenge.z) {
            super.k(a0Var);
        } else if (a0Var instanceof com.yandex.passport.internal.ui.challenge.y) {
            super.k(a0Var);
        } else {
            b6e.s();
        }
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final com.yandex.passport.internal.ui.challenge.f l(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        passportProcessGlobalComponent.getClass();
        return passportProcessGlobalComponent.createSetCurrentAccountActivityComponent(new c(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final com.yandex.passport.internal.ui.challenge.b0 n() {
        return (j) this.f.getValue();
    }

    @Override // com.yandex.passport.internal.ui.challenge.e, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b1b.b(this);
        super.onCreate(bundle);
        com.yandex.passport.sloth.data.o S = com.yandex.plus.core.network.api.utils.a.S(((b) m()).getProperties().c);
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
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 16), 3);
        }
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
        com.yandex.passport.internal.properties.c0 c0Var = (com.yandex.passport.internal.properties.c0) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-set-current-account-properties");
        if (c0Var != null) {
            z1 z1Var = c0Var.a;
            return new com.yandex.passport.internal.ui.challenge.n(z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : null, c0Var.c);
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.c0.class));
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final int u(Object obj) {
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
        return (!(((b) m()).getProperties().a == null && fVar == null) && fVar == null) ? 6 : -1;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Bundle v(Object obj) {
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj;
        if (fVar == null) {
            return null;
        }
        z1 J = com.yandex.plus.pay.ui.core.b.J(fVar);
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", J);
        return bundle;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Object w(boolean z, b6 b6Var, com.yandex.passport.internal.ui.challenge.a aVar) {
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) ((com.yandex.passport.internal.ui.challenge.n) b6Var).b;
        if (z) {
            return fVar;
        }
        return null;
    }
}
