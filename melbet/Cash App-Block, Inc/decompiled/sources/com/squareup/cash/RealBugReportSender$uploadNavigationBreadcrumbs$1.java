package com.squareup.cash;

import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBugReportSender$uploadNavigationBreadcrumbs$1 extends ContinuationImpl {
    public File L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBugReportSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$uploadNavigationBreadcrumbs$1(RealBugReportSender realBugReportSender, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBugReportSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealBugReportSender.access$uploadNavigationBreadcrumbs(this.this$0, null, null, this);
    }
}
