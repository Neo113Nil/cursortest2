package com.squareup.cash.moneybot.backend.real.managers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealMoneybotPromptManager$refreshPrompts$1 extends ContinuationImpl {
    public int I$0;
    public Mutex L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealMoneybotPromptManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMoneybotPromptManager$refreshPrompts$1(RealMoneybotPromptManager realMoneybotPromptManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realMoneybotPromptManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshPrompts(this);
    }
}
