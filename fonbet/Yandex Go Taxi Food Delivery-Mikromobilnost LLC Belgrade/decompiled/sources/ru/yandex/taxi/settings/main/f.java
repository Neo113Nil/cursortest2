package ru.yandex.taxi.settings.main;

import com.yandex.go.account.phonish_upgrade.o;
import defpackage.ad5;
import defpackage.ajm0;
import defpackage.eg3;
import defpackage.g92;
import defpackage.h3y;
import defpackage.i600;
import defpackage.jc00;
import defpackage.jj10;
import defpackage.l1s;
import defpackage.lx6;
import defpackage.m500;
import defpackage.mn10;
import defpackage.n20;
import defpackage.o600;
import defpackage.oep0;
import defpackage.pwy0;
import defpackage.qmp;
import defpackage.sq11;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpj;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u500;
import defpackage.uyj;
import defpackage.vnr0;
import defpackage.w030;
import defpackage.yvf0;
import defpackage.z500;
import defpackage.zww0;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$flatMapLatest$2;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$start$2;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$start$3;
import ru.yandex.taxi.domain.a0;
import ru.yandex.taxi.domain.c0;
import ru.yandex.taxi.domain.s0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class f extends ad5 {
    public final m500 A;
    public final h3y B;
    public final h3y C;
    public final u500 D;
    public final tpj E;
    public final h3y F;
    public final i600 G;
    public final yvf0 H;
    public final oep0 I;
    public final n20 J;
    public final vnr0 K;
    public final com.yandex.go.route.interactor.b L;
    public final h3y M;
    public final k N;
    public final s0 O;
    public final yvf0 P;
    public final jc00 Q;
    public final h3y R;
    public final h3y S;
    public final h3y T;
    public final h3y U;
    public final h3y V;
    public final h3y W;
    public final h3y Z;
    public final h3y a0;
    public final zww0 b0;
    public final lx6 c0;
    public final pwy0 d0;
    public final com.yandex.go.payments.sbp.navigation.c e0;
    public String f0;
    public WeakReference g0;
    public boolean h0;
    public final jj10 x;
    public final tt2 y;
    public final b0 z;

    public f(jj10 jj10Var, tt2 tt2Var, b0 b0Var, m500 m500Var, h3y h3yVar, h3y h3yVar2, u500 u500Var, tpj tpjVar, h3y h3yVar3, i600 i600Var, yvf0 yvf0Var, oep0 oep0Var, n20 n20Var, vnr0 vnr0Var, com.yandex.go.route.interactor.b bVar, h3y h3yVar4, k kVar, s0 s0Var, yvf0 yvf0Var2, jc00 jc00Var, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9, h3y h3yVar10, h3y h3yVar11, h3y h3yVar12, zww0 zww0Var, lx6 lx6Var, pwy0 pwy0Var, w030 w030Var, ajm0 ajm0Var) {
        super(z500.class);
        this.x = jj10Var;
        this.y = tt2Var;
        this.z = b0Var;
        this.A = m500Var;
        this.B = h3yVar;
        this.C = h3yVar2;
        this.D = u500Var;
        this.E = tpjVar;
        this.F = h3yVar3;
        this.G = i600Var;
        this.H = yvf0Var;
        this.I = oep0Var;
        this.J = n20Var;
        this.K = vnr0Var;
        this.L = bVar;
        this.M = h3yVar4;
        this.N = kVar;
        this.O = s0Var;
        this.P = yvf0Var2;
        this.Q = jc00Var;
        this.R = h3yVar5;
        this.S = h3yVar6;
        this.T = h3yVar7;
        this.U = h3yVar8;
        this.V = h3yVar9;
        this.W = h3yVar10;
        this.Z = h3yVar11;
        this.a0 = h3yVar12;
        this.b0 = zww0Var;
        this.c0 = lx6Var;
        this.d0 = pwy0Var;
        this.e0 = eg3.g(ajm0Var.a, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, w030Var).e();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ru.yandex.taxi.settings.domain.a aVar = (ru.yandex.taxi.settings.domain.a) this.U.get();
        aVar.d.d(aVar);
    }

    public final void Kg(String str) {
        m500 m500Var = this.A;
        m500Var.getClass();
        m500Var.a("FamilyAccount.FlowStart", new Pair("webview_url", str), new Pair("open_reason", "menu"));
        u500 u500Var = this.D;
        u500Var.getClass();
        u500Var.d(MainMenuProcessor$MenuEntry.FAMILY_GROUP, str);
    }

    public final void Lg() {
        com.yandex.go.coroutines.b.g(Jg(), null, null, new NativeMenuPresenter$onProfileSelected$1(this, null), 3);
    }

    public final void Mg() {
        u500 u500Var = this.D;
        u500Var.getClass();
        u500Var.d(MainMenuProcessor$MenuEntry.USER_PHOTO, null);
    }

    public final void Ng(z500 z500Var) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        Og(((com.yandex.go.user_profile.main_menu.profile.domain.c) ((o600) this.T.get())).b(), new NativeMenuPresenter$startSubscriptions$1(1, z500Var, z500.class, "renderUserProfile", "renderUserProfile(Lcom/yandex/go/user_profile/main_menu/profile/presentation/MainMenuUserProfileUiState;)V", 0));
        s0 s0Var = this.O;
        com.yandex.go.repositories.e eVar = s0Var.a;
        m mVar = s0Var.c;
        qmp qmpVar = s0Var.A;
        Og(eVar.f, new NativeMenuPresenter$startSubscriptions$2(1, z500Var, z500.class, "renderUserInfoImage", "renderUserInfoImage(Lcom/yandex/go/repositories/ImageUrl;)V", 0));
        Og(s0Var.b.f, new NativeMenuPresenter$startSubscriptions$3(1, z500Var, z500.class, "renderPlusModelMenuItem", "renderPlusModelMenuItem(Lcom/yandex/go/plus/api/model/BadgeContentState;)V", 0));
        Og(s0Var.e(), new NativeMenuPresenter$startSubscriptions$4(1, z500Var, z500.class, "setLinkAccountsVisibility", "setLinkAccountsVisibility(Z)V", 0));
        Og(s0Var.c(), new NativeMenuPresenter$startSubscriptions$5(1, this, f.class, "renderSharedAccounts", "renderSharedAccounts(Lkotlin/Pair;)V", 0));
        Og(s0Var.b(), new NativeMenuPresenter$startSubscriptions$6(1, z500Var, z500.class, "renderSafetyCenter", "renderSafetyCenter(Ljava/lang/String;)V", 0));
        Og(s0Var.a(), new NativeMenuPresenter$startSubscriptions$7(1, this, f.class, "updateHireDriverItem", "updateHireDriverItem(Lcom/yandex/go/hiredriver/api/HireDriverData;)V", 0));
        Og(new com.yandex.go.ugc.b(((sq11) s0Var.l).e.a()), new NativeMenuPresenter$startSubscriptions$8(1, this, f.class, "updateUgcItemVisibility", "updateUgcItemVisibility(Lcom/yandex/go/ugc/api/entity/UgcItem;)V", 0));
        Og(new com.yandex.go.business.impl.domain.b(s0Var.m.a.b.a()), new NativeMenuPresenter$startSubscriptions$9(1, this, f.class, "updateBusinessToBusinessSection", "updateBusinessToBusinessSection(Lcom/yandex/go/business/api/domain/B2BMenuItemState;)V", 0));
        Og(s0Var.n.a(), new NativeMenuPresenter$startSubscriptions$10(1, this, f.class, "updatePushSystemDisabledItem", "updatePushSystemDisabledItem(Z)V", 0));
        Og(((ru.yandex.taxi.maas.impl.a) s0Var.o).b(), new NativeMenuPresenter$startSubscriptions$11(1, this, f.class, "updateMaasItem", "updateMaasItem(Lru/yandex/taxi/maas/api/Maas;)V", 0));
        Og(new ru.yandex.taxi.bugreport.ui.b(s0Var.p.a.b.a()), new NativeMenuPresenter$startSubscriptions$12(1, z500Var, z500.class, "renderBugReportItem", "renderBugReportItem(Lru/yandex/taxi/bugreport/ui/BugReportViewModel$State;)V", 0));
        Og(new com.yandex.go.payments.shared.family.viewmodels.b(s0Var.q.e), new NativeMenuPresenter$startSubscriptions$13(1, z500Var, z500.class, "renderFamilyGroupItem", "renderFamilyGroupItem(Lcom/yandex/go/sharedpayments/api/menu/FamilyGroupMenuItemState;)V", 0));
        Og(s0Var.r.e, new NativeMenuPresenter$startSubscriptions$14(1, z500Var, z500.class, "renderSpecialNeedsItem", "renderSpecialNeedsItem(Lcom/yandex/go/special_needs_menu/ui/SpecialNeedsMenuItemUiState;)V", 0));
        Og(this.L.k(), new NativeMenuPresenter$startSubscriptions$15(1, this, f.class, "updateAddressItem", "updateAddressItem(Lru/yandex/taxi/object/Route;)V", 0));
        qmpVar.getClass();
        Boolean bool = Boolean.TRUE;
        Og(new g92(2, bool), new NativeMenuPresenter$startSubscriptions$16(1, z500Var, z500.class, "setPromocodesVisibility", "setPromocodesVisibility(Z)V", 0));
        qmpVar.getClass();
        Og(kotlinx.coroutines.flow.e.X(new g92(2, bool), new MainMenuItemsInteractorImpl$special$$inlined$flatMapLatest$2(null, s0Var)), new NativeMenuPresenter$startSubscriptions$17(1, this, f.class, "updatePaymentUiState", "updatePaymentUiState(Lcom/yandex/go/payments/api/model/MainMenuPaymentUiState;)V", 0));
        Og(((com.yandex.go.payments.addmethod.domain.e) s0Var.t).a(), new NativeMenuPresenter$startSubscriptions$18(1, this, f.class, "updateAddPaymentsMethodButton", "updateAddPaymentsMethodButton(Lcom/yandex/go/payments/AddButtonState;)V", 0));
        Og(s0Var.u.a(), new NativeMenuPresenter$startSubscriptions$19(1, z500Var, z500.class, "renderLogOutState", "renderLogOutState(Lcom/yandex/go/user_profile/main_menu/profile/repository/logout/presentation/MainMenuLogOutUiState;)V", 0));
        Og(s0Var.v.a(), new NativeMenuPresenter$startSubscriptions$20(1, z500Var, z500.class, "renderAccountUpgrade", "renderAccountUpgrade(Lru/yandex/taxi/settings/account/UpgradeAccountMenuItemUiState;)V", 0));
        Og(s0Var.d(), new NativeMenuPresenter$startSubscriptions$21(1, z500Var, z500.class, "renderYangoBusinessItem", "renderYangoBusinessItem(Lcom/yandex/go/business/api/model/YangoBusinessState;)V", 0));
        l1s l1sVar = s0Var.w;
        o oVar = (o) l1sVar.a;
        Og(new ru.yandex.taxi.settings.account.b(new com.yandex.go.account.phonish_upgrade.l(oVar.b.d(), oVar), l1sVar), new NativeMenuPresenter$startSubscriptions$22(1, z500Var, z500.class, "renderForcePhonishUpgrade", "renderForcePhonishUpgrade(Lru/yandex/taxi/settings/account/ForcePhonishUpgradeMenuItemUiState;)V", 0));
        mn10 mn10Var = (mn10) s0Var.y;
        Og(kotlinx.coroutines.flow.e.t(new com.yandex.go.ultima_mode.menu.b(mn10Var.b.c, mn10Var)), new NativeMenuPresenter$startSubscriptions$23(1, this, f.class, "showUltimaViewIfNeeded", "showUltimaViewIfNeeded(Z)V", 0));
        Og(s0Var.z.a(), new NativeMenuPresenter$startSubscriptions$24(1, z500Var, z500.class, "renderLotteryMenuItem", "renderLotteryMenuItem(Lcom/yandex/go/lottery/api/LotteryMenuItemUiState;)V", 0));
        Og(new c0(com.yandex.go.coroutines.b.d(mVar.f, new MainMenuItemsInteractorImpl$special$$inlined$start$3(mVar.a(), null)), s0Var), new NativeMenuPresenter$startSubscriptions$25(1, z500Var, z500.class, "setMyAddressesVisibility", "setMyAddressesVisibility(Z)V", 0));
        Og(new a0(com.yandex.go.coroutines.b.d(mVar.f, new MainMenuItemsInteractorImpl$special$$inlined$start$2(mVar.a(), null))), new NativeMenuPresenter$startSubscriptions$26(1, z500Var, z500.class, "setOrderHistoryVisibility", "setOrderHistoryVisibility(Z)V", 0));
        tje.N(Jg(), null, null, new NativeMenuPresenter$startSubscriptions$$inlined$safeCollectIn$1(this.d0.a(), null, this), 3);
    }

    public final void Og(tpr tprVar, tls tlsVar) {
        m0 m0Var = new m0(this.d0.a(), tprVar, new NativeMenuPresenter$subscribeOnUiDispatcher$1(3, null));
        this.y.getClass();
        tje.N(Jg(), null, null, new NativeMenuPresenter$subscribeOnUiDispatcher$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(m0Var, uyj.a), tlsVar, null), 3);
    }
}
