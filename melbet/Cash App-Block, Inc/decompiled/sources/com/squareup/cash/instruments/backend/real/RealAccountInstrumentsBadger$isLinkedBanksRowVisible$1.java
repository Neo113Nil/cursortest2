package com.squareup.cash.instruments.backend.real;

import com.squareup.cash.db2.Instrument$Adapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Instrument$Adapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountInstrumentsBadger$isLinkedBanksRowVisible$1(Instrument$Adapter instrument$Adapter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = instrument$Adapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return Instrument$Adapter.access$isLinkedBanksRowVisible(this.this$0, this);
    }
}
