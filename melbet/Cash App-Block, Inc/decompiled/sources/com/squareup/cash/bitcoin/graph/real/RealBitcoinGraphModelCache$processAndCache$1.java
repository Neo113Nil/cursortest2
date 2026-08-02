package com.squareup.cash.bitcoin.graph.real;

import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.protos.franklin.common.PriceTick;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBitcoinGraphModelCache$processAndCache$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public HistoricalRange L$0;
    public PolledData L$1;
    public PriceTick L$4;
    public PriceTick L$5;
    public List L$7;
    public List L$8;
    public List L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinGraphModelCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinGraphModelCache$processAndCache$1(RealBitcoinGraphModelCache realBitcoinGraphModelCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinGraphModelCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processAndCache(null, null, this);
    }
}
