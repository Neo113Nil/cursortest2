package flex.engine.section;

import defpackage.klc;
import defpackage.m5q0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2q0;
import defpackage.tse;
import defpackage.txl;
import defpackage.w2q0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.section.SectionPaginationPatcher$onError$2", f = "SectionPaginationPatcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionPaginationPatcher$onError$2 extends SuspendLambda implements wls {
    final /* synthetic */ klc $commandChannel;
    final /* synthetic */ w2q0 $operation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionPaginationPatcher$onError$2(w2q0 w2q0Var, klc klcVar, Continuation continuation) {
        super(2, continuation);
        this.$operation = w2q0Var;
        this.$commandChannel = klcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionPaginationPatcher$onError$2(this.$operation, this.$commandChannel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SectionPaginationPatcher$onError$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = ((q2q0) this.$operation).d;
        if (str == null) {
            return null;
        }
        ((txl) this.$commandChannel).a(new m5q0(str));
        return zy11.a;
    }
}
