package com.squareup.cash.moneybot.presenters;

import app.cash.api.ApiResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter$loadContent$1 extends ContinuationImpl {
    public Job L$2;
    public DeferredCoroutine L$4;
    public ApiResult L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MoneybotHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotHomePresenter$loadContent$1(MoneybotHomePresenter moneybotHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = moneybotHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MoneybotHomePresenter.access$loadContent(this.this$0, null, null, this);
    }
}
