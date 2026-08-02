package ru.yandex.taxi.preorder.source;

import defpackage.cjt0;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ cjt0 b;

    public l(jqr jqrVar, cjt0 cjt0Var) {
        this.a = jqrVar;
        this.b = cjt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1 sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1;
        int i;
        if (continuation instanceof SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1) {
            sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1 = (SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1) continuation;
            int i2 = sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.L$0 = null;
                    sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.L$1 = null;
                    sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.L$2 = null;
                    sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1) == coroutineSingletons) {
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
        sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1 = new SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1(this, continuation);
        Object obj2 = sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
