package com.squareup.cash.clientrouting.routers.profile;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ProfileDocumentsRouter$route$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfileDocumentsRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDocumentsRouter$route$1(ProfileDocumentsRouter profileDocumentsRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profileDocumentsRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.ViewDocumentCategory) null, this);
    }
}
