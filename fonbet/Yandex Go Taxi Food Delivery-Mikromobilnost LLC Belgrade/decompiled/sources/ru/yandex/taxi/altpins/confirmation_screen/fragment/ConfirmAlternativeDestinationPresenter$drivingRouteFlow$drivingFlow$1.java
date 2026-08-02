package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u2e;
import defpackage.uz;
import defpackage.v2e;
import defpackage.vj;
import defpackage.vpr;
import defpackage.wj;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.altpins.models.OptionType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1", f = "ConfirmAlternativeDestinationPresenter.kt", l = {72, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ OptionType $optionType;
    final /* synthetic */ List<zzs> $route;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v2e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1(v2e v2eVar, List list, OptionType optionType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v2eVar;
        this.$route = list;
        this.$optionType = optionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1 confirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1 = new ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1(this.this$0, this.$route, this.$optionType, continuation);
        confirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1.L$0 = obj;
        return confirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b6, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r3 == r2) goto L22;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, uz] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object s;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            v2e v2eVar = this.this$0;
            List<zzs> list = this.$route;
            OptionType optionType = this.$optionType;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            DrivingRoute drivingRoute = (DrivingRoute) v2eVar.E.get(optionType);
            if (drivingRoute != null) {
                s = drivingRoute;
            } else {
                j18 j18Var = new j18(1, dvw.b(this));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(9, y);
                cl7 cl7Var = new cl7(j18Var, vjVar);
                v2eVar.B.g(list, null, new u2e(new ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), v2eVar, optionType, new ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0)), null);
                y.element = new uz(20, v2eVar);
                if (cl7Var.c()) {
                    vjVar.invoke();
                } else {
                    j18Var.w(new wj(cl7Var, 9));
                }
                s = j18Var.s();
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            b.b(obj);
            s = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
