package defpackage;

import com.yandex.go.account.phonish_upgrade.l;
import com.yandex.go.payments.shared.family.viewmodels.b;
import com.yandex.go.payments.shared.family.viewmodels.c;
import com.yandex.go.profile.data.ProfileItem;
import com.yandex.go.profile.domain.flex.ProfileSupportedItemsRepository$supportedItem$$inlined$start$1;
import com.yandex.go.yb.main_menu.data.YbWalletMenuItemRepositoryImpl$observeYbWalletMenuItemState$$inlined$flatMapLatest$1;
import com.yandex.go.yb.main_menu.data.h;
import java.util.Set;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$flatMapLatest$1;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$start$2;
import ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$special$$inlined$start$3;
import ru.yandex.taxi.domain.a0;
import ru.yandex.taxi.domain.c0;
import ru.yandex.taxi.domain.g;
import ru.yandex.taxi.domain.h0;
import ru.yandex.taxi.domain.i;
import ru.yandex.taxi.domain.j0;
import ru.yandex.taxi.domain.k;
import ru.yandex.taxi.domain.l0;
import ru.yandex.taxi.domain.m;
import ru.yandex.taxi.domain.n0;
import ru.yandex.taxi.domain.o;
import ru.yandex.taxi.domain.p0;
import ru.yandex.taxi.domain.q;
import ru.yandex.taxi.domain.r0;
import ru.yandex.taxi.domain.s;
import ru.yandex.taxi.domain.s0;
import ru.yandex.taxi.domain.u;
import ru.yandex.taxi.domain.w;
import ru.yandex.taxi.domain.x;
import ru.yandex.taxi.maas.impl.a;

/* loaded from: classes8.dex */
public final class rgf0 {
    public static final Set b = j73.f0(new ProfileItem[]{new ProfileItem(ProfileItem.Id.ADDRESS_SELECTION), new ProfileItem(ProfileItem.Id.CHARITY), new ProfileItem(ProfileItem.Id.SETTINGS), new ProfileItem(ProfileItem.Id.INFO), new ProfileItem(ProfileItem.Id.SUPPORT)});
    public final gci0 a;

    public rgf0(s0 s0Var, tse tseVar, tt2 tt2Var) {
        tpr a = a(new x(s0Var.b.f), ProfileItem.Id.PLUS);
        tpr a2 = a(s0Var.e(), ProfileItem.Id.LINK_ACCOUNT);
        tpr a3 = a(new h0(s0Var.c()), ProfileItem.Id.BUSINESS_ACCOUNT);
        tpr a4 = a(new j0(new h0(s0Var.c())), ProfileItem.Id.BUSINESS_ACCOUNT_CREATION);
        c cVar = s0Var.q;
        tpr a5 = a(e.X(new b(cVar.e), new MainMenuItemsInteractorImpl$special$$inlined$flatMapLatest$1(null, s0Var)), ProfileItem.Id.FAMILY_ACCOUNT);
        tpr a6 = a(new l0(e.X(new b(cVar.e), new MainMenuItemsInteractorImpl$special$$inlined$flatMapLatest$1(null, s0Var))), ProfileItem.Id.FAMILY_ACCOUNT_CREATION);
        tpr a7 = a(new n0(s0Var.b()), ProfileItem.Id.SAFETY_CENTER);
        tpr a8 = a(new p0(s0Var.a()), ProfileItem.Id.HIRE_DRIVER);
        tpr a9 = a(new r0(new com.yandex.go.ugc.b(((sq11) s0Var.l).e.a())), ProfileItem.Id.UGC);
        tpr a10 = a(new ru.yandex.taxi.domain.e(new com.yandex.go.business.impl.domain.b(s0Var.m.a.b.a())), ProfileItem.Id.B2B);
        tpr a11 = a(s0Var.n.a(), ProfileItem.Id.ENABLE_NOTIFICATIONS);
        tpr a12 = a(new g(((a) s0Var.o).b()), ProfileItem.Id.MAAS);
        tpr a13 = a(new i(new ru.yandex.taxi.bugreport.ui.b(s0Var.p.a.b.a())), ProfileItem.Id.BUG_REPORT);
        tpr a14 = a(new k(s0Var.r.e), ProfileItem.Id.SPECIAL_NEEDS);
        tpr a15 = a(new m(((com.yandex.go.payments.addmethod.domain.e) s0Var.t).a()), ProfileItem.Id.ADD_PAYMENT_METHODS);
        tpr a16 = a(new o(s0Var.u.a()), ProfileItem.Id.LOGOUT);
        tpr a17 = a(new q(s0Var.v.a()), ProfileItem.Id.UPGRADE_ACCOUNT);
        tpr a18 = a(new s(s0Var.d()), ProfileItem.Id.YANGO_BUSINESS);
        l1s l1sVar = s0Var.w;
        com.yandex.go.account.phonish_upgrade.o oVar = (com.yandex.go.account.phonish_upgrade.o) l1sVar.a;
        tpr a19 = a(new u(new ru.yandex.taxi.settings.account.b(new l(oVar.b.d(), oVar), l1sVar)), ProfileItem.Id.FORCE_PHONISH_UPGRADE);
        mn10 mn10Var = (mn10) s0Var.y;
        tpr a20 = a(e.t(new com.yandex.go.ultima_mode.menu.b(mn10Var.b.c, mn10Var)), ProfileItem.Id.ULTIMA_MODE);
        tpr a21 = a(new w(s0Var.z.a()), ProfileItem.Id.LOTTERY);
        ru.yandex.taxi.am.m mVar = s0Var.c;
        tpr a22 = a(new a0(com.yandex.go.coroutines.b.d(mVar.f, new MainMenuItemsInteractorImpl$special$$inlined$start$2(mVar.a(), null))), ProfileItem.Id.ORDER_HISTORY);
        tpr a23 = a(new c0(com.yandex.go.coroutines.b.d(mVar.f, new MainMenuItemsInteractorImpl$special$$inlined$start$3(mVar.a(), null)), s0Var), ProfileItem.Id.FAVORITES);
        s0Var.B.getClass();
        com.yandex.go.yb.main_menu.data.i iVar = s0Var.C;
        tpr a24 = a(new h(e.X(e.t(iVar.e.a()), new YbWalletMenuItemRepositoryImpl$observeYbWalletMenuItemState$$inlined$flatMapLatest$1(null, iVar))), ProfileItem.Id.YANDEX_BANK);
        qmp qmpVar = s0Var.A;
        qmpVar.getClass();
        Boolean bool = Boolean.TRUE;
        tpr a25 = a(new g92(2, bool), ProfileItem.Id.PAYMENT);
        qmpVar.getClass();
        com.yandex.go.profile.domain.flex.s sVar = new com.yandex.go.profile.domain.flex.s(new tpr[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a(new g92(2, bool), ProfileItem.Id.PROMOCODES)});
        tt2Var.getClass();
        ike M = bvf0.M(tseVar, uyj.a);
        xsr0.a.getClass();
        this.a = e.R(sVar, M, wsr0.b, b);
    }

    public static tpr a(tpr tprVar, ProfileItem.Id id) {
        return com.yandex.go.coroutines.b.d(new com.yandex.go.profile.domain.flex.u(tprVar, id), new ProfileSupportedItemsRepository$supportedItem$$inlined$start$1(null, null));
    }
}
