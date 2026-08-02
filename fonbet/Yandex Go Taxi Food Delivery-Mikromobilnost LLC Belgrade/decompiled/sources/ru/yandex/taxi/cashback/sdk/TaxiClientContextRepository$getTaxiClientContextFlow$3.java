package ru.yandex.taxi.cashback.sdk;

import defpackage.ems;
import defpackage.i49;
import defpackage.jl40;
import defpackage.lux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2c;
import defpackage.s2c;
import defpackage.t2c;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "orderStatus", "Li49;", "tariffContext", "", "Ls2c;", "availableTariffs", "", "notificationShown", "selectedPaymentMethod", "Lt2c;", "<anonymous>", "(Ljava/lang/String;Li49;Ljava/util/List;ZLjava/lang/String;)Lt2c;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.TaxiClientContextRepository$getTaxiClientContextFlow$3", f = "TaxiClientContextRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TaxiClientContextRepository$getTaxiClientContextFlow$3 extends SuspendLambda implements ems {
    final /* synthetic */ String $screen;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiClientContextRepository$getTaxiClientContextFlow$3(c0 c0Var, String str, Continuation continuation) {
        super(6, continuation);
        this.this$0 = c0Var;
        this.$screen = str;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        TaxiClientContextRepository$getTaxiClientContextFlow$3 taxiClientContextRepository$getTaxiClientContextFlow$3 = new TaxiClientContextRepository$getTaxiClientContextFlow$3(this.this$0, this.$screen, (Continuation) obj6);
        taxiClientContextRepository$getTaxiClientContextFlow$3.L$0 = (String) obj;
        taxiClientContextRepository$getTaxiClientContextFlow$3.L$1 = (i49) obj2;
        taxiClientContextRepository$getTaxiClientContextFlow$3.L$2 = (List) obj3;
        taxiClientContextRepository$getTaxiClientContextFlow$3.Z$0 = booleanValue;
        taxiClientContextRepository$getTaxiClientContextFlow$3.L$3 = (String) obj5;
        return taxiClientContextRepository$getTaxiClientContextFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        String str = (String) this.L$0;
        i49 i49Var = (i49) this.L$1;
        List list = (List) this.L$2;
        boolean z = this.Z$0;
        String str2 = (String) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2c r2cVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c0 c0Var = this.this$0;
        String str3 = this.$screen;
        c0Var.getClass();
        s2c s2cVar = i49Var.a;
        if (s2cVar == null) {
            s2cVar = s2c.c;
        }
        boolean z2 = z || (jl40.l(str3, "summary") && i49Var.b);
        lux0 lux0Var = i49Var.c;
        String str4 = lux0Var.a;
        if (str4 != null && (bool = lux0Var.b) != null) {
            r2cVar = new r2c(str4, bool.booleanValue());
        }
        return new t2c(str3, str, str2, s2cVar, list, z2, r2cVar);
    }
}
