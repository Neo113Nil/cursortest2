package flex.engine.state.actor;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s0j0;
import defpackage.u1m;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls0j0;", "Lwzl;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Ls0j0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchPortion$4", f = "DocumentLoadingActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchPortion$4 extends SuspendLambda implements wls {
    final /* synthetic */ u1m $query;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchPortion$4(a aVar, u1m u1mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentLoadingActor$fetchPortion$4 documentLoadingActor$fetchPortion$4 = new DocumentLoadingActor$fetchPortion$4(this.this$0, this.$query, continuation);
        documentLoadingActor$fetchPortion$4.L$0 = obj;
        return documentLoadingActor$fetchPortion$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DocumentLoadingActor$fetchPortion$4 documentLoadingActor$fetchPortion$4 = (DocumentLoadingActor$fetchPortion$4) create((s0j0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        documentLoadingActor$fetchPortion$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s0j0 s0j0Var = (s0j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.h(this.$query, s0j0Var, false);
        return zy11.a;
    }
}
