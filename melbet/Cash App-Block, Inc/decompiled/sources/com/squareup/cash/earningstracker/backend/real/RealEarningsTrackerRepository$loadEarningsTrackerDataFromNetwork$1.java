package com.squareup.cash.earningstracker.backend.real;

import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1 extends ContinuationImpl {
    public long J$0;
    public DateFilter L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealEarningsTrackerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1(RealEarningsTrackerRepository realEarningsTrackerRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realEarningsTrackerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealEarningsTrackerRepository.access$loadEarningsTrackerDataFromNetwork(this.this$0, null, this);
    }
}
