package defpackage;

import com.yandex.go.dto.response.Action$ChargersDiscounts;
import com.yandex.go.dto.response.Action$ChargersPlusHome;
import com.yandex.go.dto.response.Action$Charity;
import com.yandex.go.dto.response.Action$CityMode;
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
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.Action$Support;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.Action$WebApp;
import com.yandex.go.dto.response.Action$ZoomLayers;
import com.yandex.go.dto.response.ActionType;
import com.yandex.go.dto.response.a;
import com.yandex.go.dto.response.c1;
import com.yandex.go.dto.response.d0;
import com.yandex.go.dto.response.d1;
import com.yandex.go.dto.response.e;
import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.f;
import com.yandex.go.dto.response.g;
import com.yandex.go.dto.response.g0;
import com.yandex.go.dto.response.h1;
import com.yandex.go.dto.response.i;
import com.yandex.go.dto.response.i0;
import com.yandex.go.dto.response.j;
import com.yandex.go.dto.response.l1;
import com.yandex.go.dto.response.m0;
import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.q;
import com.yandex.go.dto.response.q0;
import com.yandex.go.dto.response.r0;
import com.yandex.go.dto.response.s;
import com.yandex.go.dto.response.s0;
import com.yandex.go.dto.response.t0;
import com.yandex.go.dto.response.u0;
import com.yandex.go.dto.response.w0;
import com.yandex.go.dto.response.x0;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class xx extends lnt {
    public static final xx f = new xx();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e0.INSTANCE.serializer(), qoi0.a(e0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        ActionType actionType = ActionType.REFRESH;
        f9 f9Var = new f9((String) h().invoke(actionType), m0.INSTANCE.serializer(), qoi0.a(m0.class));
        ActionType actionType2 = ActionType.CLOSE;
        f9 f9Var2 = new f9((String) h().invoke(actionType2), q.INSTANCE.serializer(), qoi0.a(q.class));
        ActionType actionType3 = ActionType.ROUTE_INPUT;
        f9 f9Var3 = new f9((String) h().invoke(actionType3), Action$RouteInput.Companion.serializer(), qoi0.a(Action$RouteInput.class));
        ActionType actionType4 = ActionType.MT_ROUTE_INPUT;
        f9 f9Var4 = new f9((String) h().invoke(actionType4), Action$MtRouteInput.Companion.serializer(), qoi0.a(Action$MtRouteInput.class));
        ActionType actionType5 = ActionType.NAVIGATOR;
        f9 f9Var5 = new f9((String) h().invoke(actionType5), d0.INSTANCE.serializer(), qoi0.a(d0.class));
        ActionType actionType6 = ActionType.SUPERAPP_SEARCH;
        f9 f9Var6 = new f9((String) h().invoke(actionType6), h1.INSTANCE.serializer(), qoi0.a(h1.class));
        ActionType actionType7 = ActionType.DEEPLINK;
        f9 f9Var7 = new f9((String) h().invoke(actionType7), Action$Deeplink.Companion.serializer(), qoi0.a(Action$Deeplink.class));
        ActionType actionType8 = ActionType.TAXI_SUMMARY_REDIRECT;
        f9 f9Var8 = new f9((String) h().invoke(actionType8), Action$SummaryRedirect.Companion.serializer(), qoi0.a(Action$SummaryRedirect.class));
        ActionType actionType9 = ActionType.TAXI_MAIN_SCREEN;
        f9 f9Var9 = new f9((String) h().invoke(actionType9), l1.INSTANCE.serializer(), qoi0.a(l1.class));
        ActionType actionType10 = ActionType.SERVICE_CATALOG;
        f9 f9Var10 = new f9((String) h().invoke(actionType10), d1.INSTANCE.serializer(), qoi0.a(d1.class));
        ActionType actionType11 = ActionType.DISCOVERY;
        f9 f9Var11 = new f9((String) h().invoke(actionType11), Action$Discovery.Companion.serializer(), qoi0.a(Action$Discovery.class));
        ActionType actionType12 = ActionType.DELIVERY_DASHBOARD;
        f9 f9Var12 = new f9((String) h().invoke(actionType12), s.INSTANCE.serializer(), qoi0.a(s.class));
        ActionType actionType13 = ActionType.TAXI_PROCEED;
        f9 f9Var13 = new f9((String) h().invoke(actionType13), m1.INSTANCE.serializer(), qoi0.a(m1.class));
        ActionType actionType14 = ActionType.SELECT_POINT_A;
        f9 f9Var14 = new f9((String) h().invoke(actionType14), c1.INSTANCE.serializer(), qoi0.a(c1.class));
        ActionType actionType15 = ActionType.CITY_MODE;
        f9 f9Var15 = new f9((String) h().invoke(actionType15), Action$CityMode.Companion.serializer(), qoi0.a(Action$CityMode.class));
        ActionType actionType16 = ActionType.INTERCITY_MAIN;
        f9 f9Var16 = new f9((String) h().invoke(actionType16), Action$IntercityMain.Companion.serializer(), qoi0.a(Action$IntercityMain.class));
        ActionType actionType17 = ActionType.SCOOTERS_QR_SCAN;
        f9 f9Var17 = new f9((String) h().invoke(actionType17), Action$ScootersQrScan.Companion.serializer(), qoi0.a(Action$ScootersQrScan.class));
        ActionType actionType18 = ActionType.SCOOTERS_SUPPORT;
        f9 f9Var18 = new f9((String) h().invoke(actionType18), Action$Support.Companion.serializer(), qoi0.a(Action$Support.class));
        ActionType actionType19 = ActionType.SCOOTERS_COUPONS;
        f9 f9Var19 = new f9((String) h().invoke(actionType19), r0.INSTANCE.serializer(), qoi0.a(r0.class));
        ActionType actionType20 = ActionType.SCOOTERS_PASSES;
        f9 f9Var20 = new f9((String) h().invoke(actionType20), u0.INSTANCE.serializer(), qoi0.a(u0.class));
        ActionType actionType21 = ActionType.SCOOTERS_SUPER_PASSES;
        f9 f9Var21 = new f9((String) h().invoke(actionType21), w0.INSTANCE.serializer(), qoi0.a(w0.class));
        ActionType actionType22 = ActionType.SCOOTERS_ACTIVE_SUPER_PASSES;
        f9 f9Var22 = new f9((String) h().invoke(actionType22), q0.INSTANCE.serializer(), qoi0.a(q0.class));
        ActionType actionType23 = ActionType.SCOOTERS_INSURANCE;
        f9 f9Var23 = new f9((String) h().invoke(actionType23), s0.INSTANCE.serializer(), qoi0.a(s0.class));
        ActionType actionType24 = ActionType.SCOOTERS_MOS_RU;
        f9 f9Var24 = new f9((String) h().invoke(actionType24), t0.INSTANCE.serializer(), qoi0.a(t0.class));
        ActionType actionType25 = ActionType.CHARGERS_QR_SCAN;
        f9 f9Var25 = new f9((String) h().invoke(actionType25), i.INSTANCE.serializer(), qoi0.a(i.class));
        ActionType actionType26 = ActionType.CHARGERS_SUBSCRIPTION;
        f9 f9Var26 = new f9((String) h().invoke(actionType26), j.INSTANCE.serializer(), qoi0.a(j.class));
        ActionType actionType27 = ActionType.PLUS_HOME;
        f9 f9Var27 = new f9((String) h().invoke(actionType27), Action$ChargersPlusHome.Companion.serializer(), qoi0.a(Action$ChargersPlusHome.class));
        ActionType actionType28 = ActionType.CHARGERS_DVIZH_SUBSCRIPTION;
        f9 f9Var28 = new f9((String) h().invoke(actionType28), e.INSTANCE.serializer(), qoi0.a(e.class));
        ActionType actionType29 = ActionType.CHARGERS_DISCOUNTS;
        f9 f9Var29 = new f9((String) h().invoke(actionType29), Action$ChargersDiscounts.Companion.serializer(), qoi0.a(Action$ChargersDiscounts.class));
        ActionType actionType30 = ActionType.CHARGERS_PARTNER_SUBSCRIPTION;
        f9 f9Var30 = new f9((String) h().invoke(actionType30), f.INSTANCE.serializer(), qoi0.a(f.class));
        ActionType actionType31 = ActionType.CHARGERS_PASSES;
        f9 f9Var31 = new f9((String) h().invoke(actionType31), g.INSTANCE.serializer(), qoi0.a(g.class));
        ActionType actionType32 = ActionType.CHARITY;
        f9 f9Var32 = new f9((String) h().invoke(actionType32), Action$Charity.Companion.serializer(), qoi0.a(Action$Charity.class));
        ActionType actionType33 = ActionType.WEB_APP_ACTION;
        f9 f9Var33 = new f9((String) h().invoke(actionType33), Action$WebApp.Companion.serializer(), qoi0.a(Action$WebApp.class));
        ActionType actionType34 = ActionType.SDC_ROUTE_SELECTION;
        f9 f9Var34 = new f9((String) h().invoke(actionType34), Action$SdcRouteSelection.Companion.serializer(), qoi0.a(Action$SdcRouteSelection.class));
        ActionType actionType35 = ActionType.OPEN_TARIFF_CARD;
        f9 f9Var35 = new f9((String) h().invoke(actionType35), g0.INSTANCE.serializer(), qoi0.a(g0.class));
        ActionType actionType36 = ActionType.OPEN_ORGANIZATIONS_LIST;
        f9 f9Var36 = new f9((String) h().invoke(actionType36), Action$OpenOrganizationsList.Companion.serializer(), qoi0.a(Action$OpenOrganizationsList.class));
        ActionType actionType37 = ActionType.ZOOM_LAYERS;
        f9 f9Var37 = new f9((String) h().invoke(actionType37), Action$ZoomLayers.Companion.serializer(), qoi0.a(Action$ZoomLayers.class));
        ActionType actionType38 = ActionType.SCROLL_UP;
        f9 f9Var38 = new f9((String) h().invoke(actionType38), x0.INSTANCE.serializer(), qoi0.a(x0.class));
        ActionType actionType39 = ActionType.EXPECTED_DESTINATION;
        f9 f9Var39 = new f9((String) h().invoke(actionType39), Action$TaxiExpectedDestination.Companion.serializer(), qoi0.a(Action$TaxiExpectedDestination.class));
        ActionType actionType40 = ActionType.ORDERS_LIST;
        f9 f9Var40 = new f9((String) h().invoke(actionType40), Action$OrdersList.Companion.serializer(), qoi0.a(Action$OrdersList.class));
        ActionType actionType41 = ActionType.MARKETPLACE;
        f9 f9Var41 = new f9((String) h().invoke(actionType41), Action$Marketplace.Companion.serializer(), qoi0.a(Action$Marketplace.class));
        ActionType actionType42 = ActionType.CAR_TECH;
        f9 f9Var42 = new f9((String) h().invoke(actionType42), a.INSTANCE.serializer(), qoi0.a(a.class));
        ActionType actionType43 = ActionType.ORGANIZATIONS_DISCOVERY;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, f9Var8, f9Var9, f9Var10, f9Var11, f9Var12, f9Var13, f9Var14, f9Var15, f9Var16, f9Var17, f9Var18, f9Var19, f9Var20, f9Var21, f9Var22, f9Var23, f9Var24, f9Var25, f9Var26, f9Var27, f9Var28, f9Var29, f9Var30, f9Var31, f9Var32, f9Var33, f9Var34, f9Var35, f9Var36, f9Var37, f9Var38, f9Var39, f9Var40, f9Var41, f9Var42, new f9((String) h().invoke(actionType43), i0.INSTANCE.serializer(), qoi0.a(i0.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return ActionType.Companion.serializer();
    }
}
