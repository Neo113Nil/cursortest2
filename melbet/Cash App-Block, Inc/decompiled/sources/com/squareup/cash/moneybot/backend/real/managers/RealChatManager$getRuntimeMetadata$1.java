package com.squareup.cash.moneybot.backend.real.managers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatManager$getRuntimeMetadata$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatManager$getRuntimeMetadata$1(RealChatManager realChatManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getRuntimeMetadata(this);
    }
}
