package com.squareup.cash.account.navigation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAccountOutboundNavigator$goToPrivacyNotice$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAccountOutboundNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountOutboundNavigator$goToPrivacyNotice$1(RealAccountOutboundNavigator realAccountOutboundNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAccountOutboundNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.goToPrivacyNotice(this);
    }
}
