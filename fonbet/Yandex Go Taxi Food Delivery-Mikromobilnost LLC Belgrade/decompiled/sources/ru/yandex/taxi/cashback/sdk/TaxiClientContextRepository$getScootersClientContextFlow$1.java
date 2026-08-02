package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.scooters.api.domain.ScootersCompositePaymentInteractor$ScootersCompositePaymentState;
import defpackage.gux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2c;
import defpackage.s2c;
import defpackage.t2c;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/scooters/api/domain/ScootersCompositePaymentInteractor$ScootersCompositePaymentState;", "compositePaymentState", "", "notificationShown", "Lt2c;", "<anonymous>", "(Lcom/yandex/go/scooters/api/domain/ScootersCompositePaymentInteractor$ScootersCompositePaymentState;Z)Lt2c;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.TaxiClientContextRepository$getScootersClientContextFlow$1", f = "TaxiClientContextRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TaxiClientContextRepository$getScootersClientContextFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $screen;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiClientContextRepository$getScootersClientContextFlow$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$screen = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TaxiClientContextRepository$getScootersClientContextFlow$1 taxiClientContextRepository$getScootersClientContextFlow$1 = new TaxiClientContextRepository$getScootersClientContextFlow$1(this.$screen, (Continuation) obj3);
        taxiClientContextRepository$getScootersClientContextFlow$1.L$0 = (ScootersCompositePaymentInteractor$ScootersCompositePaymentState) obj;
        taxiClientContextRepository$getScootersClientContextFlow$1.Z$0 = booleanValue;
        return taxiClientContextRepository$getScootersClientContextFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        ScootersCompositePaymentInteractor$ScootersCompositePaymentState scootersCompositePaymentInteractor$ScootersCompositePaymentState = (ScootersCompositePaymentInteractor$ScootersCompositePaymentState) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = gux0.a[scootersCompositePaymentInteractor$ScootersCompositePaymentState.ordinal()];
        if (i == 1) {
            bool = Boolean.TRUE;
        } else if (i == 2) {
            bool = Boolean.FALSE;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            bool = null;
        }
        return new t2c(this.$screen, "", "", s2c.c, EmptyList.a, z, bool != null ? new r2c("", bool.booleanValue()) : null);
    }
}
