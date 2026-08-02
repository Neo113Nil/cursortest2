package ru.yandex.taxi.locationsdk.common_utils;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$tickerFlow$1", f = "flowUtils.kt", l = {HProv.ALG_SID_GR3410_12_256, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class FlowUtilsKt$tickerFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ long $interval;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$tickerFlow$1(long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$initialDelay = j;
        this.$interval = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowUtilsKt$tickerFlow$1 flowUtilsKt$tickerFlow$1 = new FlowUtilsKt$tickerFlow$1(this.$initialDelay, this.$interval, continuation);
        flowUtilsKt$tickerFlow$1.L$0 = obj;
        return flowUtilsKt$tickerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$tickerFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (kotlinx.coroutines.a.j(r7, r10) != r1) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005e -> B:12:0x003c). Please report as a decompilation issue!!! */
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
            b.b(obj);
            long j2 = this.$initialDelay;
            this.L$0 = vprVar;
            this.J$0 = 0L;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j2, this) != coroutineSingletons) {
                j = 0;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                j = this.J$0;
                b.b(obj);
                long j3 = this.$interval;
                this.L$0 = vprVar;
                this.J$0 = j;
                this.label = 3;
            } else if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        j = this.J$0;
        b.b(obj);
        long j4 = 1 + j;
        Long l = new Long(j);
        this.L$0 = vprVar;
        this.J$0 = j4;
        this.label = 2;
        if (vprVar.emit(l, this) != coroutineSingletons) {
            j = j4;
            long j32 = this.$interval;
            this.L$0 = vprVar;
            this.J$0 = j;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
