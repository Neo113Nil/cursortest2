package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.ahn0;
import defpackage.chn0;
import defpackage.dms;
import defpackage.jfn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6p0;
import defpackage.rgn0;
import defpackage.shn0;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.wgn0;
import defpackage.yfn0;
import defpackage.ysn0;
import defpackage.zgn0;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lshn0;", ACSPConstants.STATUS, "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;", "shareLocationToggleState", "voluntarySlowdownToggleState", "Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "onTheWayActionInProgress", "Lahn0;", "<anonymous>", "(Lshn0;Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;)Lahn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Interactor$handleModelsState$1", f = "ScootersDetailedOrderV2Interactor.kt", l = {109, 122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderV2Interactor$handleModelsState$1 extends SuspendLambda implements dms {
    final /* synthetic */ sqm0 $activeOrdersState;
    final /* synthetic */ jfn0 $promoPlate;
    final /* synthetic */ zuo0 $scootersSessionState;
    final /* synthetic */ zgn0 $scootersVehicleActualPhotoState;
    final /* synthetic */ zuo0 $sessionState;
    final /* synthetic */ p6p0 $userState;
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ chn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderV2Interactor$handleModelsState$1(chn0 chn0Var, sqm0 sqm0Var, zuo0 zuo0Var, jfn0 jfn0Var, p6p0 p6p0Var, zuo0 zuo0Var2, zgn0 zgn0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = chn0Var;
        this.$activeOrdersState = sqm0Var;
        this.$sessionState = zuo0Var;
        this.$promoPlate = jfn0Var;
        this.$userState = p6p0Var;
        this.$scootersSessionState = zuo0Var2;
        this.$scootersVehicleActualPhotoState = zgn0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ScootersDetailedOrderV2Interactor$handleModelsState$1 scootersDetailedOrderV2Interactor$handleModelsState$1 = new ScootersDetailedOrderV2Interactor$handleModelsState$1(this.this$0, this.$activeOrdersState, this.$sessionState, this.$promoPlate, this.$userState, this.$scootersSessionState, this.$scootersVehicleActualPhotoState, (Continuation) obj5);
        scootersDetailedOrderV2Interactor$handleModelsState$1.L$0 = (shn0) obj;
        scootersDetailedOrderV2Interactor$handleModelsState$1.L$1 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) obj2;
        scootersDetailedOrderV2Interactor$handleModelsState$1.L$2 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) obj3;
        scootersDetailedOrderV2Interactor$handleModelsState$1.L$3 = (ScootersOnTheWayAction) obj4;
        return scootersDetailedOrderV2Interactor$handleModelsState$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r4 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r0 == r11) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        rgn0 rgn0Var;
        yfn0 yfn0Var;
        int i;
        List p;
        Object a;
        shn0 shn0Var = (shn0) this.L$0;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) this.L$1;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) this.L$2;
        ScootersOnTheWayAction scootersOnTheWayAction = (ScootersOnTheWayAction) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.a aVar = this.this$0.h;
            int A = uh6.A(this.$activeOrdersState);
            List p2 = this.$sessionState.p();
            jfn0 jfn0Var = this.$promoPlate;
            zuo0 zuo0Var = this.$sessionState;
            p6p0 p6p0Var = this.$userState;
            this.L$0 = shn0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = scootersOnTheWayAction;
            this.label = 1;
            b = aVar.b(A, jfn0Var, zuo0Var, p6p0Var, scootersOnTheWayAction, p2, scootersDetailedOrderAction$ClickType$Toggle$ToggleState, scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                p = (List) this.L$6;
                yfn0Var = (yfn0) this.L$5;
                rgn0Var = (rgn0) this.L$4;
                kotlin.b.b(obj);
                a = obj;
                List list = p;
                return new ahn0(i != 0, yfn0Var, rgn0Var, this.$sessionState, shn0Var, list, (wgn0) a, this.$scootersVehicleActualPhotoState);
            }
            kotlin.b.b(obj);
            b = obj;
        }
        rgn0Var = (rgn0) b;
        chn0 chn0Var = this.this$0;
        zuo0 zuo0Var2 = this.$sessionState;
        ysn0 ysn0Var = this.$userState.g;
        chn0Var.getClass();
        yfn0Var = new yfn0(zuo0Var2.getNumber(), zuo0Var2.l(), zuo0Var2.h(), zuo0Var2.d(), ysn0Var, zuo0Var2.a());
        i = scootersOnTheWayAction != null ? 1 : 0;
        p = this.$sessionState.p();
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.a aVar2 = this.this$0.b;
        sqm0 sqm0Var = this.$activeOrdersState;
        String sessionId = this.$scootersSessionState.getSessionId();
        this.L$0 = shn0Var;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = rgn0Var;
        this.L$5 = yfn0Var;
        this.L$6 = p;
        this.I$0 = i;
        this.label = 2;
        a = aVar2.a(sqm0Var, sessionId, this);
    }
}
