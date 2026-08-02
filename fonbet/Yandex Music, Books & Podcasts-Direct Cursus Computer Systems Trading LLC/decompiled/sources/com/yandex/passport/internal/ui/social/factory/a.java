package com.yandex.passport.internal.ui.social.factory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.ui.social.authenticators.f;
import com.yandex.passport.internal.ui.social.b;
import com.yandex.passport.internal.ui.social.c;
import com.yandex.passport.internal.ui.social.d;
import com.yandex.passport.internal.ui.social.e;
import com.yandex.passport.internal.ui.social.g;
import com.yandex.passport.internal.ui.social.h;
import com.yandex.passport.internal.ui.social.m;
import com.yandex.passport.internal.ui.social.n;
import com.yandex.passport.internal.util.k;
import defpackage.mbo;

/* loaded from: classes4.dex */
public final class a extends mbo {
    public final /* synthetic */ int e = 1;
    public final Bundle f;
    public final PassportProcessGlobalComponent g;
    public final Parcelable h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, Bundle bundle, com.yandex.passport.internal.l lVar2, a0 a0Var, Context context, boolean z) {
        super(a0Var, context, z, (com.yandex.passport.internal.l) null);
        a0Var.getClass();
        context.getClass();
        this.h = lVar;
        this.f = bundle;
        this.i = lVar2;
        this.g = com.yandex.passport.internal.di.a.a();
    }

    @Override // defpackage.mbo
    public final f d() {
        switch (this.e) {
            case 0:
                return m(b.b);
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // defpackage.mbo
    public final f e() {
        switch (this.e) {
            case 0:
                return m(new c((String) this.i));
            default:
                return n(com.yandex.passport.internal.ui.social.l.a);
        }
    }

    @Override // defpackage.mbo
    public final f f(Intent intent) {
        switch (this.e) {
            case 0:
                return m(new d(intent));
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // defpackage.mbo
    public final f g() {
        switch (this.e) {
            case 0:
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) this.d;
                return m(new e(lVar != null ? lVar.i() : null));
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // defpackage.mbo
    public final f h(Intent intent) {
        switch (this.e) {
            case 0:
                return m(new com.yandex.passport.internal.ui.social.f(intent));
            default:
                return n(new m(intent));
        }
    }

    @Override // defpackage.mbo
    public final f i() {
        switch (this.e) {
            case 0:
                return m(b.c);
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // defpackage.mbo
    public final f j() {
        switch (this.e) {
            case 0:
                return m(new g((String) this.i, ((com.yandex.passport.internal.ui.domik.d) this.h).b));
            default:
                return n(com.yandex.passport.internal.ui.social.l.b);
        }
    }

    public com.yandex.passport.internal.ui.social.authenticators.c m(h hVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.g;
        k hashEncoder = passportProcessGlobalComponent.getHashEncoder();
        com.yandex.passport.internal.usecase.authorize.f authByCodeUseCase = passportProcessGlobalComponent.getAuthByCodeUseCase();
        com.yandex.passport.internal.usecase.ui.l authorizeByMailOAuthTaskIdUseCase = passportProcessGlobalComponent.getAuthorizeByMailOAuthTaskIdUseCase();
        com.yandex.passport.internal.usecase.authorize.c authByCookieUseCase = passportProcessGlobalComponent.getAuthByCookieUseCase();
        com.yandex.passport.internal.core.accounts.e accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
        com.yandex.passport.internal.account.d loginController = passportProcessGlobalComponent.getLoginController();
        a1 socialReporter = passportProcessGlobalComponent.getSocialReporter();
        socialReporter.c = passportProcessGlobalComponent.getStatefulReporter().d;
        return new com.yandex.passport.internal.ui.social.authenticators.c(hVar, hashEncoder, authByCodeUseCase, authorizeByMailOAuthTaskIdUseCase, authByCookieUseCase, accountsRetriever, loginController, socialReporter, passportProcessGlobalComponent.getClientChooser(), passportProcessGlobalComponent.getProperties(), ((com.yandex.passport.internal.ui.domik.d) this.h).a, (a0) this.b, this.f, ((com.yandex.passport.internal.l) this.d) != null);
    }

    public com.yandex.passport.internal.ui.social.authenticators.e n(n nVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.g;
        return new com.yandex.passport.internal.ui.social.authenticators.e(nVar, passportProcessGlobalComponent.getHashEncoder(), passportProcessGlobalComponent.getClientChooser(), passportProcessGlobalComponent.getSocialReporter(), (com.yandex.passport.internal.l) this.i, (l) this.h, (a0) this.b, this.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.yandex.passport.internal.ui.domik.d dVar, String str, Bundle bundle, a0 a0Var, Context context, boolean z, com.yandex.passport.internal.l lVar) {
        super(a0Var, context, z, lVar);
        a0Var.getClass();
        context.getClass();
        this.h = dVar;
        this.i = str;
        this.f = bundle;
        this.g = com.yandex.passport.internal.di.a.a();
    }
}
