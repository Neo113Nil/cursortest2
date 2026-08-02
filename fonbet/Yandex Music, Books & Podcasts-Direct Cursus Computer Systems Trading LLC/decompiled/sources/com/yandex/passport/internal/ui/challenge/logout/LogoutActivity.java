package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.b6;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.er0;
import defpackage.ern;
import defpackage.xq0;
import defpackage.ybf;
import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class LogoutActivity extends com.yandex.passport.internal.ui.challenge.e {
    public static final /* synthetic */ int f = 0;
    public final ybf e = new ybf(ern.a(f0.class), new a(this, 1), new a(this, 0), new a(this, 2));

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final com.yandex.passport.internal.ui.challenge.f l(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle) {
        passportProcessGlobalComponent.getClass();
        return passportProcessGlobalComponent.createLogoutActivityComponent(new c(this, bundle));
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final com.yandex.passport.internal.ui.challenge.b0 n() {
        return (f0) this.e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // com.yandex.passport.internal.ui.challenge.e, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        y1 y1Var;
        Bundle extras;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-logout-properties");
            if (uVar == null) {
                xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.u.class));
                return;
            }
            y1Var = uVar.b;
        }
        y1Var = y1.b;
        int ordinal = y1Var.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    return;
                }
                i = -1;
            }
        }
        if (i != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + y1Var + " with nightMode=" + i + ", was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(i);
            recreate();
        }
        super.onCreate(bundle);
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final b6 t(Bundle bundle) {
        com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-logout-properties");
        if (uVar != null) {
            return new com.yandex.passport.internal.ui.challenge.o(com.yandex.plus.pay.ui.core.b.L(uVar.a), uVar.b);
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.u.class));
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final int u(Object obj) {
        return ((Boolean) obj).booleanValue() ? -1 : 6;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final /* bridge */ /* synthetic */ Bundle v(Object obj) {
        ((Boolean) obj).getClass();
        return null;
    }

    @Override // com.yandex.passport.internal.ui.challenge.e
    public final Object w(boolean z, b6 b6Var, com.yandex.passport.internal.ui.challenge.a aVar) {
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // com.yandex.passport.internal.ui.challenge.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(com.yandex.passport.internal.ui.challenge.o oVar, Continuation continuation) {
        d dVar;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            d.a.getClass();
            extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            Serializable serializable = extras.getSerializable("passport-logout-behaviour");
            dVar = serializable instanceof d ? (d) serializable : null;
        }
        dVar = d.b;
        ((f0) this.e.getValue()).l = dVar;
        return com.yandex.passport.internal.ui.challenge.e.r(this, oVar, (cg6) continuation);
    }
}
