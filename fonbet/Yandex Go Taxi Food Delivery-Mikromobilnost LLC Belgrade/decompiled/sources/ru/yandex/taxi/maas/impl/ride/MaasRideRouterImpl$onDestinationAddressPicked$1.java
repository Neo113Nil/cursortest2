package ru.yandex.taxi.maas.impl.ride;

import com.yandex.go.taxi.tariffs.interactor.k;
import defpackage.f200;
import defpackage.m000;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0u;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.za31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.MaasRideRouterImpl$onDestinationAddressPicked$1", f = "MaasRideRouterImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasRideRouterImpl$onDestinationAddressPicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ m000 $deeplinkData;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasRideRouterImpl$onDestinationAddressPicked$1(b bVar, pv0 pv0Var, m000 m000Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$addressInfo = pv0Var;
        this.$deeplinkData = m000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasRideRouterImpl$onDestinationAddressPicked$1(this.this$0, this.$addressInfo, this.$deeplinkData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasRideRouterImpl$onDestinationAddressPicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m000 m000Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m000 a = m000.a(this.$deeplinkData, this.this$0.D.c(this.$addressInfo));
            ru.yandex.taxi.maas.impl.ride.common.a aVar = this.this$0.D;
            String str = a.b;
            this.L$0 = null;
            this.L$1 = a;
            this.label = 1;
            Object y = e.y(new mth(new k(((com.yandex.go.taxi.tariffs.internal.repository.k) aVar.a.a).i(), str), 6), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            m000Var = a;
            obj = y;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m000Var = (m000) this.L$1;
            kotlin.b.b(obj);
        }
        boolean e = this.this$0.D.e((za31) obj, m000Var);
        zy11 zy11Var = zy11.a;
        if (!e) {
            return zy11Var;
        }
        b bVar = this.this$0;
        bVar.D.d(bVar.o(), m000Var, new f200(this.this$0, 1), new p0u(21));
        return zy11Var;
    }
}
