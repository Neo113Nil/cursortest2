package com.squareup.cash.onboarding.check.checkers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class TabIntegrityCheck$check$1 extends ContinuationImpl {
    public TabIntegrityCheck L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TabIntegrityCheck this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIntegrityCheck$check$1(TabIntegrityCheck tabIntegrityCheck, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tabIntegrityCheck;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.check(this);
    }
}
