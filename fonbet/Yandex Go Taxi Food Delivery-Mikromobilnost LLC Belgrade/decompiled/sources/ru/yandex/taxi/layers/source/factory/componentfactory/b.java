package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.o a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ym00 c;

    public b(kotlinx.coroutines.flow.o oVar, e eVar, ym00 ym00Var) {
        this.a = oVar;
        this.b = eVar;
        this.c = ym00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1;
        int i;
        if (continuation instanceof AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) {
            advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 = (AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) continuation;
            int i2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$0 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$1 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.L$2 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1) == coroutineSingletons) {
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
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1 = new AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1(this, continuation);
        Object obj2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
