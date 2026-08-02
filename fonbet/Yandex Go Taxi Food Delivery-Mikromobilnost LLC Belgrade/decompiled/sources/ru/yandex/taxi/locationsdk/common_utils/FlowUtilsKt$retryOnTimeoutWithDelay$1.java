package ru.yandex.taxi.locationsdk.common_utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cause", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$retryOnTimeoutWithDelay$1", f = "flowUtils.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlowUtilsKt$retryOnTimeoutWithDelay$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$retryOnTimeoutWithDelay$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowUtilsKt$retryOnTimeoutWithDelay$1 flowUtilsKt$retryOnTimeoutWithDelay$1 = new FlowUtilsKt$retryOnTimeoutWithDelay$1(this.$delay, continuation);
        flowUtilsKt$retryOnTimeoutWithDelay$1.L$0 = obj;
        return flowUtilsKt$retryOnTimeoutWithDelay$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$retryOnTimeoutWithDelay$1) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Boolean bool = (Boolean) this.L$1;
            b.b(obj);
            return bool;
        }
        b.b(obj);
        boolean z = th instanceof TimeoutCancellationException;
        Boolean valueOf = Boolean.valueOf(z);
        long j = this.$delay;
        if (z) {
            this.L$0 = null;
            this.L$1 = valueOf;
            this.Z$0 = z;
            this.I$0 = 0;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return valueOf;
    }
}
