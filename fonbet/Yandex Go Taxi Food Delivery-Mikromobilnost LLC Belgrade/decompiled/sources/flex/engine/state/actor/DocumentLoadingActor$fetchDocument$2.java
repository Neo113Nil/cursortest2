package flex.engine.state.actor;

import defpackage.i7x0;
import defpackage.m0m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tls;
import defpackage.u1m;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwzl;", "<anonymous>", "()Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchDocument$2", f = "DocumentLoadingActor.kt", l = {326}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchDocument$2 extends SuspendLambda implements tls {
    final /* synthetic */ ywl $currentDocument;
    final /* synthetic */ boolean $force;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $retriedAfterError;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchDocument$2(a aVar, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$currentDocument = ywlVar;
        this.$retriedAfterError = z;
        this.$force = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DocumentLoadingActor$fetchDocument$2(this.this$0, this.$query, this.$currentDocument, this.$retriedAfterError, this.$force, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DocumentLoadingActor$fetchDocument$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        ywl ywlVar = this.$currentDocument;
        boolean z = this.$retriedAfterError;
        boolean z2 = this.$force;
        i7x0 i7x0Var = this.this$0.c;
        this.label = 1;
        Object e = m0mVar.e(u1mVar, ywlVar, z, z2, i7x0Var, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
