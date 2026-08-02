package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.go.masstransit.sdk.order.impl.orders.k;
import com.yandex.go.masstransit.sdk.order.impl.tickets.g;
import com.yandex.go.masstransit.sdk.order.impl.tickets.l;
import com.yandex.go.masstransit.sdk.order.impl.tickets.m;
import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$Action;
import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$MainScreenState;
import com.yandex.mapkit.navigation.transport.layer.AccuracyCircleStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationIconStyle;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.auth.passport.b;
import com.yandex.messaging.internal.authorized.sync.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CreditDepositEvents$CreditDepositPaymentResultStatus;
import com.ybsdk.feature.credit.deposit.api.CreditDepositScreenParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.masstransit.tickets.a;
import ru.yandex.taxi.masstransit.tickets.c;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandextaxi.flutter_yandex_mapkit.styles.transport.UserLocationIconStyleData;

/* loaded from: classes15.dex */
public final class vbb implements rdq0, z820, ctq0, z9f, UserLocationStyleProvider {
    public Object a;
    public Object b;

    public vbb(int i, float f) {
        float[] fArr;
        if (f == 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            fArr = null;
        } else {
            fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = f;
            }
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        this.a = roundRectShape;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        this.b = shapeDrawable;
    }

    public Context A() {
        Context context = ((z8g) this.a).a.a;
        q5z.i(context);
        return context;
    }

