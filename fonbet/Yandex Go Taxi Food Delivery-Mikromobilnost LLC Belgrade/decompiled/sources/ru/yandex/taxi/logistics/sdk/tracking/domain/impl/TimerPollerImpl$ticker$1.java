package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.TimerPollerImpl$ticker$1", f = "TimerPollerImpl.kt", l = {17, 18}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TimerPollerImpl$ticker$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerPollerImpl$ticker$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimerPollerImpl$ticker$1 timerPollerImpl$ticker$1 = new TimerPollerImpl$ticker$1(this.$delay, continuation);
        timerPollerImpl$ticker$1.L$0 = obj;
        return timerPollerImpl$ticker$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimerPollerImpl$ticker$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (kotlinx.coroutines.a.j(r7, r9) == r1) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0049 -> B:6:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j = 0;
        } else if (i == 1) {
            j = this.J$0;
            kotlin.b.b(obj);
            long j2 = this.$delay;
            this.L$0 = vprVar;
            this.J$0 = j;
            this.label = 2;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            kotlin.b.b(obj);
        }
        j++;
        Long l = new Long(j);
        this.L$0 = vprVar;
        this.J$0 = j;
        this.label = 1;
    }
}
