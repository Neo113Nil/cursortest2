package com.squareup.cash.payments.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.protos.common.Money;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter$send$1 extends ContinuationImpl {
    public List L$0;
    public String L$1;
    public PersonalizationInput L$2;
    public Object L$3;
    public UUID L$4;
    public Money L$5;
    public List L$6;
    public InstrumentSelectionData L$7;
    public BetterNavigator.ScreenNavigator L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PersonalizePaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizePaymentPresenter$send$1(PersonalizePaymentPresenter personalizePaymentPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = personalizePaymentPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.send$presenters(null, null, null, false, this);
    }
}
