package com.squareup.cash.recipients.data;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealRecipientRepository$buildSuggestedSection$1 extends ContinuationImpl {
    public List L$1;
    public List L$2;
    public Set L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRecipientRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientRepository$buildSuggestedSection$1(RealRecipientRepository realRecipientRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realRecipientRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealRecipientRepository.access$buildSuggestedSection(this.this$0, false, null, null, null, null, this);
    }
}
