package ru.yandex.taxi.routeselector;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.pickup_from_photo.navigation.c;
import defpackage.avj0;
import defpackage.b1;
import defpackage.byb;
import defpackage.cob0;
import defpackage.eov0;
import defpackage.h55;
import defpackage.hnb0;
import defpackage.hxj0;
import defpackage.hxx;
import defpackage.i130;
import defpackage.i6r;
import defpackage.jqr;
import defpackage.kev0;
import defpackage.kyh0;
import defpackage.mhf;
import defpackage.n050;
import defpackage.n3o;
import defpackage.oep0;
import defpackage.ohk0;
import defpackage.pep0;
import defpackage.pp0;
import defpackage.q9l0;
import defpackage.qy41;
import defpackage.t3g;
import defpackage.uet0;
import defpackage.umb0;
import defpackage.v8l0;
import defpackage.v9l0;
import defpackage.vzb;
import defpackage.w6r;
import defpackage.x9l0;
import defpackage.y9l0;
import defpackage.yit0;
import defpackage.yvf0;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.design.sourcedestination.PinType;
import ru.yandex.taxi.persuggest.source.f;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final zuj0 D;
    public final mhf E;
    public final n050 F;
    public final yit0 G;
    public final yvf0 H;
    public final qy41 I;
    public final AddressResolveRepository J;
    public final n3o K;
    public final kev0 L;
    public final i130 M;
    public final i6r N;
    public final uet0 O;
    public final yvf0 P;
    public final v8l0 Q;
    public final b1 R;
    public final pp0 S;
    public final byb T;
    public final w6r U;
    public final yvf0 V;
    public final hnb0 W;
    public final oep0 Z;

    public a(zuj0 zuj0Var, mhf mhfVar, n050 n050Var, yit0 yit0Var, yvf0 yvf0Var, qy41 qy41Var, AddressResolveRepository addressResolveRepository, n3o n3oVar, kev0 kev0Var, i130 i130Var, i6r i6rVar, uet0 uet0Var, yvf0 yvf0Var2, v8l0 v8l0Var, b1 b1Var, pp0 pp0Var, byb bybVar, w6r w6rVar, yvf0 yvf0Var3, hnb0 hnb0Var, oep0 oep0Var) {
        super(null);
        this.D = zuj0Var;
        this.E = mhfVar;
        this.F = n050Var;
        this.G = yit0Var;
        this.H = yvf0Var;
        this.I = qy41Var;
        this.J = addressResolveRepository;
        this.K = n3oVar;
        this.L = kev0Var;
        this.M = i130Var;
        this.N = i6rVar;
        this.O = uet0Var;
        this.P = yvf0Var2;
        this.Q = v8l0Var;
        this.R = b1Var;
        this.S = pp0Var;
        this.T = bybVar;
        this.U = w6rVar;
        this.V = yvf0Var3;
        this.W = hnb0Var;
        this.Z = oep0Var;
    }

    public static final void P(a aVar, ModalViewOrigin modalViewOrigin, PickupFromPhotoPayload$Origin pickupFromPhotoPayload$Origin) {
        c cVar = (c) aVar.V.get();
        if (modalViewOrigin == ModalViewOrigin.SUMMARY) {
            e.H(aVar.o(), new jqr(e.c(cVar.M.a), new RouteSelectorNavigationRouter$openPickupFromPhoto$1(aVar, null), 3));
        }
        ((umb0) aVar.W).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
        ((pep0) aVar.Z).f(cVar, new cob0(pickupFromPhotoPayload$Origin, true), hxx.a);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((f) this.U).c = false;
        this.Q.e.cancel();
        this.M.a().c(RouteSelectorModalView.class, true, null);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        y9l0 y9l0Var = (y9l0) obj;
        f fVar = (f) this.U;
        fVar.c = true;
        fVar.a();
        Q(y9l0Var, y9l0Var.a, y9l0Var.b, y9l0Var.g);
    }

    public final void Q(y9l0 y9l0Var, ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason, RouteSelectorOpenReason routeSelectorOpenReason2) {
        SourcePicker sourcePicker = y9l0Var.a == ModalViewOrigin.HOME ? SourcePicker.A_FROM_HOME : SourcePicker.A_FROM_SUMMARY;
        q9l0 q9l0Var = new q9l0(this, y9l0Var, sourcePicker, modalViewOrigin, routeSelectorOpenReason);
        String str = y9l0Var.c;
        String str2 = y9l0Var.d;
        String str3 = y9l0Var.e;
        v9l0 v9l0Var = new v9l0(q9l0Var);
        if (str == null) {
            str = ((avj0) this.D).h(kyh0.new_point_selection_screen_starting_point_title_statement);
        }
        v9l0Var.g = str;
        v9l0Var.k = str2;
        int i = kyh0.new_point_selection_screen_confirm_button_title;
        v9l0Var.e = null;
        v9l0Var.d = i;
        v9l0Var.b = sourcePicker;
        v9l0Var.c = PinType.PICKER;
        v9l0Var.r = new ohk0(16, this);
        v9l0Var.j = true;
        v9l0Var.o = routeSelectorOpenReason;
        v9l0Var.h = routeSelectorOpenReason == RouteSelectorOpenReason.SUMMARY;
        v9l0Var.q = new hxj0(10, this);
        v9l0Var.p = routeSelectorOpenReason2;
        if (str3 != null) {
            v9l0Var.d = 0;
            v9l0Var.e = str3;
        }
        x9l0 x9l0Var = new x9l0(v9l0Var);
        eov0 eov0Var = new eov0(this.R, modalViewOrigin);
        i6r i6rVar = this.N;
        i6rVar.getClass();
        AddressResolveRepository addressResolveRepository = this.J;
        addressResolveRepository.getClass();
        RouteSelectorModalView a = new t3g(i6rVar, x9l0Var, eov0Var, addressResolveRepository).a();
        this.Q.a();
        this.E.c();
        a.setOnAppearingListener(new vzb(2, this));
        this.M.a().s(a, false);
    }
}
