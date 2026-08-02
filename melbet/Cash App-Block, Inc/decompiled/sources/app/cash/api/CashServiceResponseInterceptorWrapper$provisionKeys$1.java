package app.cash.api;

import com.squareup.cash.api.AppServiceResponseInterceptorWrapper;
import com.squareup.cash.clientsync.network.SyncEntityTypeInterceptor;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CashServiceResponseInterceptorWrapper$provisionKeys$1 extends ContinuationImpl {
    public Class L$3;
    public SyncEntityTypeInterceptor L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppServiceResponseInterceptorWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashServiceResponseInterceptorWrapper$provisionKeys$1(AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper, Continuation continuation) {
        super(continuation);
        this.this$0 = appServiceResponseInterceptorWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.provisionKeys(null, this);
    }
}
