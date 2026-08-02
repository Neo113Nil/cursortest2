package defpackage;

import com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation_8Mi8wO0$longDistanceFlow$$inlined$transform$1;
import com.yandex.go.superapp.biometrics.data.models.BiometricsBleReceiverDisconnectReason;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class uy5 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpr b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ uy5(vpr vprVar, Integer num, int i) {
        this.a = i;
        this.c = num;
        this.b = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object u;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vpr vprVar = this.b;
        Integer num = this.c;
        switch (i) {
            case 0:
                xy5 xy5Var = (xy5) obj;
                if (!jl40.l(xy5Var, vy5.a)) {
                    if (!(xy5Var instanceof wy5)) {
                        w511.b();
                        break;
                    } else {
                        u = e.u(new rol0(new BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation_8Mi8wO0$longDistanceFlow$$inlined$transform$1(((wy5) xy5Var).b.d, null, num)), vprVar, continuation);
                        if (u != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                } else {
                    u = vprVar.emit(BiometricsBleReceiverDisconnectReason.DeviceUnavailable, continuation);
                    if (u != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                break;
            default:
                c26 c26Var = (c26) obj;
                if (!jl40.l(c26Var, b26.a) && !jl40.l(c26Var, a26.a)) {
                    if (!(c26Var instanceof z16)) {
                        w511.b();
                        break;
                    } else {
                        Integer num2 = ((z16) c26Var).c;
                        if (num2 != null && num != null && num2.intValue() < num.intValue() && (r4 = vprVar.emit(BiometricsBleReceiverDisconnectReason.LongDistance, continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                }
                break;
        }
        return null;
    }
}
