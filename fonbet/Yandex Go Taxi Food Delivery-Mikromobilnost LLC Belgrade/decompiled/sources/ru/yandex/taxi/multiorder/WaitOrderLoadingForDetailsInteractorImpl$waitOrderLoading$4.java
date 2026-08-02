package ru.yandex.taxi.multiorder;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.multiorder.WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4", f = "WaitOrderLoadingForDetailsInteractorImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4 extends SuspendLambda implements zls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ long $timeoutMs;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4(String str, long j, Continuation continuation) {
        super(3, continuation);
        this.$orderId = str;
        this.$timeoutMs = j;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4 waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4 = new WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4(this.$orderId, this.$timeoutMs, (Continuation) obj3);
        waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4.L$0 = (vpr) obj;
        waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4.L$1 = (Throwable) obj2;
        return waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!(th instanceof TimeoutCancellationException)) {
                throw th;
            }
            jst.e.getClass();
            Boolean bool = Boolean.FALSE;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
