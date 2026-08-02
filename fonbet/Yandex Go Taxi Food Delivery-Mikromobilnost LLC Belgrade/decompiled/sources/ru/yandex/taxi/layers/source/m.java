package ru.yandex.taxi.layers.source;

import defpackage.byx;
import defpackage.d4e0;
import defpackage.fmt;
import defpackage.g4e0;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.wwg;
import defpackage.zyx;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.analytics.LayersService;

/* loaded from: classes9.dex */
public final class m extends c {
    public final l b;
    public final zyx c;

    public m(l lVar, zyx zyxVar) {
        this.b = lVar;
        this.c = zyxVar;
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
    public final Object c(d4e0 d4e0Var, ContinuationImpl continuationImpl) {
        PolygonsRepository$getResponse$1 polygonsRepository$getResponse$1;
        int i;
        if (continuationImpl instanceof PolygonsRepository$getResponse$1) {
            polygonsRepository$getResponse$1 = (PolygonsRepository$getResponse$1) continuationImpl;
            int i2 = polygonsRepository$getResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonsRepository$getResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polygonsRepository$getResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonsRepository$getResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    polygonsRepository$getResponse$1.L$0 = d4e0Var;
                    polygonsRepository$getResponse$1.label = 1;
                    obj = this.b.c(d4e0Var, polygonsRepository$getResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d4e0Var = (d4e0) polygonsRepository$getResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                g4e0 g4e0Var = (g4e0) fmtVar.a;
                r1e0 n = wwg.n(fmtVar);
                g4e0Var.h = n != null ? n.b : null;
                List list = g4e0Var.f;
                byx byxVar = d4e0Var.a;
                g4e0Var.i = byxVar;
                LayersService layersService = LayersService.POLYGONS;
                this.c.b(byxVar, layersService, list == null ? list.size() : 0, fmtVar.h - fmtVar.g);
                this.c.c(d4e0Var.a, layersService, list != null ? list.size() : 0, fmtVar.f);
                return g4e0Var;
            }
        }
        polygonsRepository$getResponse$1 = new PolygonsRepository$getResponse$1(this, continuationImpl);
        Object obj2 = polygonsRepository$getResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonsRepository$getResponse$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        g4e0 g4e0Var2 = (g4e0) fmtVar2.a;
        r1e0 n2 = wwg.n(fmtVar2);
        g4e0Var2.h = n2 != null ? n2.b : null;
        List list2 = g4e0Var2.f;
        byx byxVar2 = d4e0Var.a;
        g4e0Var2.i = byxVar2;
        LayersService layersService2 = LayersService.POLYGONS;
        this.c.b(byxVar2, layersService2, list2 == null ? list2.size() : 0, fmtVar2.h - fmtVar2.g);
        this.c.c(d4e0Var.a, layersService2, list2 != null ? list2.size() : 0, fmtVar2.f);
        return g4e0Var2;
    }
}
