package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.preorder.navigation.s;
import com.yandex.go.service_catalog.router.b;
import com.yandex.go.summary.requirements.list.requirementgroup.d;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.data.SuperAppMapCategoryFiltersStateRepository;
import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.domain.entities.SuperAppDiscoveryMapFilter;
import com.yandex.go.superapp.discovery.map.impl.ui.model.SuperAppDiscoveryMapSearchOpenedEntity;
import com.yandex.go.ugc.f;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.share_favorites.router.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class yio0 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yio0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy60
    public final void a() {
        Object obj;
        int i = this.a;
        ijv0 ijv0Var = null;
        Object[] objArr = 0;
        int i2 = 9;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((y4c0) obj2).r(new qu(i2));
                break;
            case 1:
                ((b) obj2).r(new qu(i2));
                break;
            case 2:
                a aVar = (a) obj2;
                if (!aVar.u()) {
                    aVar.i();
                    break;
                } else {
                    aVar.r(new qu(i2));
                    break;
                }
            case 3:
                omr0 omr0Var = (omr0) obj2;
                omr0Var.r(new qu(i2));
                omr0Var.F.invoke();
                break;
            case 4:
                ((e8t0) obj2).r(new qu(i2));
                break;
            case 5:
                ((cbp0) obj2).r(new qu(i2));
                break;
            case 6:
                ((com.yandex.go.quark.soul.router.a) obj2).r(new qu(9));
                break;
            case 7:
                ((n) obj2).Y(new xse0(ghv0.a, ijv0Var, objArr == true ? 1 : 0, 62));
                break;
            case 8:
                ((rwo0) obj2).r(new qu(i2));
                break;
            case 9:
                ((yn5) obj2).r(new qu(i2));
                break;
            case 10:
                ((d) obj2).r(new qu(i2));
                break;
            case 11:
                uva uvaVar = (uva) obj2;
                uvaVar.r(new qu(i2));
                ((xlp0) uvaVar.F).invoke();
                break;
            case 12:
                pw1 pw1Var = (pw1) obj2;
                pw1Var.r(new qu(i2));
                ((lu4) pw1Var.F).invoke();
                break;
            case 13:
                rwo0 rwo0Var = (rwo0) obj2;
                rwo0Var.r(new qu(i2));
                ((nao0) rwo0Var.F).invoke();
                break;
            case 14:
                ((o0k0) obj2).r(new qu(i2));
                break;
            case 15:
                ((jov0) obj2).r(new qu(i2));
                break;
            case 16:
                uva uvaVar2 = (uva) obj2;
                uvaVar2.r(new qu(i2));
                ((sls) uvaVar2.F).invoke();
                break;
            case 17:
                fwv0 fwv0Var = (fwv0) obj2;
                r4w0 r4w0Var = fwv0Var.G;
                kxv0 kxv0Var = fwv0Var.E;
                SuperAppDiscoveryMapSearchOpenedEntity superAppDiscoveryMapSearchOpenedEntity = kxv0Var.a;
                kxv0Var.a = SuperAppDiscoveryMapSearchOpenedEntity.NONE;
                int i3 = dwv0.a[superAppDiscoveryMapSearchOpenedEntity.ordinal()];
                if (i3 == 1) {
                    SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter = SuperAppDiscoveryMapFilter.PLACES;
                    SuperAppDiscoveryMapExperiment.CategoryFilterType categoryFilterType = SuperAppDiscoveryMapExperiment.CategoryFilterType.TRANSPORT;
                    SuperAppMapCategoryFiltersStateRepository superAppMapCategoryFiltersStateRepository = r4w0Var.a;
                    Iterator it = ((Iterable) superAppMapCategoryFiltersStateRepository.b.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gtv0) obj).g == categoryFilterType) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gtv0 gtv0Var = (gtv0) obj;
                    if (gtv0Var != null) {
                        r0 r0Var = superAppMapCategoryFiltersStateRepository.a;
                        r0Var.getClass();
                        r0Var.m(null, gtv0Var);
                        break;
                    }
                } else if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        w511.b();
                        break;
                    }
                } else {
                    r4w0Var.a.a.l(null);
                    fwv0Var.C.l(t6c0.a);
                    break;
                }
                break;
            case 18:
                com.yandex.go.superapp.discovery.map.scooters.impl.navigation.a aVar2 = (com.yandex.go.superapp.discovery.map.scooters.impl.navigation.a) obj2;
                aVar2.H.b(qoi0.a(xun0.class));
                aVar2.G.c();
                ((jgc0) aVar2.M).attach();
                aVar2.P = aVar2.K.c(new ydf(11));
                aVar2.J.b(new byx(Screen.DISCOVERY, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)));
                aVar2.E.a.offer(aVar2.N);
                khn khnVar = aVar2.O;
                if (khnVar != null) {
                    aVar2.z(khnVar, new p4g0(aVar2, 14));
                    break;
                }
                break;
            case 19:
                ((s8w0) obj2).r(new qu(i2));
                break;
            case 20:
                ((yn5) obj2).r(new qu(i2));
                break;
            case 21:
                uva uvaVar3 = (uva) obj2;
                uvaVar3.r(new qu(i2));
                ((mu4) uvaVar3.F).invoke();
                break;
            case 22:
                ((p2z0) obj2).r(new qu(i2));
                break;
            case 23:
                ((c8n0) obj2).r(new qu(i2));
                break;
            case 24:
                ((hd30) obj2).r(new qu(i2));
                break;
            case 25:
                ((f) obj2).r(new qu(9));
                break;
            case 26:
                ((zr01) obj2).invoke();
                break;
            case 27:
                ((c2n0) obj2).r(new qu(i2));
                break;
            case 28:
                s sVar = (s) obj2;
                g18 g18Var = sVar.L;
                if (g18Var != null) {
                    g18Var.cancel();
                }
                sVar.M = false;
                sVar.r(new qu(i2));
                break;
            default:
                com.yandex.go.user_profile.fullscreen.router.a aVar3 = (com.yandex.go.user_profile.fullscreen.router.a) obj2;
                acy0 acy0Var = aVar3.E.b;
                acy0Var.getClass();
                acy0Var.a.a("TaxiUserProfile.Close", new HashMap(), 1, new HashMap());
                aVar3.r(new qu(i2));
                break;
        }
    }
}
