package defpackage;

import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment;
import com.yandex.go.agreement.api.AcceptanceChangeSource;
import com.yandex.go.agreement.interactor.a;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.plus.pay.presentation.b;
import com.yandex.go.preorder.navigation.h;
import com.yandex.go.preorder.zone.d;
import com.yandex.go.promocodes.referral.impl.ui.ReferralGiftViewHolder$ButtonType;
import com.yandex.go.promocodes.referral.impl.ui.ReferralMainScreenButton;
import com.yandex.go.route.analytics.e;
import com.yandex.go.shortcuts.impl.interactors.n;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.user_profile.ui.primary.ProfileModalView;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.ScreenRect;
import com.yandex.pay.payment.YPayResult;
import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c;
import ru.yandex.taxi.main_screen_custom.presentation.v;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.order.view.FeedbackView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class qtc0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qtc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r1 = com.yandex.go.taxi.main.ShortcutsMainScreen.onAttachedToWindow$lambda$1((com.yandex.go.taxi.main.ShortcutsMainScreen) r1.b);
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        pqi pqiVar;
        r0 r0Var;
        Object value2;
        g9g0 g9g0Var;
        FeedbackView feedbackView;
        r0 r0Var2;
        Object value3;
        int intValue;
        ViewGroup viewGroup;
        SlideableModalView onAttachedToWindow$lambda$1;
        int i = this.a;
        Long l = null;
        View view = null;
        View view2 = null;
        View view3 = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ptc0) obj2).render((h4w0) obj);
                return zy11Var;
            case 1:
                hl3 hl3Var = (hl3) obj;
                if (hl3Var instanceof fl3) {
                    l = new Long(((fl3) hl3Var).a);
                } else if (!(hl3Var instanceof gl3)) {
                    w511.b();
                    return null;
                }
                ((b) obj2).a.k(l);
                return zy11Var;
            case 2:
                pqi pqiVar2 = (pqi) obj;
                c cVar = (c) obj2;
                ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b bVar = cVar.c;
                bVar.d = cVar.a;
                r0 r0Var3 = bVar.c;
                do {
                    value = r0Var3.getValue();
                    pqiVar = (pqi) value;
                } while (!r0Var3.k(value, pqiVar == null ? pqiVar2 : pqi.a(pqiVar2, pqiVar.d)));
                return zy11Var;
            case 3:
                ((Number) obj).intValue();
                ((Runnable) obj2).run();
                return zy11Var;
            case 4:
                h hVar = (h) obj2;
                if (((Boolean) obj).booleanValue()) {
                    hVar.G.b("resumePreorderController", false);
                    hVar.a0.b();
                    jqe0 jqe0Var = hVar.Q;
                    jqe0Var.a.a(jqe0Var.b);
                    ((e) hVar.M).a();
                } else {
                    hVar.P();
                }
                return zy11Var;
            case 5:
                d dVar = (d) obj2;
                Zone zone = ((gd61) obj).b;
                if (zone != null) {
                    ((a) dVar.d).e(((kd) dVar.i).a(zone), AcceptanceChangeSource.ZONE_INFO);
                    dVar.b.r(zone.a);
                    dVar.c.getClass();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                }
                return zy11Var;
            case 6:
                Object emit = ((n) obj2).g.emit((eaf0) obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            case 7:
                ((ProfileModalView) obj2).render((sgf0) obj);
                return zy11Var;
            case 8:
                ((inf0) obj2).updateState((anf0) obj);
                return zy11Var;
            case 9:
                ((vof0) ((v) obj2).Dg()).render(((zs7) obj).c ? mof0.c : mof0.b);
                return zy11Var;
            case 10:
                hsc hscVar = (hsc) ((Pair) obj).getSecond();
                wpf0 wpf0Var = ((com.yandex.go.taxi.order.communications.analytics.realtime.a) obj2).a;
                CommunicationItem communicationItem = hscVar.a;
                wpf0Var.getClass();
                String str = communicationItem.a;
                Map map = communicationItem.k;
                RealtimeEventType realtimeEventType = RealtimeEventType.Shown;
                o2y0 o2y0Var = wpf0Var.g;
                wpf0Var.d(str, map, wpf0.b(o2y0Var != null ? o2y0Var.b() : null), realtimeEventType);
                return zy11Var;
            case 11:
                ((com.yandex.go.taxi.order.search.ui.overlay.proxy.c) obj2).A.l((SearchOverlayType) obj);
                return zy11Var;
            case 12:
                l1g0 l1g0Var = (l1g0) obj2;
                o1g0 o1g0Var = ((iae0) obj).e;
                iae0 iae0Var = (iae0) l1g0Var.y.a.b();
                k1g0 k1g0Var = (k1g0) l1g0Var.Dg();
                String str2 = (String) iae0Var.c.get(o1g0Var.c);
                if (str2 == null) {
                    str2 = "";
                }
                k1g0Var.setTitle(str2);
                k1g0 k1g0Var2 = (k1g0) l1g0Var.Dg();
                String str3 = (String) iae0Var.c.get(o1g0Var.d);
                k1g0Var2.setSubtitle(str3 != null ? str3 : "");
                ((k1g0) l1g0Var.Dg()).M6(((m7x0) l1g0Var.x).a(o1g0Var.a));
                return zy11Var;
            case 13:
                com.yandex.go.preorder.lifecycle.e eVar = (com.yandex.go.preorder.lifecycle.e) obj2;
                if (eVar.b.a().getB()) {
                    ((ru.yandex.taxi.settings.domain.d) eVar.c.getValue()).a();
                }
                return zy11Var;
            case 14:
                iae0 iae0Var2 = (iae0) obj;
                y3g0 y3g0Var = (y3g0) obj2;
                w2g0 w2g0Var = y3g0Var.z;
                x3g0 x3g0Var = (x3g0) y3g0Var.Dg();
                String str4 = (String) iae0Var2.c.get(w2g0Var.getC());
                if (str4 == null) {
                    str4 = "";
                }
                x3g0Var.setTitle(str4);
                x3g0 x3g0Var2 = (x3g0) y3g0Var.Dg();
                String str5 = (String) iae0Var2.c.get(w2g0Var.getD());
                x3g0Var2.setSubtitle(str5 != null ? str5 : "");
                ((x3g0) y3g0Var.Dg()).P1(((m7x0) y3g0Var.C).a(w2g0Var.getA()));
                return zy11Var;
            case 15:
                iae0 iae0Var3 = (iae0) obj;
                z3g0 z3g0Var = (z3g0) obj2;
                x1g0 x1g0Var = z3g0Var.h;
                tj60 tj60Var = z3g0Var.b;
                if (x1g0Var.a.e()) {
                    if (z3g0Var.e.b.b()) {
                        iae0Var3.e.getClass();
                        tj60Var.c("push_disabled_popup");
                        z3g0Var.c(iae0Var3.d);
                    } else {
                        iae0Var3.d.getClass();
                        tj60Var.c("push_settings_popup");
                        z3g0Var.c(iae0Var3.e);
                    }
                }
                return zy11Var;
            case 16:
                u3g0 u3g0Var = (u3g0) obj;
                ru.yandex.taxi.settings.presentation.settings.a aVar = (ru.yandex.taxi.settings.presentation.settings.a) obj2;
                if (aVar.F == null || u3g0Var.c) {
                    aVar.F = u3g0Var;
                }
                ((v3g0) aVar.Dg()).Qc(new t4g0(u3g0Var.a));
                return zy11Var;
            case 17:
                kgy0 kgy0Var = (kgy0) obj;
                com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar2 = (com.ybsdk.feature.qr.payments.internal.screens.presentation.b) obj2;
                d9g0 b = qca1.b((h9g0) bVar2.X());
                if (b != null) {
                    pz40 Y = bVar2.Y();
                    do {
                        r0Var = (r0) Y;
                        value2 = r0Var.getValue();
                        g9g0Var = ((h9g0) value2).a;
                        if (g9g0Var instanceof f9g0) {
                            g9g0Var = d9g0.c(b, null, null, kgy0Var.a, kgy0Var, null, null, null, false, null, 65151);
                        }
                    } while (!r0Var.k(value2, new h9g0(g9g0Var)));
                    bVar2.J.a(kgy0Var.a, false);
                }
                return zy11Var;
            case 18:
                qdg0 qdg0Var = (qdg0) obj;
                com.ybsdk.feature.qr.internal.screens.reader.presentation.b bVar3 = (com.ybsdk.feature.qr.internal.screens.reader.presentation.b) obj2;
                if (qdg0Var instanceof odg0) {
                    com.ybsdk.feature.qr.internal.screens.reader.presentation.b.b0(bVar3, (odg0) qdg0Var);
                } else {
                    if (!(qdg0Var instanceof pdg0)) {
                        w511.b();
                        return null;
                    }
                    bVar3.r0(qdg0Var);
                }
                bVar3.t0();
                return zy11Var;
            case 19:
                com.yandex.go.quark.dynamic.h hVar2 = (com.yandex.go.quark.dynamic.h) obj2;
                if (((Number) obj).intValue() <= 0) {
                    hst hstVar = jst.e;
                    ke00 a = hstVar.b.a();
                    if (a != null && a.b(10)) {
                        a.a(10, "QuarkService", null, "QuarkMobileBridge " + com.yandex.go.quark.dynamic.h.d(hVar2) + " stopping...", hstVar.a);
                    }
                    try {
                        ms1 ms1Var = ((uig0) hVar2.q.E()).a;
                    } catch (Throwable unused) {
                    }
                    bvf0.i(hVar2.b, "Stopping Quark, cancelling associated coroutines", null);
                    ((com.yandex.quark.lite.b) hVar2.m.getValue()).h();
                }
                return zy11Var;
            case 20:
                ((alg0) obj2).Kg((tkg0) obj);
                return zy11Var;
            case 21:
                ((m7i0) obj2).render((r8l0) obj);
                return zy11Var;
            case 22:
                r0 r0Var4 = ((p7i0) obj2).J;
                cm21 a2 = cm21.a((cm21) r0Var4.getValue(), null, null, ((Editable) obj).toString(), 3);
                r0Var4.getClass();
                r0Var4.m(null, a2);
                return zy11Var;
            case 23:
                int intValue2 = ((Number) obj).intValue();
                feedbackView = ((RateView) obj2).feedbackView;
                feedbackView.setStarsClickable(intValue2 != 2);
                return zy11Var;
            case 24:
                n8u0 n8u0Var = (n8u0) obj;
                com.ybsdk.feature.rebind.payment.internal.screens.a aVar2 = (com.ybsdk.feature.rebind.payment.internal.screens.a) obj2;
                pz40 Y2 = aVar2.Y();
                tfl0 tfl0Var = aVar2.D;
                do {
                    r0Var2 = (r0) Y2;
                    value3 = r0Var2.getValue();
                } while (!r0Var2.k(value3, new gfi0(n8u0Var.a, n8u0Var.b)));
                RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity = n8u0Var.a;
                Throwable th = n8u0Var.c;
                int i2 = ifi0.a[rebindPaymentMethodStatusEntity.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (th == null) {
                            th = new Throwable("Unknown error");
                        }
                        aVar2.c0(th);
                        tfl0Var.e();
                    } else if (i2 != 3 && i2 != 4) {
                        w511.b();
                        return null;
                    }
                } else if (th != null) {
                    aVar2.c0(th);
                } else {
                    aVar2.C.a(cfi0.b);
                    tfl0Var.e();
                }
                return zy11Var;
            case 25:
                RecenterType recenterType = (RecenterType) obj;
                com.yandex.go.taxi.order.map.overlay.recenter.b bVar4 = (com.yandex.go.taxi.order.map.overlay.recenter.b) obj2;
                ggi0 l2 = bVar4.l(recenterType);
                fi6 fi6Var = new fi6();
                l2.f(fi6Var, bVar4.w);
                if (fi6Var.i() && recenterType != RecenterType.SAVED_POSITION) {
                    recenterType = RecenterType.ALL_ROUTE;
                }
                Object e = bVar4.e(recenterType, false, continuation);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11Var;
            case 26:
                ru.yandex.taxi.address.experiment.e eVar2 = (ru.yandex.taxi.address.experiment.e) obj;
                pki0 pki0Var = (pki0) obj2;
                if (eVar2 == null) {
                    ((j61) pki0Var.Dg()).fg();
                } else {
                    ((j61) pki0Var.Dg()).na(eVar2);
                    ((j61) pki0Var.Dg()).Ta(eVar2.f);
                }
                return zy11Var;
            case 27:
                Intent intent = new Intent();
                intent.putExtra("result_key", say.a((YPayResult) obj));
                RedirectHostFragment redirectHostFragment = (RedirectHostFragment) obj2;
                redirectHostFragment.requireActivity().setResult(1, intent);
                redirectHostFragment.requireActivity().finish();
                return zy11Var;
            case 28:
                goi0 goi0Var = (goi0) obj;
                com.yandex.go.promocodes.referral.impl.ui.b bVar5 = (com.yandex.go.promocodes.referral.impl.ui.b) obj2;
                bVar5.getClass();
                n0 n0Var = bVar5.n;
                boolean z = goi0Var.a;
                String str6 = goi0Var.b;
                if (goi0Var instanceof aoi0) {
                    bVar5.a(new ReferralGiftViewHolder$ButtonType[0]);
                } else {
                    if (goi0Var instanceof coi0) {
                        bVar5.a(new ReferralGiftViewHolder$ButtonType[0]);
                        if (z) {
                            ScreenRect screenRect = ((coi0) goi0Var).c;
                            ViewGroup viewGroup2 = bVar5.e;
                            if (viewGroup2 != null) {
                                View view4 = bVar5.i;
                                if (view4 == null) {
                                    View c = bVar5.c(null, viewGroup2);
                                    if (c != null) {
                                        bVar5.d(c, str6);
                                        Integer b2 = com.yandex.go.promocodes.referral.impl.ui.b.b(c, screenRect);
                                        intValue = b2 != null ? b2.intValue() : -1;
                                        c.setVisibility(4);
                                        n0Var.g(new ioi0(c, intValue));
                                        view = c;
                                    }
                                    bVar5.i = view;
                                } else {
                                    cma1.J(view4);
                                }
                            }
                        } else {
                            View view5 = bVar5.i;
                            if (view5 != null) {
                                xw31.a(view5);
                                cma1.L(view5);
                                bVar5.i = null;
                            }
                        }
                    } else if (goi0Var instanceof boi0) {
                        bVar5.a(ReferralGiftViewHolder$ButtonType.MAIN_MODAL_VIEW);
                        if (z) {
                            b7p0 b7p0Var = bVar5.f;
                            if (b7p0Var != null && onAttachedToWindow$lambda$1 != null) {
                                ReferralMainScreenButton referralMainScreenButton = bVar5.j;
                                if (referralMainScreenButton == null) {
                                    ReferralMainScreenButton referralMainScreenButton2 = new ReferralMainScreenButton(onAttachedToWindow$lambda$1.getContext());
                                    referralMainScreenButton2.setOnClickListener(new com.yandex.go.promocodes.referral.impl.ui.a(bVar5, 1));
                                    bVar5.d(referralMainScreenButton2, str6);
                                    bVar5.j = referralMainScreenButton2;
                                }
                                if (referralMainScreenButton != null) {
                                    if (onAttachedToWindow$lambda$1.indexOfChild(referralMainScreenButton) == -1) {
                                        onAttachedToWindow$lambda$1.addViewAboveCard(referralMainScreenButton, 8388659, 0);
                                    }
                                    cma1.J(referralMainScreenButton);
                                }
                            }
                        } else {
                            View view6 = bVar5.i;
                            if (view6 != null) {
                                xw31.a(view6);
                                cma1.L(view6);
                                bVar5.i = null;
                            }
                        }
                    } else if (goi0Var instanceof foi0) {
                        bVar5.a(ReferralGiftViewHolder$ButtonType.SUMMARY);
                        if (z) {
                            ScreenRect screenRect2 = ((foi0) goi0Var).c;
                            ViewGroup viewGroup3 = bVar5.e;
                            if (viewGroup3 != null && (viewGroup = (ViewGroup) viewGroup3.findViewById(bVar5.d)) != null) {
                                View view7 = bVar5.k;
                                if (view7 == null) {
                                    View.inflate(viewGroup.getContext(), fvh0.source_point_referral_gift_summary, viewGroup);
                                    int i3 = a7h0.referral_gift_summary_button;
                                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                                    View view8 = (View) rp31.d(viewGroup, i3);
                                    view8.setOnClickListener(new d5b0(27, bVar5));
                                    ImageView imageView = (ImageView) view8.findViewById(a7h0.referral_gift_summary_button);
                                    if (imageView != null && str6 != null) {
                                        bVar5.e(imageView, str6);
                                    }
                                    Integer b3 = com.yandex.go.promocodes.referral.impl.ui.b.b(view8, screenRect2);
                                    intValue = b3 != null ? b3.intValue() : -1;
                                    view8.setVisibility(4);
                                    n0Var.g(new ioi0(view8, intValue));
                                    bVar5.k = view8;
                                } else {
                                    Integer b4 = com.yandex.go.promocodes.referral.impl.ui.b.b(view7, screenRect2);
                                    n0Var.g(new ioi0(view7, b4 != null ? b4.intValue() : -1));
                                }
                            }
                        } else {
                            View view9 = bVar5.k;
                            if (view9 != null) {
                                xw31.a(view9);
                                bVar5.k = null;
                            }
                        }
                    } else if (goi0Var instanceof doi0) {
                        bVar5.a(new ReferralGiftViewHolder$ButtonType[0]);
                        if (z) {
                            ScreenRect screenRect3 = ((doi0) goi0Var).c;
                            View c2 = bVar5.c(bVar5.l, bVar5.e);
                            if (c2 != null) {
                                bVar5.d(c2, str6);
                                Integer b5 = com.yandex.go.promocodes.referral.impl.ui.b.b(c2, screenRect3);
                                intValue = b5 != null ? b5.intValue() : -1;
                                c2.setVisibility(4);
                                n0Var.g(new ioi0(c2, intValue));
                                view2 = c2;
                            }
                            bVar5.l = view2;
                        } else {
                            View view10 = bVar5.l;
                            if (view10 != null) {
                                xw31.a(view10);
                                bVar5.l = null;
                            }
                        }
                    } else {
                        if (!(goi0Var instanceof eoi0)) {
                            w511.b();
                            return null;
                        }
                        bVar5.a(new ReferralGiftViewHolder$ButtonType[0]);
                        if (z) {
                            ScreenRect screenRect4 = ((eoi0) goi0Var).c;
                            View c3 = bVar5.c(bVar5.m, bVar5.g);
                            if (c3 != null) {
                                bVar5.d(c3, str6);
                                Integer b6 = com.yandex.go.promocodes.referral.impl.ui.b.b(c3, screenRect4);
                                intValue = b6 != null ? b6.intValue() : -1;
                                c3.setVisibility(4);
                                n0Var.g(new ioi0(c3, intValue));
                                view3 = c3;
                            }
                            bVar5.m = view3;
                        } else {
                            View view11 = bVar5.m;
                            if (view11 != null) {
                                xw31.a(view11);
                                cma1.L(view11);
                                bVar5.m = null;
                            }
                        }
                    }
                }
                return zy11Var;
            default:
                ici iciVar = ((ru.yandex.taxi.preorder.summary.altchoice.ui.selector.e) obj2).M;
                pex0 pex0Var = ((fnx0) obj).c;
                lci lciVar = iciVar.b;
                String str7 = (String) ((Map) lciVar.a.getValue()).get(pex0Var.b);
                if (str7 != null) {
                    pex0 b7 = pex0Var.b();
                    if (b7 != null) {
                        ArrayList b8 = ru.yandex.taxi.tariffs.model.b.b(b7);
                        if (!b8.isEmpty()) {
                            Iterator it = b8.iterator();
                            while (it.hasNext()) {
                                nu1 nu1Var = (nu1) it.next();
                                if (!nu1Var.h || !jl40.l(nu1Var.b, str7)) {
                                }
                            }
                        }
                    }
                    lciVar.a(null, pex0Var.b);
                }
                return zy11Var;
        }
    }
}
