package ru.yandex.taxi.layers.source;

import defpackage.byx;
import defpackage.nmx;
import defpackage.pwy0;
import defpackage.sx4;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wd7;
import defpackage.wiq0;
import defpackage.wnt;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.layers.api.LayersApi;

/* loaded from: classes5.dex */
public final class d extends sx4 {
    public final LayersApi h;
    public final wnt i;
    public final tt2 j;
    public final ru.yandex.taxi.layers.e k;

    public d(tt2 tt2Var, wd7 wd7Var, wnt wntVar, nmx nmxVar, wiq0 wiq0Var, pwy0 pwy0Var, com.yandex.go.taxi.tariffs.repository.g gVar, ru.yandex.taxi.layers.e eVar, LayersApi layersApi) {
        super(wntVar, eVar, pwy0Var, nmxVar, wiq0Var, gVar, wd7Var);
        this.h = layersApi;
        this.i = wntVar;
        this.j = tt2Var;
        this.k = eVar;
    }

    public final Object c(byx byxVar, Continuation continuation) {
        this.j.getClass();
        return tje.k0(uyj.a, new ClusterApiSource$getCluster$2(this, byxVar, null), continuation);
    }
}
