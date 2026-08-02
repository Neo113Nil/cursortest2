package com.squareup.cash.blockers.presenters;

import com.squareup.cash.card.onboarding.DisclosurePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class StripeLinkPresenter$completeLink$1 extends ContinuationImpl {
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeLinkPresenter$completeLink$1(DisclosurePresenter disclosurePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = disclosurePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.completeLink(null, null, null, this);
    }
}
