package ru.yandex.taxi.layers.presentation.walkroute.simple;

import defpackage.a3v;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.zzs;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.layers.presentation.walkroute.e;

/* loaded from: classes9.dex */
public final class a extends e {
    public final a3v e;
    public final pwy0 f;

    public a(ru.yandex.taxi.walkroute.a aVar, a3v a3vVar, pwy0 pwy0Var) {
        super(aVar);
        this.e = a3vVar;
        this.f = pwy0Var;
    }

    @Override // ru.yandex.taxi.layers.presentation.walkroute.e
    public final g d(zzs zzsVar, String str) {
        return kotlinx.coroutines.flow.e.X(new rol0(new SimpleWalkRouteInteractor$listenToWalkRoutes$1(zzsVar, str, null, this)), new SimpleWalkRouteInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1(null, this, str));
    }
}
