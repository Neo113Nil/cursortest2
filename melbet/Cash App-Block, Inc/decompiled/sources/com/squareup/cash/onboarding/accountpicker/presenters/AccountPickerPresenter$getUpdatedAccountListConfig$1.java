package com.squareup.cash.onboarding.accountpicker.presenters;

import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.protos.cash.janus.api.JanusService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AccountPickerPresenter$getUpdatedAccountListConfig$1 extends ContinuationImpl {
    public JanusService L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TabToolbarPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerPresenter$getUpdatedAccountListConfig$1(TabToolbarPresenter tabToolbarPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tabToolbarPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TabToolbarPresenter.access$getUpdatedAccountListConfig(this.this$0, this);
    }
}
