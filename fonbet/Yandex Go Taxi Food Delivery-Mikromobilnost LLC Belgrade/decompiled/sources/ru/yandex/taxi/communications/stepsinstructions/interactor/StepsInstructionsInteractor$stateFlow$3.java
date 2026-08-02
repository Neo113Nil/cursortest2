package ru.yandex.taxi.communications.stepsinstructions.interactor;

import defpackage.jbu0;
import defpackage.mau0;
import defpackage.mvg;
import defpackage.nau0;
import defpackage.nbu0;
import defpackage.ny61;
import defpackage.rbu0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.stepsinstructions.model.LoadingState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lnbu0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.stepsinstructions.interactor.StepsInstructionsInteractor$stateFlow$3", f = "StepsInstructionsInteractor.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StepsInstructionsInteractor$stateFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ jbu0 $model;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsInstructionsInteractor$stateFlow$3(jbu0 jbu0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$model = jbu0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StepsInstructionsInteractor$stateFlow$3 stepsInstructionsInteractor$stateFlow$3 = new StepsInstructionsInteractor$stateFlow$3(this.$model, this.this$0, continuation);
        stepsInstructionsInteractor$stateFlow$3.L$0 = obj;
        return stepsInstructionsInteractor$stateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StepsInstructionsInteractor$stateFlow$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List singletonList = Collections.singletonList(new rbu0(this.$model.a));
            jbu0 jbu0Var = this.$model;
            List list = jbu0Var.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                mau0 mau0Var = (mau0) obj2;
                arrayList.add(new nau0(mau0Var.a, mau0Var.b, null, null, LoadingState.LOADING, i2 == scc.f(jbu0Var.b)));
                i2 = i3;
            }
            nbu0 nbu0Var = new nbu0(singletonList, arrayList, c.a(this.this$0, this.$model.c), c.b(this.this$0, this.$model.c));
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(nbu0Var, this) == coroutineSingletons) {
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
