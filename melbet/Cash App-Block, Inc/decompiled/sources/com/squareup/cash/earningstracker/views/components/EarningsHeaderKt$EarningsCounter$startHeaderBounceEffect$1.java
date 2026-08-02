package com.squareup.cash.earningstracker.views.components;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class EarningsHeaderKt$EarningsCounter$startHeaderBounceEffect$1 extends ContinuationImpl {
    public Function0 L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EarningsHeaderKt.access$EarningsCounter$startHeaderBounceEffect(null, null, null, null, this);
    }
}
