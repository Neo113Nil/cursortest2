package com.squareup.cash.earningstracker.presenters;

import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealGetCustomerProfileScreen$invoke$1 extends ContinuationImpl {
    public EarningsTrackerScreen L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetCustomerProfileScreen$invoke$1(zzr zzrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, this);
    }
}
