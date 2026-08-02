package ru.yandex.taxi.layers.source;

import defpackage.cne0;
import defpackage.cq60;
import defpackage.dne0;
import defpackage.fn21;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e {
    public final wnt a;
    public final tt2 b;
    public final ru.yandex.taxi.layers.source.factory.c c;
    public final fn21 d;
    public final cne0 e;
    public final Map f = Collections.synchronizedMap(new LinkedHashMap());

    public e(dne0 dne0Var, wnt wntVar, tt2 tt2Var, ru.yandex.taxi.layers.source.factory.c cVar, fn21 fn21Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = cVar;
        this.d = fn21Var;
        this.e = dne0Var.a("layers_map_object_prefs");
    }

    public final Object a(cq60 cq60Var, ContinuationImpl continuationImpl) {
        if (cq60Var.g != null) {
            this.b.getClass();
            return tje.k0(uyj.a, new MapObjectsRepository$obtainMapObjects$2(this, cq60Var, null), continuationImpl);
        }
        ny61.t("ObjectsResponse has no features");
        return null;
    }
}
