package com.squareup.cash.clientrouting.routers.appMessages;

import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GetAppMessageByTokenRouter$route$1 extends ContinuationImpl {
    public AppMessage L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetAppMessageByTokenRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppMessageByTokenRouter$route$1(GetAppMessageByTokenRouter getAppMessageByTokenRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getAppMessageByTokenRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route(null, this);
    }
}
