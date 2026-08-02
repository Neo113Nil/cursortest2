package ru.yandex.taxi.layers.source;

import defpackage.cmt;
import defpackage.g6u;
import defpackage.l3u0;
import defpackage.l5e0;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o5e0;
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
public final class n extends sx4 {
    public final LayersApi h;
    public final tt2 i;
    public final ru.yandex.taxi.layers.e j;

    public n(tt2 tt2Var, wd7 wd7Var, wnt wntVar, nmx nmxVar, wiq0 wiq0Var, pwy0 pwy0Var, com.yandex.go.taxi.tariffs.repository.g gVar, ru.yandex.taxi.layers.e eVar, LayersApi layersApi) {
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
    public final Object c(l5e0 l5e0Var, ContinuationImpl continuationImpl) {
        PolylinesApiSource$getPolylines$1 polylinesApiSource$getPolylines$1;
        int i;
        if (continuationImpl instanceof PolylinesApiSource$getPolylines$1) {
            polylinesApiSource$getPolylines$1 = (PolylinesApiSource$getPolylines$1) continuationImpl;
            int i2 = polylinesApiSource$getPolylines$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polylinesApiSource$getPolylines$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polylinesApiSource$getPolylines$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polylinesApiSource$getPolylines$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    polylinesApiSource$getPolylines$1.L$0 = l5e0Var;
                    polylinesApiSource$getPolylines$1.label = 1;
                    obj = this.j.a(polylinesApiSource$getPolylines$1);
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
                        l5e0Var = (l5e0) polylinesApiSource$getPolylines$1.L$0;
                        kotlin.b.b(obj);
                        cmt<o5e0> a = this.h.a(new wyx(a((l3u0) obj, l5e0Var.a.b.c), l5e0Var.a.b.b, null));
                        polylinesApiSource$getPolylines$1.L$0 = null;
                        polylinesApiSource$getPolylines$1.L$1 = null;
                        polylinesApiSource$getPolylines$1.L$2 = null;
                        polylinesApiSource$getPolylines$1.L$3 = null;
                        polylinesApiSource$getPolylines$1.label = 3;
                        Object b = ru.yandex.taxi.network.api.a.b(a, null, polylinesApiSource$getPolylines$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    l5e0Var = (l5e0) polylinesApiSource$getPolylines$1.L$0;
                    kotlin.b.b(obj);
                }
                this.i.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                PolylinesApiSource$getPolylines$state$1 polylinesApiSource$getPolylines$state$1 = new PolylinesApiSource$getPolylines$state$1(this, (zzs) obj, l5e0Var, null);
                polylinesApiSource$getPolylines$1.L$0 = l5e0Var;
                polylinesApiSource$getPolylines$1.L$1 = null;
                polylinesApiSource$getPolylines$1.label = 2;
                obj = tje.k0(g6uVar, polylinesApiSource$getPolylines$state$1, polylinesApiSource$getPolylines$1);
            }
        }
        polylinesApiSource$getPolylines$1 = new PolylinesApiSource$getPolylines$1(this, continuationImpl);
        Object obj2 = polylinesApiSource$getPolylines$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polylinesApiSource$getPolylines$1.label;
        if (i != 0) {
        }
        this.i.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        PolylinesApiSource$getPolylines$state$1 polylinesApiSource$getPolylines$state$12 = new PolylinesApiSource$getPolylines$state$1(this, (zzs) obj2, l5e0Var, null);
        polylinesApiSource$getPolylines$1.L$0 = l5e0Var;
        polylinesApiSource$getPolylines$1.L$1 = null;
        polylinesApiSource$getPolylines$1.label = 2;
        obj2 = tje.k0(g6uVar2, polylinesApiSource$getPolylines$state$12, polylinesApiSource$getPolylines$1);
    }
}
