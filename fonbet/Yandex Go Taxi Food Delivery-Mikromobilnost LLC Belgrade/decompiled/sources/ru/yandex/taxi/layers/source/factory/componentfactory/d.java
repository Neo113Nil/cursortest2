package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.f0k;
import defpackage.fkp;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements tpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ e b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ f0k w;
    public final /* synthetic */ vm00 x;

    public d(b bVar, e eVar, fkp fkpVar, f0k f0kVar, vm00 vm00Var) {
        this.a = bVar;
        this.b = eVar;
        this.c = fkpVar;
        this.w = f0kVar;
        this.x = vm00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1;
        int i;
        if (continuation instanceof AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1) {
            advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1 = (AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1) continuation;
            int i2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c, this.w, this.x);
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.L$0 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.L$1 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.L$2 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1) == coroutineSingletons) {
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
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1 = new AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1(this, continuation);
        Object obj2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
