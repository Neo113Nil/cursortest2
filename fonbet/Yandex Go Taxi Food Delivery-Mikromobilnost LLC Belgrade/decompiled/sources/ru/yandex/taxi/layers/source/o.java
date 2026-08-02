package ru.yandex.taxi.layers.source;

import defpackage.byx;
import defpackage.fmt;
import defpackage.l5e0;
import defpackage.ny61;
import defpackage.o5e0;
import defpackage.r1e0;
import defpackage.wwg;
import defpackage.zyx;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.analytics.LayersService;

/* loaded from: classes9.dex */
public final class o extends c {
    public final n b;
    public final zyx c;

    public o(n nVar, zyx zyxVar) {
        this.b = nVar;
        this.c = zyxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.yandex.taxi.layers.source.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(l5e0 l5e0Var, ContinuationImpl continuationImpl) {
        PolylinesRepository$getResponse$1 polylinesRepository$getResponse$1;
        int i;
        if (continuationImpl instanceof PolylinesRepository$getResponse$1) {
            polylinesRepository$getResponse$1 = (PolylinesRepository$getResponse$1) continuationImpl;
            int i2 = polylinesRepository$getResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polylinesRepository$getResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polylinesRepository$getResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polylinesRepository$getResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    polylinesRepository$getResponse$1.L$0 = l5e0Var;
                    polylinesRepository$getResponse$1.label = 1;
                    obj = this.b.c(l5e0Var, polylinesRepository$getResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l5e0Var = (l5e0) polylinesRepository$getResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                o5e0 o5e0Var = (o5e0) fmtVar.a;
                r1e0 n = wwg.n(fmtVar);
                o5e0Var.g = n != null ? n.b : null;
                byx byxVar = l5e0Var.a;
                o5e0Var.h = byxVar;
                LayersService layersService = LayersService.POLYLINES;
                List list = o5e0Var.f;
                this.c.b(byxVar, layersService, list == null ? list.size() : 0, fmtVar.h - fmtVar.g);
                return o5e0Var;
            }
        }
        polylinesRepository$getResponse$1 = new PolylinesRepository$getResponse$1(this, continuationImpl);
        Object obj2 = polylinesRepository$getResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polylinesRepository$getResponse$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        o5e0 o5e0Var2 = (o5e0) fmtVar2.a;
        r1e0 n2 = wwg.n(fmtVar2);
        o5e0Var2.g = n2 != null ? n2.b : null;
        byx byxVar2 = l5e0Var.a;
        o5e0Var2.h = byxVar2;
        LayersService layersService2 = LayersService.POLYLINES;
        List list2 = o5e0Var2.f;
        this.c.b(byxVar2, layersService2, list2 == null ? list2.size() : 0, fmtVar2.h - fmtVar2.g);
        return o5e0Var2;
    }
}
