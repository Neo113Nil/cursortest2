package com.yandex.passport.common.ui.compose;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.r;
import com.yandex.passport.api.w0;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.sloth.performers.usermenu.e;
import com.yandex.passport.internal.sloth.performers.usermenu.f;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.account_upgrade.g;
import com.yandex.passport.internal.ui.account_upgrade.h;
import com.yandex.passport.internal.ui.account_upgrade.i;
import com.yandex.passport.internal.ui.account_upgrade.l;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.roundabout.z;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.relogin.d;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.domik.w;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.b0;
import com.yandex.passport.internal.ui.router.n;
import com.yandex.passport.internal.ui.sloth.d0;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.menu.b;
import com.yandex.passport.internal.ui.sloth.menu.c;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.k1;
import com.yandex.passport.internal.ui.social.j;
import com.yandex.passport.internal.ui.social.k;
import com.yandex.passport.internal.ui.social.p;
import com.yandex.passport.internal.ui.social.t;
import com.yandex.passport.sloth.h0;
import com.yandex.passport.sloth.q;
import com.yandex.passport.sloth.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import defpackage.a4g;
import defpackage.aqi;
import defpackage.b6e;
import defpackage.ca8;
import defpackage.cxb;
import defpackage.dq7;
import defpackage.ezc;
import defpackage.gld;
import defpackage.j5;
import defpackage.j5h;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.o30;
import defpackage.oba;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.ssd;
import defpackage.tf6;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.zh;
import java.io.IOException;
import java.util.EnumSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1 function1) {
        this.a = 20;
        this.b = (ezc) function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0478  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v21, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        b bVar;
        int i;
        Object obj2;
        String str;
        int i2;
        int i3 = this.a;
        int i4 = 3;
        ?? r10 = this.b;
        switch (i3) {
            case 0:
                Object invoke = ((Function2) ((aqi) r10).getValue()).invoke(obj, continuation);
                return invoke == nm6.a ? invoke : Unit.a;
            case 1:
                i iVar = (i) obj;
                AccountUpgraderActivity accountUpgraderActivity = (AccountUpgraderActivity) r10;
                if (iVar instanceof h) {
                    if (((Boolean) accountUpgraderActivity.e.getFlagRepository().b(o.V)).booleanValue()) {
                        zh zhVar = accountUpgraderActivity.d;
                        l lVar = accountUpgraderActivity.a;
                        if (lVar == null) {
                            Intrinsics.j("upgraderExtras");
                            throw null;
                        }
                        zhVar.a(new d0(com.yandex.plus.pay.ui.core.b.G(lVar.b), ((h) iVar).a));
                    } else {
                        accountUpgraderActivity.c.a(((h) iVar).a);
                    }
                    return Unit.a;
                }
                if (!(iVar instanceof g)) {
                    b6e.s();
                    return null;
                }
                StringBuilder sb = new StringBuilder("Error ");
                Throwable th = ((g) iVar).a;
                sb.append(th);
                Toast.makeText(accountUpgraderActivity, sb.toString(), 0).show();
                Object j = AccountUpgraderActivity.j(accountUpgraderActivity, new r(th), continuation);
                return j == nm6.a ? j : Unit.a;
            case 2:
                com.yandex.passport.sloth.ui.b bVar2 = (com.yandex.passport.sloth.ui.b) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SlothNetworkStatus " + bVar2, 8);
                }
                if (Intrinsics.d(bVar2, com.yandex.passport.sloth.ui.b.a)) {
                    ((s) r10).a(y1.c);
                } else if (!Intrinsics.d(bVar2, com.yandex.passport.sloth.ui.b.b) && bVar2 != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 3:
                com.yandex.passport.sloth.ui.b bVar3 = (com.yandex.passport.sloth.ui.b) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SlothNetworkStatus " + bVar3, 8);
                }
                if (Intrinsics.d(bVar3, com.yandex.passport.sloth.ui.b.a)) {
                    ((com.yandex.passport.internal.ui.bouncer.loading.i) r10).m.a(y1.c);
                } else if (!Intrinsics.d(bVar3, com.yandex.passport.sloth.ui.b.b) && bVar3 != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((d) r10).l.l(bool);
                return Unit.a;
            case 5:
                GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) r10;
                n nVar = (n) obj;
                if (Intrinsics.d(nVar, com.yandex.passport.internal.ui.router.l.a)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Global Route was cancelled", 8);
                    }
                    globalRouterActivity.finish();
                } else {
                    if (!(nVar instanceof com.yandex.passport.internal.ui.router.o)) {
                        b6e.s();
                        return null;
                    }
                    globalRouterActivity.b.a(nVar);
                }
                return Unit.a;
            case 6:
                b0 b0Var = (b0) obj;
                LoginRouterActivity loginRouterActivity = (LoginRouterActivity) r10;
                com.yandex.passport.internal.ui.router.d0 d0Var = loginRouterActivity.a;
                if (d0Var != null) {
                    d0Var.e.setVisibility(8);
                }
                loginRouterActivity.k.setValue(Boolean.FALSE);
                n0 n0Var = loginRouterActivity.c;
                if (n0Var == null) {
                    Intrinsics.j("statefulReporter");
                    throw null;
                }
                n0Var.f();
                com.yandex.passport.internal.properties.l lVar2 = loginRouterActivity.b;
                if (lVar2 == null) {
                    Intrinsics.j("loginProperties");
                    throw null;
                }
                n0Var.b = lVar2.l;
                n0Var.g = lVar2.p.j;
                n0Var.f = lVar2.r;
                loginRouterActivity.h.a(b0Var);
                return Unit.a;
            case 7:
                ((o1) r10).u(((h0) obj).toString(), n1.USER_MENU);
                return Unit.a;
            case 8:
                UserMenuActivity userMenuActivity = (UserMenuActivity) r10;
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i5 = bVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = bVar.j;
                        nm6 nm6Var = nm6.a;
                        i = bVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            obj2 = (com.yandex.passport.internal.sloth.performers.usermenu.g) obj;
                            if (obj2 instanceof f) {
                                f fVar = (f) obj2;
                                com.yandex.passport.internal.ui.a.r(userMenuActivity, com.yandex.plus.core.network.api.utils.a.G(new f2(fVar.a, fVar.b)));
                            } else if (obj2 instanceof e) {
                                com.yandex.passport.internal.ui.sloth.menu.e eVar = userMenuActivity.b;
                                if (eVar == null) {
                                    Intrinsics.j("component");
                                    throw null;
                                }
                                com.yandex.passport.internal.ui.sloth.menu.l userMenuRequestsProcessor = eVar.getUserMenuRequestsProcessor();
                                e eVar2 = (e) obj2;
                                Message obtain = Message.obtain(null, 10, cxb.K(new Pair("ID_COMMAND", eVar2.a)));
                                obtain.getClass();
                                bVar.m = eVar2;
                                bVar.k = 1;
                                userMenuRequestsProcessor.getClass();
                                obj3 = j5.u(userMenuRequestsProcessor, obtain, bVar);
                                if (obj3 == nm6Var) {
                                    return nm6Var;
                                }
                            }
                            return Unit.a;
                        }
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = bVar.m;
                        qgg.h0(obj3);
                        String str2 = (String) obj3;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "callback " + str2, 8);
                        }
                        ((e) obj2).b.invoke(str2);
                        return Unit.a;
                    }
                }
                bVar = new b(this, continuation);
                Object obj32 = bVar.j;
                nm6 nm6Var2 = nm6.a;
                i = bVar.k;
                if (i != 0) {
                }
                String str22 = (String) obj32;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                ((e) obj2).b.invoke(str22);
                return Unit.a;
            case 9:
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) r10;
                jyr jyrVar = managingPlusDevicesHelperActivity.d;
                com.yandex.passport.internal.ui.sloth.plusdevices.f fVar2 = (com.yandex.passport.internal.ui.sloth.plusdevices.f) obj;
                if (Intrinsics.d(fVar2, com.yandex.passport.internal.ui.sloth.plusdevices.d.a)) {
                    ((Handler) jyrVar.getValue()).removeCallbacksAndMessages(null);
                    z zVar = managingPlusDevicesHelperActivity.a;
                    if (zVar == null) {
                        Intrinsics.j("ui");
                        throw null;
                    }
                    ((View) zVar.e).setVisibility(8);
                } else if (Intrinsics.d(fVar2, com.yandex.passport.internal.ui.sloth.plusdevices.d.b)) {
                    c cVar = new c(1, managingPlusDevicesHelperActivity);
                    int i6 = ManagingPlusDevicesHelperActivity.g;
                    ((Handler) jyrVar.getValue()).postDelayed(new com.yandex.passport.internal.ui.autologin.d(1, cVar), 2000L);
                } else if (fVar2 instanceof com.yandex.passport.internal.ui.sloth.plusdevices.e) {
                    ((Handler) jyrVar.getValue()).removeCallbacksAndMessages(null);
                    z zVar2 = managingPlusDevicesHelperActivity.a;
                    if (zVar2 == null) {
                        Intrinsics.j("ui");
                        throw null;
                    }
                    ((View) zVar2.e).setVisibility(8);
                    if (!managingPlusDevicesHelperActivity.f) {
                        managingPlusDevicesHelperActivity.b.a(((com.yandex.passport.internal.ui.sloth.plusdevices.e) fVar2).a);
                    }
                } else {
                    if (!(fVar2 instanceof com.yandex.passport.internal.ui.sloth.plusdevices.c)) {
                        b6e.s();
                        return null;
                    }
                    managingPlusDevicesHelperActivity.setResult(((com.yandex.passport.internal.ui.sloth.plusdevices.c) fVar2).a);
                    managingPlusDevicesHelperActivity.finish();
                }
                return Unit.a;
            case 10:
                ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity = (ManagingPlusDevicesSlothActivity) r10;
                managingPlusDevicesSlothActivity.setResult(((Number) obj).intValue(), managingPlusDevicesSlothActivity.getIntent());
                managingPlusDevicesSlothActivity.finish();
                return Unit.a;
            case 11:
                u uVar = (u) obj;
                gf gfVar = ((k1) r10).q;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth event: " + uVar, 8);
                }
                if (uVar instanceof q) {
                    gfVar.e("native.show_webview");
                } else if (uVar instanceof com.yandex.passport.sloth.r) {
                    gfVar.e("webview.".concat(((com.yandex.passport.sloth.r) uVar).a));
                }
                return Unit.a;
            case 12:
                t tVar = (t) obj;
                j jVar = (j) r10;
                if (!Intrinsics.d(tVar, com.yandex.passport.internal.ui.social.q.b)) {
                    if (Intrinsics.d(tVar, com.yandex.passport.internal.ui.social.q.c)) {
                        k x = j.x(jVar);
                        if (jVar.g == null) {
                            Intrinsics.j("configuration");
                            throw null;
                        }
                        ((SocialBindActivity) x).m(false);
                    } else if (tVar instanceof com.yandex.passport.internal.ui.social.s) {
                        com.yandex.passport.internal.ui.base.l lVar3 = ((com.yandex.passport.internal.ui.social.s) tVar).a;
                        jVar.startActivityForResult(lVar3.a(jVar.requireContext()), lVar3.b);
                    } else if (tVar instanceof p) {
                        SocialBindActivity socialBindActivity = (SocialBindActivity) j.x(jVar);
                        socialBindActivity.setResult(-1);
                        socialBindActivity.finish();
                    } else if (tVar instanceof com.yandex.passport.internal.ui.social.r) {
                        Throwable th2 = ((com.yandex.passport.internal.ui.social.r) tVar).a.b;
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Social auth error", th2);
                        }
                        int i7 = th2 instanceof IOException ? R.string.passport_error_network : R.string.passport_reg_error_unknown;
                        o30 o30Var = new o30(jVar.requireActivity());
                        o30Var.b(R.string.passport_error_dialog_title);
                        o30Var.a(i7);
                        o30Var.setPositiveButton(android.R.string.ok, new oba(i4, jVar)).create().show();
                    } else {
                        if (!Intrinsics.d(tVar, com.yandex.passport.internal.ui.social.q.a)) {
                            b6e.s();
                            return null;
                        }
                        new Handler(Looper.getMainLooper()).post(new androidx.core.app.a(10, jVar));
                    }
                }
                return Unit.a;
            case 13:
                t tVar2 = (t) obj;
                com.yandex.passport.internal.ui.social.o oVar = (com.yandex.passport.internal.ui.social.o) r10;
                if (!Intrinsics.d(tVar2, com.yandex.passport.internal.ui.social.q.b)) {
                    if (Intrinsics.d(tVar2, com.yandex.passport.internal.ui.social.q.c)) {
                        String str3 = com.yandex.passport.internal.ui.social.o.k;
                        com.yandex.passport.internal.ui.social.a x2 = oVar.x();
                        a0 a0Var = oVar.g;
                        if (a0Var == null) {
                            Intrinsics.j("configuration");
                            throw null;
                        }
                        ((DomikActivity) x2).j.getDomikRouter().e(false, a0Var, false, null);
                    } else if (tVar2 instanceof com.yandex.passport.internal.ui.social.s) {
                        com.yandex.passport.internal.ui.base.l lVar4 = ((com.yandex.passport.internal.ui.social.s) tVar2).a;
                        oVar.startActivityForResult(lVar4.a(oVar.requireContext()), lVar4.b);
                    } else if (tVar2 instanceof p) {
                        com.yandex.passport.internal.l lVar5 = ((p) tVar2).a;
                        String str4 = com.yandex.passport.internal.ui.social.o.k;
                        DomikActivity domikActivity = (DomikActivity) oVar.x();
                        n0 n0Var2 = domikActivity.f;
                        n0Var2.getClass();
                        lVar5.getClass();
                        xy0 xy0Var = new xy0(0);
                        if (lVar5.k() != null) {
                            Object obj4 = a1.d;
                            String k = lVar5.k();
                            k.getClass();
                            ?? r3 = a1.d;
                            if (r3.containsKey(k)) {
                                Object obj5 = r3.get(k);
                                obj5.getClass();
                                str = (String) obj5;
                            } else {
                                str = "other";
                            }
                            xy0Var.put("provider", str);
                        }
                        n0Var2.c(m0.IDENTIFIER, l0.SOCIAL_AUTH_SUCCESS, xy0Var);
                        domikActivity.d.M();
                        v domikRouter = domikActivity.j.getDomikRouter();
                        w0 w0Var = w0.b;
                        EnumSet noneOf = EnumSet.noneOf(w.class);
                        noneOf.getClass();
                        com.yandex.passport.internal.ui.domik.u uVar2 = new com.yandex.passport.internal.ui.domik.u(lVar5, null, w0Var, null, noneOf);
                        domikRouter.getClass();
                        domikRouter.f(null, uVar2);
                    } else if (tVar2 instanceof com.yandex.passport.internal.ui.social.r) {
                        com.yandex.passport.internal.ui.f fVar3 = ((com.yandex.passport.internal.ui.social.r) tVar2).a;
                        String str5 = com.yandex.passport.internal.ui.social.o.k;
                        Throwable th3 = fVar3.b;
                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Social auth error", th3);
                        }
                        androidx.fragment.app.t requireActivity = oVar.requireActivity();
                        requireActivity.getClass();
                        int i8 = th3 instanceof IOException ? R.string.passport_error_network : R.string.passport_reg_error_unknown;
                        ssd requireActivity2 = oVar.requireActivity();
                        requireActivity2.getClass();
                        com.yandex.passport.internal.ui.i iVar2 = new com.yandex.passport.internal.ui.i(requireActivity, ((DomikActivity) ((com.yandex.passport.internal.ui.domik.k) requireActivity2)).j.getDomikDesignProvider().d);
                        iVar2.e = requireActivity.getString(R.string.passport_error_dialog_title);
                        iVar2.b(i8);
                        iVar2.c(android.R.string.ok, new oba(4, requireActivity));
                        iVar2.d = new com.yandex.passport.internal.ui.b(3, requireActivity);
                        iVar2.a().show();
                    } else {
                        if (!Intrinsics.d(tVar2, com.yandex.passport.internal.ui.social.q.a)) {
                            b6e.s();
                            return null;
                        }
                        String str6 = com.yandex.passport.internal.ui.social.o.k;
                        new Handler(Looper.getMainLooper()).post(new androidx.core.app.a(11, oVar));
                    }
                }
                return Unit.a;
            case 14:
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "start publishActualStatus triggered by host", 8);
                }
                Object d = ((com.yandex.passport.internal.usecase.vpn.e) r10).d("data_changed", continuation);
                return d == nm6.a ? d : Unit.a;
            case 15:
                ((com.yandex.passport.sloth.t) r10).a.invoke((String) obj);
                return Unit.a;
            case 16:
                com.yandex.plus.core.debug.panel.internal.presentation.state.d dVar3 = (com.yandex.plus.core.debug.panel.internal.presentation.state.d) obj;
                com.yandex.plus.core.debug.panel.internal.presentation.view.d dVar4 = ((com.yandex.plus.core.debug.panel.internal.presentation.controller.b) r10).b;
                if (dVar3 instanceof com.yandex.plus.core.debug.panel.internal.presentation.state.b) {
                    dVar4.b((com.yandex.plus.core.debug.panel.internal.presentation.state.b) dVar3);
                } else {
                    if (dVar3 instanceof com.yandex.plus.core.debug.panel.internal.presentation.state.a) {
                        dVar4.getClass();
                        dVar4.getContext().getClass();
                        throw null;
                    }
                    if (!(dVar3 instanceof com.yandex.plus.core.debug.panel.internal.presentation.state.c)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.core.debug.panel.internal.presentation.state.c cVar2 = (com.yandex.plus.core.debug.panel.internal.presentation.state.c) dVar3;
                    dVar4.getClass();
                    dq7 dq7Var = ca8.a;
                    tf6 e = gld.e(j5h.a.plus(a4g.n()));
                    Context context = dVar4.getContext();
                    context.getClass();
                    com.yandex.plus.core.debug.panel.internal.presentation.view.o oVar2 = new com.yandex.plus.core.debug.panel.internal.presentation.view.o(context, dVar4, e, new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c(cVar2, e, dVar4.k, dVar4.j, dVar4.l, dVar4.b, dVar4.e), dVar4.a, dVar4.g);
                    dVar4.h.push(oVar2);
                    dVar4.addView(oVar2);
                }
                return Unit.a;
            case 17:
                Object invoke2 = r10.invoke(obj, continuation);
                return invoke2 == nm6.a ? invoke2 : Unit.a;
            case 18:
                ((Boolean) obj).getClass();
                com.yandex.plus.home.feature.webviews.internal.container.t tVar3 = (com.yandex.plus.home.feature.webviews.internal.container.t) r10;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar3 = tVar3.x;
                FrameLayout frameLayout = tVar3.K;
                boolean booleanValue = ((Boolean) iVar3.invoke()).booleanValue();
                View view = tVar3.L;
                view.setVisibility(booleanValue ? 0 : 8);
                if (!booleanValue) {
                    frameLayout.removeView(view);
                } else if (view.getParent() == null) {
                    frameLayout.addView(view);
                }
                return Unit.a;
            case 19:
                com.yandex.plus.home.feature.webviews.internal.stories.b bVar4 = (com.yandex.plus.home.feature.webviews.internal.stories.b) obj;
                com.yandex.plus.home.feature.webviews.internal.stories.list.i iVar4 = (com.yandex.plus.home.feature.webviews.internal.stories.list.i) r10;
                com.yandex.plus.core.analytics.logging.b bVar5 = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.a;
                com.yandex.plus.core.analytics.logging.e.e(aVar, bVar5, "WebStories navigation event received = " + bVar4, null);
                int ordinal = bVar4.ordinal();
                if (ordinal == 0) {
                    i2 = iVar4.h + 1;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    i2 = iVar4.h - 1;
                }
                if (i2 < 0 || i2 >= iVar4.g.size()) {
                    com.yandex.plus.core.analytics.logging.e.e(aVar, bVar5, "WebStories navigation result dismiss", null);
                    ((com.yandex.plus.home.feature.webviews.internal.stories.list.g) iVar4.e).dismiss();
                } else {
                    com.yandex.plus.core.analytics.logging.e.e(aVar, bVar5, "WebStories navigation result new position = " + i2, null);
                    iVar4.j = z0.c;
                    ((com.yandex.plus.home.feature.webviews.internal.stories.list.g) iVar4.e).d(i2);
                }
                return Unit.a;
            case 20:
                ((ezc) r10).invoke((f1) obj);
                return Unit.a;
            default:
                com.yandex.plus.home.plaque.feature.internal.e eVar3 = (com.yandex.plus.home.plaque.feature.internal.e) r10;
                com.yandex.plus.log.api.b bVar6 = eVar3.f;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar6.b(aVar2)) {
                    bVar6.c(aVar2, "PlaqueFeatureImpl", "collect update trigger");
                }
                eVar3.a(true);
                return Unit.a;
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
