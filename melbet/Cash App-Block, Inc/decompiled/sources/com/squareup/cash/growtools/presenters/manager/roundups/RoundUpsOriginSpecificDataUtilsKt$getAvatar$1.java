package com.squareup.cash.growtools.presenters.manager.roundups;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.ClosedRange;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RoundUpsOriginSpecificDataUtilsKt$getAvatar$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ClosedRange.DefaultImpls.access$getAvatar(null, null, false, this);
    }
}
