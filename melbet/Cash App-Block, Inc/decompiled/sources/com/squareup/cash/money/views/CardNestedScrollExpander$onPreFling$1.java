package com.squareup.cash.money.views;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardNestedScrollExpander$onPreFling$1 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardNestedScrollExpander this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNestedScrollExpander$onPreFling$1(CardNestedScrollExpander cardNestedScrollExpander, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardNestedScrollExpander;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.mo493onPreFlingQWom1Mo(0L, this);
    }
}
