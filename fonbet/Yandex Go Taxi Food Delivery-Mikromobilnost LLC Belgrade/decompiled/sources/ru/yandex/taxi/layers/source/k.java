package ru.yandex.taxi.layers.source;

import defpackage.aq00;
import defpackage.byx;
import defpackage.bzx;
import defpackage.c430;
import defpackage.cq60;
import defpackage.fmt;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.tyx;
import defpackage.wwg;
import defpackage.zyx;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.analytics.LayersService;

/* loaded from: classes9.dex */
public final class k extends c {
    public final f b;
    public final tyx c;
    public final zyx d;

    public k(f fVar, tyx tyxVar, zyx zyxVar) {
        this.b = fVar;
        this.c = tyxVar;
        this.d = zyxVar;
    }

    @Override // ru.yandex.taxi.layers.source.c
    public final void d(bzx bzxVar, byx byxVar) {
        cq60 cq60Var = (cq60) bzxVar;
        super.d(cq60Var, byxVar);
        c430 c430Var = byxVar.b;
        tyx tyxVar = this.c;
        tyxVar.getClass();
        Pair pair = new Pair(cq60Var, c430Var);
        tyxVar.b.g(pair);
        r0 r0Var = tyxVar.c;
        r0Var.getClass();
        r0Var.m(null, pair);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.yandex.taxi.layers.source.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(aq00 aq00Var, ContinuationImpl continuationImpl) {
        ObjectsRepository$getResponse$1 objectsRepository$getResponse$1;
        int i;
        if (continuationImpl instanceof ObjectsRepository$getResponse$1) {
            objectsRepository$getResponse$1 = (ObjectsRepository$getResponse$1) continuationImpl;
            int i2 = objectsRepository$getResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                objectsRepository$getResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = objectsRepository$getResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = objectsRepository$getResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    objectsRepository$getResponse$1.L$0 = aq00Var;
                    objectsRepository$getResponse$1.label = 1;
                    obj = this.b.c(aq00Var, objectsRepository$getResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aq00Var = (aq00) objectsRepository$getResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                cq60 cq60Var = (cq60) fmtVar.a;
                r1e0 n = wwg.n(fmtVar);
                cq60Var.m = n != null ? n.b : null;
                List list = cq60Var.g;
                byx byxVar = aq00Var.a;
                cq60Var.n = byxVar;
                LayersService layersService = LayersService.MAP_OBJECTS;
                this.d.b(byxVar, layersService, list == null ? list.size() : 0, fmtVar.h - fmtVar.g);
                this.d.c(aq00Var.a, layersService, list != null ? list.size() : 0, fmtVar.f);
                return cq60Var;
            }
        }
        objectsRepository$getResponse$1 = new ObjectsRepository$getResponse$1(this, continuationImpl);
        Object obj2 = objectsRepository$getResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = objectsRepository$getResponse$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        cq60 cq60Var2 = (cq60) fmtVar2.a;
        r1e0 n2 = wwg.n(fmtVar2);
        cq60Var2.m = n2 != null ? n2.b : null;
        List list2 = cq60Var2.g;
        byx byxVar2 = aq00Var.a;
        cq60Var2.n = byxVar2;
        LayersService layersService2 = LayersService.MAP_OBJECTS;
        this.d.b(byxVar2, layersService2, list2 == null ? list2.size() : 0, fmtVar2.h - fmtVar2.g);
        this.d.c(aq00Var.a, layersService2, list2 != null ? list2.size() : 0, fmtVar2.f);
        return cq60Var2;
    }
}
