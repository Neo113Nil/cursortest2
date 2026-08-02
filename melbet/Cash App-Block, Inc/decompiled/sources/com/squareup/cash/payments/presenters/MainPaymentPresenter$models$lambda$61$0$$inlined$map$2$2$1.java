package com.squareup.cash.payments.presenters;

import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public List L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardSchemePresenter$toHeroModule$3$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentPresenter$models$lambda$61$0$$inlined$map$2$2$1(CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = cardSchemePresenter$toHeroModule$3$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
