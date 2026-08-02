package flex.engine.state.actor;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.kq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oju0;
import defpackage.q0m;
import defpackage.s0j0;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls0j0;", "Lwzl;", "Lflex/engine/state/actor/RepeatableTaskOutput;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Ls0j0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1", f = "DocumentLoadingActor.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ u1m $query;
    final /* synthetic */ oju0 $store;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1(u1m u1mVar, kq90 kq90Var, wbe0 wbe0Var, oju0 oju0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$patchParams = kq90Var;
        this.$params = wbe0Var;
        this.$store = oju0Var;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = this.this$0;
        DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1 documentLoadingActor$fetchPortion$onPortionFetchSuccess$1 = new DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1(this.$query, this.$patchParams, this.$params, this.$store, aVar, continuation);
        documentLoadingActor$fetchPortion$onPortionFetchSuccess$1.L$0 = obj;
        return documentLoadingActor$fetchPortion$onPortionFetchSuccess$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1) create((s0j0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s0j0 s0j0Var = (s0j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            n0 n0Var = this.this$0.D;
            q0m q0mVar = new q0m(s0j0Var, this.$patchParams, this.$params, this.$store, this.$query);
            this.L$0 = null;
            this.label = 1;
            if (n0Var.emit(q0mVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
