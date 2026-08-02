package com.squareup.cash.clientsync;

import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ResponseContextProcessors$processResponseContext$1 extends ContinuationImpl {
    public int I$0;
    public RequestContext L$0;
    public ResponseContext L$1;
    public String L$2;
    public Iterator L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ResponseContextProcessors this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseContextProcessors$processResponseContext$1(ResponseContextProcessors responseContextProcessors, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = responseContextProcessors;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processResponseContext(null, null, null, this);
    }
}
