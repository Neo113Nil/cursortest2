package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.fgn0;
import defpackage.lhn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s7n0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {299}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lhn0 lhn0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            fgn0 fgn0Var = eVar.V;
            ru.yandex.taxi.scooters.presentation.share_location.data.a aVar = eVar.U;
            this.L$0 = fgn0Var;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            lhn0Var = fgn0Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lhn0Var = (lhn0) this.L$0;
            kotlin.b.b(obj);
        }
        a aVar2 = ((fgn0) lhn0Var).a;
        aVar2.A((m950) aVar2.P.get(), (s7n0) obj, sy60.Q2);
        return zy11.a;
    }
}
