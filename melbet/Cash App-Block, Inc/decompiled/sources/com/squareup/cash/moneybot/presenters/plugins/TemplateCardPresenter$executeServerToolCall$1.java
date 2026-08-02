package com.squareup.cash.moneybot.presenters.plugins;

import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class TemplateCardPresenter$executeServerToolCall$1 extends ContinuationImpl {
    public TemplateCardViewEvent.ExecuteServerToolCall L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TemplateCardPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardPresenter$executeServerToolCall$1(TemplateCardPresenter templateCardPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = templateCardPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TemplateCardPresenter.access$executeServerToolCall(this.this$0, null, this);
    }
}
