package ru.yandex.taxi.layers.source;

import defpackage.aq00;
import defpackage.cmt;
import defpackage.cq60;
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
public final class f extends sx4 {
    public final LayersApi h;
    public final tt2 i;
    public final ru.yandex.taxi.layers.e j;

    public f(tt2 tt2Var, wd7 wd7Var, wnt wntVar, nmx nmxVar, wiq0 wiq0Var, pwy0 pwy0Var, com.yandex.go.taxi.tariffs.repository.g gVar, ru.yandex.taxi.layers.e eVar, LayersApi layersApi) {
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
    public final Object c(aq00 aq00Var, ContinuationImpl continuationImpl) {
        ObjectsApiSource$getObjects$1 objectsApiSource$getObjects$1;
        int i;
        if (continuationImpl instanceof ObjectsApiSource$getObjects$1) {
            objectsApiSource$getObjects$1 = (ObjectsApiSource$getObjects$1) continuationImpl;
            int i2 = objectsApiSource$getObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                objectsApiSource$getObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = objectsApiSource$getObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = objectsApiSource$getObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    objectsApiSource$getObjects$1.L$0 = aq00Var;
                    objectsApiSource$getObjects$1.label = 1;
                    obj = this.j.a(objectsApiSource$getObjects$1);
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
                        aq00Var = (aq00) objectsApiSource$getObjects$1.L$0;
                        kotlin.b.b(obj);
                        cmt<cq60> c = this.h.c(new wyx(a((l3u0) obj, aq00Var.a.b.c), aq00Var.a.b.b, null));
                        objectsApiSource$getObjects$1.L$0 = null;
                        objectsApiSource$getObjects$1.L$1 = null;
                        objectsApiSource$getObjects$1.L$2 = null;
                        objectsApiSource$getObjects$1.L$3 = null;
                        objectsApiSource$getObjects$1.label = 3;
                        Object b = ru.yandex.taxi.network.api.a.b(c, null, objectsApiSource$getObjects$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    aq00Var = (aq00) objectsApiSource$getObjects$1.L$0;
                    kotlin.b.b(obj);
                }
                this.i.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                ObjectsApiSource$getObjects$state$1 objectsApiSource$getObjects$state$1 = new ObjectsApiSource$getObjects$state$1(this, (zzs) obj, aq00Var, null);
                objectsApiSource$getObjects$1.L$0 = aq00Var;
                objectsApiSource$getObjects$1.L$1 = null;
                objectsApiSource$getObjects$1.label = 2;
                obj = tje.k0(g6uVar, objectsApiSource$getObjects$state$1, objectsApiSource$getObjects$1);
            }
        }
        objectsApiSource$getObjects$1 = new ObjectsApiSource$getObjects$1(this, continuationImpl);
        Object obj2 = objectsApiSource$getObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = objectsApiSource$getObjects$1.label;
        if (i != 0) {
        }
        this.i.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        ObjectsApiSource$getObjects$state$1 objectsApiSource$getObjects$state$12 = new ObjectsApiSource$getObjects$state$1(this, (zzs) obj2, aq00Var, null);
        objectsApiSource$getObjects$1.L$0 = aq00Var;
        objectsApiSource$getObjects$1.L$1 = null;
        objectsApiSource$getObjects$1.label = 2;
        obj2 = tje.k0(g6uVar2, objectsApiSource$getObjects$state$12, objectsApiSource$getObjects$1);
    }
}
