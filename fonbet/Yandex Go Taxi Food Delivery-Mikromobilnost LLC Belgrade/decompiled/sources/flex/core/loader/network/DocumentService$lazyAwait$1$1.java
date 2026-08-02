package flex.core.loader.network;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lyu00;", "<anonymous>", "(Ltse;)Lyu00;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.DocumentService$lazyAwait$1$1", f = "DocumentService.kt", l = {704}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentService$lazyAwait$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $this_lazyAwait;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentService$lazyAwait$1$1(noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.$this_lazyAwait = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DocumentService$lazyAwait$1$1(this.$this_lazyAwait, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentService$lazyAwait$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        noh nohVar = this.$this_lazyAwait;
        this.label = 1;
        Object k = nohVar.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
