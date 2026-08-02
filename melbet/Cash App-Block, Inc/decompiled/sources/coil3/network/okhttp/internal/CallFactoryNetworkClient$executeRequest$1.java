package coil3.network.okhttp.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Call;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient$executeRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Call.Factory L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CallFactoryNetworkClient.m1461executeRequestimpl(null, null, null, this);
    }
}
