package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yqv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "it", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.ExitFromTrapInteractor$waitTrapModeExit$3", f = "ExitFromTrapInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ExitFromTrapInteractor$waitTrapModeExit$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitFromTrapInteractor$waitTrapModeExit$3(Continuation continuation, v vVar) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitFromTrapInteractor$waitTrapModeExit$3(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ExitFromTrapInteractor$waitTrapModeExit$3 exitFromTrapInteractor$waitTrapModeExit$3 = (ExitFromTrapInteractor$waitTrapModeExit$3) create((fnx0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        exitFromTrapInteractor$waitTrapModeExit$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((a7t0) this.this$0.b).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        return zy11.a;
    }
}
