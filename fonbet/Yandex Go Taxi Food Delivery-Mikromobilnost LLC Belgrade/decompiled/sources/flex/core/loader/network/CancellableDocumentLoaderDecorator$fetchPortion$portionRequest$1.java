package flex.core.loader.network;

import defpackage.kq90;
import defpackage.m0m;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q370;
import defpackage.s8o;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wzl;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1", f = "CancellableDocumentLoaderDecorator.kt", l = {113, 119}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ q370 $context;
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ noh[] $previousPortionRequests;
    final /* synthetic */ u1m $query;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1(a aVar, u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, noh[] nohVarArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$params = wbe0Var;
        this.$context = q370Var;
        this.$patchParams = kq90Var;
        this.$previousPortionRequests = nohVarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1(this.this$0, this.$query, this.$params, this.$context, this.$patchParams, this.$previousPortionRequests, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r11 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1 cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            m0m m0mVar = (m0m) s8o.W(aVar, aVar.b);
            u1m u1mVar = this.$query;
            wbe0 wbe0Var = this.$params;
            q370 q370Var = this.$context;
            kq90 kq90Var = this.$patchParams;
            this.label = 1;
            cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1 = this;
            obj = m0mVar.d(u1mVar, wbe0Var, q370Var, kq90Var, cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wzl wzlVar = (wzl) this.L$0;
                kotlin.b.b(obj);
                return wzlVar;
            }
            kotlin.b.b(obj);
            cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1 = this;
        }
        wzl wzlVar2 = (wzl) obj;
        noh[] nohVarArr = cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1.$previousPortionRequests;
        noh[] nohVarArr2 = (noh[]) Arrays.copyOf(nohVarArr, nohVarArr.length);
        cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1.L$0 = wzlVar2;
        cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1.label = 2;
        return kotlinx.coroutines.a.c(nohVarArr2, cancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1) == coroutineSingletons ? coroutineSingletons : wzlVar2;
    }
}
