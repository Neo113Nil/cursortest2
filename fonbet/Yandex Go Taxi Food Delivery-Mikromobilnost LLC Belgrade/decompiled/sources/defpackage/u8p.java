package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class u8p extends a {
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoFailedVerification();
    }
}
