package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.m0;
import defpackage.c8o;
import defpackage.ceg;
import defpackage.ezc;
import defpackage.ph;
import defpackage.rh;
import defpackage.syc;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.zh;
import defpackage.zyc;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class s implements rh, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginRouterActivity b;

    public /* synthetic */ s(LoginRouterActivity loginRouterActivity, int i) {
        this.a = i;
        this.b = loginRouterActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x00f9, code lost:
    
        if (com.yandex.passport.api.q.e(r3.getExtras()) == null) goto L65;
     */
    @Override // defpackage.rh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z;
        int i = this.a;
        LoginRouterActivity loginRouterActivity = this.b;
        switch (i) {
            case 0:
                ph phVar = (ph) obj;
                phVar.getClass();
                LoginRouterActivity.j(loginRouterActivity, phVar);
                return;
            case 1:
                ph phVar2 = (ph) obj;
                phVar2.getClass();
                LoginRouterActivity.j(loginRouterActivity, phVar2);
                return;
            default:
                ph phVar3 = (ph) obj;
                phVar3.getClass();
                int i2 = LoginRouterActivity.l;
                Intent intent = phVar3.b;
                ceg cegVar = phVar3.a;
                int i3 = cegVar.b;
                if (cegVar.equals(c8o.h)) {
                    if ((intent != null ? intent.getExtras() : null) != null) {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            xq0.q("internal error");
                            return;
                        }
                        if (extras.containsKey("configuration_to_relogin_with")) {
                            String string = extras.getString("authAccount");
                            if (string == null) {
                                xq0.q("no authAccount in extras");
                                return;
                            }
                            com.yandex.passport.internal.ui.social.gimap.t tVar = (com.yandex.passport.internal.ui.social.gimap.t) extras.getSerializable("configuration_to_relogin_with");
                            w1 w1Var = tVar != null ? tVar.b : null;
                            com.yandex.passport.internal.properties.l lVar = loginRouterActivity.b;
                            if (lVar == null) {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k(lVar);
                            kVar.l = string;
                            kVar.k = w1Var;
                            loginRouterActivity.b = kVar.a();
                            Intent intent2 = loginRouterActivity.getIntent();
                            com.yandex.passport.internal.properties.l lVar2 = loginRouterActivity.b;
                            if (lVar2 == null) {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                            intent2.putExtras(lVar2.t());
                            x k = loginRouterActivity.k();
                            com.yandex.passport.internal.properties.l lVar3 = loginRouterActivity.b;
                            if (lVar3 != null) {
                                k.J(loginRouterActivity, lVar3);
                                return;
                            } else {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                        }
                        if (extras.getBoolean("forbidden_web_am_for_this_auth", false)) {
                            com.yandex.passport.internal.properties.l lVar4 = loginRouterActivity.b;
                            if (lVar4 == null) {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                            m0 m0Var = lVar4.u;
                            com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k(lVar4);
                            kVar2.d = m0Var == null || !m0Var.d;
                            loginRouterActivity.b = kVar2.a();
                            Intent intent3 = loginRouterActivity.getIntent();
                            com.yandex.passport.internal.properties.l lVar5 = loginRouterActivity.b;
                            if (lVar5 == null) {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                            intent3.putExtras(lVar5.t());
                            x k2 = loginRouterActivity.k();
                            com.yandex.passport.internal.properties.l lVar6 = loginRouterActivity.b;
                            if (lVar6 != null) {
                                k2.J(loginRouterActivity, lVar6);
                                return;
                            } else {
                                Intrinsics.j("loginProperties");
                                throw null;
                            }
                        }
                        if (i3 == -1) {
                            break;
                        } else {
                            if (i3 != 0 && i3 != 6) {
                                if (i3 == 13) {
                                    z = intent.hasExtra(Constants.KEY_EXCEPTION);
                                }
                                z = false;
                            }
                            z = true;
                        }
                        if (z) {
                            com.yandex.passport.internal.ui.a.r(loginRouterActivity, com.yandex.plus.core.network.api.utils.a.F(com.yandex.passport.api.q.c(cegVar.b, intent)));
                            return;
                        }
                        if (((com.yandex.passport.internal.ui.domik.t) extras.getParcelable("domik-result")) == null) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Unsupported result extras: " + extras, 8);
                            }
                            loginRouterActivity.setResult(0);
                            loginRouterActivity.finish();
                            return;
                        }
                        com.yandex.passport.internal.ui.domik.t tVar2 = (com.yandex.passport.internal.ui.domik.t) extras.getParcelable("domik-result");
                        if (tVar2 == null) {
                            xq0.q("no domik-result in the bundle");
                            return;
                        }
                        com.yandex.passport.internal.properties.l lVar7 = loginRouterActivity.b;
                        if (lVar7 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        boolean isEmpty = CollectionsKt.U(tVar2.D().e.C, com.yandex.passport.internal.ui.a.I(lVar7.d.d)).isEmpty();
                        if (isEmpty) {
                            Intent intent4 = new Intent();
                            intent4.putExtra(Constants.KEY_EXCEPTION, new com.yandex.passport.internal.network.exception.a());
                            loginRouterActivity.setResult(13, intent4);
                            loginRouterActivity.finish();
                        }
                        if (isEmpty) {
                            return;
                        }
                        com.yandex.passport.internal.l D = tVar2.D();
                        com.yandex.passport.internal.properties.l lVar8 = loginRouterActivity.b;
                        if (lVar8 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        boolean a = lVar8.d.a(com.yandex.passport.api.n.CHILDISH);
                        if (!tVar2.D().e.x || a) {
                            com.yandex.passport.internal.entities.e Y = tVar2.Y();
                            com.yandex.passport.common.core.f fVar = D.b;
                            com.yandex.passport.api.t tVar3 = new com.yandex.passport.api.t(com.yandex.plus.pay.ui.core.b.J(fVar), com.yandex.plus.core.locale.b.B(tVar2.D()), tVar2.w(), tVar2.H(), null);
                            com.yandex.passport.internal.storage.m preferenceStorage = com.yandex.passport.internal.di.a.a().getPreferenceStorage();
                            preferenceStorage.getClass();
                            new com.yandex.passport.internal.storage.e(preferenceStorage, fVar).a(false);
                            Intent intent5 = com.yandex.plus.core.network.api.utils.a.F(tVar3).b;
                            if (intent5 == null) {
                                xq0.q("Internal error: no data in result");
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("accountType", com.yandex.passport.internal.ui.a.a);
                            bundle.putString("authAccount", D.j);
                            if (Y != null) {
                                bundle.putString("authtoken", Y.a);
                            }
                            if (tVar2 instanceof com.yandex.passport.internal.ui.domik.x) {
                                bundle.putString("phone-number", ((com.yandex.passport.internal.ui.domik.x) tVar2).b);
                            }
                            intent5.putExtras(bundle);
                            boolean z2 = (Y == null || com.yandex.plus.core.network.api.utils.a.z(Y.a) == null) ? false : true;
                            o0 o0Var = loginRouterActivity.d;
                            if (o0Var == null) {
                                Intrinsics.j("eventReporter");
                                throw null;
                            }
                            long j = fVar.b;
                            boolean z3 = com.yandex.plus.core.locale.b.B(D).g;
                            xy0 xy0Var = new xy0(0);
                            xy0Var.put("uid", String.valueOf(j));
                            xy0Var.put("clientTokenIsNotNullNorEmpty", String.valueOf(z2));
                            xy0Var.put("is_yandexoid", String.valueOf(z3));
                            o0Var.a.b(com.yandex.passport.internal.analytics.g.h, xy0Var);
                            loginRouterActivity.setResult(-1, intent5);
                            loginRouterActivity.finish();
                            return;
                        }
                        com.yandex.passport.common.core.f fVar2 = D.b;
                        PassportProcessGlobalComponent passportProcessGlobalComponent = loginRouterActivity.f;
                        if (passportProcessGlobalComponent == null) {
                            Intrinsics.j("component");
                            throw null;
                        }
                        com.yandex.passport.internal.network.d urlDispatcher = passportProcessGlobalComponent.getUrlDispatcher();
                        com.yandex.passport.internal.properties.l lVar9 = loginRouterActivity.b;
                        if (lVar9 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(lVar9.d.a);
                        urlDispatcher.getClass();
                        String m = ((com.yandex.passport.internal.network.h) urlDispatcher).m(L, null);
                        com.yandex.passport.internal.properties.l lVar10 = loginRouterActivity.b;
                        if (lVar10 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        com.yandex.passport.sloth.data.z zVar = new com.yandex.passport.sloth.data.z(fVar2, com.yandex.plus.core.network.api.utils.a.S(lVar10.e), m);
                        com.yandex.passport.internal.properties.l lVar11 = loginRouterActivity.b;
                        if (lVar11 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        com.yandex.passport.common.core.b L2 = com.yandex.plus.core.network.api.utils.a.L(lVar11.d.a);
                        com.yandex.passport.internal.properties.l lVar12 = loginRouterActivity.b;
                        if (lVar12 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        m0 m0Var2 = lVar12.u;
                        com.yandex.passport.internal.flags.i iVar = loginRouterActivity.e;
                        if (iVar == null) {
                            Intrinsics.j("flagsRepository");
                            throw null;
                        }
                        com.yandex.passport.sloth.data.m mVar = new com.yandex.passport.sloth.data.m(zVar, L2, com.yandex.plus.core.network.api.utils.a.J(m0Var2, ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.y)).booleanValue()), 4);
                        com.yandex.passport.internal.flags.i iVar2 = loginRouterActivity.e;
                        if (iVar2 == null) {
                            Intrinsics.j("flagsRepository");
                            throw null;
                        }
                        if (!((Boolean) iVar2.b(com.yandex.passport.internal.flags.o.V)).booleanValue()) {
                            loginRouterActivity.i.a(mVar);
                            return;
                        }
                        zh zhVar = loginRouterActivity.j;
                        com.yandex.passport.internal.properties.l lVar13 = loginRouterActivity.b;
                        if (lVar13 != null) {
                            zhVar.a(new com.yandex.passport.internal.ui.sloth.d0(com.yandex.plus.pay.ui.core.b.G(lVar13.e), mVar));
                            return;
                        } else {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                    }
                }
                loginRouterActivity.setResult(i3, intent);
                loginRouterActivity.finish();
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rh) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new ezc(1, 0, LoginRouterActivity.class, this.b, "processBearResult", "processBearResult(Lcom/lightside/android/ActivityResult;)V");
            case 1:
                return new ezc(1, 0, LoginRouterActivity.class, this.b, "processBearResult", "processBearResult(Lcom/lightside/android/ActivityResult;)V");
            default:
                return new ezc(1, 0, LoginRouterActivity.class, this.b, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
