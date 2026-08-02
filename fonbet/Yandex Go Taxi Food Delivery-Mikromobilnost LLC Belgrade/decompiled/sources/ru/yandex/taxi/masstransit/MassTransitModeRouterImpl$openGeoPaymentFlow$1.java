package ru.yandex.taxi.masstransit;

import defpackage.a36;
import defpackage.bl30;
import defpackage.e210;
import defpackage.e310;
import defpackage.i3g;
import defpackage.mvg;
import defpackage.n26;
import defpackage.nk30;
import defpackage.ny61;
import defpackage.q1j0;
import defpackage.rz00;
import defpackage.sls;
import defpackage.sz00;
import defpackage.tse;
import defpackage.wls;
import defpackage.z8b1;
import defpackage.zk30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$openGeoPaymentFlow$1", f = "MassTransitModeRouterImpl.kt", l = {623}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MassTransitModeRouterImpl$openGeoPaymentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ a36 $analyticsContext;
    final /* synthetic */ e210 $config;
    final /* synthetic */ q1j0 $replaceStrategy;
    final /* synthetic */ e310 $this_openGeoPaymentFlow;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitModeRouterImpl$openGeoPaymentFlow$1(e210 e210Var, e310 e310Var, d dVar, a36 a36Var, q1j0 q1j0Var, Continuation continuation) {
        super(2, continuation);
        this.$config = e210Var;
        this.$this_openGeoPaymentFlow = e310Var;
        this.this$0 = dVar;
        this.$analyticsContext = a36Var;
        this.$replaceStrategy = q1j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MassTransitModeRouterImpl$openGeoPaymentFlow$1(this.$config, this.$this_openGeoPaymentFlow, this.this$0, this.$analyticsContext, this.$replaceStrategy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MassTransitModeRouterImpl$openGeoPaymentFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n26 f;
        bl30 bl30Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            f = z8b1.f(this.$config);
            bl30 bl30Var2 = (bl30) ((i3g) this.$this_openGeoPaymentFlow).W.get();
            ru.yandex.taxi.masstransit.geopayment.a a = ((i3g) this.$this_openGeoPaymentFlow).a();
            this.L$0 = f;
            this.L$1 = bl30Var2;
            this.label = 1;
            Object a2 = a.a(this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bl30Var = bl30Var2;
            obj = a2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bl30Var = (bl30) this.L$1;
            f = (n26) this.L$0;
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar = this.this$0;
        if (booleanValue) {
            com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d dVar2 = (com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d) bl30Var.s.getValue();
            nk30 nk30Var = new nk30(f, this.$analyticsContext);
            final d dVar3 = this.this$0;
            final e310 e310Var = this.$this_openGeoPaymentFlow;
            e210 e210Var = this.$config;
            final int i3 = 0;
            sls slsVar = new sls() { // from class: oz00
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    e310 e310Var2 = e310Var;
                    d dVar4 = dVar3;
                    switch (i4) {
                        case 0:
                            dVar4.c0(e310Var2);
                            break;
                        default:
                            dVar4.c0(e310Var2);
                            break;
                    }
                    return zy11Var;
                }
            };
            dVar3.getClass();
            dVar.B(dVar2, nk30Var, new rz00(dVar3, e310Var, e210Var, false, slsVar), this.$replaceStrategy);
        } else {
            ru.yandex.taxi.masstransit.geopayment.modal.e eVar = (ru.yandex.taxi.masstransit.geopayment.modal.e) bl30Var.r.getValue();
            zk30 zk30Var = new zk30(f);
            final d dVar4 = this.this$0;
            final e310 e310Var2 = this.$this_openGeoPaymentFlow;
            e210 e210Var2 = this.$config;
            sls slsVar2 = new sls() { // from class: oz00
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    e310 e310Var22 = e310Var2;
                    d dVar42 = dVar4;
                    switch (i4) {
                        case 0:
                            dVar42.c0(e310Var22);
                            break;
                        default:
                            dVar42.c0(e310Var22);
                            break;
                    }
                    return zy11Var;
                }
            };
            dVar4.getClass();
            dVar.B(eVar, zk30Var, new sz00(dVar4, e310Var2, e210Var2, false, slsVar2), this.$replaceStrategy);
        }
        return zy11.a;
    }
}
