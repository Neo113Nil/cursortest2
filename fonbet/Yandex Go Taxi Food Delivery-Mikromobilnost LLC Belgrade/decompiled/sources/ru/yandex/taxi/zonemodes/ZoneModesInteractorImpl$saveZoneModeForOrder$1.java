package ru.yandex.taxi.zonemodes;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.model.ZoneMode;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$saveZoneModeForOrder$1", f = "ZoneModesInteractorImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZoneModesInteractorImpl$saveZoneModeForOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ ZoneMode $zoneMode;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesInteractorImpl$saveZoneModeForOrder$1(j jVar, TaxiOrder taxiOrder, ZoneMode zoneMode, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$order = taxiOrder;
        this.$zoneMode = zoneMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneModesInteractorImpl$saveZoneModeForOrder$1(this.this$0, this.$order, this.$zoneMode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModesInteractorImpl$saveZoneModeForOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sd61 sd61Var = this.this$0.a;
            String str = this.$order.a;
            ZoneMode zoneMode = this.$zoneMode;
            this.label = 1;
            sd61Var.a.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new ZoneModesStorage$saveZoneMode$2(sd61Var, str, zoneMode, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
