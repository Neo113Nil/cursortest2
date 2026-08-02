package defpackage;

import com.yandex.go.navigator.domain.a0;
import com.yandex.go.preorder.navigation.s;
import com.yandex.go.universal_qr_scanner.presentation.d;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenVaultAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultAcceptAction;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$NavigationScreenType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.experiment.WalkNavExperiment;
import com.yandex.go.walking.navigation.impl.guidance.e;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.payment.sdk.transportcards.nfc.a;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.screens.upgrade.presentation.edit.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.summary.requirements.list.recycler.i;

/* loaded from: classes14.dex */
public final class sf11 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        b viewModel;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        switch (this.a) {
            case 0:
                if (jl40.l(((t011) obj).a, "transportCardNfcReaderEnable")) {
                    ((TransportCardsActivity) ((a) this.b).a.a).showNfcDialog();
                }
                return zy11.a;
            case 1:
                ((jh11) this.b).pa((xh11) obj);
                return zy11.a;
            case 2:
                ((m021) this.b).xg((i121) obj);
                return zy11.a;
            case 3:
                Object Kg = d.Kg((d) this.b, (xz11) obj, continuation);
                return Kg == CoroutineSingletons.COROUTINE_SUSPENDED ? Kg : zy11.a;
            case 4:
                if (((fnx0) obj).c.C) {
                    ((c521) this.b).b.a(qtb1.D);
                    jbn jbnVar = (jbn) ((c521) this.b).c;
                    ArrayList d = jbnVar.d();
                    List list = jbnVar.b.a.x;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!d.contains(((b580) obj2).a)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() != jbnVar.b.a.x.size()) {
                        jbnVar.b.a.x = arrayList;
                        jbnVar.c.a.g(RequirementsChangedNotifier.ChangeType.REMOVE_UNSUPPORTED);
                    }
                }
                return zy11.a;
            case 5:
                ((s) this.b).r(new qu(9));
                return zy11.a;
            case 6:
                ((a0) this.b).d.l(new Integer(((Number) obj).intValue()));
                return zy11.a;
            case 7:
                ((i) ((a201) this.b).c).e((fnx0) obj);
                return zy11.a;
            case 8:
                viewModel = ((UpgradeEditFragment) this.b).getViewModel();
                viewModel.B.c(((z921) viewModel.X()).a, (String) obj);
                return zy11.a;
            case 9:
                ((nn21) this.b).setUserInfo((zn21) obj);
                return zy11.a;
            case 10:
                lk51 lk51Var = (lk51) obj;
                on21 on21Var = (on21) this.b;
                on21Var.getClass();
                if (jl40.l(lk51Var, lk51.e)) {
                    ((nn21) on21Var.Dg()).hideYaPlusStatus();
                } else {
                    ((nn21) on21Var.Dg()).showYaPlusStatus(lk51Var.b);
                }
                return zy11.a;
            case 11:
                pn21 pn21Var = (pn21) this.b;
                egv egvVar = (egv) obj;
                if (egvVar instanceof cgv) {
                    pn21Var.setImage(((cgv) egvVar).a);
                } else {
                    if (!(egvVar instanceof bgv)) {
                        w511.b();
                        return null;
                    }
                    pn21Var.setCircleLoadingImage(((bgv) egvVar).a);
                }
                return zy11.a;
            case 12:
                ((pn21) ((qn21) this.b).Dg()).setLinkAccount((kj) obj);
                return zy11.a;
            case 13:
                ((com.yandex.go.ui.d) this.b).close();
                return zy11.a;
            case 14:
                ((gr21) this.b).G7((tr21) obj);
                return zy11.a;
            case 15:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                hr21 hr21Var = (hr21) pair.getSecond();
                com.yandex.go.navigation.b bVar = (com.yandex.go.navigation.b) this.b;
                if (booleanValue) {
                    bVar.P(hr21Var);
                } else {
                    bVar.r(new qu(9));
                }
                return zy11.a;
            case 16:
                double doubleValue = ((Number) obj).doubleValue();
                par parVar = (par) this.b;
                if (doubleValue > 0.0d) {
                    oar oarVar = parVar.c;
                    int i = oarVar.a + 1;
                    oarVar.a = i;
                    oarVar.b = ((i * oarVar.b) + doubleValue) / (r0 + 2);
                } else {
                    parVar.getClass();
                }
                return zy11.a;
            case 17:
                com.yandex.messaging.internal.urlpreview.impl.d dVar = (com.yandex.messaging.internal.urlpreview.impl.d) this.b;
                dVar.I.setText(h791.g((qp21) obj, dVar.E.getResources(), null));
                return zy11.a;
            case 18:
                kr krVar = (kr) obj;
                com.yandex.go.vault.flexsdk.descriptors.widget.view.b bVar2 = (com.yandex.go.vault.flexsdk.descriptors.widget.view.b) this.b;
                if (krVar instanceof VaultAcceptAction) {
                    return com.yandex.go.vault.flexsdk.descriptors.widget.view.b.Kg(bVar2, continuation);
                }
                if (krVar instanceof OpenVaultAction) {
                    OpenVaultAction openVaultAction = (OpenVaultAction) krVar;
                    bVar2.getClass();
                    boolean z = openVaultAction.b;
                    VaultRarity vaultRarity = openVaultAction.a;
                    if (z) {
                        ((c431) bVar2.Dg()).openVault(vaultRarity);
                    } else {
                        ((c431) bVar2.Dg()).scrollToVault(vaultRarity);
                    }
                }
                return zy11.a;
            case 19:
                dd31.U((dd31) this.b, (PointType) obj);
                return zy11.a;
            case 20:
                ((VerticalInternalTariffView) this.b).invalidateVisibleState((ux31) obj);
                return zy11.a;
            case 21:
                ((lx40) this.b).a(((Number) obj).floatValue());
                return zy11.a;
            case 22:
                ((wi31) this.b).G5((yi31) obj);
                return zy11.a;
            case 23:
                ((Boolean) obj).getClass();
                k kVar = (k) this.b;
                Camera camera = kVar.h;
                if (camera != null) {
                    camera.setCameraMode(CameraMode.INDOOR, kVar.l);
                }
                return zy11.a;
            case 24:
                com.yandex.go.walking.navigation.impl.navigation_core.guidance.a aVar = (com.yandex.go.walking.navigation.impl.navigation_core.guidance.a) this.b;
                long currentTimeMillis = (((WalkNavExperiment) ((l141) aVar.a.get()).a.b()).d * 60000) + System.currentTimeMillis();
                cne0 cne0Var = aVar.e;
                cne0Var.q(-2L, "walk_nav_total_route_time");
                cne0Var.q(currentTimeMillis, "walk_nav_deadline");
                aVar.e(currentTimeMillis);
                return zy11.a;
            case 25:
                ((Boolean) obj).booleanValue();
                e eVar = (e) this.b;
                b741 b741Var = eVar.P;
                WalkingNavigationAnalytics$NavigationScreenType walkingNavigationAnalytics$NavigationScreenType = WalkingNavigationAnalytics$NavigationScreenType.Finished;
                w041 w041Var = eVar.Q;
                String str = w041Var.a;
                if (w041Var.b != null) {
                    Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                                walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                            }
                        }
                    }
                    walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
                }
                b741Var.a(walkingNavigationAnalytics$NavigationScreenType, str, walkingNavigationAnalytics$WalkingNavigationGeneration);
                return zy11.a;
            case 26:
                ((a341) this.b).c.l((Route) obj);
                return zy11.a;
            case 27:
                ((v341) this.b).e.a.l((q341) obj);
                return zy11.a;
            case 28:
                t641 t641Var = (t641) obj;
                h641 h641Var = (h641) this.b;
                if (t641Var instanceof o641) {
                    if (h641Var.E) {
                        jst.e.getClass();
                    } else {
                        h641Var.E = true;
                        List list2 = ((o641) t641Var).a;
                        qur qurVar = h641Var.B;
                        if (qurVar != null) {
                            qurVar.k(new ArrayList(list2));
                        } else {
                            ((n641) h641Var.Dg()).v(list2);
                        }
                    }
                } else if (t641Var instanceof q641) {
                    ((n641) h641Var.Dg()).m0(((q641) t641Var).a);
                } else if (t641Var instanceof s641) {
                    ((n641) h641Var.Dg()).r6(((s641) t641Var).a);
                } else if (t641Var instanceof r641) {
                    ((n641) h641Var.Dg()).T0(((r641) t641Var).a);
                } else {
                    if (!(t641Var instanceof p641)) {
                        h641Var.getClass();
                        w511.b();
                        return null;
                    }
                    ((n641) h641Var.Dg()).h0();
                }
                return zy11.a;
            default:
                j1r j1rVar = ((se41) this.b).h;
                return zy11.a;
        }
    }
}
