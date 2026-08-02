package com.squareup.cash.profile.presenters.notifications;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ProfileNotificationsPresenter$loadAccountSelectorAccounts$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfileNotificationsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileNotificationsPresenter$loadAccountSelectorAccounts$1(ProfileNotificationsPresenter profileNotificationsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profileNotificationsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ProfileNotificationsPresenter.access$loadAccountSelectorAccounts(this.this$0, this);
    }
}
