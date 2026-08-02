package ru.yandex.taxi.masstransit.domain;

import defpackage.i540;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1 mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1) {
            mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1 = (MtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MtSummaryCommunicationsResponse.b.a aVar = ((i540) obj).a.a.b;
                    mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.L$0 = null;
                    mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.L$1 = null;
                    mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.L$2 = null;
                    mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.L$3 = null;
                    mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(aVar, mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1 = new MtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtObjectsOverMapInteractorImpl$objectsOverMapFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
