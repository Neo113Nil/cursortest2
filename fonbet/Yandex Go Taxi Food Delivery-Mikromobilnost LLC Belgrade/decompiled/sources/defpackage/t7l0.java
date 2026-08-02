package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.routestops.v2.ui.c;
import com.yandex.go.scooters.passes.purchase.packages.f;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import defpackage.ao;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.f030;
import defpackage.fub;
import defpackage.gw00;
import defpackage.kcz0;
import defpackage.p1b;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class t7l0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7l0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str;
        d561 themeSelectionDelegate$lambda$5;
        zy11 updateState$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                dms dmsVar = (dms) obj4;
                x7l0 x7l0Var = (x7l0) obj3;
                String str2 = (String) obj;
                hyq hyqVar = (hyq) obj2;
                Integer valueOf = Integer.valueOf(x7l0Var.c);
                if (jl40.l(hyqVar, gyq.a)) {
                    str = x7l0Var.g.i;
                } else if (jl40.l(hyqVar, fyq.a)) {
                    str = x7l0Var.k.i;
                } else if (jl40.l(hyqVar, dyq.a)) {
                    str = x7l0Var.j.i;
                } else if (jl40.l(hyqVar, cyq.a)) {
                    str = x7l0Var.i.i;
                } else {
                    if (!jl40.l(hyqVar, eyq.a)) {
                        w511.b();
                        return null;
                    }
                    str = x7l0Var.h.i;
                }
                dmsVar.invoke(valueOf, str2, hyqVar, str, x7l0Var.s);
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                c.a((n4m) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                sua1.a((tgl0) obj4, (sls) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 3:
                n351 n351Var = (n351) obj4;
                final fub fubVar = (fub) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    tgl0 tgl0Var = (tgl0) n351Var;
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new sls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.e
                            @Override // defpackage.sls
                            public final Object invoke() {
                                final d dVar = (d) fub.this.d;
                                dVar.h.x("DeliveryRover.Tracking.OpenLocker.Tapped", null);
                                List a = dVar.f.a();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : a) {
                                    if (obj5 instanceof ao) {
                                        arrayList.add(obj5);
                                    }
                                }
                                ao aoVar = (ao) kotlin.collections.a.R(arrayList);
                                if (aoVar != null) {
                                    final String str3 = aoVar.b;
                                    f030 f030Var = aoVar.d;
                                    final Object obj6 = aoVar.c;
                                    if (f030Var != null) {
                                        p1b p1bVar = dVar.g;
                                        sls slsVar = new sls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.a
                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                d dVar2 = d.this;
                                                kcz0 kcz0Var = dVar2.h;
                                                String str4 = str3;
                                                kcz0Var.x("DeliveryRover.Tracking.ModalWindow.ButtonClicked", gw00.e(new Pair("action", str4)));
                                                tje.N(bvf0.a(dVar2.e.b), null, null, new RoverStateHolder$submitRoverAction$1(dVar2, obj6, str4, null), 3);
                                                return zy11.a;
                                            }
                                        };
                                        final int i2 = 0;
                                        sls slsVar2 = new sls() { // from class: ahl0
                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int i3 = i2;
                                                zy11 zy11Var2 = zy11.a;
                                                d dVar2 = dVar;
                                                switch (i3) {
                                                    case 0:
                                                        dVar2.h.x("DeliveryRover.Tracking.ModalWindow.ButtonClicked", gw00.e(new Pair("action", "wait")));
                                                        break;
                                                    default:
                                                        dVar2.h.x("DeliveryRover.Tracking.ModalWindow.Shown", null);
                                                        break;
                                                }
                                                return zy11Var2;
                                            }
                                        };
                                        final int i3 = 1;
                                        p1bVar.j(f030Var, ButtonType.NONE, slsVar, slsVar2, new sls() { // from class: ahl0
                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int i32 = i3;
                                                zy11 zy11Var2 = zy11.a;
                                                d dVar2 = dVar;
                                                switch (i32) {
                                                    case 0:
                                                        dVar2.h.x("DeliveryRover.Tracking.ModalWindow.ButtonClicked", gw00.e(new Pair("action", "wait")));
                                                        break;
                                                    default:
                                                        dVar2.h.x("DeliveryRover.Tracking.ModalWindow.Shown", null);
                                                        break;
                                                }
                                                return zy11Var2;
                                            }
                                        }, new bgc(12));
                                    } else {
                                        tje.N(bvf0.a(dVar.e.b), null, null, new RoverStateHolder$submitRoverAction$1(dVar, obj6, str3, null), 3);
                                    }
                                }
                                return zy11.a;
                            }
                        };
                        btsVar.o0(Q);
                    }
                    sua1.a(tgl0Var, (sls) Q, btsVar, 48);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                nwa1.e((cwl0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                nwa1.c((dwl0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                nwa1.b((bwl0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                twa1.c((exl0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                eyl0 eyl0Var = (eyl0) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qy20.a(null, v2o.a, ymo.a, false, wwg.S(-586209113, true, new u5(11, eyl0Var, tlsVar), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 9);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                fu91.d((cyl0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                kxa1.a((f47) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                return new t9m0((Date) obj4, (MoneyEntity) obj3, (SavingsActionStatus) obj, (Throwable) obj2);
            case 12:
                themeSelectionDelegate$lambda$5 = SavingsAccountThemeSelectorView.themeSelectionDelegate$lambda$5((Context) obj4, (SavingsAccountThemeSelectorView) obj3, (LayoutInflater) obj, (ViewGroup) obj2);
                return themeSelectionDelegate$lambda$5;
            case 13:
                com.yandex.payment.sdk.ui.payment.sbp.d dVar = (com.yandex.payment.sdk.ui.payment.sbp.d) obj4;
                Uri uri = (Uri) obj;
                String str3 = (String) obj2;
                dVar.I = new Pair(uri, str3);
                dVar.Z((mp4) obj3, uri, str3);
                return zy11Var;
            case 14:
                a aVar = (a) obj4;
                ckm0 ckm0Var = (ckm0) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar3);
                    r1b0 o = btsVar3.o();
                    f530 d2 = b.d(btsVar3, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.f, d);
                    qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                    wls wlsVar = androidx.compose.ui.node.d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar3, S, wlsVar);
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.d, d2);
                    aVar.invoke(ckm0Var, btsVar3, 6);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.a.e((wmm0) obj4, (tls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 16:
                pav pavVar = (pav) obj4;
                ScootersCardV2.ChargeConfig chargeConfig = (ScootersCardV2.ChargeConfig) obj3;
                View inflate = ((LayoutInflater) obj).inflate(srh0.scooter_on_card_item, (ViewGroup) obj2, false);
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                int i2 = qfh0.remaining_charge;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null) {
                    i2 = qfh0.scooter_charged_icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                    if (goImageView != null) {
                        i2 = qfh0.vehicle_number_text_view;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                        if (robotoTextView2 != null) {
                            return new wpm0(new ipm0(goConstraintLayout, goImageView, robotoTextView, robotoTextView2), pavVar, chargeConfig);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 17:
                ((Integer) obj2).getClass();
                e0b1.a((urm0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                f0b1.a((hsm0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                com.yandex.go.scooters.passes.active.v3.c.d((fum0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                l0b1.a((pum0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                com.yandex.go.scooters.ignition.controlling.d.b((rqn0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                n2b1.e((run0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                updateState$lambda$1 = ScootersNewControlPanelView.updateState$lambda$1((ScootersNewControlPanelView) obj4, (ahn0) obj3, (kfn0) obj, ((Boolean) obj2).booleanValue());
                return updateState$lambda$1;
            case 24:
                ((Integer) obj2).getClass();
                f.d((g8o0) obj4, (oip0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                pao0.i((yao0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.scooters.parking.d.d((aco0) obj4, (a) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                u3b1.b((xjo0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                j4b1.a((wxo0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                lzo0.h((vzo0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ t7l0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
