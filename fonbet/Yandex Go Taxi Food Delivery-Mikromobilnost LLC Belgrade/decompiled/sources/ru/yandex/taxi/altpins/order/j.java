package ru.yandex.taxi.altpins.order;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a741;
import defpackage.n3j;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z641;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public j(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1 walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1;
        int i;
        a741 a741Var;
        if (continuation instanceof WalkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1) {
            walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1 = (WalkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z641 z641Var = (z641) obj;
                    OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock = z641Var.a;
                    if (infoBlock != null) {
                        a741Var = new a741(infoBlock.getA(), infoBlock.getB(), this.b.a(infoBlock.getC(), n3j.b), infoBlock.getD(), z641Var.b);
                    } else {
                        a741Var = null;
                    }
                    walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a741Var, walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1 = new WalkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingInfoBlockInteractorImpl$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
