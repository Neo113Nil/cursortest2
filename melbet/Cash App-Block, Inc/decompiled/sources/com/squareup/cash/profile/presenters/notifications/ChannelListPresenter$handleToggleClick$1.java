package com.squareup.cash.profile.presenters.notifications;

import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChannelListPresenter$handleToggleClick$1 extends ContinuationImpl {
    public ChannelListViewEvent.ToggleClicked L$0;
    public ShiftNotePresenter$models$1$1 L$4;
    public ShiftNotePresenter$models$1$1 L$5;
    public Category L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListPresenter$handleToggleClick$1(ChannelListPresenter channelListPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = channelListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ChannelListPresenter.access$handleToggleClick(this.this$0, null, null, null, null, null, null, this);
    }
}
