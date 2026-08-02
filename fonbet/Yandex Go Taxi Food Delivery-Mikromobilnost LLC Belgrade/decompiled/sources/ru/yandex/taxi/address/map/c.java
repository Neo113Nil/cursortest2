package ru.yandex.taxi.address.map;

import defpackage.b1c0;
import defpackage.e0c0;
import defpackage.g92;
import defpackage.p2c0;
import defpackage.r0c0;
import defpackage.tpr;
import defpackage.vtb0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes5.dex */
public final class c extends b1c0 {
    public final AddressResolveRepository a;
    public final vtb0 b;
    public final p2c0 c;
    public final SourceOnMapControl.a d;
    public final SourceOnMapControl.a e;
    public final SourceOnMapControl.a f;
    public final g92 g;

    public c(PointType pointType, r0c0 r0c0Var, AddressResolveRepository addressResolveRepository, vtb0 vtb0Var, p2c0 p2c0Var) {
        this.a = addressResolveRepository;
        this.b = vtb0Var;
        this.c = p2c0Var;
        this.d = new SourceOnMapControl.a(pointType.a() ? r0c0Var.h() : r0c0Var.b(), null, null, false, false, null, null, 2046);
        this.e = new SourceOnMapControl.a(e0c0.a, null, null, false, false, null, null, 2046);
        this.f = new SourceOnMapControl.a(r0c0Var.d(), null, null, false, false, null, null, 2046);
        this.g = new g92(2, pointType.a() ? r0c0Var.i() : r0c0Var.c());
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.a.b, new AddressSelectorPinV2DataRepository$positionFlow$1(this.c.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        r0 r0Var = this.a.a;
        return new m0(r0Var, ((ru.yandex.taxi.f) this.b).a(r0Var, this.d), new AddressSelectorPinV2DataRepository$stateFlow$1(this, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return this.g;
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
