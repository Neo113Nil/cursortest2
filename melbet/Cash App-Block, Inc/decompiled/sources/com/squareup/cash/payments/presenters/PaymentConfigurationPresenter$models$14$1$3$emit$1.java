package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$14$1$3$emit$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public SectionViewModel L$10;
    public String L$12;
    public Collection L$13;
    public Iterator L$14;
    public Collection L$17;
    public RecipientViewModel L$18;
    public Collection L$19;
    public PaymentConfigurationPresenter L$2;
    public MutableState L$3;
    public Collection L$5;
    public Iterator L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$14$1$3$emit$1(NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = nearbyPayRequestPresenter$models$10$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit$com$squareup$cash$payments$presenters$PaymentConfigurationPresenter$models$14$1$3((List) null, (Continuation) this);
    }
}
