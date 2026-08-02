package app.cash.api;

import app.cash.api.wrapper.ServiceContextWrapper;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.Message;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CashServiceContextWrapper$getAppShortlink$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public ServiceContextWrapper L$2;
    public Message L$3;
    public Exception L$5;
    public RequestContext L$6;
    public Object L$7;
    public Object L$8;
    public GetAppShortlinkRequest L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashServiceContextWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashServiceContextWrapper$getAppShortlink$1(CashServiceContextWrapper cashServiceContextWrapper, Continuation continuation) {
        super(continuation);
        this.this$0 = cashServiceContextWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getAppShortlink(null, null, this);
    }
}
