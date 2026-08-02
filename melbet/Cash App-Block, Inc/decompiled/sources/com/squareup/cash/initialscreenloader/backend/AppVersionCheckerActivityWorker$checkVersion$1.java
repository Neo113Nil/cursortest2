package com.squareup.cash.initialscreenloader.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppVersionCheckerActivityWorker$checkVersion$1 extends ContinuationImpl {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppVersionCheckerActivityWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersionCheckerActivityWorker$checkVersion$1(AppVersionCheckerActivityWorker appVersionCheckerActivityWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appVersionCheckerActivityWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AppVersionCheckerActivityWorker.access$checkVersion(this.this$0, this);
    }
}
