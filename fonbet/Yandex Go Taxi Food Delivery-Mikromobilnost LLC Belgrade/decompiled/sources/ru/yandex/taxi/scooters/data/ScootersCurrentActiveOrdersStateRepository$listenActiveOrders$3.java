package ru.yandex.taxi.scooters.data;

import defpackage.ibn0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqm0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lsqm0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3", f = "ScootersCurrentActiveOrdersStateRepository.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $withStartValueIfEmpty;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3(g gVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$withStartValueIfEmpty = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3 scootersCurrentActiveOrdersStateRepository$listenActiveOrders$3 = new ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3(this.this$0, this.$withStartValueIfEmpty, continuation);
        scootersCurrentActiveOrdersStateRepository$listenActiveOrders$3.L$0 = obj;
        return scootersCurrentActiveOrdersStateRepository$listenActiveOrders$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCurrentActiveOrdersStateRepository$listenActiveOrders$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object value = this.this$0.a.getValue();
            Pair pair = ibn0.a;
            if (jl40.l(value, pair) && this.$withStartValueIfEmpty) {
                sqm0 sqm0Var = (sqm0) pair.f();
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(sqm0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
