package ru.yandex.taxi.communications.stepsinstructions.interactor;

import defpackage.bvf0;
import defpackage.jbu0;
import defpackage.nbu0;
import defpackage.ny61;
import defpackage.rbu0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ jbu0 b;
    public final /* synthetic */ c c;

    public a(vpr vprVar, jbu0 jbu0Var, c cVar) {
        this.a = vprVar;
        this.b = jbu0Var;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
    
        if (r10.emit(r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1 stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        List list;
        if (continuation instanceof StepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1) {
            stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1 = (StepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label;
                c cVar = this.c;
                jbu0 jbu0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List singletonList = Collections.singletonList(new rbu0(jbu0Var.a));
                    List list2 = jbu0Var.b;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$7 = singletonList;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    Object n = bvf0.n(new StepsInstructionsInteractor$mapStepsToState$2(list2, cVar, (ThemeType) obj, null), stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1);
                    if (n != coroutineSingletons) {
                        vprVar = vprVar2;
                        list = singletonList;
                        obj2 = n;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                list = (List) stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$7;
                vprVar = (vpr) stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                nbu0 nbu0Var = new nbu0(list, (List) obj2, c.a(cVar, jbu0Var.c), c.b(cVar, jbu0Var.c));
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1 = new StepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label;
        c cVar2 = this.c;
        jbu0 jbu0Var2 = this.b;
        if (i != 0) {
        }
        nbu0 nbu0Var2 = new nbu0(list, (List) obj22, c.a(cVar2, jbu0Var2.c), c.b(cVar2, jbu0Var2.c));
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
    }
}
