package com.squareup.cash.activity.presenters;

import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.data.db.InvitationConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter$buildFeedEntries$1 extends ContinuationImpl {
    public Activities L$0;
    public ContactHeaderViewModel L$1;
    public InvitationConfig L$3;
    public InlineAppMessageViewModel L$4;
    public InlineAppMessageV2ViewModel L$5;
    public CardAppMessageViewModel L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabPresenter$buildFeedEntries$1(ActivityTabPresenter activityTabPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = activityTabPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ActivityTabPresenter.access$buildFeedEntries(this.this$0, null, null, null, null, null, null, null, this);
    }
}
