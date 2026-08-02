package com.squareup.cash.clientrouting.routers.blockers;

import com.squareup.protos.franklin.api.ClientScenario;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealBiometricPreauthScenarioManager$preauthenticate$1 extends ContinuationImpl {
    public ClientScenario L$0;
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MarkwonConfiguration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBiometricPreauthScenarioManager$preauthenticate$1(MarkwonConfiguration markwonConfiguration, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = markwonConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.preauthenticate(null, null, this);
    }
}
