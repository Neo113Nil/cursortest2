package flex.feature.deferreddecoded;

import defpackage.kr;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.feature.deferreddecoded.DeferredDecodingActionHandler$handle$2$1$1", f = "DeferredDecodingActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeferredDecodingActionHandler$handle$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ n6u $context;
    final /* synthetic */ kr $decodedAction;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredDecodingActionHandler$handle$2$1$1(a aVar, n6u n6uVar, kr krVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$context = n6uVar;
        this.$decodedAction = krVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeferredDecodingActionHandler$handle$2$1$1(this.this$0, this.$context, this.$decodedAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeferredDecodingActionHandler$handle$2$1$1 deferredDecodingActionHandler$handle$2$1$1 = (DeferredDecodingActionHandler$handle$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deferredDecodingActionHandler$handle$2$1$1.invokeSuspend(zy11Var);
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
        wu wuVar = (wu) s8o.W(this.this$0, this.$context.c);
        kr krVar = this.$decodedAction;
        n6u n6uVar = this.$context;
        wuVar.b(krVar, n6uVar.b, n6uVar.e);
        return zy11.a;
    }
}
