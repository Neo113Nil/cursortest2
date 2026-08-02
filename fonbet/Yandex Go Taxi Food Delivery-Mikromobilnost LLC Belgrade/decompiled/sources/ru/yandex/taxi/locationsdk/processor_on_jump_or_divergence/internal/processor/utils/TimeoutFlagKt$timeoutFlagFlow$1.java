package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils.TimeoutFlagKt$timeoutFlagFlow$1", f = "timeoutFlag.kt", l = {21, 22, 23}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TimeoutFlagKt$timeoutFlagFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutFlagKt$timeoutFlagFlow$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimeoutFlagKt$timeoutFlagFlow$1 timeoutFlagKt$timeoutFlagFlow$1 = new TimeoutFlagKt$timeoutFlagFlow$1(this.$timeout, continuation);
        timeoutFlagKt$timeoutFlagFlow$1.L$0 = obj;
        return timeoutFlagKt$timeoutFlagFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeoutFlagKt$timeoutFlagFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Boolean bool = Boolean.FALSE;
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Boolean bool2 = Boolean.TRUE;
            this.L$0 = null;
            this.label = 3;
        }
        long j = this.$timeout;
        this.L$0 = vprVar;
        this.label = 2;
    }
}
