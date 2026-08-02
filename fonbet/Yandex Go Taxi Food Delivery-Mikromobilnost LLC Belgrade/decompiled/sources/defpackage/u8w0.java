package defpackage;

import com.yandex.go.dto.response.Action$ChargersDiscounts;
import com.yandex.go.dto.response.Action$ChargersPlusHome;
import com.yandex.go.dto.response.Action$Charity;
import com.yandex.go.dto.response.Action$Deeplink;
import com.yandex.go.dto.response.Action$Discovery;
import com.yandex.go.dto.response.Action$IntercityMain;
import com.yandex.go.dto.response.Action$Marketplace;
import com.yandex.go.dto.response.Action$MtRouteInput;
import com.yandex.go.dto.response.Action$OpenOrganizationsList;
import com.yandex.go.dto.response.Action$OrdersList;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.Action$ScootersQrScan;
import com.yandex.go.dto.response.Action$SdcRouteSelection;
import com.yandex.go.dto.response.Action$Support;
import com.yandex.go.dto.response.Action$WebApp;
import com.yandex.go.dto.response.Action$ZoomLayers;
import com.yandex.go.dto.response.a;
import com.yandex.go.dto.response.c1;
import com.yandex.go.dto.response.d0;
import com.yandex.go.dto.response.d1;
import com.yandex.go.dto.response.e;
import com.yandex.go.dto.response.f;
import com.yandex.go.dto.response.g;
import com.yandex.go.dto.response.h1;
import com.yandex.go.dto.response.i;
import com.yandex.go.dto.response.i0;
import com.yandex.go.dto.response.j;
import com.yandex.go.dto.response.l1;
import com.yandex.go.dto.response.m0;
import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.q;
import com.yandex.go.dto.response.q0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.dto.response.r0;
import com.yandex.go.dto.response.s;
import com.yandex.go.dto.response.s0;
import com.yandex.go.dto.response.t0;
import com.yandex.go.dto.response.u0;
import com.yandex.go.dto.response.w0;
import com.yandex.go.dto.response.x0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class u8w0 implements t8w0 {
    public final o1s0 a;
    public final rxr0 b;
    public final ylp0 c;
    public final q3s0 d;

    public u8w0(o1s0 o1s0Var, rxr0 rxr0Var, ylp0 ylp0Var, q3s0 q3s0Var) {
        this.a = o1s0Var;
        this.b = rxr0Var;
        this.c = ylp0Var;
        this.d = q3s0Var;
    }

    public final Object a(q1 q1Var, SuspendLambda suspendLambda) {
        boolean z = q1Var instanceof Action$Deeplink;
        rxr0 rxr0Var = this.b;
        if (z) {
            rxr0Var.b(new mwr0(((Action$Deeplink) q1Var).a));
        } else if (q1Var instanceof Action$Discovery) {
            rxr0Var.b(new owr0((Action$Discovery) q1Var, this.a.a()));
        } else if (q1Var instanceof Action$Support) {
            rxr0Var.b(new ixr0(((Action$Support) q1Var).a));
        } else if (q1Var instanceof Action$Charity) {
            Action$Charity action$Charity = (Action$Charity) q1Var;
            rxr0Var.b(new kwr0(action$Charity.a, action$Charity.b));
        } else if (q1Var instanceof Action$WebApp) {
            rxr0Var.b(new kxr0());
        } else if (q1Var instanceof Action$RouteInput) {
            Action$RouteInput action$RouteInput = (Action$RouteInput) q1Var;
            rxr0Var.b(new nxr0(Action$RouteInput.b(action$RouteInput, action$RouteInput.a, action$RouteInput.b, action$RouteInput.c, null, 8)));
        } else if (q1Var instanceof Action$MtRouteInput) {
            rxr0Var.b(new twr0());
        } else if (q1Var instanceof d0) {
            rxr0Var.b(uwr0.a);
        } else if (q1Var instanceof Action$ZoomLayers) {
            rxr0Var.b(new r400(11));
        } else if (q1Var instanceof Action$SdcRouteSelection) {
            Action$SdcRouteSelection action$SdcRouteSelection = (Action$SdcRouteSelection) q1Var;
            this.c.a(mlp0.b(action$SdcRouteSelection), new tpt0(21, this, action$SdcRouteSelection));
        } else if (q1Var instanceof Action$OrdersList) {
            rxr0Var.b(new mxr0((Action$OrdersList) q1Var));
        } else {
            if (q1Var instanceof m0) {
                return this.d.a.emit(q1Var, suspendLambda);
            }
            if ((q1Var instanceof m1) || jl40.l(q1Var, c1.INSTANCE)) {
                rxr0Var.b(pxr0.a);
            } else if (q1Var instanceof s) {
                rxr0Var.b(nwr0.a);
            } else if (q1Var instanceof Action$Marketplace) {
                rxr0Var.b(new swr0(((Action$Marketplace) q1Var).a));
            } else if (q1Var instanceof i0) {
                rxr0Var.b(wwr0.a);
            } else if (q1Var instanceof Action$OpenOrganizationsList) {
                Action$OpenOrganizationsList action$OpenOrganizationsList = (Action$OpenOrganizationsList) q1Var;
                rxr0Var.b(new xwr0(action$OpenOrganizationsList.a, action$OpenOrganizationsList.b, action$OpenOrganizationsList.c, r501.p(gvj.b, action$OpenOrganizationsList.d)));
            } else if (q1Var instanceof Action$ScootersQrScan) {
                rxr0Var.b(dxr0.a);
            } else if (q1Var instanceof r0) {
                rxr0Var.b(cxr0.a);
            } else if (q1Var instanceof u0) {
                rxr0Var.b(bxr0.a);
            } else if (q1Var instanceof w0) {
                rxr0Var.b(exr0.a);
            } else if (q1Var instanceof q0) {
                rxr0Var.b(ywr0.a);
            } else if (q1Var instanceof s0) {
                rxr0Var.b(zwr0.a);
            } else if (q1Var instanceof t0) {
                rxr0Var.b(axr0.a);
            } else if (q1Var instanceof d1) {
                rxr0Var.b(fxr0.a);
            } else if (q1Var instanceof i) {
                rxr0Var.b(iwr0.a);
            } else if (q1Var instanceof j) {
                rxr0Var.b(jwr0.a);
            } else if (q1Var instanceof e) {
                rxr0Var.b(ewr0.a);
            } else if (q1Var instanceof Action$ChargersDiscounts) {
                Action$ChargersDiscounts.ChargersDiscountIdentifierDto chargersDiscountIdentifierDto = ((Action$ChargersDiscounts) q1Var).a;
                rxr0Var.b(new dwr0(chargersDiscountIdentifierDto != null ? chargersDiscountIdentifierDto.getA() : null, chargersDiscountIdentifierDto != null ? chargersDiscountIdentifierDto.getB() : null));
            } else if (q1Var instanceof Action$ChargersPlusHome) {
                rxr0Var.b(new hwr0(((Action$ChargersPlusHome) q1Var).a));
            } else if (q1Var instanceof f) {
                rxr0Var.b(fwr0.a);
            } else if (q1Var instanceof g) {
                rxr0Var.b(gwr0.a);
            } else if (q1Var instanceof q) {
                rxr0Var.b(bei.P);
            } else if (q1Var instanceof x0) {
                rxr0Var.b(zvr0.a);
            } else if (q1Var instanceof l1) {
                rxr0Var.b(jxr0.a);
            } else if (q1Var instanceof Action$IntercityMain) {
                rxr0Var.b(new rwr0((Action$IntercityMain) q1Var));
            } else if (q1Var instanceof a) {
                rxr0Var.b(cwr0.a);
            } else if (q1Var instanceof h1) {
                rxr0Var.b(hxr0.a);
            } else {
                jst.e.s(new IllegalArgumentException("Unsupported action " + q1Var.a()));
            }
        }
        return zy11.a;
    }
}
