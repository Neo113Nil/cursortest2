package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.family.familyhub.backend.api.SponseeCashAppTag;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CashCardControlPresenter$runTagOperation$1 extends ContinuationImpl {
    public SponseeCashAppTag L$0;
    public String L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashCardControlPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCardControlPresenter$runTagOperation$1(CashCardControlPresenter cashCardControlPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashCardControlPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.runTagOperation(null, false, null, this);
    }
}
