package kotlinx.coroutines.flow;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mvg;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.tfi0;
import defpackage.vez0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loi9;", "", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Loi9;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ tfi0 $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef ref$ObjectRef, tfi0 tfi0Var, Continuation continuation) {
        super(2, continuation);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = tfi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, continuation);
        flowKt__DelayKt$sample$2$1$1.L$0 = ((oi9) obj).a;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = (FlowKt__DelayKt$sample$2$1$1) create(new oi9(((oi9) obj).a), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, jb20] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z = r0 instanceof ni9;
        if (!z) {
            ref$ObjectRef.element = r0;
        }
        tfi0 tfi0Var = this.$ticker;
        if (z) {
            Throwable a = oi9.a(r0);
            if (a != null) {
                throw a;
            }
            tfi0Var.a(new ChildCancelledException());
            ref$ObjectRef.element = vez0.d;
        }
        return zy11.a;
    }
}
