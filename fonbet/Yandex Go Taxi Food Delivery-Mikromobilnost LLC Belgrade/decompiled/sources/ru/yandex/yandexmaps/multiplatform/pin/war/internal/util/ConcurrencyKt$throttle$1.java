package ru.yandex.yandexmaps.multiplatform.pin.war.internal.util;

import defpackage.bb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.ConcurrencyKt$throttle$1", f = "Concurrency.kt", l = {9}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
public final class ConcurrencyKt$throttle$1 extends SuspendLambda implements tls {
    final /* synthetic */ Ref$IntRef $counter;
    final /* synthetic */ int $threshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrencyKt$throttle$1(Ref$IntRef ref$IntRef, int i, Continuation continuation) {
        super(1, continuation);
        this.$counter = ref$IntRef;
        this.$threshold = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ConcurrencyKt$throttle$1(this.$counter, this.$threshold, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ConcurrencyKt$throttle$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$IntRef ref$IntRef = this.$counter;
            int i2 = ref$IntRef.element;
            ref$IntRef.element = i2 + 1;
            if (i2 % this.$threshold == 0) {
                this.label = 1;
                if (bb1.l0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
