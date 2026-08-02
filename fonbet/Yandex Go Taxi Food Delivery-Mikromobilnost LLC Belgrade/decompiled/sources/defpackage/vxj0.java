package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.rida.bids.router.g;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.controller.a;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusProgressItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b0;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.y;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalView;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultError;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameParams;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import defpackage.aam0;
import defpackage.e561;
import defpackage.fam0;
import defpackage.n70;
import defpackage.z2m0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes13.dex */
public final /* synthetic */ class vxj0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vxj0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pzt0 pzt0Var;
        zy11 updatePlate$lambda$0$1;
        zy11 createButton$lambda$0$0;
        zy11 createSlider$lambda$0$0;
        Object value;
        zy11 renderContent$lambda$22$lambda$21;
        zy11 themeSelectionDelegate$lambda$9;
        zy11 renderBalanceState$lambda$6$lambda$5;
        zy11 renderImageState$lambda$15$lambda$14$lambda$13;
        zy11 render$lambda$10$lambda$9$lambda$7;
        int i = 8;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((wxj0) this.b).b.c((oll0) obj, (ArrayList) this.c);
                return zy11.a;
            case 1:
                g gVar = (g) this.b;
                c29 c29Var = (c29) this.c;
                o2y0 o2y0Var = (o2y0) obj;
                if (o2y0Var.b().I()) {
                    gVar.getClass();
                    if (((a) c29Var.b).d() && !o2y0Var.b().l.q && !gVar.J.a() && ((pzt0Var = ((a) c29Var.b).L) == null || !pzt0Var.isActive())) {
                        ((a) c29Var.b).h(new l5k0(c29Var, o2y0Var, gVar));
                    }
                }
                return zy11.a;
            case 2:
                n12 n12Var = (n12) this.b;
                sue0 sue0Var = (sue0) this.c;
                aye0 aye0Var = (aye0) n12Var.J;
                aye0Var.getClass();
                if (!jl40.l((y7k0) obj, y7k0.a)) {
                    w511.b();
                    return null;
                }
                ((b) aye0Var.b).j();
                ((n12) sue0Var.b).r(new nqi0(24));
                return zy11.a;
            case 3:
                ((com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b) this.b).S.a(new a9k0(((Boolean) obj).booleanValue()), ((u8k0) this.c).e);
                return zy11.a;
            case 4:
                ((dhk0) this.b).b.a((ibk0) obj, ((ygk0) this.c).l);
                return zy11.a;
            case 5:
                updatePlate$lambda$0$1 = RideCardDriverSectionView.updatePlate$lambda$0$1((yzx) this.b, (zuc0) this.c, (Animator) obj);
                return updatePlate$lambda$0$1;
            case 6:
                bjk0 bjk0Var = (bjk0) this.b;
                ajk0 ajk0Var = (ajk0) this.c;
                ibk0 a = ijk0.a((nqs0) obj);
                if (a != null) {
                    bjk0Var.b.a(a, ajk0Var.d);
                }
                return zy11.a;
            case 7:
                return new y((RideCardStatusProgressItemView) obj, (com.yandex.go.taxi.order.details.v2.analytics.g) this.b, (j8y) this.c);
            case 8:
                a0 a0Var = (a0) this.b;
                wrs0 wrs0Var = (wrs0) this.c;
                ibk0 a2 = ijk0.a((nqs0) obj);
                if (a2 != null) {
                    a0Var.S.a(a2, wrs0Var);
                }
                return zy11.a;
            case 9:
                b0 b0Var = (b0) this.b;
                wrs0 wrs0Var2 = (wrs0) this.c;
                ibk0 a3 = ijk0.a((nqs0) obj);
                if (a3 != null) {
                    b0Var.S.a(a3, wrs0Var2);
                }
                return zy11.a;
            case 10:
                cqk0 cqk0Var = (cqk0) this.b;
                tls tlsVar = (tls) this.c;
                u6y u6yVar = (u6y) obj;
                bpl0 bpl0Var = cqk0Var.c;
                List list = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list.size(), wlsVar != null ? new qq5(8, wlsVar, list) : null, new qc0(list, 26), new androidx.compose.runtime.internal.a(1891899975, new yc0(i, list, cqk0Var, tlsVar), true));
                return zy11.a;
            case 11:
                createButton$lambda$0$0 = RobotaxiModalView.createButton$lambda$0$0((ButtonComponent) this.b, (RobotaxiModalView) this.c, (fvk0) obj);
                return createButton$lambda$0$0;
            case 12:
                createSlider$lambda$0$0 = RobotaxiModalView.createSlider$lambda$0$0((SliderButtonView) this.b, (RobotaxiModalView) this.c, (fvk0) obj);
                return createSlider$lambda$0$0;
            case 13:
                com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) this.b;
                iib iibVar = (iib) this.c;
                r0 r0Var = aVar.l;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
                ((gh00) aVar.b).D(ru.yandex.taxi.map.utils.a.F((zzs) iibVar.b), iibVar.a, 400.0f, new mx0(10, aVar));
                return zy11.a;
            case 14:
                u6y.b((u6y) obj, null, new androidx.compose.runtime.internal.a(1521449501, new m2l0((w2l0) this.b, (tls) this.c, i2), true), 3);
                return zy11.a;
            case 15:
                ffu0 ffu0Var = (ffu0) this.b;
                oz40 oz40Var = (oz40) this.c;
                diu0 diu0Var = (diu0) obj;
                List list2 = (List) oz40Var.getValue();
                ffu0Var.getClass();
                int indexOf = list2.indexOf(diu0Var);
                List list3 = list2;
                if (indexOf >= 0) {
                    list3 = ffu0.a(list2, diu0.c(diu0Var, ffu0.b(list2, diu0Var.d, indexOf)), diu0Var.d, indexOf);
                }
                oz40Var.setValue(list3);
                return zy11.a;
            case 16:
                ModalViewOrigin modalViewOrigin = (ModalViewOrigin) this.b;
                ru.yandex.taxi.routeselector.a aVar2 = (ru.yandex.taxi.routeselector.a) this.c;
                ((wvw) obj).a();
                if (modalViewOrigin == ModalViewOrigin.HOME) {
                    aVar2.O.b(null, false);
                } else {
                    aVar2.G.c(bov0.e);
                }
                return zy11.a;
            case 17:
                egl0 egl0Var = (egl0) this.b;
                g92 g92Var = (g92) this.c;
                hgl0 hgl0Var = (hgl0) obj;
                String j = b64.j(egl0Var.c, ".ChildScreen");
                vlr vlrVar = (vlr) egl0Var.y.invoke();
                return egl0Var.b(vlr.a(vlrVar, j, new f83(egl0Var, j, hgl0Var, vlrVar, 12), 1048542), true, false, g92Var, true, true, null);
            case 18:
                csl0 csl0Var = (csl0) this.b;
                String str = (String) this.c;
                sy60 sy60Var = (sy60) obj;
                p1b p1bVar = csl0Var.L;
                bqc bqcVar = bqc.c;
                String d = p1bVar.d(bqcVar);
                boolean h = p1bVar.h(d);
                u500 u500Var = csl0Var.J;
                if (h) {
                    u500Var.f(true, false, str, new siw0(bqcVar, d));
                } else {
                    u500Var.f(false, true, str, null);
                }
                sy60Var.a();
                return zy11.a;
            case 19:
                ndl0 ndl0Var = (ndl0) this.b;
                ((csl0) ndl0Var.b).r(new vxj0(19, ndl0Var, (Preorder) this.c));
                return zy11.a;
            case 20:
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.b;
                sje sjeVar = new sje(3, (oz40) this.c);
                accessibilityManager.addTouchExplorationStateChangeListener(sjeVar);
                return new te4(13, accessibilityManager, sjeVar);
            case 21:
                String str2 = (String) this.b;
                com.ybsdk.feature.savings.internal.helpers.a aVar3 = (com.ybsdk.feature.savings.internal.helpers.a) this.c;
                x4c.g("Unable to rename savings account", (Throwable) obj, str2, null, 8);
                aVar3.d.c(unr0.h(Text.Companion, dzh0.ybsdk_savings_name_change_failed_title), new Text.Resource(dzh0.ybsdk_common_error_try_again));
                return zy11.a;
            case 22:
                final bab babVar = (bab) this.b;
                final tls tlsVar2 = (tls) this.c;
                final n70 n70Var = (n70) obj;
                n70Var.W(new tls() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.delegates.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        n70 n70Var2 = n70.this;
                        ((e561) n70Var2.N).b.setClickListener(babVar);
                        fam0 fam0Var = (fam0) n70Var2.Z();
                        e561 e561Var = (e561) n70Var2.N;
                        aam0 c = fam0Var.c(e561Var.a.getContext());
                        SavingsCardView savingsCardView = e561Var.b;
                        savingsCardView.setBackgroundFetcher((z2m0) ((SavingsDashboardRecyclerHelper$adapter$1) tlsVar2).invoke(((fam0) n70Var2.Z()).b()));
                        savingsCardView.render(c);
                        return zy11.a;
                    }
                });
                return zy11.a;
            case 23:
                n70 n70Var2 = (n70) this.b;
                qa3 qa3Var = (qa3) this.c;
                xty0.d(((w561) n70Var2.N).e, ((d9m0) n70Var2.Z()).d);
                w561 w561Var = (w561) n70Var2.N;
                xty0.d(w561Var.f, ((d9m0) n70Var2.Z()).e);
                w561Var.d.setText(d.a(n70Var2.P, ((d9m0) n70Var2.Z()).f));
                qa3Var.h(((d9m0) n70Var2.Z()).h, new hxj0(22, n70Var2));
                return zy11.a;
            case 24:
                renderContent$lambda$22$lambda$21 = SavingsAccountFragment.renderContent$lambda$22$lambda$21((u761) this.b, (SavingsAccountFragment) this.c, ((Boolean) obj).booleanValue());
                return renderContent$lambda$22$lambda$21;
            case 25:
                u9m0 u9m0Var = (u9m0) this.b;
                k7m0 k7m0Var = (k7m0) this.c;
                SavingsAccountNameParams savingsAccountNameParams = k7m0Var.B;
                AppAnalyticsReporter appAnalyticsReporter = k7m0Var.D;
                h7m0 h7m0Var = (h7m0) obj;
                SavingsActionStatus savingsActionStatus = u9m0Var.b;
                String str3 = u9m0Var.a;
                int i3 = j7m0.a[savingsActionStatus.ordinal()];
                if (i3 == 1) {
                    Throwable th = u9m0Var.c;
                    if (th != null) {
                        k7m0Var.W("IDEMPOTENCY_KEY_FOR_NAME", th);
                    }
                    rt1 rt1Var = appAnalyticsReporter.f0;
                    SavingsEvents$SavingsAccountEditNameSaveResultResult savingsEvents$SavingsAccountEditNameSaveResultResult = SavingsEvents$SavingsAccountEditNameSaveResultResult.ERROR;
                    SavingsEvents$SavingsAccountEditNameSaveResultError savingsEvents$SavingsAccountEditNameSaveResultError = SavingsEvents$SavingsAccountEditNameSaveResultError.SERVER_ERROR;
                    String saverType = savingsAccountNameParams.getSaverType();
                    rt1Var.I(savingsEvents$SavingsAccountEditNameSaveResultResult, savingsEvents$SavingsAccountEditNameSaveResultError, str3, saverType != null ? k7m0.d0(saverType) : null);
                    return h7m0.a(h7m0Var, str3, null, null, false, 19);
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return h7m0.a(h7m0Var, null, str3, null, true, 23);
                    }
                    w511.b();
                    return null;
                }
                rt1 rt1Var2 = appAnalyticsReporter.f0;
                SavingsEvents$SavingsAccountEditNameSaveResultResult savingsEvents$SavingsAccountEditNameSaveResultResult2 = SavingsEvents$SavingsAccountEditNameSaveResultResult.OK;
                String saverType2 = savingsAccountNameParams.getSaverType();
                rt1Var2.I(savingsEvents$SavingsAccountEditNameSaveResultResult2, null, str3, saverType2 != null ? k7m0.d0(saverType2) : null);
                k7m0Var.C.e();
                return h7m0Var;
            case 26:
                themeSelectionDelegate$lambda$9 = SavingsAccountThemeSelectorView.themeSelectionDelegate$lambda$9((Context) this.b, (SavingsAccountThemeSelectorView) this.c, (n70) obj);
                return themeSelectionDelegate$lambda$9;
            case 27:
                renderBalanceState$lambda$6$lambda$5 = SavingsCardView.renderBalanceState$lambda$6$lambda$5((SavingsCardView) this.b, (y9m0) this.c, ((Boolean) obj).booleanValue());
                return renderBalanceState$lambda$6$lambda$5;
            case 28:
                renderImageState$lambda$15$lambda$14$lambda$13 = SavingsCardView.renderImageState$lambda$15$lambda$14$lambda$13((SavingsCardView) this.b, (z9m0) this.c, ((Boolean) obj).booleanValue());
                return renderImageState$lambda$15$lambda$14$lambda$13;
            default:
                render$lambda$10$lambda$9$lambda$7 = SavingsDashboardFragmentV2.render$lambda$10$lambda$9$lambda$7((zbm0) this.b, (SavingsDashboardFragmentV2) this.c, (View) obj);
                return render$lambda$10$lambda$9$lambda$7;
        }
    }
}
