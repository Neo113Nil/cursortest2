package ru.yandex.taxi.logistics.sdk.utils;

import defpackage.axd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.utils.ConcurrencyUtilsKt$throttleFirst$1", f = "ConcurrencyUtils.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ConcurrencyUtilsKt$throttleFirst$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $duration;
    final /* synthetic */ tpr $this_throttleFirst;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrencyUtilsKt$throttleFirst$1(tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_throttleFirst = tprVar;
        this.$duration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConcurrencyUtilsKt$throttleFirst$1 concurrencyUtilsKt$throttleFirst$1 = new ConcurrencyUtilsKt$throttleFirst$1(this.$this_throttleFirst, this.$duration, continuation);
        concurrencyUtilsKt$throttleFirst$1.L$0 = obj;
        return concurrencyUtilsKt$throttleFirst$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConcurrencyUtilsKt$throttleFirst$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            tpr tprVar = this.$this_throttleFirst;
            axd axdVar = new axd(ref$LongRef, this.$duration, vprVar, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(axdVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
