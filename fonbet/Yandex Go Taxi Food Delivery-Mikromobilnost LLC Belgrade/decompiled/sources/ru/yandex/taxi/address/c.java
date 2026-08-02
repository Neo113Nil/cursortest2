package ru.yandex.taxi.address;

import com.yandex.go.address.models.Address;
import defpackage.a41;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.c7p;
import defpackage.hnb0;
import defpackage.iy0;
import defpackage.jqr;
import defpackage.mob0;
import defpackage.nx0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.q330;
import defpackage.tdp;
import defpackage.tje;
import defpackage.tls;
import defpackage.yvf0;
import defpackage.z2e;
import defpackage.z31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.fragment.preorder.f;

/* loaded from: classes5.dex */
public final class c extends ad5 {
    public final hnb0 A;
    public final f B;
    public final z31 C;
    public final yvf0 D;
    public final oep0 E;
    public final ru.yandex.taxi.favorites.address.api.experiment.a F;
    public final ru.yandex.taxi.favorites.address.impl.data.a G;
    public boolean H;
    public boolean I;
    public final r0 J;
    public final r0 K;
    public pzt0 L;
    public pzt0 M;
    public pzt0 N;
    public final AddressResolveRepository x;
    public final mob0 y;
    public final pav z;

    public c(AddressResolveRepository addressResolveRepository, mob0 mob0Var, pav pavVar, hnb0 hnb0Var, f fVar, z31 z31Var, yvf0 yvf0Var, oep0 oep0Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar, ru.yandex.taxi.favorites.address.impl.data.a aVar2) {
        super(iy0.class);
        this.x = addressResolveRepository;
        this.y = mob0Var;
        this.z = pavVar;
        this.A = hnb0Var;
        this.B = fVar;
        this.C = z31Var;
        this.D = yvf0Var;
        this.E = oep0Var;
        this.F = aVar;
        this.G = aVar2;
        this.H = true;
        this.J = bvf0.c(null);
        this.K = bvf0.c(new a41(0));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.C.detach();
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
    }

    public final void Kg(AddressMapFragment addressMapFragment) {
        Bg(addressMapFragment);
        tje.N(Jg(), null, null, new AddressMapPresenter$attachView$1(this, addressMapFragment, null), 3);
        if (this.I) {
            mob0 mob0Var = this.y;
            if (mob0Var.b()) {
                tje.N(Jg(), null, null, new AddressMapPresenter$attachView$2(this, null), 3);
                e.H(Jg(), new jqr(new b(mob0Var.c()), new AddressMapPresenter$attachView$4(this, null), 3));
            }
        }
        if (this.H) {
            tje.N(Jg(), null, null, new AddressMapPresenter$subscribeToAddressState$1(this, null), 3);
            tje.N(Jg(), null, null, new AddressMapPresenter$subscribeToAddressState$2(this, null), 3);
        } else {
            a41 a41Var = a41.h;
            r0 r0Var = this.K;
            r0Var.getClass();
            r0Var.m(null, a41Var);
        }
    }

    public final void Lg(pv0 pv0Var) {
        r0 r0Var;
        Object value;
        if (this.H) {
            do {
                r0Var = this.J;
                value = r0Var.getValue();
            } while (!r0Var.k(value, pv0Var));
        }
    }

    public final void Mg(c7p c7pVar) {
        if (!this.H) {
            return;
        }
        while (true) {
            r0 r0Var = this.K;
            Object value = r0Var.getValue();
            c7p c7pVar2 = c7pVar;
            if (r0Var.k(value, a41.a((a41) value, null, c7pVar2, null, null, null, null, null, HProv.PP_DELETE_KEYSET))) {
                return;
            } else {
                c7pVar = c7pVar2;
            }
        }
    }

    public final void Ng(z2e z2eVar) {
        if (!this.H) {
            return;
        }
        while (true) {
            r0 r0Var = this.K;
            Object value = r0Var.getValue();
            z2e z2eVar2 = z2eVar;
            if (r0Var.k(value, a41.a((a41) value, null, null, null, z2eVar2, null, null, null, 119))) {
                return;
            } else {
                z2eVar = z2eVar2;
            }
        }
    }

    public final void Og(c7p c7pVar) {
        if (!this.H) {
            return;
        }
        while (true) {
            r0 r0Var = this.K;
            Object value = r0Var.getValue();
            c7p c7pVar2 = c7pVar;
            if (r0Var.k(value, a41.a((a41) value, null, null, null, null, null, c7pVar2, null, 95))) {
                return;
            } else {
                c7pVar = c7pVar2;
            }
        }
    }

