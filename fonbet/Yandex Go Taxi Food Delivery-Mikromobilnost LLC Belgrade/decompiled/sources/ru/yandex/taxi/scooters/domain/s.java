package ru.yandex.taxi.scooters.domain;

import defpackage.pwy0;
import defpackage.rol0;
import defpackage.zzs;

/* loaded from: classes5.dex */
public final class s extends ru.yandex.taxi.layers.presentation.walkroute.e {
    public final ru.yandex.taxi.scooters.data.g e;
    public final pwy0 f;

    public s(ru.yandex.taxi.walkroute.a aVar, ru.yandex.taxi.scooters.data.g gVar, pwy0 pwy0Var) {
        super(aVar);
        this.e = gVar;
        this.f = pwy0Var;
    }

    @Override // ru.yandex.taxi.layers.presentation.walkroute.e
    public final kotlinx.coroutines.flow.internal.g d(zzs zzsVar, String str) {
        return kotlinx.coroutines.flow.e.X(new rol0(new ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1(zzsVar, str, null, this)), new ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1(null, this, str));
    }
}
