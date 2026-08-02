package ru.yandex.taxi.layers.source;

import defpackage.cmt;
import defpackage.d4e0;
import defpackage.g4e0;
import defpackage.g6u;
import defpackage.l3u0;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.sx4;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wd7;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.wyx;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.api.LayersApi;

/* loaded from: classes9.dex */
public final class l extends sx4 {
    public final LayersApi h;
    public final tt2 i;
    public final ru.yandex.taxi.layers.e j;

    public l(tt2 tt2Var, wd7 wd7Var, wnt wntVar, nmx nmxVar, wiq0 wiq0Var, pwy0 pwy0Var, com.yandex.go.taxi.tariffs.repository.g gVar, ru.yandex.taxi.layers.e eVar, LayersApi layersApi) {
        super(wntVar, eVar, pwy0Var, nmxVar, wiq0Var, gVar, wd7Var);
        this.h = layersApi;
        this.i = tt2Var;
        this.j = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d4e0 d4e0Var, ContinuationImpl continuationImpl) {
        PolygonsApiSource$getPolygons$1 polygonsApiSource$getPolygons$1;
        int i;
        if (continuationImpl instanceof PolygonsApiSource$getPolygons$1) {
            polygonsApiSource$getPolygons$1 = (PolygonsApiSource$getPolygons$1) continuationImpl;
            int i2 = polygonsApiSource$getPolygons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonsApiSource$getPolygons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polygonsApiSource$getPolygons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsApiSource$getPolygons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    polygonsApiSource$getPolygons$1.L$0 = d4e0Var;
                    polygonsApiSource$getPolygons$1.label = 1;
                    obj = this.j.a(polygonsApiSource$getPolygons$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        d4e0Var = (d4e0) polygonsApiSource$getPolygons$1.L$0;
                        kotlin.b.b(obj);
                        cmt<g4e0> d = this.h.d(new wyx(a((l3u0) obj, d4e0Var.a.b.c), d4e0Var.a.b.b, d4e0Var.b));
                        polygonsApiSource$getPolygons$1.L$0 = null;
                        polygonsApiSource$getPolygons$1.L$1 = null;
                        polygonsApiSource$getPolygons$1.L$2 = null;
                        polygonsApiSource$getPolygons$1.L$3 = null;
                        polygonsApiSource$getPolygons$1.label = 3;
                        Object b = ru.yandex.taxi.network.api.a.b(d, null, polygonsApiSource$getPolygons$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    d4e0Var = (d4e0) polygonsApiSource$getPolygons$1.L$0;
                    kotlin.b.b(obj);
                }
                this.i.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                PolygonsApiSource$getPolygons$state$1 polygonsApiSource$getPolygons$state$1 = new PolygonsApiSource$getPolygons$state$1(this, (zzs) obj, d4e0Var, null);
                polygonsApiSource$getPolygons$1.L$0 = d4e0Var;
                polygonsApiSource$getPolygons$1.L$1 = null;
                polygonsApiSource$getPolygons$1.label = 2;
                obj = tje.k0(g6uVar, polygonsApiSource$getPolygons$state$1, polygonsApiSource$getPolygons$1);
            }
        }
        polygonsApiSource$getPolygons$1 = new PolygonsApiSource$getPolygons$1(this, continuationImpl);
        Object obj2 = polygonsApiSource$getPolygons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsApiSource$getPolygons$1.label;
        if (i != 0) {
        }
        this.i.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        PolygonsApiSource$getPolygons$state$1 polygonsApiSource$getPolygons$state$12 = new PolygonsApiSource$getPolygons$state$1(this, (zzs) obj2, d4e0Var, null);
        polygonsApiSource$getPolygons$1.L$0 = d4e0Var;
        polygonsApiSource$getPolygons$1.L$1 = null;
        polygonsApiSource$getPolygons$1.label = 2;
        obj2 = tje.k0(g6uVar2, polygonsApiSource$getPolygons$state$12, polygonsApiSource$getPolygons$1);
    }
}
