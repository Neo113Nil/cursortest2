package com.squareup.cash.savings.backend.real;

import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WirelessProviderListPresenter$models$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1(WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = wirelessProviderListPresenter$models$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
