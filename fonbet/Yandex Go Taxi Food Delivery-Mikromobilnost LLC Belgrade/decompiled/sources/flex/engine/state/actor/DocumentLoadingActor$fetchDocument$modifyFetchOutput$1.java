package flex.engine.state.actor;

import defpackage.jse;
import defpackage.kq90;
import defpackage.m1m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.txl;
import defpackage.u1m;
import defpackage.wls;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxzl;", "output", "<anonymous>", "(Lxzl;)Lxzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchDocument$modifyFetchOutput$1", f = "DocumentLoadingActor.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchDocument$modifyFetchOutput$1 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $currentDocument;
    final /* synthetic */ List<kq90> $patchParams;
    final /* synthetic */ u1m $query;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchDocument$modifyFetchOutput$1(ywl ywlVar, a aVar, u1m u1mVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$currentDocument = ywlVar;
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$patchParams = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentLoadingActor$fetchDocument$modifyFetchOutput$1 documentLoadingActor$fetchDocument$modifyFetchOutput$1 = new DocumentLoadingActor$fetchDocument$modifyFetchOutput$1(this.$currentDocument, this.this$0, this.$query, this.$patchParams, continuation);
        documentLoadingActor$fetchDocument$modifyFetchOutput$1.L$0 = obj;
        return documentLoadingActor$fetchDocument$modifyFetchOutput$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadingActor$fetchDocument$modifyFetchOutput$1) create((xzl) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xzl xzlVar = (xzl) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ywl ywlVar = this.$currentDocument;
            if (ywlVar == null) {
                ywlVar = xzlVar.a;
            }
            ywl ywlVar2 = ywlVar;
            ywl ywlVar3 = xzlVar.a;
            List list = this.this$0.x;
            ArrayList m0 = kotlin.collections.a.m0(this.$patchParams, Collections.singletonList(new m1m(this.$query)));
            a aVar = this.this$0;
            jse jseVar = aVar.w;
            txl txlVar = aVar.a.b;
            this.L$0 = xzlVar;
            this.L$1 = null;
            this.label = 1;
            obj = flex.engine.state.actor.internal.a.a(ywlVar2, ywlVar3, ywlVar3, list, m0, jseVar, txlVar, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return xzl.a(xzlVar, (ywl) obj);
    }
}
