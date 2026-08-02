package com.squareup.cash.notifications.channels;

import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealNotificationChannelsInitializer$identifyChannelId$1 extends ContinuationImpl {
    public NotificationChannelId L$1;
    public UtilsKt$$ExternalSyntheticLambda0 L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNotificationChannelsInitializer$identifyChannelId$1(DefaultSocket defaultSocket, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.identifyChannelId(null, this);
    }
}
