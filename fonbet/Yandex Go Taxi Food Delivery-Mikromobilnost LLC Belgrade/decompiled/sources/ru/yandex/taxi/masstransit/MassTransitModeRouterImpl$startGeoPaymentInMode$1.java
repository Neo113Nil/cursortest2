package ru.yandex.taxi.masstransit;

import defpackage.a36;
import defpackage.bl30;
import defpackage.d010;
import defpackage.e010;
import defpackage.e210;
import defpackage.e310;
import defpackage.i3g;
import defpackage.l1j0;
import defpackage.mvg;
import defpackage.n26;
import defpackage.nk30;
import defpackage.ny61;
import defpackage.rz00;
import defpackage.sz00;
import defpackage.tse;
import defpackage.wls;
import defpackage.xga0;
import defpackage.z8b1;
import defpackage.zk30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$startGeoPaymentInMode$1", f = "MassTransitModeRouterImpl.kt", l = {649, 657}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MassTransitModeRouterImpl$startGeoPaymentInMode$1 extends SuspendLambda implements wls {
    final /* synthetic */ a36 $analyticsContext;
    final /* synthetic */ xga0 $loadingRouter;
    final /* synthetic */ e310 $this_startGeoPaymentInMode;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitModeRouterImpl$startGeoPaymentInMode$1(d dVar, xga0 xga0Var, e310 e310Var, a36 a36Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$loadingRouter = xga0Var;
        this.$this_startGeoPaymentInMode = e310Var;
        this.$analyticsContext = a36Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MassTransitModeRouterImpl$startGeoPaymentInMode$1(this.this$0, this.$loadingRouter, this.$this_startGeoPaymentInMode, this.$analyticsContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MassTransitModeRouterImpl$startGeoPaymentInMode$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r12.a(r11) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n26 f;
        e210 e210Var;
        bl30 bl30Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.geopayment.b bVar = this.this$0.Z;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bl30Var = (bl30) this.L$2;
                f = (n26) this.L$1;
                e210 e210Var2 = (e210) this.L$0;
                kotlin.b.b(obj);
                e210Var = e210Var2;
                if (((Boolean) obj).booleanValue()) {
                    ru.yandex.taxi.masstransit.geopayment.modal.e eVar = (ru.yandex.taxi.masstransit.geopayment.modal.e) bl30Var.r.getValue();
                    d dVar = this.this$0;
                    zk30 zk30Var = new zk30(f);
                    e310 e310Var = this.$this_startGeoPaymentInMode;
                    e010 e010Var = new e010(eVar, 0);
                    dVar.getClass();
                    dVar.B(eVar, zk30Var, new sz00(dVar, e310Var, e210Var, true, e010Var), new l1j0(this.$loadingRouter));
                    return zy11Var;
                }
                com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d dVar2 = (com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d) bl30Var.s.getValue();
                d dVar3 = this.this$0;
                nk30 nk30Var = new nk30(f, this.$analyticsContext);
                e310 e310Var2 = this.$this_startGeoPaymentInMode;
                d010 d010Var = new d010(dVar2, 0);
                dVar3.getClass();
                dVar3.B(dVar2, nk30Var, new rz00(dVar3, e310Var2, e210Var, true, d010Var), new l1j0(this.$loadingRouter));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        e210 a = this.this$0.W.a();
        if (a == null) {
            this.$loadingRouter.i();
            return zy11Var;
        }
        f = z8b1.f(a);
        bl30 bl30Var2 = (bl30) ((i3g) this.$this_startGeoPaymentInMode).W.get();
        ru.yandex.taxi.masstransit.geopayment.a a2 = ((i3g) this.$this_startGeoPaymentInMode).a();
        this.L$0 = a;
        this.L$1 = f;
        this.L$2 = bl30Var2;
        this.label = 2;
        Object a3 = a2.a(this);
        if (a3 != coroutineSingletons) {
            e210Var = a;
            obj = a3;
            bl30Var = bl30Var2;
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return coroutineSingletons;
    }
}
