package com.squareup.cash.moneybot.backend.real.managers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatSessionManager$sendMessages$1 extends ContinuationImpl {
    public String L$0;
    public Object[] L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatSessionManager$sendMessages$1(RealChatSessionManager realChatSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendMessages(null, null, this);
    }
}
