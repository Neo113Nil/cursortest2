package ru.yandex.taxi.requirements.glued.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;

    public b(tpr tprVar, c cVar) {
        this.a = tprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1 gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1) {
            gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1 = (GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1) continuation;
            int i2 = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.L$0 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.L$1 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.L$2 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1 = new GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
