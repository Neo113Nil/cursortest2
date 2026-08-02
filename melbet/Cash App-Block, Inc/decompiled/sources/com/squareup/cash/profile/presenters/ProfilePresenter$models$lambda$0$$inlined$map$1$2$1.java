package com.squareup.cash.profile.presenters;

import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ProfilePresenter$models$lambda$0$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public AsyncResult L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WirelessProviderListPresenter$models$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePresenter$models$lambda$0$$inlined$map$1$2$1(WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1, Continuation continuation) {
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
