package com.squareup.cash.appmessages.overlay;

import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealOverlayAppMessageReader$pendingMessageFor$1 extends ContinuationImpl {
    public OverlayAppMessagePlacement L$0;
    public RealOverlayAppMessageReader.MessageSearchResult L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOverlayAppMessageReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOverlayAppMessageReader$pendingMessageFor$1(RealOverlayAppMessageReader realOverlayAppMessageReader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOverlayAppMessageReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.pendingMessageFor(null, this);
    }
}
