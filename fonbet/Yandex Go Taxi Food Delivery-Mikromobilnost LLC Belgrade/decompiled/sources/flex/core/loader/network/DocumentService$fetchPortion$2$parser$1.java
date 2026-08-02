package flex.core.loader.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lyu00;", "Lkg90;", "Lh2m;", "Lflex/parser/DocumentResponseMapiParser;", "<anonymous>", "(Ltse;)Lyu00;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.DocumentService$fetchPortion$2$parser$1", f = "DocumentService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentService$fetchPortion$2$parser$1 extends SuspendLambda implements wls {
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentService$fetchPortion$2$parser$1(d dVar, u1m u1mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DocumentService$fetchPortion$2$parser$1(this.this$0, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentService$fetchPortion$2$parser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.b.b(this.$query, null, null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
