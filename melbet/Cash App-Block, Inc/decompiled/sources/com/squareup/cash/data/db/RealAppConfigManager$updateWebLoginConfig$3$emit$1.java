package com.squareup.cash.data.db;

import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAppConfigManager$updateWebLoginConfig$3$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardModelView$1$2$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAppConfigManager$updateWebLoginConfig$3$emit$1(CardModelView$1$2$2 cardModelView$1$2$2, Continuation continuation) {
        super(continuation);
        this.this$0 = cardModelView$1$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit$2(this);
    }
}
