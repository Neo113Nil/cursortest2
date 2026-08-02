package com.squareup.cash.education.stories.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class EducationStoryPresenter$handleNewUrl$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$3;
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EducationStoryPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationStoryPresenter$handleNewUrl$1(EducationStoryPresenter educationStoryPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = educationStoryPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EducationStoryPresenter.access$handleNewUrl(this.this$0, null, 0, this);
    }
}
