package ru.yandex.taxi.requirements.interactor;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n implements tpr {
    public final /* synthetic */ mth a;

    public n(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1 requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1;
        int i;
        if (continuation instanceof RequirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1) {
            requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1 = (RequirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1) continuation;
            int i2 = requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar);
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.L$0 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.L$1 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.L$2 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.label = 1;
                    if (this.a.collect(mVar, requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1) == coroutineSingletons) {
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
        requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1 = new RequirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1(this, continuation);
        Object obj2 = requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementBubbleDataInteractor$listenBubbles$$inlined$map$6$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
