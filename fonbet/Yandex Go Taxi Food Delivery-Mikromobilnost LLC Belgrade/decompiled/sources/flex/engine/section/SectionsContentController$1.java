package flex.engine.section;

import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.f170;
import defpackage.mvg;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.ox31;
import defpackage.px31;
import defpackage.qx31;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqx31;", "visibleItemPosition", "Lzy11;", "<anonymous>", "(Lqx31;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.section.SectionsContentController$1", f = "SectionsContentController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class SectionsContentController$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionsContentController$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SectionsContentController$1 sectionsContentController$1 = new SectionsContentController$1(this.this$0, continuation);
        sectionsContentController$1.L$0 = obj;
        return sectionsContentController$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SectionsContentController$1 sectionsContentController$1 = (SectionsContentController$1) create((qx31) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sectionsContentController$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object findViewHolderForAdapterPosition;
        qx31 qx31Var = (qx31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nfh nfhVar = this.this$0.M;
        if (nfhVar != null && (findViewHolderForAdapterPosition = ((OrientationAwareRecyclerView) nfhVar.b).findViewHolderForAdapterPosition(qx31Var.getPosition())) != null && (findViewHolderForAdapterPosition instanceof f170)) {
            if (qx31Var instanceof ox31) {
                ((f170) findViewHolderForAdapterPosition).l();
            } else {
                if (!(qx31Var instanceof px31)) {
                    w511.b();
                    return null;
                }
                ((f170) findViewHolderForAdapterPosition).h();
            }
        }
        return zy11.a;
    }
}
