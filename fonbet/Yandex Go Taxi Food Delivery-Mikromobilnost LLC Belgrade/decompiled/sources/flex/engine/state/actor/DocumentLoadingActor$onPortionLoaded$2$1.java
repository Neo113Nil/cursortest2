package flex.engine.state.actor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oju0;
import defpackage.tse;
import defpackage.u1m;
import defpackage.ube0;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wzl;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$onPortionLoaded$2$1", f = "DocumentLoadingActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$onPortionLoaded$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ wzl $output;
    final /* synthetic */ ywl $patchedDocument;
    final /* synthetic */ wbe0 $portionParams;
    final /* synthetic */ u1m $query;
    final /* synthetic */ oju0 $store;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$onPortionLoaded$2$1(oju0 oju0Var, u1m u1mVar, wbe0 wbe0Var, wzl wzlVar, ywl ywlVar, Continuation continuation) {
        super(2, continuation);
        this.$store = oju0Var;
        this.$query = u1mVar;
        this.$portionParams = wbe0Var;
        this.$output = wzlVar;
        this.$patchedDocument = ywlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DocumentLoadingActor$onPortionLoaded$2$1(this.$store, this.$query, this.$portionParams, this.$output, this.$patchedDocument, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DocumentLoadingActor$onPortionLoaded$2$1 documentLoadingActor$onPortionLoaded$2$1 = (DocumentLoadingActor$onPortionLoaded$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        documentLoadingActor$onPortionLoaded$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$store.b(new ube0(this.$query, this.$portionParams, xzl.a((xzl) this.$output, this.$patchedDocument)));
        return zy11.a;
    }
}
