package com.squareup.cash.activity.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealActivityAnalyticsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealActivityAnalyticsService$setTreehouseAnalyticsTokens$1(RealActivityAnalyticsService realActivityAnalyticsService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realActivityAnalyticsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setTreehouseAnalyticsTokens(this);
    }
}
