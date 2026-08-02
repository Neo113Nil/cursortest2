package kotlinx.coroutines.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lvpr;", "downstream", "Lzy11;", "<anonymous>", "(Ltse;Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements zls {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ tpr $this_sample;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, tpr tprVar, Continuation continuation) {
        super(3, continuation);
        this.$periodMillis = j;
        this.$this_sample = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, (Continuation) obj3);
        flowKt__DelayKt$sample$2.L$0 = (tse) obj;
        flowKt__DelayKt$sample$2.L$1 = (vpr) obj2;
        return flowKt__DelayKt$sample$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        tfi0 b;
        tfi0 tfi0Var;
        tse tseVar = (tse) this.L$0;
        vpr vprVar = (vpr) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x6f0 b2 = kotlinx.coroutines.channels.b.b(tseVar, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1);
            ref$ObjectRef = new Ref$ObjectRef();
            b = kotlinx.coroutines.channels.b.b(tseVar, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.$periodMillis, null), 1);
            tfi0Var = b2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b = (tfi0) this.L$4;
            ref$ObjectRef = (Ref$ObjectRef) this.L$3;
            tfi0Var = (tfi0) this.L$2;
            kotlin.b.b(obj);
        }
        while (ref$ObjectRef.element != vez0.d) {
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            bVar.h(tfi0Var.f(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, b, null));
            bVar.h(b.i(), new FlowKt__DelayKt$sample$2$1$2(vprVar, null, ref$ObjectRef));
            this.L$0 = null;
            this.L$1 = vprVar;
            this.L$2 = tfi0Var;
            this.L$3 = ref$ObjectRef;
            this.L$4 = b;
            this.L$5 = null;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (bVar.e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
