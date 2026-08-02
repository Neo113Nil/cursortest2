package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.address.search.common.presenter.i;
import com.yandex.go.flex.main_screen.domain.g;
import com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView;
import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.payments.api.exception.PaymentChangeException;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.tariffcard.ui.HeaderType;
import com.yandex.go.yb.analytics.SuggestYbCardInRideAnalytics$ChangePaymentError;
import com.ybsdk.core.analytics.generated.delegates.SplitEvents$SplitDepositTransactionStatusShownStatus;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.statebar.controller.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class qit0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qit0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ykn0 ykn0Var;
        Object value;
        String str;
        boolean z;
        int i = this.a;
        int i2 = 6;
        int i3 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                rit0 rit0Var = (rit0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    rit0Var.b.Lc(c.class, null);
                    break;
                } else {
                    rit0Var.b.q3(c.class, 0, ((avj0) rit0Var.c).c(usg0.statebar_height), 0, 0);
                    break;
                }
            case 1:
                mo21 mo21Var = (mo21) obj;
                if (mo21Var != null && (ykn0Var = ((cjt0) obj2).g) != null) {
                    ((s) ykn0Var.b).b(mo21Var, "auto", false, true);
                    break;
                }
                break;
            case 2:
                d dVar = (d) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    gf50 gf50Var = dVar.j;
                    if (gf50Var != null) {
                        gf50Var.reset();
                    }
                    dVar.b(null);
                    break;
                } else {
                    bf50 bf50Var = dVar.b;
                    Object e = dVar.e(bf50Var.a(), bf50Var.c.l("navigator.language_assistance_key", null) != null ? (String) bf50Var.i.getValue() : null, continuation);
                    if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 3:
                ((sot0) obj2).Hb((Drawable) obj);
                break;
            case 4:
                ((Boolean) obj).getClass();
                em3 em3Var = ((com.ybsdk.feature.split.deposit.internal.ui.payment.status.c) obj2).H.b.k0;
                SplitEvents$SplitDepositTransactionStatusShownStatus splitEvents$SplitDepositTransactionStatusShownStatus = SplitEvents$SplitDepositTransactionStatusShownStatus.PENDING;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(ACSPConstants.STATUS, splitEvents$SplitDepositTransactionStatusShownStatus.getOriginalValue());
                em3Var.a.a("split_deposit.transaction_status.shown", linkedHashMap);
                break;
            case 5:
                a aVar = (a) obj2;
                aVar.a0(new p9t0(i2, (j7r) obj));
                aVar.F.b.k0.a.a("split_deposit.payment_screen.finalize_payment_choice.deeplink_processed", null);
                break;
            case 6:
                k8u0 k8u0Var = (k8u0) obj;
                l8u0 l8u0Var = (l8u0) obj2;
                boolean z2 = k8u0Var.e;
                boolean z3 = k8u0Var.d;
                boolean z4 = k8u0Var.c;
                boolean z5 = k8u0Var.a;
                HeaderType headerType = k8u0Var.b;
                if (z2 || headerType != HeaderType.ULTIMA || !z5 || !z4 || !z3) {
                    if (z2 && (headerType == HeaderType.STANDARD || !z3 || ((!z5 && headerType == HeaderType.ULTIMA) || !z4))) {
                        l8u0Var.a();
                        break;
                    }
                } else {
                    ((d2x0) l8u0Var.a).a(0, qoi0.a(l8u0.class), false);
                    r0 r0Var = l8u0Var.b;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, k8u0.a((k8u0) value, false, null, false, false, true, 15)));
                }
                break;
            case 7:
                rc9 rc9Var = (rc9) obj;
                aav0 aav0Var = (aav0) obj2;
                zxs0 zxs0Var = aav0Var.B;
                n3w n3wVar = aav0Var.C;
                oep0 oep0Var = aav0Var.E;
                if (!jl40.l(rc9Var, qc9.d)) {
                    if (!jl40.l(rc9Var, qc9.a)) {
                        if (!jl40.l(rc9Var, qc9.b)) {
                            if (!(rc9Var instanceof pc9)) {
                                if (!jl40.l(rc9Var, qc9.c)) {
                                    w511.b();
                                    break;
                                } else {
                                    aav0Var.Kg(false);
                                    ((z9v0) aav0Var.Dg()).dismiss();
                                    zxs0Var.r("rejected");
                                }
                            } else {
                                aav0Var.Kg(false);
                                pda0 pda0Var = (pda0) n3wVar.a;
                                PaymentChangeException paymentChangeException = ((pc9) rc9Var).a;
                                ((pep0) oep0Var).f(pda0Var, new jda0(paymentChangeException), hxx.a);
                                SuggestYbCardInRideAnalytics$ChangePaymentError suggestYbCardInRideAnalytics$ChangePaymentError = jx81.D(paymentChangeException) ? SuggestYbCardInRideAnalytics$ChangePaymentError.NETWORK_ERROR : SuggestYbCardInRideAnalytics$ChangePaymentError.CHANGE_FAILED;
                                zxs0Var.getClass();
                                int i4 = y9v0.a[suggestYbCardInRideAnalytics$ChangePaymentError.ordinal()];
                                if (i4 == 1) {
                                    str = "network_error";
                                } else if (i4 == 2) {
                                    str = "google_pay_bind_error";
                                } else if (i4 == 3) {
                                    str = "change_error";
                                } else if (i4 != 4) {
                                    w511.b();
                                    break;
                                } else {
                                    str = "unknown";
                                }
                                g8k0 g8k0Var = (g8k0) zxs0Var.a;
                                String str2 = (String) zxs0Var.b;
                                f8k0 f8k0Var = g8k0Var.a;
                                f8k0Var.getClass();
                                HashMap h = b.h(new Pair(CRLReasonCodeExtension.REASON, str));
                                if (str2 != null) {
                                    h.put("payment_type", str2);
                                }
                                x4e.B(f8k0Var.a, "Ride.SuggestChangePayment.Failed", h, 1);
                            }
                        } else {
                            aav0Var.Kg(false);
                            g8k0 g8k0Var2 = (g8k0) zxs0Var.a;
                            String str3 = (String) zxs0Var.b;
                            f8k0 f8k0Var2 = g8k0Var2.a;
                            f8k0Var2.getClass();
                            HashMap hashMap = new HashMap();
                            if (str3 != null) {
                                hashMap.put("payment_type", str3);
                            }
                            f8k0Var2.a.a("Ride.SuggestChangePayment.Success", hashMap, 1, new HashMap());
                            ((z9v0) aav0Var.Dg()).dismiss();
                            zxs0Var.r("changed");
                        }
                    } else {
                        aav0Var.Kg(false);
                        ((pep0) oep0Var).f((pda0) n3wVar.a, nda0.a, hxx.a);
                        ((z9v0) aav0Var.Dg()).dismiss();
                        zxs0Var.r("default_changed");
                    }
                } else {
                    aav0Var.Kg(true);
                }
                break;
            case 8:
                com.yandex.go.address.search.common.presenter.b bVar = (com.yandex.go.address.search.common.presenter.b) obj2;
                ((ntj0) obj).c(new u51((j61) bVar.Dg(), 1)).b(new v51(7, bVar)).a(new v51(i2, new oav0(i3, bVar)));
                break;
            case 9:
                ((j61) ((i) obj2).Dg()).C((o5v0) obj);
                break;
            case 10:
                ((Boolean) obj).getClass();
                ((com.yandex.go.taxi.summary.ui.a) obj2).b();
                break;
            case 11:
                rg rgVar = (rg) obj;
                if (rgVar == null) {
                    w511.b();
                    break;
                } else {
                    ((View) obj2).announceForAccessibility(rgVar.a);
                    break;
                }
            case 12:
                xlv0 xlv0Var = (xlv0) obj;
                slv0 slv0Var = (slv0) obj2;
                if (!(xlv0Var instanceof wlv0)) {
                    if (!(xlv0Var instanceof vlv0)) {
                        slv0Var.getClass();
                        w511.b();
                        break;
                    } else {
                        ((rlv0) slv0Var.Dg()).dismiss();
                    }
                } else {
                    ((rlv0) slv0Var.Dg()).c6((wlv0) xlv0Var);
                }
                break;
            case 13:
                atv0 atv0Var = (atv0) obj2;
                atv0Var.c.a(atv0Var.d, (String) obj);
                break;
            case 14:
                ((ixv0) obj2).l((Drawable) obj);
                break;
            case 15:
                ((e4w0) obj2).render((h4w0) obj);
                break;
            case 16:
                break;
            case 17:
                ru.yandex.taxi.superapp.payment.a aVar2 = (ru.yandex.taxi.superapp.payment.a) obj2;
                pzt0 pzt0Var = aVar2.g;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                aVar2.g = null;
                Iterator it = EatsService.f().iterator();
                while (it.hasNext()) {
                    l0 l0Var = aVar2.b((EatsService) it.next()).c;
                    if (l0Var != null) {
                        l0Var.a();
                    }
                }
                break;
            case 18:
                ((Boolean) obj).booleanValue();
                SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView = (SuperappAzimuthRotatableIconView) obj2;
                z = superappAzimuthRotatableIconView.isIntroPending;
                if (z) {
                    superappAzimuthRotatableIconView.startIntro();
                    break;
                }
                break;
            case 19:
                ((g) obj2).b.i(new z131("superapp.point_a.address_short_text", (String) obj));
                break;
            case 20:
                ((xbw0) obj2).render(new ybw0((bk10) obj));
                break;
            case 21:
                ((udw0) obj2).render((kew0) obj);
                break;
            case 22:
                ((com.yandex.go.suggest.impl.view.error.a) obj2).c((ThemeType) obj);
                break;
            case 23:
                ((qjw0) obj2).renderIcon((Bitmap) obj);
                break;
            case 24:
                Pair pair = (Pair) obj;
                com.yandex.go.taxi.order.support.data.repositories.a aVar3 = (com.yandex.go.taxi.order.support.data.repositories.a) obj2;
                aVar3.i.l(pair != null ? (String) pair.c() : null);
                aVar3.h.l(pair != null ? (wjw0) pair.f() : null);
                break;
            case 25:
                ((hpw0) obj2).k4((puq) obj);
                break;
            case 26:
                ((tsw0) obj2).j6((jtw0) obj);
                break;
            case 27:
                ((vuw0) obj2).R7((gze0) obj);
                break;
            case 28:
                x4b0 x4b0Var = (x4b0) obj;
                com.yandex.messaging.contacts.sync.b bVar2 = (com.yandex.messaging.contacts.sync.b) obj2;
                if (!jl40.l(x4b0Var.g, bVar2.P)) {
                    bVar2.P = x4b0Var.g;
                    bVar2.d();
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r0 r0Var2 = ((com.yandex.messaging.internal.authorized.sync.i) obj2).e;
                r0Var2.getClass();
                r0Var2.m(null, bool);
                break;
        }
        return zy11Var;
    }
}
