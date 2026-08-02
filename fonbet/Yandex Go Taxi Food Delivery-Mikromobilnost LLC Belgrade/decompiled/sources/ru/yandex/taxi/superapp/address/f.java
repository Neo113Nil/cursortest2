package ru.yandex.taxi.superapp.address;

import com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2;
import com.yandex.go.shortcuts.impl.interactors.l;
import com.yandex.go.shortcuts.impl.interactors.m;
import defpackage.f0t;
import defpackage.h1p;
import defpackage.jc00;
import defpackage.jqr;
import defpackage.mth;
import defpackage.rvf0;
import defpackage.tpr;
import defpackage.x6w0;
import defpackage.yaf0;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.yandex.taxi.superapp.AddressGeoPositionProvider$geoPositionFlow$$inlined$start$1;

/* loaded from: classes6.dex */
public final class f {
    public final ru.yandex.taxi.superapp.e a;
    public final rvf0 b;
    public final boolean c;
    public final h1p d;
    public f0t e;

    public f(ru.yandex.taxi.superapp.e eVar, rvf0 rvf0Var, x6w0 x6w0Var) {
        this.a = eVar;
        this.b = rvf0Var;
        this.c = x6w0Var.A;
        this.d = x6w0Var.a;
    }

    public final e a() {
        ru.yandex.taxi.superapp.e eVar = this.a;
        jc00 jc00Var = eVar.c;
        m mVar = eVar.a;
        ru.yandex.taxi.superapp.b bVar = new ru.yandex.taxi.superapp.b(new ru.yandex.taxi.superapp.d(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new l(mVar.i.a, jc00Var.a() ? yaf0.b : yaf0.a), new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2(3, null))), eVar), eVar);
        HashMap hashMap = eVar.j;
        h1p h1pVar = this.d;
        return new e(new jqr(new c(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.t(new mth(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{com.yandex.go.coroutines.b.d(bVar, new AddressGeoPositionProvider$geoPositionFlow$$inlined$start$1(hashMap.get(h1pVar), null)), eVar.b(h1pVar), new ru.yandex.taxi.superapp.d(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new l(mVar.i.a, yaf0.c), new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2(3, null))), eVar)}, 3)), 6)), 0, BufferOverflow.DROP_OLDEST, 1), this), new GeoPositionRepositoryImpl$lastGeoPositionFlow$2(this, null), 3));
    }
}
