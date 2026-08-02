package flex.engine.section;

import defpackage.klc;
import defpackage.m5q0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.txl;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.section.SectionPaginationPatcher$onError$3", f = "SectionPaginationPatcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionPaginationPatcher$onError$3 extends SuspendLambda implements wls {
    final /* synthetic */ klc $commandChannel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionPaginationPatcher$onError$3(klc klcVar, Continuation continuation) {
        super(2, continuation);
        this.$commandChannel = klcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionPaginationPatcher$onError$3(this.$commandChannel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SectionPaginationPatcher$onError$3 sectionPaginationPatcher$onError$3 = (SectionPaginationPatcher$onError$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sectionPaginationPatcher$onError$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((txl) this.$commandChannel).a(new m5q0(null));
        return zy11.a;
    }
}
