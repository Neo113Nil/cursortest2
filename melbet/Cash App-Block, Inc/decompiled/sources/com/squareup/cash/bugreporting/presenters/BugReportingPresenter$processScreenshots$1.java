package com.squareup.cash.bugreporting.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BugReportingPresenter$processScreenshots$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Collection L$3;
    public Iterator L$4;
    public Screenshot L$6;
    public Collection L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportingPresenter$processScreenshots$1(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalHomePresenter.access$processScreenshots(this.this$0, null, this);
    }
}
