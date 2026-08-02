package ru.yandex.taxi.routeselector.presentation;

import com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1;
import defpackage.b1c0;
import defpackage.p2c0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.x9l0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes6.dex */
public final class d extends b1c0 {
    public final x9l0 a;
    public final l b;
    public final AddressResolveRepository c;
    public final com.yandex.go.pin.repository.o d;
    public final tpr e;
    public final p2c0 f;

    public d(x9l0 x9l0Var, l lVar, AddressResolveRepository addressResolveRepository, com.yandex.go.pin.repository.o oVar, r0 r0Var, p2c0 p2c0Var) {
        this.a = x9l0Var;
        this.b = lVar;
        this.c = addressResolveRepository;
        this.d = oVar;
        this.e = r0Var;
        this.f = p2c0Var;
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.c.b, new RouteSelectorPinV2DataRepository$positionFlow$1(this.f.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        l lVar = this.b;
        return kotlinx.coroutines.flow.e.p(!lVar.a.m ? new f(lVar.b.a, lVar) : new rol0(new RouteSelectorPinV2StateRepository$stateFullInfoFlow$1(lVar, null)), 100L);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        boolean b = this.a.b();
        com.yandex.go.pin.repository.o oVar = this.d;
        return b ? kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(oVar.c(), new MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1(oVar, null))) : oVar.b();
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return this.e;
    }
}
