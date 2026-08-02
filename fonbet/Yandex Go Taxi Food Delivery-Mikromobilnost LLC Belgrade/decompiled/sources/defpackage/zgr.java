package defpackage;

import com.yandex.go.dto.response.Action$CityMode;
import com.yandex.go.dto.response.Action$Discovery;
import com.yandex.go.dto.response.Action$IntercityMain;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding;
import com.yandex.go.flex.common.api.actions.CityModeAction;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.flex.common.api.actions.DiscoveryAction;
import com.yandex.go.flex.common.api.actions.IntercityMainAction;
import com.yandex.go.flex.common.api.actions.MarketPlaceAction;
import com.yandex.go.flex.common.api.actions.OnboardingDeeplinkNavigationAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationCardAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationsListAction;
import com.yandex.go.flex.common.api.actions.ShowOnboardingAction;
import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction;
import com.yandex.go.flex.common.api.actions.WebCustomTabsAction;
import com.yandex.go.flex.common.api.actions.e0;
import com.yandex.go.flex.common.api.actions.i0;
import com.yandex.go.flex.common.api.actions.l;
import com.yandex.go.flex.common.api.actions.l0;
import com.yandex.go.flex.common.api.actions.n;
import com.yandex.go.flex.common.api.actions.r;
import com.yandex.go.flex.common.api.actions.r0;
import com.yandex.go.flex.common.api.actions.s0;
import com.yandex.go.flex.common.api.actions.v;
import com.yandex.go.flex.common.api.actions.v0;
import com.yandex.go.flex.common.api.actions.w;
import com.yandex.go.flex.common.api.actions.z;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Clarification;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Coordinates;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressesDto;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.c;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.d;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.e;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class zgr implements dw {
    public final rxr0 a;
    public final z0w0 b;
    public final n170 c;
    public final w030 w;
    public final h3y x;
    public final yvf0 y;

    public zgr(rxr0 rxr0Var, z0w0 z0w0Var, n170 n170Var, w030 w030Var, h3y h3yVar, yvf0 yvf0Var) {
        this.a = rxr0Var;
        this.b = z0w0Var;
        this.c = n170Var;
        this.w = w030Var;
        this.x = h3yVar;
        this.y = yvf0Var;
    }

    public static e a(r rVar) {
        if (rVar instanceof IntercityMainAction.Addresses.Coordinates) {
            return new AddressDto$Coordinates(((IntercityMainAction.Addresses.Coordinates) rVar).c);
        }
        if (rVar instanceof IntercityMainAction.Addresses.Clarification) {
            return new AddressDto$Clarification(((IntercityMainAction.Addresses.Clarification) rVar).c);
        }
        if (rVar instanceof v) {
            return c.INSTANCE;
        }
        if (rVar instanceof w) {
            return d.INSTANCE;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.dw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void handle(n nVar, n6u n6uVar) {
        u45 e;
        SummaryRedirectActionModel.State state;
        Action$RouteInput.AdditionalActionType additionalActionType;
        boolean z = nVar instanceof r0;
        rxr0 rxr0Var = this.a;
        if (z) {
            rxr0Var.b(jxr0.a);
            return;
        }
        if (nVar instanceof TaxiRouteInputAction) {
            TaxiRouteInputAction taxiRouteInputAction = (TaxiRouteInputAction) nVar;
            String str = taxiRouteInputAction.b;
            String str2 = taxiRouteInputAction.c;
            int i = ygr.a[taxiRouteInputAction.d.getA().ordinal()];
            if (i == 1) {
                additionalActionType = Action$RouteInput.AdditionalActionType.PREORDER;
            } else if (i == 2) {
                additionalActionType = Action$RouteInput.AdditionalActionType.ORDER_TO_ANOTHER;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                additionalActionType = Action$RouteInput.AdditionalActionType.NONE;
            }
            rxr0Var.b(new nxr0(new Action$RouteInput(str, str2, new Action$RouteInput.AdditionalAction(additionalActionType), 8)));
            return;
        }
        if (nVar instanceof s0) {
            rxr0Var.b(pxr0.a);
            return;
        }
        if (nVar instanceof l0) {
            rxr0Var.b(fxr0.a);
            return;
        }
        if (nVar instanceof l) {
            rxr0Var.b(nwr0.a);
            return;
        }
        if (nVar instanceof z) {
            rxr0Var.b(uwr0.a);
            return;
        }
        if (nVar instanceof com.yandex.go.flex.common.api.actions.d) {
            rxr0Var.b(cwr0.a);
            return;
        }
        if (nVar instanceof DiscoveryAction) {
            DiscoveryAction discoveryAction = (DiscoveryAction) nVar;
            rxr0Var.b(new owr0(new Action$Discovery(discoveryAction.b, discoveryAction.c), yaf0.b));
            return;
        }
        if (nVar instanceof CityModeAction) {
            CityModeAction cityModeAction = (CityModeAction) nVar;
            rxr0Var.b(new lwr0(new Action$CityMode(8, cityModeAction.b, cityModeAction.c, cityModeAction.d)));
            return;
        }
        if (nVar instanceof MarketPlaceAction) {
            rxr0Var.b(new swr0(((MarketPlaceAction) nVar).b));
            return;
        }
        if (nVar instanceof IntercityMainAction) {
            IntercityMainAction intercityMainAction = (IntercityMainAction) nVar;
            IntercityMainAction.Addresses addresses = intercityMainAction.c;
            rxr0Var.b(new rwr0(new Action$IntercityMain(intercityMainAction.b, new AddressesDto(a(addresses.a), a(addresses.b)))));
            return;
        }
        if (nVar instanceof SummaryRedirectAction) {
            SummaryRedirectAction summaryRedirectAction = (SummaryRedirectAction) nVar;
            int i2 = ygr.b[summaryRedirectAction.d.ordinal()];
            if (i2 == 1) {
                state = SummaryRedirectActionModel.State.COLLAPSED;
            } else if (i2 == 2) {
                state = SummaryRedirectActionModel.State.EXPANDED;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                state = SummaryRedirectActionModel.State.ANCHORED;
            }
            SummaryRedirectActionModel.State state2 = state;
            SummaryRedirectAction.Destination destination = summaryRedirectAction.f;
            rxr0Var.b(new awr0(new SummaryRedirectActionModel(summaryRedirectAction.b, summaryRedirectAction.c, state2, summaryRedirectAction.e, destination != null ? new SummaryRedirectActionModel.a(8, new zzs(destination.getA().a, destination.getA().b, 0, null, null, 28), destination.getB(), destination.getB()) : null, summaryRedirectAction.g, summaryRedirectAction.h, new vnv0(0), null, 256), q121.h, new zi(21)));
            return;
        }
        if (nVar instanceof ActionWithOnTapOnboarding) {
            ActionWithOnTapOnboarding actionWithOnTapOnboarding = (ActionWithOnTapOnboarding) nVar;
            t7j t7jVar = new t7j(9, this, actionWithOnTapOnboarding, n6uVar);
            ActionWithOnTapOnboarding.Onboarding onboarding = actionWithOnTapOnboarding.b;
            String str3 = onboarding.a;
            ActionWithOnTapOnboarding.Onboarding.ShowPolicy showPolicy = onboarding.b;
            if (evu0.J(str3)) {
                t7jVar.invoke();
                return;
            }
            if (evu0.J(showPolicy.a)) {
                t7jVar.invoke();
                return;
            }
            CountersShowPolicy countersShowPolicy = new CountersShowPolicy(showPolicy.a, showPolicy.b, showPolicy.c, 4);
            n170 n170Var = this.c;
            if (n170Var.w.b.contains(countersShowPolicy.getA()) || n170Var.e(countersShowPolicy)) {
                t7jVar.invoke();
                return;
            } else {
                n170Var.b(countersShowPolicy);
                rxr0Var.b(new gxr0(t7jVar, onboarding.a));
                return;
            }
        }
        if (nVar instanceof i0) {
            rxr0Var.b(wwr0.a);
            return;
        }
        if (nVar instanceof OpenOrganizationsListAction) {
            OpenOrganizationsListAction openOrganizationsListAction = (OpenOrganizationsListAction) nVar;
            rxr0Var.b(new xwr0(openOrganizationsListAction.b, openOrganizationsListAction.c, openOrganizationsListAction.d, r501.p(fvj.b, openOrganizationsListAction.e)));
            return;
        }
        if (nVar instanceof WebCustomTabsAction) {
            WebCustomTabsAction webCustomTabsAction = (WebCustomTabsAction) nVar;
            rxr0Var.b(new lxr0(webCustomTabsAction.b, webCustomTabsAction.c));
            return;
        }
        if (nVar instanceof OpenOrganizationCardAction) {
            OpenOrganizationCardAction openOrganizationCardAction = (OpenOrganizationCardAction) nVar;
            rxr0Var.b(new vwr0(openOrganizationCardAction.b, openOrganizationCardAction.c, r501.p(qvj.b, openOrganizationCardAction.f), openOrganizationCardAction.d, openOrganizationCardAction.e, openOrganizationCardAction.g));
            return;
        }
        if (nVar instanceof OnboardingDeeplinkNavigationAction) {
            n6uVar.c.b(new DeeplinkNavigationAction(((OnboardingDeeplinkNavigationAction) nVar).b), n6uVar.b, n6uVar.e);
            return;
        }
        if (nVar instanceof v0) {
            jst.e.k(new IllegalArgumentException(), "Unsupported action received on FlexMain screen");
            return;
        }
        if (nVar instanceof ShowOnboardingAction) {
            ShowOnboardingAction showOnboardingAction = (ShowOnboardingAction) nVar;
            FormattedText formattedText = showOnboardingAction.b;
            FormattedText formattedText2 = showOnboardingAction.c;
            String str4 = showOnboardingAction.d;
            String str5 = showOnboardingAction.e;
            kotlinx.serialization.json.c cVar = showOnboardingAction.f;
            this.b.a.g(new v0w0(formattedText, formattedText2, str4, str5, cVar != null ? xsq0.c(cVar) : null));
            return;
        }
        if (!(nVar instanceof CloseAction)) {
            if (!(nVar instanceof e0)) {
                w511.b();
                return;
            } else {
                o4w0 o4w0Var = ((n4w0) this.x.get()).a;
                o4w0Var.E((m950) o4w0Var.Q.get(), lgw0.a, sy60.Q2, hxx.a);
                return;
            }
        }
        if (vc00.b((vc00) this.y.get()) || (e = this.w.e()) == null) {
            return;
        }
        rkr rkrVar = e instanceof rkr ? (rkr) e : null;
        if (rkrVar != null ? rkrVar.handleAction(new CloseAction()) : false) {
            return;
        }
        e.dismiss();
    }
}
