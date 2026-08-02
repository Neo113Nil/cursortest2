package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.b;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.cxq0;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;

/* loaded from: classes5.dex */
public abstract class xe91 {
    public static final byte[] a = {124, -113, 24, BlobHeaderStructure.BLOB_VERSION, -65, Alerts.alert_no_application_protocol, 81, -116};
    public static final byte[] b = {30, -18, 118, 75, -32, PKIBody._CANN, Alerts.alert_export_restriction, -19, DerValue.tag_GeneralString, -22};

    public static final void a(f530 f530Var, w49 w49Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1141304760);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(w49Var) : btsVar.e(w49Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                View inflate = LayoutInflater.from(context).inflate(clh0.hub_cashback_view, (ViewGroup) null, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    return;
                }
                final GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                final cxq0 a2 = ((t0w0) w49Var).a(goFrameLayout);
                WeakHashMap weakHashMap = b.a;
                if (goFrameLayout.isAttachedToWindow()) {
                    a2.D();
                } else {
                    goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.VerticalHubHeaderContentKt$CashbackBadgeContent$lambda$0$0$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            goFrameLayout.removeOnAttachStateChangeListener(this);
                            ((cxq0) a2).D();
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                }
                if (goFrameLayout.isAttachedToWindow()) {
                    goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.VerticalHubHeaderContentKt$CashbackBadgeContent$lambda$0$0$$inlined$doOnDetach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            goFrameLayout.removeOnAttachStateChangeListener(this);
                            ((cxq0) a2).z();
                        }
                    });
                } else {
                    a2.z();
                }
                btsVar.o0(goFrameLayout);
                obj = goFrameLayout;
            }
            GoFrameLayout goFrameLayout2 = (GoFrameLayout) obj;
            boolean e = btsVar.e(goFrameLayout2) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new e331(i3, tlsVar, goFrameLayout2);
                btsVar.o0(Q2);
            }
            c(f530Var, (tls) Q2, wwg.S(-960518177, true, new l131(i4, goFrameLayout2), btsVar), btsVar, (i2 & 14) | 384);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(f530Var, w49Var, tlsVar, i, 11);
        }
    }

    public static final void b(final n9j n9jVar, fid fidVar, final int i) {
        final n9j n9jVar2;
        final int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(313054330);
        int i3 = i | (btsVar.k(n9jVar) ? 4 : 2);
        final int i4 = 0;
        if (!btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            n9jVar2 = n9jVar;
            i2 = 1;
            btsVar.Y();
        } else {
            if (n9jVar.a.length() == 0 || n9jVar.b.a.isEmpty()) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls(n9jVar, i, i4) { // from class: g9j
                        public final /* synthetic */ int a;
                        public final /* synthetic */ n9j b;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            n9j n9jVar3 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    xe91.b(n9jVar3, fidVar2, vng.O(1));
                                    break;
                                default:
                                    xe91.b(n9jVar3, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = false;
            jeb1.f(n9jVar.a, an91.o(c530Var, 18.0f, 5.0f, 0.0f, 5.0f, 4), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.b, btsVar, 432, 0, 16376);
            btsVar = btsVar;
            f530 c2 = ljs0.c(c530Var, 1.0f);
            l690 d2 = an91.d(16.0f, 0.0f, 16.0f, 16.0f, 2);
            i2 = 1;
            i43 i43Var = new i43(8.0f, true, new quz(11));
            if ((i3 & 14) == 4) {
                z = true;
            }
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                n9jVar2 = n9jVar;
                Q = new zvi(3, n9jVar2);
                btsVar.o0(Q);
            } else {
                n9jVar2 = n9jVar;
            }
            adb1.b(c2, null, d2, i43Var, null, null, false, null, (tls) Q, btsVar, 24966, 490);
            btsVar.t(true);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(n9jVar2, i, i2) { // from class: g9j
                public final /* synthetic */ int a;
                public final /* synthetic */ n9j b;

                {
                    this.a = i2;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    n9j n9jVar3 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            xe91.b(n9jVar3, fidVar2, vng.O(1));
                            break;
                        default:
                            xe91.b(n9jVar3, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void c(f530 f530Var, tls tlsVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1846477809);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            aVar.invoke(btsVar, Integer.valueOf((i2 >> 6) & 14));
            f530 b2 = cj6.a.b(c530.a);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ip1(3, tlsVar);
                btsVar.o0(Q);
            }
            pi6.a(exw0.a(b2, zy11.a, (PointerInputEventHandler) Q), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(f530Var, tlsVar, aVar, i, 13);
        }
    }

    public static final void d(f530 f530Var, frv0 frv0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1118865200);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(frv0Var) : btsVar.e(frv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout.setClipChildren(false);
                frameLayout.setClipToOutline(false);
                ViewStub viewStub = new ViewStub(context);
                frameLayout.addView(viewStub);
                ((irv0) frv0Var.a(viewStub)).h.setImportantForAccessibility(4);
                btsVar.o0(frameLayout);
                obj = frameLayout;
            }
            FrameLayout frameLayout2 = (FrameLayout) obj;
            boolean e = btsVar.e(frameLayout2) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new e331(5, tlsVar, frameLayout2);
                btsVar.o0(Q2);
            }
            c(f530Var, (tls) Q2, wwg.S(-293732249, true, new l131(i3, frameLayout2), btsVar), btsVar, (i2 & 14) | 384);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(f530Var, frv0Var, tlsVar, i, 12);
        }
    }

    public static final void e(f530 f530Var, jxu jxuVar, w49 w49Var, frv0 frv0Var, tls tlsVar, fid fidVar, int i) {
        uo5 uo5Var = x4c.w;
        bts btsVar = (bts) fidVar;
        btsVar.g0(367668716);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(jxuVar) ? 32 : 16) | (btsVar.k(w49Var) ? 256 : 128) | (btsVar.k(frv0Var) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            uo5 uo5Var2 = x4c.b;
            z910 d = pi6.d(uo5Var2, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            if (jxuVar.equals(gxu.a)) {
                btsVar.e0(-1549279978);
                btsVar.t(false);
            } else {
                boolean equals = jxuVar.equals(hxu.a);
                c530 c530Var = c530.a;
                cj6 cj6Var = cj6.a;
                if (equals) {
                    btsVar.e0(-782990855);
                    a(cj6Var.a(c530Var, uo5Var), w49Var, tlsVar, btsVar, ((i2 >> 6) & 896) | ((i2 >> 3) & 112));
                    btsVar.t(false);
                } else {
                    if (!jxuVar.equals(ixu.a)) {
                        throw unr0.y(-1549281018, btsVar, false);
                    }
                    btsVar.e0(-782756278);
                    f530 a2 = cj6Var.a(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), uo5Var2);
                    int i3 = i2 >> 6;
                    d(a2, frv0Var, tlsVar, btsVar, i3 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                    a(cj6Var.a(c530Var, uo5Var), w49Var, tlsVar, btsVar, ((i2 >> 3) & 112) | (i3 & 896));
                    btsVar.t(false);
                }
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ub31(i, 1, tlsVar, f530Var, jxuVar, w49Var, frv0Var);
        }
    }

    public static final CashbackCardContext f(PaymentsScreen paymentsScreen) {
        switch (oba0.a[paymentsScreen.ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 15:
            case 16:
                return CashbackCardContext.SUMMARY;
            case 2:
                return CashbackCardContext.MENU_PAYMENT_METHODS_PROMO;
            case 3:
            case 9:
                return CashbackCardContext.ORDER;
            case 5:
                return CashbackCardContext.SCOOTERS;
            case 11:
                return CashbackCardContext.PLACES;
            case 12:
                return CashbackCardContext.CHARGERS;
            case 13:
                return CashbackCardContext.SUPERAPP;
            case 14:
                return CashbackCardContext.DRIVE_PAYMENTS;
            default:
                w511.b();
                return null;
        }
    }

    public static final YbScreenSource g(PaymentsScreen paymentsScreen) {
        switch (oba0.a[paymentsScreen.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 10:
            case 16:
                return YbScreenSource.SUMMARY;
            case 2:
                return YbScreenSource.MENU;
            case 3:
            case 9:
                return YbScreenSource.RIDE;
            case 4:
                return YbScreenSource.OVERDRAFT;
            case 5:
            case 11:
            case 12:
            case 13:
                return YbScreenSource.LPM;
            case 14:
                return YbScreenSource.DRIVE;
            case 15:
                return YbScreenSource.WEB_PLUS_HOME;
            default:
                w511.b();
                return null;
        }
    }

    public static final PaymentMethodsAnalytics$PaymentMethodsScreen h(PaymentsScreen paymentsScreen) {
        switch (oba0.a[paymentsScreen.ordinal()]) {
            case 1:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Summary;
            case 2:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Menu;
            case 3:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Ride;
            case 4:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Debts;
            case 5:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Scooters;
            case 6:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Intercity;
            case 7:
            case 8:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Transport;
            case 9:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.DeliveryOrder;
            case 10:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Delivery;
            case 11:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Places;
            case 12:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Chargers;
            case 13:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Superapp;
            case 14:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Drive;
            case 15:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Plus;
            case 16:
                return PaymentMethodsAnalytics$PaymentMethodsScreen.Porttech;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final PaymentMethodsAnalytics$PaymentMethodsScreen i(String str) {
        Object obj;
        Iterator<E> it = PaymentMethodsAnalytics$PaymentMethodsScreen.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((PaymentMethodsAnalytics$PaymentMethodsScreen) obj).getEventValue(), str)) {
                break;
            }
        }
        PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen = (PaymentMethodsAnalytics$PaymentMethodsScreen) obj;
        if (paymentMethodsAnalytics$PaymentMethodsScreen != null) {
            return paymentMethodsAnalytics$PaymentMethodsScreen;
        }
        switch (str.hashCode()) {
            case -762633907:
                if (str.equals("overdraft")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Debts;
                }
                break;
            case -760108900:
                if (str.equals("intercity_dashboard")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Intercity;
                }
                break;
            case -324206033:
                if (str.equals("delivery_form")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Delivery;
                }
                break;
            case 107369:
                if (str.equals("lpm")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Superapp;
                }
                break;
            case 106006350:
                if (str.equals("order")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Ride;
                }
                break;
            case 235251457:
                if (str.equals("address_selection")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Summary;
                }
                break;
            case 479749794:
                if (str.equals("delivery_tracking")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.DeliveryOrder;
                }
                break;
            case 1084755088:
                if (str.equals("transport_summary")) {
                    return PaymentMethodsAnalytics$PaymentMethodsScreen.Transport;
                }
                break;
        }
        jst.e.q("Unknown screen for evgen analytics: ".concat(str));
        return PaymentMethodsAnalytics$PaymentMethodsScreen.Summary;
    }
}
