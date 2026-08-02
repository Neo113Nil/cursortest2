package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yqv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class u implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ yqv0 b;

    public u(mth mthVar, yqv0 yqv0Var) {
        this.a = mthVar;
        this.b = yqv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ExitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1 exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ExitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1) {
            exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1 = (ExitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1) continuation;
            int i2 = exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.L$0 = null;
                    exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.L$1 = null;
                    exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.L$2 = null;
                    exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(tVar, exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1) == coroutineSingletons) {
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
        exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1 = new ExitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1(this, continuation);
        Object obj2 = exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = exitFromTrapInteractor$waitTrapModeExit$lambda$0$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
