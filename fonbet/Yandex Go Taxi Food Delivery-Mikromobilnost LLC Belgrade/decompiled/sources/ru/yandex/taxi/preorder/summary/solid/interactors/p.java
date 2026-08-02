package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class p implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ s b;

    public p(kotlinx.coroutines.flow.internal.g gVar, s sVar) {
        this.a = gVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1 copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1;
        int i;
        if (continuation instanceof CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1) {
            copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1 = (CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1) continuation;
            int i2 = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.L$0 = null;
                    copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.L$1 = null;
                    copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.L$2 = null;
                    copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(oVar, copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1) == coroutineSingletons) {
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
        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1 = new CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1(this, continuation);
        Object obj2 = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
