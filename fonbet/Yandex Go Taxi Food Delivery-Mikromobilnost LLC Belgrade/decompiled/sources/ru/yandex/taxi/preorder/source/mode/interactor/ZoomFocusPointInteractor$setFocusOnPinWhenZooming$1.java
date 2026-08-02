package ru.yandex.taxi.preorder.source.mode.interactor;

import defpackage.eg41;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ze61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.map_common.map.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.mode.interactor.ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1", f = "ZoomFocusPointInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1 extends SuspendLambda implements tls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ze61 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1(ze61 ze61Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ze61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ze61 ze61Var = this.this$0;
            gh00 gh00Var = (gh00) ze61Var.b;
            o oVar = new o(new g(gh00Var.a.f, gh00Var), new ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            eg41 eg41Var = new eg41(9, ze61Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(eg41Var, this) == coroutineSingletons) {
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
