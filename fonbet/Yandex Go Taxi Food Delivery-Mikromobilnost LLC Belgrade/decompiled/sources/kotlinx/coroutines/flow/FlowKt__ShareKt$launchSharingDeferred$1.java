package kotlinx.coroutines.flow;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend", v = 1)
/* loaded from: classes14.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ eyc $result;
    final /* synthetic */ tpr $upstream;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(tpr tprVar, eyc eycVar, Continuation continuation) {
        super(2, continuation);
        this.$upstream = tprVar;
        this.$result = eycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                tpr tprVar = this.$upstream;
                ye yeVar = new ye(8, ref$ObjectRef2, tseVar, this.$result);
                this.L$0 = null;
                this.L$1 = ref$ObjectRef2;
                this.label = 1;
                if (tprVar.collect(yeVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
            }
            if (ref$ObjectRef.element == 0) {
                ((fyc) this.$result).T(new Result(new Result.Failure(new NoSuchElementException("Flow is empty"))));
            }
            return zy11.a;
        } catch (Throwable th) {
            ((fyc) this.$result).j0(th);
            throw th;
        }
    }
}
