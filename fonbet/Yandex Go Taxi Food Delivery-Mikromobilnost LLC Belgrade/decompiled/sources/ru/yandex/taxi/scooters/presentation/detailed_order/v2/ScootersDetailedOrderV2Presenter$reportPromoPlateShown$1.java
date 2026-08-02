package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import defpackage.boo0;
import defpackage.e3n;
import defpackage.fei0;
import defpackage.hei0;
import defpackage.jfn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.yno0;
import defpackage.zno0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {325}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ jfn0 $promoPlate;
    long J$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1(e eVar, jfn0 jfn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$promoPlate = jfn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1(this.this$0, this.$promoPlate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fei0 a = ((hei0) this.this$0.S).a();
            if (a != null) {
                j = a.b;
            } else {
                o430 o430Var = e3n.b;
                j = 0;
            }
            this.J$0 = j;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        zno0 zno0Var = this.this$0.E;
        yno0 yno0Var = this.$promoPlate.j;
        boo0 boo0Var = (boo0) zno0Var;
        boo0Var.getClass();
        Map map = yno0Var.c;
        if (map != null) {
            String str = (String) map.get("creative_id");
            if (str == null) {
                str = "";
            }
            boo0Var.a(str, map, RealtimeEventType.Shown);
        }
        return zy11.a;
    }
}
