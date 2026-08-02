package ru.yandex.taxi.preorder.tollroad.compose.navigation;

import defpackage.kuk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ztk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.navigation.RoadsPaneRouter$content$1$2$1", f = "RoadsPaneRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsPaneRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ kuk0 $roadsPaneUiAction;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadsPaneRouter$content$1$2$1(b bVar, kuk0 kuk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$roadsPaneUiAction = kuk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadsPaneRouter$content$1$2$1(this.this$0, this.$roadsPaneUiAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RoadsPaneRouter$content$1$2$1 roadsPaneRouter$content$1$2$1 = (RoadsPaneRouter$content$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        roadsPaneRouter$content$1$2$1.invokeSuspend(zy11Var);
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
        b bVar = this.this$0;
        bVar.H.e(this.$roadsPaneUiAction, (ztk0) bVar.M.getValue());
        return zy11.a;
    }
}
