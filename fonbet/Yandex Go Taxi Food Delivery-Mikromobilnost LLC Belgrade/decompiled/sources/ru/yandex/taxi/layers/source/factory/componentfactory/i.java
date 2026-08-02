package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class i implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.o a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public i(kotlinx.coroutines.flow.o oVar, l lVar, int i) {
        this.a = oVar;
        this.b = lVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1;
        int i;
        if (continuation instanceof AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) {
            advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 = (AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) continuation;
            int i2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b, this.c);
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$0 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$1 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$2 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) == coroutineSingletons) {
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
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 = new AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1(this, continuation);
        Object obj2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
