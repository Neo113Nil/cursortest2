package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class s2a0 {
    public final n0 a;
    public final eci0 b;
    public volatile q3a0 c;

    public s2a0() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.c(b);
    }

    public final q3a0 a() {
        q3a0 q3a0Var = this.c;
        return q3a0Var == null ? new q3a0(FinishFlowStatus.CANCEL, null, null) : q3a0Var;
    }
}