    public kse B() {
        return (kse) ((z8g) this.a).f.get();
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    public lqo C() {
        lqo lqoVar = ((z8g) this.a).a.d;
        q5z.i(lqoVar);
        return lqoVar;
    }

    public sft D() {
        return new sft((kse) ((z8g) this.a).f.get(), (b4f0) ((p8g) this.b).J.get());
    }

    public a8u E() {
        return new a8u((kse) ((z8g) this.a).f.get(), ((p8g) this.b).c());
    }

    public q6v F() {
        return (q6v) ((z8g) this.a).W.get();
    }

    public p220 G() {
        return (p220) ((z8g) this.a).n.get();
    }

    public q220 H() {
        return (q220) ((z8g) this.a).x0.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        y9p y9pVar = ((brb) this.a).d.c;
        y9pVar.a.a("FamilyAccount.Contacts.UserSelected", tse0.n(y9pVar), 1, new HashMap());
        ((Ref$ObjectRef) this.b).element = bgq0Var;
    }

    public Looper J() {
        return (Looper) ((z8g) this.a).d.get();
    }

    public rz10 K() {
        rz10 rz10Var = ((z8g) this.a).a.k;
        q5z.i(rz10Var);
        return rz10Var;
    }

    public k020 L() {
        return (k020) ((p8g) this.b).H.get();
    }

    public MessengerEnvironment M() {
        return (MessengerEnvironment) ((p8g) this.b).i.get();
    }

    public Moshi N() {
        return (Moshi) ((z8g) this.a).N.get();
    }

    public dh60 O() {
        return (dh60) ((p8g) this.b).t.get();
    }

    public xf7 P() {
        return (xf7) ((p8g) this.b).g0.get();
    }

    public zm90 Q() {
        ccg ccgVar = (ccg) this.b;
        xqi0 S = ccgVar.a.S();
        q5z.h(S);
        vbb vbbVar = ccgVar.a;
        y120 y120Var = ((z8g) vbbVar.a).a.h;
        b00 p = vbbVar.p();
        q5z.h(p);
        b bVar = ((z8g) vbbVar.a).a.n;
        x22 s = vbbVar.s();
        q5z.h(s);
        return new zm90(S, y120Var, p, bVar, s);
    }

    public oo90 R() {
        ol3 ol3Var = new ol3((Activity) this.a);
        ccg ccgVar = (ccg) this.b;
        xqi0 S = ccgVar.a.S();
        q5z.h(S);
        vbb vbbVar = ccgVar.a;
        qp90 n = ((p8g) vbbVar.b).n();
        xh3 xh3Var = (xh3) ((p8g) vbbVar.b).e2.get();
        q5z.h(xh3Var);
        return new oo90(ol3Var, S, n, xh3Var);
    }

    public xqi0 S() {
        return (xqi0) ((p8g) this.b).v.get();
    }

    public SharedPreferences T() {
        return (SharedPreferences) ((z8g) this.a).T.get();
    }

    public void U(MainScreenAnalytics$Action mainScreenAnalytics$Action, PointType pointType, MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState) {
        j800 j800Var = (j800) this.b;
        SourcePicker sourcePicker = pointType == null ? null : pointType == PointType.DESTINATION ? SourcePicker.B_FROM_HOME : SourcePicker.A_FROM_HOME;
        if (mainScreenAnalytics$MainScreenState.ordinal() != j800Var.j.ordinal()) {
            if (mainScreenAnalytics$MainScreenState.ordinal() <= j800Var.j.ordinal()) {
                i a = j800Var.a("Main.SuggestCard.Closed", mainScreenAnalytics$MainScreenState);
                MainScreenBehavior mainScreenBehavior = j800Var.a;
                String str = mainScreenBehavior.version;
                LinkedHashMap linkedHashMap = a.a;
                linkedHashMap.put("MainScreenVersion", str);
                linkedHashMap.put("action", mainScreenAnalytics$Action.getKey());
                if (sourcePicker != null) {
                    a.d("address_search", sourcePicker.getSource());
                }
                String str2 = j800Var.k;
                if (str2 != null && !evu0.J(str2)) {
                    a.d("GridID", j800Var.k);
                }
                if (MainScreenBehavior.SHORTCUTS == mainScreenBehavior) {
                    lx4 lx4Var = j800Var.c;
                    ((na1) j800Var.d).getClass();
                    ((j) lx4Var).v(as6.y());
                }
                a.d(MetaDataField.SCREEN_FIELD, j800Var.h.c());
                a.m();
            } else if (mainScreenAnalytics$MainScreenState == MainScreenAnalytics$MainScreenState.EXPANDED) {
                j800Var.b(mainScreenAnalytics$Action, sourcePicker);
            } else {
                j800Var.a("Main.SuggestCard.Opened", mainScreenAnalytics$MainScreenState).m();
            }
            j800Var.j = mainScreenAnalytics$MainScreenState;
        }
    }

    public g V() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        w030 B5 = c0gVar.B5();
        q5z.h(B5);
        h410 h410Var = (h410) c0gVar.lz.get();
        q5z.h(h410Var);
        c cVar = new c(c0gVar.N5(), c0gVar.M5());
        xl10 xl10Var = new xl10(new pj((pho) c0gVar.A.a.a.d0.get()));
        Context H12 = c0gVar.H1();
        q5z.h(H12);
        tse tseVar = (tse) c0gVar.B.get();
        q5z.h(tseVar);
        k3c d2 = c0gVar.d2();
        y50 q1 = c0gVar.q1();
        q5z.h(q1);
        NotificationStackComponent notificationStackComponent = ((a400) c0gVar.A.a.b.Ob.get()).b;
        q5z.i(notificationStackComponent);
        a aVar = new a(H12, tseVar, d2, q1, notificationStackComponent);
        dx9 dx9Var = (dx9) this.b;
        b7z0 b7z0Var = (b7z0) c0gVar.A.a.W4.get();
        q5z.h(b7z0Var);
        to70 to70Var = (to70) h410Var.f.getValue();
        d240 d240Var = new d240(5, dx9Var);
        int i = f1h0.brick_sign;
        w740 w740Var = (w740) to70Var.g.getValue();
        com.yandex.go.masstransit.sdk.order.impl.tickets.i iVar = new com.yandex.go.masstransit.sdk.order.impl.tickets.i((k) to70Var.e.getValue(), w740Var, (com.yandex.go.masstransit.sdk.order.impl.orders.c) to70Var.f.getValue());
        at20 at20Var = new at20(xl10Var, w740Var);
        hhw hhwVar = to70Var.a;
        cot cotVar = (cot) hhwVar.l;
        ru.yandex.taxi.widget.c cVar2 = (ru.yandex.taxi.widget.c) hhwVar.n;
        yp2 yp2Var = (yp2) hhwVar.k;
        tt2 tt2Var = (tt2) hhwVar.e;
        return new g(H1, B5, iVar, new l(iVar, new m(H1, (zuj0) hhwVar.m, cVar2, yp2Var, tt2Var, new w1z0(), new com.yandex.go.masstransit.sdk.core.design.slot.mapper.a(cotVar, cVar2, yp2Var, tt2Var), cVar, i), b7z0Var), new e100(16, iVar, at20Var, (zuj0) hhwVar.m), at20Var, cVar, new djb(to70Var, H1, B5, 4), d240Var, aVar);
    }

