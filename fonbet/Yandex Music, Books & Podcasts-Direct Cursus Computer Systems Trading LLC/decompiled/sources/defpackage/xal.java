package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.passport.internal.analytics.d;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.properties.k;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.passport.internal.ui.domik.common.i;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.plus.bdui.action.h;
import com.yandex.plus.core.debug.panel.internal.model.ui.a;
import com.yandex.plus.core.debug.panel.internal.presentation.view.f;
import com.yandex.plus.core.debug.panel.internal.presentation.view.o;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.adapter.holders.c;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class xal implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xal(b bVar, a aVar) {
        this.a = 25;
        this.b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Continuation continuation = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                nbl nblVar = ((yal) obj).g;
                i8l i8lVar = nblVar.P0;
                if (i8lVar != null && i8lVar.V0(29)) {
                    w0t Z = nblVar.P0.Z();
                    i8l i8lVar2 = nblVar.P0;
                    int i2 = dvt.a;
                    i8lVar2.H(Z.a().d(1).o(1).b());
                    s7f s7fVar = nblVar.f;
                    ((String[]) s7fVar.f)[1] = nblVar.getResources().getString(R.string.exo_track_selection_auto);
                    nblVar.k.dismiss();
                    break;
                }
                break;
            case 1:
                gbl gblVar = (gbl) obj;
                nbl nblVar2 = gblVar.x;
                int c = gblVar.c();
                View view2 = nblVar2.z;
                if (c != 0) {
                    if (c != 1) {
                        nblVar2.k.dismiss();
                        break;
                    } else {
                        yal yalVar = nblVar2.i;
                        view2.getClass();
                        nblVar2.d(yalVar, view2);
                        break;
                    }
                } else {
                    dbl dblVar = nblVar2.g;
                    view2.getClass();
                    nblVar2.d(dblVar, view2);
                    break;
                }
            case 2:
                nbl nblVar3 = ((yal) obj).g;
                i8l i8lVar3 = nblVar3.P0;
                if (i8lVar3 != null && i8lVar3.V0(29)) {
                    nblVar3.P0.H(nblVar3.P0.Z().a().d(3).i().l(null).n().b());
                    nblVar3.k.dismiss();
                    break;
                }
                break;
            case 3:
                sbl sblVar = (sbl) obj;
                sblVar.g();
                if (view.getId() != R.id.exo_overflow_show) {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        sblVar.r.start();
                        break;
                    }
                } else {
                    sblVar.q.start();
                    break;
                }
                break;
            case 4:
                PostGridItemsActivity postGridItemsActivity = (PostGridItemsActivity) obj;
                int i3 = PostGridItemsActivity.H0;
                lg3.d0("MultiItemsWindow_OpenFullDescription");
                postGridItemsActivity.C0.setMaxLines(Integer.MAX_VALUE);
                TextView textView = postGridItemsActivity.D0;
                jyr jyrVar = sht.a;
                if (textView != null) {
                    textView.setVisibility(8);
                    break;
                }
                break;
            case 5:
                wom womVar = (wom) obj;
                g0c g0cVar = (g0c) womVar.m.getValue();
                qne q = gut.q();
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(q);
                womVar.requireActivity().onBackPressed();
                break;
            case 6:
                ((jqo) ((spo) obj).h.getValue()).o.m(dqo.a);
                break;
            case 7:
                sbp sbpVar = (sbp) obj;
                sbpVar.getClass();
                u8q a = sbpVar.a();
                g0c g0cVar2 = a.k;
                qne m1 = gut.m1(d0n.LEGAL_AGREEMENT);
                x60 x60Var2 = (x60) g0cVar2;
                x60Var2.getClass();
                x60Var2.a(m1);
                a.l.l(nxi.e);
                break;
            case 8:
                ddp ddpVar = (ddp) obj;
                one oneVar = ddpVar.x;
                cdp cdpVar = ddpVar.y;
                if (oneVar != null) {
                    bg3.s(ddpVar, oneVar);
                }
                nra nraVar = cdpVar.c;
                if (nraVar != null) {
                    nraVar.setSelectionAfterHeaderView();
                }
                cdpVar.f();
                break;
            case 9:
                SwitchCompat switchCompat = ((wvr) obj).a;
                if (switchCompat.isEnabled()) {
                    switchCompat.performClick();
                    break;
                }
                break;
            case 10:
                ((vf) ((c) obj).v).a.invoke();
                break;
            case 11:
                ((hq0) obj).onSupportNavigateUp();
                break;
            case 12:
                int i4 = TransportCardsActivity.i;
                ((TransportCardsActivity) obj).finish();
                break;
            case 13:
                UrlActivity urlActivity = (UrlActivity) obj;
                int i5 = UrlActivity.C;
                saf.D(wyf.F(urlActivity.getLifecycle()).b, null);
                urlActivity.x = null;
                Intent intent = urlActivity.getIntent();
                intent.getClass();
                urlActivity.C(intent);
                break;
            case 14:
                zdv zdvVar = (zdv) obj;
                g0c y = zdvVar.y();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k(zdvVar.getG().a, linkedHashMap, "webview_tag", linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(k, "event_name", "confirm_exit_screen_opened", "confirm_exit_screen_opened", k);
                x60 x60Var3 = (x60) y;
                x60Var3.getClass();
                x60Var3.a(j);
                ((u8q) zdvVar.i.getValue()).K();
                break;
            case 15:
                AutoLoginRetryActivity autoLoginRetryActivity = (AutoLoginRetryActivity) obj;
                o0 o0Var = autoLoginRetryActivity.a;
                o0Var.getClass();
                o0Var.a.b(d.e, new xy0(0));
                if (!autoLoginRetryActivity.c) {
                    int i6 = GlobalRouterActivity.i;
                    k kVar = new k();
                    kVar.c(autoLoginRetryActivity.b.a);
                    kVar.m = autoLoginRetryActivity.d;
                    kVar.q = "passport/autologin";
                    autoLoginRetryActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.a(autoLoginRetryActivity, kVar.a(), true, null, null), 1);
                    autoLoginRetryActivity.e.setVisibility(8);
                    break;
                } else {
                    com.yandex.passport.internal.ui.autologin.c cVar = autoLoginRetryActivity.g;
                    cVar.l.l(Boolean.TRUE);
                    x97.y(ot0.F(cVar), null, null, new r1w(cVar, continuation, 19), 3);
                    break;
                }
            case 16:
                int i7 = DomikActivity.n;
                ((DomikActivity) obj).onSupportNavigateUp();
                break;
            case 17:
                com.yandex.passport.internal.ui.domik.common.b bVar = (com.yandex.passport.internal.ui.domik.common.b) obj;
                bVar.q.d();
                bVar.L();
                break;
            case 18:
                ((e) obj).L();
                break;
            case 19:
                i iVar = (i) obj;
                if (!iVar.L().isFocused()) {
                    iVar.O();
                    break;
                } else {
                    iVar.M().requestFocus();
                    break;
                }
            case 20:
                com.yandex.passport.internal.ui.util.a aVar = (com.yandex.passport.internal.ui.util.a) obj;
                aVar.e = true;
                aVar.a();
                if (aVar.f < System.currentTimeMillis()) {
                    aVar.b.invoke();
                    break;
                }
                break;
            case 21:
                ((evw) obj).invoke();
                break;
            case 22:
                com.yandex.plus.bdui.plus.checkout.content.controller.e eVar = (com.yandex.plus.bdui.plus.checkout.content.controller.e) obj;
                com.yandex.plus.bdui.content.d dVar = eVar.d;
                com.yandex.plus.log.api.b bVar2 = eVar.b;
                if (dVar == null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusPayButtonContentController", "button.onClick(); update is null!");
                        break;
                    }
                } else {
                    com.yandex.plus.bdui.content.a aVar3 = dVar.b;
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar4)) {
                        com.appsflyer.internal.k.x(new StringBuilder("button.onClick(); dispatch action = "), ((com.yandex.plus.bdui.plus.checkout.content.b) aVar3).a.a, bVar2, aVar4, "PlusPayButtonContentController");
                    }
                    eVar.a.a.a(((com.yandex.plus.bdui.plus.checkout.content.b) aVar3).a.a, new h(dVar.c), null);
                    break;
                }
                break;
            case 23:
                ((f) obj).p.invoke();
                break;
            case 24:
                s9f[] s9fVarArr = o.I;
                ((PopupMenu) obj).show();
                break;
            case 25:
                ((b) obj).u.invoke(null);
                break;
            case 26:
                ((g) obj).u.invoke();
                break;
            case 27:
                s9f[] s9fVarArr2 = com.yandex.plus.home.feature.webviews.internal.container.g.D;
                ((com.yandex.plus.home.feature.webviews.internal.container.g) obj).r();
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((t) obj).s(null);
                break;
            default:
                ((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a) obj).invoke();
                break;
        }
    }

    public /* synthetic */ xal(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
