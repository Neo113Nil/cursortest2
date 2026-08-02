package ru.yandex.taxi.layers;

import defpackage.a4e0;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.i6r;
import defpackage.ny61;
import defpackage.ysd0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.presentation.f;
import ru.yandex.taxi.layers.presentation.i;

/* loaded from: classes9.dex */
public final class b {
    public final ysd0 a;
    public final i6r b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public f f;
    public a4e0 g;
    public i h;
    public ru.yandex.taxi.layers.presentation.mapnotification.d i;
    public final r0 j = bvf0.c(Boolean.FALSE);
    public boolean k;

    public b(ysd0 ysd0Var, i6r i6rVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = ysd0Var;
        this.b = i6rVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LayersRouterImpl$waitUntilAttached$1 layersRouterImpl$waitUntilAttached$1;
        int i;
        if (continuationImpl instanceof LayersRouterImpl$waitUntilAttached$1) {
            layersRouterImpl$waitUntilAttached$1 = (LayersRouterImpl$waitUntilAttached$1) continuationImpl;
            int i2 = layersRouterImpl$waitUntilAttached$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersRouterImpl$waitUntilAttached$1.label = i2 - Integer.MIN_VALUE;
                Object obj = layersRouterImpl$waitUntilAttached$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersRouterImpl$waitUntilAttached$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LayersRouterImpl$waitUntilAttached$2 layersRouterImpl$waitUntilAttached$2 = new LayersRouterImpl$waitUntilAttached$2();
                    layersRouterImpl$waitUntilAttached$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(this.j, layersRouterImpl$waitUntilAttached$2, layersRouterImpl$waitUntilAttached$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        layersRouterImpl$waitUntilAttached$1 = new LayersRouterImpl$waitUntilAttached$1(this, continuationImpl);
        Object obj2 = layersRouterImpl$waitUntilAttached$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersRouterImpl$waitUntilAttached$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
