package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yqv0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lza31;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2", f = "TrapOnlyVerticalFallbackInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2 trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2 = (TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$2.invokeSuspend(zy11Var);
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
