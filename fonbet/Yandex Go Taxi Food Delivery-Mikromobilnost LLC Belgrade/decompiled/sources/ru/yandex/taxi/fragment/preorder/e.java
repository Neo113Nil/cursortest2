package ru.yandex.taxi.fragment.preorder;

import defpackage.atd0;
import defpackage.c7p;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kr0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.qq60;
import defpackage.rx0;
import defpackage.si00;
import defpackage.sx0;
import defpackage.tje;
import defpackage.wpb0;
import defpackage.zzs;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes5.dex */
public final class e {
    public final atd0 a;
    public final qq60 b;
    public final kr0 c;
    public final AddressResolveRepository d;
    public final sx0 e;
    public final rx0 f;
    public pzt0 g;

    public e(atd0 atd0Var, qq60 qq60Var, kr0 kr0Var, AddressResolveRepository addressResolveRepository, sx0 sx0Var, rx0 rx0Var) {
        this.a = atd0Var;
        this.b = qq60Var;
        this.c = kr0Var;
        this.d = addressResolveRepository;
        this.e = sx0Var;
        this.f = rx0Var;
    }

    public static final void a(e eVar, pv0 pv0Var, PositionInitAction positionInitAction) {
        Object obj;
        rx0 rx0Var = eVar.f;
        if (positionInitAction == PositionInitAction.GEO) {
            sx0 sx0Var = eVar.e;
            if (sx0Var.e) {
                tje.N(sx0Var.c, null, null, new AddressMapFragmentAddressController$onNearestPosition$1(null, eVar), 3);
            }
        }
        AddressMapFragment addressMapFragment = rx0Var.a;
        addressMapFragment.setAddressInfo(pv0Var);
        addressMapFragment.onAddressChanged();
        addressMapFragment.changeAddressInfo(pv0Var);
        addressMapFragment.lastAddressUpdate = System.currentTimeMillis();
        AddressInputComponent addressInitialPointComponent = addressMapFragment.getAddressInitialPointComponent();
        if (addressInitialPointComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        addressInitialPointComponent.startTrailProgressAnimation();
        eVar.b.d = pv0Var.a;
        eVar.d.b(AddressResolveRepository.State.LOADED);
        addressMapFragment.changeAutoLocateButtonState(new c7p(true, true));
        obj = ((YandexTaxiFragment) addressMapFragment).callback;
        si00 si00Var = (si00) obj;
        if (si00Var != null) {
            si00Var.j(pv0Var);
        }
    }

    public final void b(zzs zzsVar, String str, wpb0 wpb0Var, PositionInitAction positionInitAction) {
        sx0 sx0Var = this.e;
        hbp0 hbp0Var = sx0Var.h;
        AddressMapFragment addressMapFragment = this.f.a;
        if (addressMapFragment.getActivity() == null || addressMapFragment.getView() == null) {
            return;
        }
        this.d.b(AddressResolveRepository.State.LOADING);
        hbp0Var.f();
        if (jl40.l(zzsVar, zzs.f)) {
            addressMapFragment.reportPinDropToEmptyGeoPointError();
        }
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(hbp0Var, null, null, new AddressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$safeCollectIn$1(new b(new jqr(((ru.yandex.taxi.search.suggest.i) this.a).o(zzsVar, str, sx0Var.b, wpb0Var != null ? wpb0Var.a : null, sx0Var.d, sx0Var.a, positionInitAction), new AddressMapFragmentAddressController$requestPositionChangedPinDrop$1(null, this), 3), this), null, this, positionInitAction), 3);
    }
}
