package com.squareup.cash.activity.presenters;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class DefaultActivityItemEventHandler$itemClicked$1 extends ContinuationImpl {
    public ActivityItemViewModel L$0;
    public FormattedPaymentHistoryActivityItem L$1;
    public ProducerScope L$2;
    public ActivityItemPresentationContext L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultActivityItemEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultActivityItemEventHandler$itemClicked$1(DefaultActivityItemEventHandler defaultActivityItemEventHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultActivityItemEventHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DefaultActivityItemEventHandler.access$itemClicked(this.this$0, null, null, null, this);
    }
}
