package ru.yandex.taxi.plaque;

import defpackage.hjc0;
import defpackage.ijc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plaque.PlaqueView$startAutoCloseJobIfNeeded$1", f = "PlaqueView.kt", l = {221}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class PlaqueView$startAutoCloseJobIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    final /* synthetic */ qoc0 $model;
    int label;
    final /* synthetic */ PlaqueView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueView$startAutoCloseJobIfNeeded$1(long j, PlaqueView plaqueView, qoc0 qoc0Var, Continuation continuation) {
        super(2, continuation);
        this.$delay = j;
        this.this$0 = plaqueView;
        this.$model = qoc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueView$startAutoCloseJobIfNeeded$1(this.$delay, this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueView$startAutoCloseJobIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hjc0 hjc0Var;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.$delay;
            this.label = 1;
            if (a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        hjc0Var = this.this$0.plaqueCallback;
        qoc0 qoc0Var = this.$model;
        obj2 = this.this$0.payload;
        ((ijc0) hjc0Var).a(qoc0Var, false, obj2);
        return zy11.a;
    }
}
