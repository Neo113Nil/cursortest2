package kotlin.sequences;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lsrq0;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", l = {3163}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ qrq0 $this_zipWithNext;
    final /* synthetic */ wls $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(qrq0 qrq0Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_zipWithNext = qrq0Var;
        this.$transform = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator it;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Iterator it2 = this.$this_zipWithNext.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                it = it2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        next = this.L$3;
        it = (Iterator) this.L$1;
        kotlin.b.b(obj);
        while (it.hasNext()) {
            Object next2 = it.next();
            Object invoke = this.$transform.invoke(next, next2);
            this.L$0 = srq0Var;
            this.L$1 = it;
            this.L$2 = null;
            this.L$3 = next2;
            this.label = 1;
            if (srq0Var.a(invoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = next2;
        }
        return zy11.a;
    }
}
