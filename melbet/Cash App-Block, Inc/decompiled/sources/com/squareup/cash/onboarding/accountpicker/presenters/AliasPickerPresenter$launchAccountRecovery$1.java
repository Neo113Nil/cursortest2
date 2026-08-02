package com.squareup.cash.onboarding.accountpicker.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.janus.api.ReturningCustomerLoginFlowService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AliasPickerPresenter$launchAccountRecovery$1 extends ContinuationImpl {
    public BlockersData L$0;
    public RequestContext L$1;
    public String L$2;
    public ReturningCustomerLoginFlowService L$3;
    public ClientScenario L$4;
    public String L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliasPickerPresenter$launchAccountRecovery$1(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardLockPresenter.access$launchAccountRecovery(this.this$0, this);
    }
}
