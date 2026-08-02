package com.squareup.cash.initialscreenloader.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class AppVersionCheckerActivityWorker$showUpgradePrompt$1 extends ContinuationImpl {
    public String L$0;
    public String L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppVersionCheckerActivityWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersionCheckerActivityWorker$showUpgradePrompt$1(AppVersionCheckerActivityWorker appVersionCheckerActivityWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appVersionCheckerActivityWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showUpgradePrompt(null, null, false, this);
    }
}
