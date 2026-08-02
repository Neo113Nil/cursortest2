package ru.yandex.taxi.logistics.ndd_map.walkroute;

import defpackage.e3n;
import defpackage.f5v0;
import defpackage.kp50;
import defpackage.o430;
import defpackage.q5c;
import defpackage.rol0;
import defpackage.zzs;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.layers.presentation.walkroute.e;

/* loaded from: classes5.dex */
public final class a extends e {
    public final f5v0 e;
    public final q5c f;

    public a(ru.yandex.taxi.walkroute.a aVar, f5v0 f5v0Var) {
        super(aVar);
        this.e = f5v0Var;
        o430 o430Var = e3n.b;
        this.f = new q5c(0.0d, e3n.m(kp50.U(600, DurationUnit.MINUTES), DurationUnit.SECONDS));
    }

    @Override // ru.yandex.taxi.layers.presentation.walkroute.e
    public final q5c b() {
        return this.f;
    }

    @Override // ru.yandex.taxi.layers.presentation.walkroute.e
    public final g d(zzs zzsVar, String str) {
        return kotlinx.coroutines.flow.e.X(new rol0(new SimpleWalkToDeliveryInteractor$listenToWalkRoutes$1(this, str, zzsVar, null)), new SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1(null, (zzs) this.e.b.a.getValue(), this, zzsVar));
    }
}
