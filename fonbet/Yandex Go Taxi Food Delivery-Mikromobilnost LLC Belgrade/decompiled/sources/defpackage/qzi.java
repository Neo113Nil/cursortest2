package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.Pair;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes12.dex */
public final class qzi extends h55 {
    public final nzi D;
    public final jgq0 E;
    public final c F;
    public final v8l0 G;
    public final com.yandex.go.navigation.screen.c H;

    public qzi(nzi nziVar, jgq0 jgq0Var, c cVar, v8l0 v8l0Var, com.yandex.go.navigation.screen.c cVar2) {
        super(null);
        this.D = nziVar;
        this.E = jgq0Var;
        this.F = cVar;
        this.G = v8l0Var;
        this.H = cVar2;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.e.cancel();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        String str;
        String h;
        String str2;
        Pair pair;
        wzi wziVar = (wzi) obj;
        this.G.a();
        boolean z = wziVar instanceof uzi;
        nzi nziVar = this.D;
        if (z) {
            uzi uziVar = (uzi) wziVar;
            pv0 pv0Var = uziVar.a;
            kzi kziVar = kzi.a;
            pzi P = P(kziVar);
            RouteSelectorOpenReason routeSelectorOpenReason = uziVar.b;
            ModalViewOrigin Q = Q();
            if (Q == null) {
                Q = ModalViewOrigin.SUMMARY;
            }
            RouteSelectorDestinationFragment a = nziVar.a(Q, nziVar.d, kziVar, routeSelectorOpenReason);
            a.setInitialAddress(pv0Var);
            nziVar.b(P, a);
            return;
        }
        if (wziVar instanceof rzi) {
            rzi rziVar = (rzi) wziVar;
            u0j u0jVar = rziVar.b;
            pv0 pv0Var2 = rziVar.c;
            Address address = rziVar.a;
            pzi P2 = P(u0jVar);
            arb arbVar = rziVar.d;
            ChooseAddressMode chooseAddressMode = arbVar.b;
            ModalViewOrigin modalViewOrigin = arbVar.c;
            RouteSelectorOpenReason routeSelectorOpenReason2 = rziVar.e;
            if (pv0Var2 != null) {
                RouteSelectorDestinationFragment a2 = nziVar.a(modalViewOrigin, nziVar.d, u0jVar, routeSelectorOpenReason2);
                a2.setInitialAddress(pv0Var2);
                nziVar.c(P2, u0jVar, chooseAddressMode, a2);
                return;
            } else {
                zzs B = address != null ? address.B() : null;
                RouteSelectorDestinationFragment a3 = nziVar.a(modalViewOrigin, nziVar.d, u0jVar, routeSelectorOpenReason2);
                a3.updateInitialPoint(B);
                nziVar.c(P2, u0jVar, chooseAddressMode, a3);
                return;
            }
        }
        if (wziVar instanceof vzi) {
            vzi vziVar = (vzi) wziVar;
            int i = vziVar.b;
            pv0 pv0Var3 = new pv0(vziVar.a, null, null, null, null, null, null, null, 1022);
            pzi P3 = P(new dzi(i));
            dzi dziVar = new dzi(i);
            arb arbVar2 = vziVar.c;
            ChooseAddressMode chooseAddressMode2 = arbVar2.b;
            RouteSelectorDestinationFragment a4 = nziVar.a(arbVar2.c, nziVar.d, dziVar, vziVar.d);
            a4.setInitialAddress(pv0Var3);
            nziVar.c(P3, dziVar, chooseAddressMode2, a4);
            return;
        }
        boolean z2 = wziVar instanceof szi;
        int i2 = 9;
        c cVar = this.F;
        if (z2) {
            Address d = cVar.d();
            if (d == null) {
                Address g = cVar.g();
                if (g == null) {
                    xby.t(jst.e, "DESTINATION_PICKER:NO_SOURCE_ADDRESS", new IllegalStateException("Source address should be already defined!"), null, 10);
                    r(new qu(i2));
                    return;
                }
                pair = new Pair(tyi.a, g.B());
            } else {
                pair = new Pair(new dzi(cVar.c().b.indexOf(d)), d.B());
            }
            u0j u0jVar2 = (u0j) pair.getFirst();
            zzs zzsVar = (zzs) pair.getSecond();
            pzi P4 = P(u0jVar2);
            ChooseAddressMode chooseAddressMode3 = ChooseAddressMode.DESTINATION;
            szi sziVar = (szi) wziVar;
            ModalViewOrigin modalViewOrigin2 = sziVar.a;
            if (modalViewOrigin2 == null && (modalViewOrigin2 = Q()) == null) {
                modalViewOrigin2 = ModalViewOrigin.SUMMARY;
            }
            RouteSelectorDestinationFragment a5 = nziVar.a(modalViewOrigin2, nziVar.d, u0jVar2, sziVar.b);
            a5.updateInitialPoint(zzsVar);
            nziVar.c(P4, u0jVar2, chooseAddressMode3, a5);
            return;
        }
        if (!(wziVar instanceof tzi)) {
            w511.b();
            return;
        }
        Address d2 = cVar.d();
        if (d2 == null) {
            xby.t(jst.e, "DESTINATION_PICKER:CLARIFY:NO_DESTINATION_ADDRESS", new IllegalStateException("Destination address should be already defined!"), null, 10);
            r(new qu(i2));
            return;
        }
        int indexOf = cVar.c().b.indexOf(d2);
        pv0 pv0Var4 = new pv0(d2, null, null, null, null, null, null, null, 1022);
        pzi P5 = P(new dzi(indexOf));
        ezi eziVar = new ezi(indexOf);
        ChooseAddressMode chooseAddressMode4 = ChooseAddressMode.DESTINATION;
        tzi tziVar = (tzi) wziVar;
        String str3 = tziVar.a;
        String str4 = tziVar.b;
        int i3 = tziVar.c;
        RouteSelectorOpenReason routeSelectorOpenReason3 = RouteSelectorOpenReason.OTHER;
        ModalViewOrigin Q2 = Q();
        if (Q2 == null) {
            Q2 = ModalViewOrigin.SUMMARY;
        }
        ModalViewOrigin modalViewOrigin3 = Q2;
        avd0 avd0Var = nziVar.g;
        pex0 m = ((k) nziVar.b).m();
        zud0 a6 = ((d) avd0Var).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.DESTINATION);
        z8l0 z8l0Var = RouteSelectorDestinationFragment.Companion;
        l56 l56Var = nziVar.d;
        if (a6 == null || (str = a6.a) == null) {
            str = str3;
        }
        String str5 = (a6 == null || (str2 = a6.b) == null) ? str4 : str2;
        if (a6 == null || (h = a6.c) == null) {
            h = ((avj0) nziVar.e).h(i3);
        }
        b9l0 b9l0Var = new b9l0(modalViewOrigin3, l56Var, str, eziVar, routeSelectorOpenReason3, str5, null, null, h);
        z8l0Var.getClass();
        RouteSelectorDestinationFragment routeSelectorDestinationFragment = new RouteSelectorDestinationFragment();
        routeSelectorDestinationFragment.state = b9l0Var;
        routeSelectorDestinationFragment.setInitialAddress(pv0Var4);
        nziVar.c(P5, eziVar, chooseAddressMode4, routeSelectorDestinationFragment);
    }

    public final pzi P(u0j u0jVar) {
        return new pzi(p7b1.d(u0jVar, this.E.a), this, 0);
    }

    public final ModalViewOrigin Q() {
        com.yandex.go.navigation.screen.c cVar = this.H;
        if (cVar.f()) {
            return ModalViewOrigin.ON_ORDER;
        }
        if (cVar.b() == Screen.MAIN_V4) {
            return ModalViewOrigin.SUPERAPP_MAIN;
        }
        if (cVar.e() || cVar.h()) {
            return ModalViewOrigin.HOME;
        }
        if (cVar.g()) {
            return ModalViewOrigin.SUMMARY;
        }
        return null;
    }
}
