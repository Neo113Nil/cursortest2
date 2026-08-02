package ru.yandex.taxi.map_common.style.domain;

import defpackage.bt00;
import defpackage.mdh;
import defpackage.oxu0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.map_common.style.source.MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.map_common.style.source.e;
import ru.yandex.taxi.map_common.style.source.internal.b;
import ru.yandex.taxi.styling.g;

/* loaded from: classes9.dex */
public final class a {
    public final bt00 a;

    public a(bt00 bt00Var) {
        this.a = bt00Var;
    }

    public final tpr a() {
        e eVar = (e) this.a;
        n nVar = new n(kotlinx.coroutines.flow.e.t(new b(((g) ((oxu0) eVar.g.a)).c())), new MapStyleInteractor$mainMapStyleConfigFlow$1(2, null));
        n nVar2 = new n(eVar.h, new MapStyleInteractor$mainMapStyleConfigFlow$2(2, null));
        ru.yandex.taxi.map_common.style.source.b bVar = new ru.yandex.taxi.map_common.style.source.b(eVar.c.a, eVar);
        eVar.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.t(new n(kotlinx.coroutines.flow.e.n(nVar, nVar2, new n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(bVar, mdh.b), new MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$flatMapLatest$1(null, eVar)), new MapStyleInteractor$mainMapStyleConfigFlow$3(2, null)), new MapStyleInteractor$mainMapStyleConfigFlow$4(this, null)), new MapStyleInteractor$mainMapStyleConfigFlow$5(this, null)));
    }
}
