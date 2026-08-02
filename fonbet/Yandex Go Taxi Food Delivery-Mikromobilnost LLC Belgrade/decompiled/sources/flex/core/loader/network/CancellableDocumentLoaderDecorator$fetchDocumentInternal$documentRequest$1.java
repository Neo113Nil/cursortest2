package flex.core.loader.network;

import defpackage.i7x0;
import defpackage.m0m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1", f = "CancellableDocumentLoaderDecorator.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ boolean $force;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $restoreTagsIfError;
    final /* synthetic */ boolean $retriedAfterError;
    final /* synthetic */ i7x0 $tagRegistry;
    final /* synthetic */ boolean $usePassedCoroutineContext;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1(a aVar, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$document = ywlVar;
        this.$retriedAfterError = z;
        this.$force = z2;
        this.$restoreTagsIfError = z3;
        this.$tagRegistry = i7x0Var;
        this.$usePassedCoroutineContext = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1(this.this$0, this.$query, this.$document, this.$retriedAfterError, this.$force, this.$restoreTagsIfError, this.$tagRegistry, this.$usePassedCoroutineContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        m0m m0mVar = (m0m) s8o.W(aVar, aVar.b);
        u1m u1mVar = this.$query;
        ywl ywlVar = this.$document;
        boolean z = this.$retriedAfterError;
        boolean z2 = this.$force;
        boolean z3 = this.$restoreTagsIfError;
        i7x0 i7x0Var = this.$tagRegistry;
        boolean z4 = this.$usePassedCoroutineContext;
        this.label = 1;
        Object c = m0mVar.c(u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