    public final void Pg(q330 q330Var) {
        if (!this.H) {
            return;
        }
        while (true) {
            r0 r0Var = this.K;
            Object value = r0Var.getValue();
            q330 q330Var2 = q330Var;
            if (r0Var.k(value, a41.a((a41) value, null, null, null, null, q330Var2, null, null, 111))) {
                return;
            } else {
                q330Var = q330Var2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Qg(pv0 pv0Var, ContinuationImpl continuationImpl) {
        AddressMapPresenter$isSaveAddressEnabled$1 addressMapPresenter$isSaveAddressEnabled$1;
        Object obj;
        int i;
        boolean z;
        int i2;
        if (continuationImpl instanceof AddressMapPresenter$isSaveAddressEnabled$1) {
            addressMapPresenter$isSaveAddressEnabled$1 = (AddressMapPresenter$isSaveAddressEnabled$1) continuationImpl;
            int i3 = addressMapPresenter$isSaveAddressEnabled$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                addressMapPresenter$isSaveAddressEnabled$1.label = i3 - Integer.MIN_VALUE;
                obj = addressMapPresenter$isSaveAddressEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPresenter$isSaveAddressEnabled$1.label;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address address = pv0Var != null ? pv0Var.a : null;
                    int i4 = (address == null || !address.getIsFavorite()) ? 0 : 1;
                    addressMapPresenter$isSaveAddressEnabled$1.L$0 = null;
                    addressMapPresenter$isSaveAddressEnabled$1.L$1 = null;
                    addressMapPresenter$isSaveAddressEnabled$1.I$0 = i4;
                    addressMapPresenter$isSaveAddressEnabled$1.label = 1;
                    obj = this.F.a.b(addressMapPresenter$isSaveAddressEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = addressMapPresenter$isSaveAddressEnabled$1.I$0;
                    kotlin.b.b(obj);
                }
                if (((tdp) obj).b && i2 == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        addressMapPresenter$isSaveAddressEnabled$1 = new AddressMapPresenter$isSaveAddressEnabled$1(this, continuationImpl);
        obj = addressMapPresenter$isSaveAddressEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPresenter$isSaveAddressEnabled$1.label;
        z = false;
        if (i != 0) {
        }
        if (((tdp) obj).b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Rg(pv0 pv0Var, ContinuationImpl continuationImpl) {
        AddressMapPresenter$mergeWithNearbyFavorite$1 addressMapPresenter$mergeWithNearbyFavorite$1;
        int i;
        Address address;
        if (continuationImpl instanceof AddressMapPresenter$mergeWithNearbyFavorite$1) {
            addressMapPresenter$mergeWithNearbyFavorite$1 = (AddressMapPresenter$mergeWithNearbyFavorite$1) continuationImpl;
            int i2 = addressMapPresenter$mergeWithNearbyFavorite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPresenter$mergeWithNearbyFavorite$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPresenter$mergeWithNearbyFavorite$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPresenter$mergeWithNearbyFavorite$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (pv0Var == null || (address = pv0Var.a) == null) {
                        return null;
                    }
                    addressMapPresenter$mergeWithNearbyFavorite$1.L$0 = null;
                    addressMapPresenter$mergeWithNearbyFavorite$1.L$1 = null;
                    addressMapPresenter$mergeWithNearbyFavorite$1.L$2 = pv0Var;
                    addressMapPresenter$mergeWithNearbyFavorite$1.label = 1;
                    obj = this.G.c(address, addressMapPresenter$mergeWithNearbyFavorite$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) addressMapPresenter$mergeWithNearbyFavorite$1.L$2;
                    kotlin.b.b(obj);
                }
                return pv0Var.c((Address) obj);
            }
        }
        addressMapPresenter$mergeWithNearbyFavorite$1 = new AddressMapPresenter$mergeWithNearbyFavorite$1(this, continuationImpl);
        Object obj3 = addressMapPresenter$mergeWithNearbyFavorite$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPresenter$mergeWithNearbyFavorite$1.label;
        if (i != 0) {
        }
        return pv0Var.c((Address) obj3);
    }

    public final void Sg(boolean z, nx0 nx0Var, tls tlsVar) {
        Mg(new c7p(false, false));
        Pg(new q330(true, true));
        Ng(new z2e(8, true, false, true));
        Og(new c7p(false, false));
        boolean z2 = ((AddressResolveRepository.State) this.x.a.getValue()) == AddressResolveRepository.State.LOADED;
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(Jg(), null, null, new AddressMapPresenter$onLocationClick$1(this, z, z2, nx0Var, tlsVar, null), 3);
    }

    public final void Tg() {
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(Jg(), null, null, new AddressMapPresenter$positionMapToCurrentLocation$1(this, null), 3);
    }

    public final void Ug(boolean z, nx0 nx0Var, tls tlsVar) {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(Jg(), null, null, new AddressMapPresenter$requestCurrentLocation$1(this, z, nx0Var, tlsVar, null), 3);
    }
}
