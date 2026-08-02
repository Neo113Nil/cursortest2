package com.squareup.cash.moneybot.backend.real.managers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatSessionManager$startChat$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatSessionManager$startChat$1(RealChatSessionManager realChatSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startChat(null, null, this);
    }
}
