package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EMPTY;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CancelVerificationFlowState$onStart$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.getClass();
        try {
            bVar.f.cancelVerification();
            bVar.d(EMPTY.INSTANCE);
        } catch (Exception e) {
            bVar.c(e);
        }
        return zy11.a;
    }
}
