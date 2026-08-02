package ru.yandex.taxi.logistics.ndd_map.pin;

import defpackage.b1c0;
import defpackage.li50;
import defpackage.oh50;
import defpackage.r0c0;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes5.dex */
public final class g extends b1c0 {
    public final r0c0 a;
    public final AddressResolveRepository b;
    public final oh50 c;
    public final b d;

    public g(r0c0 r0c0Var, AddressResolveRepository addressResolveRepository, oh50 oh50Var, li50 li50Var) {
        this.a = r0c0Var;
        this.b = addressResolveRepository;
        this.c = oh50Var;
        this.d = new b(li50Var.b.b);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.b.b, new NddAddressMapPickerPinV2DataRepository$positionFlow$1(3, null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return new m0(this.d, this.b.a, new NddAddressMapPickerPinV2DataRepository$stateFlow$1(this, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return new d(this.d, this.a);
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new f(this.c.b);
    }
}
