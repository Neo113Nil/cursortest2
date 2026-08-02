package ru.yandex.taxi.checkin;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class h implements tpr {
    public final /* synthetic */ f a;

    public h(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1 openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1;
        int i;
        if (continuation instanceof OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1) {
            openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1 = (OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1) continuation;
            int i2 = openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar);
                    openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.L$0 = null;
                    openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.L$1 = null;
                    openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.L$2 = null;
                    openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(gVar, openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1) == coroutineSingletons) {
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
        openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1 = new OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1(this, continuation);
        Object obj2 = openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
