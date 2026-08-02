package ru.yandex.taxi.clock;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.clock.CountdownTimer$timerFlow$1", f = "CountdownTimer.kt", l = {17, 21}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CountdownTimer$timerFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $endTimestamp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTimer$timerFlow$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$endTimestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CountdownTimer$timerFlow$1 countdownTimer$timerFlow$1 = new CountdownTimer$timerFlow$1(this.$endTimestamp, continuation);
        countdownTimer$timerFlow$1.L$0 = obj;
        return countdownTimer$timerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CountdownTimer$timerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005b -> B:13:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long max;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                max = this.J$0;
                b.b(obj);
                if (max != 0) {
                    this.L$0 = vprVar;
                    this.J$0 = max;
                    this.label = 2;
                }
                return zy11.a;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        b.b(obj);
        if (kotlinx.coroutines.a.p(get_context())) {
            max = Math.max(this.$endTimestamp - System.currentTimeMillis(), 0L);
            Long l = new Long(max);
            this.L$0 = vprVar;
            this.J$0 = max;
            this.label = 1;
        }
        return zy11.a;
    }
}
