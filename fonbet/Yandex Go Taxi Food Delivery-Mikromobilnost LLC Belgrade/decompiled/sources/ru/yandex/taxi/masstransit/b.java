package ru.yandex.taxi.masstransit;

import defpackage.a80;
import defpackage.b64;
import defpackage.c85;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.e310;
import defpackage.i8m;
import defpackage.igu0;
import defpackage.j18;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.common_models.net.map_object.t;
import ru.yandex.taxi.masstransit.api.model.OpenReason;

/* loaded from: classes6.dex */
public final class b extends c85 {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, i8m] */
    @Override // defpackage.c85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pm00 pm00Var, Continuation continuation) {
        MassTransitModeRouterImpl$onAttach$1$visit$1 massTransitModeRouterImpl$onAttach$1$visit$1;
        int i;
        if (continuation instanceof MassTransitModeRouterImpl$onAttach$1$visit$1) {
            massTransitModeRouterImpl$onAttach$1$visit$1 = (MassTransitModeRouterImpl$onAttach$1$visit$1) continuation;
            int i2 = massTransitModeRouterImpl$onAttach$1$visit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitModeRouterImpl$onAttach$1$visit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = massTransitModeRouterImpl$onAttach$1$visit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitModeRouterImpl$onAttach$1$visit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    massTransitModeRouterImpl$onAttach$1$visit$1.L$0 = pm00Var;
                    d dVar = this.a;
                    massTransitModeRouterImpl$onAttach$1$visit$1.L$1 = dVar;
                    massTransitModeRouterImpl$onAttach$1$visit$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(massTransitModeRouterImpl$onAttach$1$visit$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(17, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2 massTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2 = new MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                    igu0 igu0Var = new igu0(pm00Var.b, pm00Var.a, ((t) pm00Var.d).a, OpenReason.REASON_MAP);
                    e310 e310Var = dVar.e0;
                    if (e310Var != null) {
                        dVar.V(e310Var, igu0Var, new a80(23, massTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2));
                    }
                    y.element = new i8m(26, massTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 17));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        massTransitModeRouterImpl$onAttach$1$visit$1 = new MassTransitModeRouterImpl$onAttach$1$visit$1(this, (ContinuationImpl) continuation);
        Object obj2 = massTransitModeRouterImpl$onAttach$1$visit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitModeRouterImpl$onAttach$1$visit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
