package com.squareup.cash.savings.presenters;

import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUrlAuthenticator$special$$inlined$filter$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1(RealUrlAuthenticator$special$$inlined$filter$1$2 realUrlAuthenticator$special$$inlined$filter$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realUrlAuthenticator$special$$inlined$filter$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
