package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.HeaderKt$StopWatch$1$1", f = "Header.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HeaderKt$StopWatch$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $start;
    final /* synthetic */ long $step;
    final /* synthetic */ oz40 $time;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderKt$StopWatch$1$1(oz40 oz40Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$time = oz40Var;
        this.$start = j;
        this.$step = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HeaderKt$StopWatch$1$1 headerKt$StopWatch$1$1 = new HeaderKt$StopWatch$1$1(this.$time, this.$start, this.$step, continuation);
        headerKt$StopWatch$1$1.L$0 = obj;
        return headerKt$StopWatch$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderKt$StopWatch$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long I;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            I = vng.I();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            I = this.J$0;
            kotlin.b.b(obj);
        }
        while (bvf0.D(tseVar)) {
            long I2 = vng.I() - I;
            if (I2 < 0) {
                I2 = 0;
            }
            oz40 oz40Var = this.$time;
            long j = this.$start + I2;
            oz40Var.setValue(new Long(j >= 0 ? j : 0L));
            long j2 = this.$step;
            long longValue = ((Number) this.$time.getValue()).longValue();
            if (j2 > longValue) {
                j2 = longValue;
            }
            this.L$0 = tseVar;
            this.J$0 = I;
            this.J$1 = I2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
