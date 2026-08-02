package com.squareup.cash.card.onboarding.core;

import com.datadog.android.rum.internal.utils.WriteOperation;
import com.squareup.cash.card.onboarding.CardContouredText;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContouredTextOverlay$update$1 extends ContinuationImpl {
    public CardContouredText L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WriteOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContouredTextOverlay$update$1(WriteOperation writeOperation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = writeOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.update(null, false, this);
    }
}
