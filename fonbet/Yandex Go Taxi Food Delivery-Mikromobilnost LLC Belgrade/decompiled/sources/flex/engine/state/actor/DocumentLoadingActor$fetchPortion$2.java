package flex.engine.state.actor;

import defpackage.kq90;
import defpackage.m0m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q370;
import defpackage.s8o;
import defpackage.tls;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwzl;", "<anonymous>", "()Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchPortion$2", f = "DocumentLoadingActor.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchPortion$2 extends SuspendLambda implements tls {
    final /* synthetic */ q370 $context;
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchPortion$2(a aVar, u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$params = wbe0Var;
        this.$context = q370Var;
        this.$patchParams = kq90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DocumentLoadingActor$fetchPortion$2(this.this$0, this.$query, this.$params, this.$context, this.$patchParams, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DocumentLoadingActor$fetchPortion$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        m0m m0mVar = (m0m) s8o.W(aVar, aVar.b);
        u1m u1mVar = this.$query;
        wbe0 wbe0Var = this.$params;
        q370 q370Var = this.$context;
        kq90 kq90Var = this.$patchParams;
        this.label = 1;
        Object d = m0mVar.d(u1mVar, wbe0Var, q370Var, kq90Var, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
