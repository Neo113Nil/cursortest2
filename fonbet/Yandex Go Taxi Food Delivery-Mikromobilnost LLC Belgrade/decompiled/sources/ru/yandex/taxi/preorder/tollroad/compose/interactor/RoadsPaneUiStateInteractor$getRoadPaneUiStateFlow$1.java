package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lntk0;", "roadOptions", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.interactor.RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1", f = "RoadsPaneUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1 roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1 = new RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1(this.this$0, continuation);
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1.L$0 = obj;
        return roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1 roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1 = (RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.x(list.size() > 1);
        this.this$0.b.t();
        return zy11.a;
    }
}
