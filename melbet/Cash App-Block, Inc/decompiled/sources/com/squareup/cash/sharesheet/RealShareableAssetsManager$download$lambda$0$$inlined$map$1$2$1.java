package com.squareup.cash.sharesheet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelFlowMerge$collectTo$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShareableAssetsManager$download$lambda$0$$inlined$map$1$2$1(ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2, Continuation continuation) {
        super(continuation);
        this.this$0 = channelFlowMerge$collectTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
