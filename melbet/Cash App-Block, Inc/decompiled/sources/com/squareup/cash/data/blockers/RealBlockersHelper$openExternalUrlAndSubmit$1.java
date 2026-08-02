package com.squareup.cash.data.blockers;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$openExternalUrlAndSubmit$1 extends ContinuationImpl {
    public BlockerAction.OpenExternalURLAndSubmitAction L$0;
    public BlockersScreens L$1;
    public Function2 L$2;
    public BlockersData L$3;
    public ApiResult L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$openExternalUrlAndSubmit$1(RealBlockersHelper realBlockersHelper, Continuation continuation) {
        super(continuation);
        this.this$0 = realBlockersHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.openExternalUrlAndSubmit(null, null, null, this);
    }
}
