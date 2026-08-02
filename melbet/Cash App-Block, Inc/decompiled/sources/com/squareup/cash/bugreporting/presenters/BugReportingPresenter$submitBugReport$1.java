package com.squareup.cash.bugreporting.presenters;

import androidx.compose.material3.ButtonKt$Button$2;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BugReportingPresenter$submitBugReport$1 extends ContinuationImpl {
    public RealBrandFollowPresenter$models$2$1$1 L$5;
    public RealBrandFollowPresenter$models$2$1$1 L$6;
    public ButtonKt$Button$2.AnonymousClass1 L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportingPresenter$submitBugReport$1(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalHomePresenter.access$submitBugReport(this.this$0, null, null, null, null, null, null, null, null, this);
    }
}
