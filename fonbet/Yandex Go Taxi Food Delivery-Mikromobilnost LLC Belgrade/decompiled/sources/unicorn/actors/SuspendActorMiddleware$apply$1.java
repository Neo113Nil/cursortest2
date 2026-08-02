package unicorn.actors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oju0;
import defpackage.peo;
import defpackage.s8o;
import defpackage.tse;
import defpackage.tww0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "unicorn.actors.SuspendActorMiddleware$apply$1", f = "SuspendActorMiddleware.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class SuspendActorMiddleware$apply$1 extends SuspendLambda implements wls {
    final /* synthetic */ tww0 $actor;
    final /* synthetic */ peo $event;
    final /* synthetic */ oju0 $store;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendActorMiddleware$apply$1(a aVar, tww0 tww0Var, oju0 oju0Var, peo peoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$actor = tww0Var;
        this.$store = oju0Var;
        this.$event = peoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendActorMiddleware$apply$1(this.this$0, this.$actor, this.$store, this.$event, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendActorMiddleware$apply$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tww0 tww0Var = (tww0) s8o.W(this.this$0, this.$actor);
            oju0 oju0Var = this.$store;
            peo peoVar = this.$event;
            this.label = 1;
            if (tww0Var.b(oju0Var, peoVar, this) == coroutineSingletons) {
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
