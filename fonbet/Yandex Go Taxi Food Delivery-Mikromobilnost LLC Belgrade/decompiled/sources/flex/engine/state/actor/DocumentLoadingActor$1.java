package flex.engine.state.actor;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq0m;", "portionData", "Lzy11;", "<anonymous>", "(Lq0m;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$1", f = "DocumentLoadingActor.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentLoadingActor$1 documentLoadingActor$1 = new DocumentLoadingActor$1(this.this$0, continuation);
        documentLoadingActor$1.L$0 = obj;
        return documentLoadingActor$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadingActor$1) create((q0m) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q0m q0mVar = (q0m) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            s0j0 s0j0Var = q0mVar.a;
            kq90 kq90Var = q0mVar.b;
            wbe0 wbe0Var = q0mVar.c;
            oju0 oju0Var = q0mVar.d;
            u1m u1mVar = q0mVar.e;
            this.L$0 = null;
            this.label = 1;
            if (a.c(aVar, s0j0Var, kq90Var, wbe0Var, oju0Var, u1mVar, this) == coroutineSingletons) {
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
