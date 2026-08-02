package com.squareup.cash.card.onboarding.core;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1 extends ContinuationImpl {
    public long J$0;
    public LinkedHashMap L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(null, null, null, this);
    }
}
