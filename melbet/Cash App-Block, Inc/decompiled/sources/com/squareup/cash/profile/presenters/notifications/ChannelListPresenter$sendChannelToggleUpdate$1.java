package com.squareup.cash.profile.presenters.notifications;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChannelListPresenter$sendChannelToggleUpdate$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListPresenter$sendChannelToggleUpdate$1(ChannelListPresenter channelListPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = channelListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendChannelToggleUpdate$real(null, null, false, null, null, this);
    }
}
