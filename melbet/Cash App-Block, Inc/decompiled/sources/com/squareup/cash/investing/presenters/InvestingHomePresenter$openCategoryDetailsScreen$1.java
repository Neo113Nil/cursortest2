package com.squareup.cash.investing.presenters;

import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingHomePresenter$openCategoryDetailsScreen$1 extends ContinuationImpl {
    public InvestingHomeViewEvent.SelectCategory L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingHomePresenter$openCategoryDetailsScreen$1(ProfilePresenter profilePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profilePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ProfilePresenter.access$openCategoryDetailsScreen(this.this$0, null, this);
    }
}
