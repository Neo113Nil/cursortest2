package com.squareup.cash.prepurchasecashcard.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 extends ContinuationImpl {
    public Screen L$0;
    public BlockersData L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EglCore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1(EglCore eglCore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eglCore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getPrepurchaseToggleFlowScreen(null, null, null, this);
    }
}