    public void W(CreditDepositEvents$CreditDepositPaymentResultStatus creditDepositEvents$CreditDepositPaymentResultStatus) {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        linkedHashMap.put(ACSPConstants.STATUS, creditDepositEvents$CreditDepositPaymentResultStatus.getOriginalValue());
        rt1Var.a.a("credit_deposit.payment_result", linkedHashMap);
    }

    public void X(int i) {
        RoundRectShape roundRectShape = (RoundRectShape) this.a;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, shapeDrawable);
        stateListDrawable.addState(new int[0], (Drawable) this.b);
        this.b = stateListDrawable;
    }

    public void Y(int i) {
        RoundRectShape roundRectShape = (RoundRectShape) this.a;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(-1);
        this.b = new RippleDrawable(ColorStateList.valueOf(i), (Drawable) this.b, shapeDrawable);
    }

    @Override // defpackage.z9f
    public void a() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.pay.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void b() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.screen_open", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void c() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.back.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void d() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.close.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void e() {
        ((AppAnalyticsReporter) this.b).p.a.a("credit_deposit.suggest.click", null);
    }

    @Override // defpackage.z9f
    public void f(saf safVar) {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        String str = safVar.b;
        if (str == null) {
            str = safVar.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        linkedHashMap.put("card_id", str);
        rt1Var.a.a("credit_deposit.change_card.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void g(String str) {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        linkedHashMap.put("action", str);
        rt1Var.a.a("credit_deposit.local_action.click", linkedHashMap);
    }

    @Override // defpackage.ctq0
    public KSerializer h(lfx lfxVar) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class a = ((zzb) lfxVar).a();
        Object obj = concurrentHashMap.get(a);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (obj = new gb7((KSerializer) ((tls) this.a).invoke(lfxVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((gb7) obj).a;
    }

    @Override // defpackage.z9f
    public void i() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.timeout.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void j() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.tooltip.click", linkedHashMap);
    }

    public Drawable k() {
        return (Drawable) this.b;
    }

    @Override // defpackage.z9f
    public void l() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.change_sum.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void m(s2e0 s2e0Var) {
        CreditDepositEvents$CreditDepositPaymentResultStatus creditDepositEvents$CreditDepositPaymentResultStatus;
        if (!(s2e0Var instanceof q2e0)) {
            if (s2e0Var instanceof n2e0) {
                W(CreditDepositEvents$CreditDepositPaymentResultStatus.ERROR);
                return;
            }
            if (s2e0Var.equals(o2e0.a) || (s2e0Var instanceof p2e0)) {
                W(CreditDepositEvents$CreditDepositPaymentResultStatus.PROCESSING);
                return;
            } else if (s2e0Var.equals(r2e0.a)) {
                W(CreditDepositEvents$CreditDepositPaymentResultStatus.TIMEOUT);
                return;
            } else {
                w511.b();
                return;
            }
        }
        int i = caf.a[((xaf) ((q2e0) s2e0Var).a).c.ordinal()];
        if (i == 1) {
            creditDepositEvents$CreditDepositPaymentResultStatus = CreditDepositEvents$CreditDepositPaymentResultStatus.PROCESSING;
        } else if (i == 2) {
            creditDepositEvents$CreditDepositPaymentResultStatus = CreditDepositEvents$CreditDepositPaymentResultStatus.REQUIRED_3DS;
        } else if (i == 3) {
            creditDepositEvents$CreditDepositPaymentResultStatus = CreditDepositEvents$CreditDepositPaymentResultStatus.OK;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            creditDepositEvents$CreditDepositPaymentResultStatus = CreditDepositEvents$CreditDepositPaymentResultStatus.ERROR;
        }
        W(creditDepositEvents$CreditDepositPaymentResultStatus);
    }

    @Override // defpackage.z9f
    public void n() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.error.try_again.click", linkedHashMap);
    }

    public e0g o(MapFragment mapFragment, xm00 xm00Var) {
        mapFragment.getClass();
        xm00Var.getClass();
        return new e0g((zzf) this.a, (c0g) this.b, new qip(), mapFragment, xm00Var);
    }

    public b00 p() {
        return (b00) ((p8g) this.b).U.get();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public void provideAccuracyCircleStyle(boolean z, AccuracyCircleStyle accuracyCircleStyle) {
        accuracyCircleStyle.setFillColor(0);
        accuracyCircleStyle.setStrokeColor(0);
        accuracyCircleStyle.setStrokeWidth(0.0f);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider
    public void provideIconStyle(float f, boolean z, UserLocationIconStyle userLocationIconStyle) {
        ssr ssrVar = (ssr) this.a;
        UserLocationIconStyleData userLocationIconStyleData = (UserLocationIconStyleData) this.b;
        if (userLocationIconStyleData == null) {
            return;
        }
        userLocationIconStyleData.getArrowStyle().a(ssrVar, f, z, userLocationIconStyle.arrowStyle());
        userLocationIconStyleData.getPinStyle().a(ssrVar, f, z, userLocationIconStyle.pinStyle());
    }

    @Override // defpackage.z9f
    public void q() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.3ds.close.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void r() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.question.click", linkedHashMap);
    }

    public x22 s() {
        return (x22) ((z8g) this.a).y.get();
    }

    @Override // defpackage.z9f
    public void t() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.error.support.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void u() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.card_list.click", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void v() {
        rt1 rt1Var = ((AppAnalyticsReporter) this.b).p;
        CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) this.a;
        String scenario = creditDepositScreenParams.getScenario();
        String creditType = creditDepositScreenParams.getCreditType();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (scenario != null) {
            linkedHashMap.put("scenario", scenario);
        }
        linkedHashMap.put("credit_type", creditType);
        rt1Var.a.a("credit_deposit.payment_result.ok.click", linkedHashMap);
    }

    public at2 w() {
        return (at2) ((p8g) this.b).z.get();
    }

    public jn3 x() {
        return (jn3) ((p8g) this.b).X.get();
    }

    public com.yandex.messaging.internal.authorized.b y() {
        p8g p8gVar = (p8g) this.b;
        z8g z8gVar = p8gVar.b;
        return new com.yandex.messaging.internal.authorized.b(z8gVar.c(), i5m.a(p8gVar.w), new com.yandex.messaging.domain.j((el21) p8gVar.p.get(), (kse) z8gVar.f.get()), (xdf0) p8gVar.q.get(), p8gVar.m());
    }

    public d z() {
        return (d) ((p8g) this.b).W0.get();
    }

    public /* synthetic */ vbb(Object obj, Object obj2, boolean z) {
        this.a = obj2;
        this.b = obj;
    }

    public vbb(int i, lb10 lb10Var) {
        String str;
        this.a = lb10Var;
        if (i == 0) {
            str = "SYNCHRONOUS";
        } else if (i == 1) {
            str = "ASYNCHRONOUS";
        } else if (i != 2) {
            str = i != 3 ? "?" : "ASYNCHRONOUS_RECOVERABLE";
        } else {
            str = "SYNCHRONOUS_RECOVERABLE";
        }
        this.b = str;
    }

    public vbb(zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = kotlin.a.a(new lyc(0, this));
    }

    public vbb(ssr ssrVar) {
        this.a = ssrVar;
    }

    public vbb(String str, String str2) {
        this.a = str;
        this.b = str2;
        if (str.length() > 0) {
            return;
        }
        ny61.g("userId should not be empty");
        throw null;
    }

    public vbb(tls tlsVar) {
        this.a = tlsVar;
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ vbb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
