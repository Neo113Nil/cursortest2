package flex.core.loader.network;

import defpackage.i7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.DocumentService$fetchDocument$3", f = "DocumentService.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentService$fetchDocument$3 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ boolean $force;
    final /* synthetic */ boolean $isPreload;
    final /* synthetic */ Map<String, kotlinx.serialization.json.b> $payload;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $restoreTagsIfError;
    final /* synthetic */ boolean $retriedAfterError;
    final /* synthetic */ boolean $saveForNextUse;
    final /* synthetic */ i7x0 $tagRegistry;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentService$fetchDocument$3(d dVar, u1m u1mVar, ywl ywlVar, Map map, i7x0 i7x0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$query = u1mVar;
        this.$document = ywlVar;
        this.$payload = map;
        this.$tagRegistry = i7x0Var;
        this.$retriedAfterError = z;
        this.$force = z2;
        this.$saveForNextUse = z3;
        this.$restoreTagsIfError = z4;
        this.$isPreload = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DocumentService$fetchDocument$3(this.this$0, this.$query, this.$document, this.$payload, this.$tagRegistry, this.$retriedAfterError, this.$force, this.$saveForNextUse, this.$restoreTagsIfError, this.$isPreload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentService$fetchDocument$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        u1m u1mVar = this.$query;
        ywl ywlVar = this.$document;
        Map<String, kotlinx.serialization.json.b> map = this.$payload;
        i7x0 i7x0Var = this.$tagRegistry;
        boolean z = this.$retriedAfterError;
        boolean z2 = this.$force;
        boolean z3 = this.$saveForNextUse;
        boolean z4 = this.$restoreTagsIfError;
        boolean z5 = this.$isPreload;
        this.label = 1;
        Object f = dVar.f(u1mVar, ywlVar, map, i7x0Var, z, z2, z3, z4, z5, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
