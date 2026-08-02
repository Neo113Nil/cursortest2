package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.graphics.backend.gl.core.EglCore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealNextBestActionManager$updateNextBestAction$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EglCore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNextBestActionManager$updateNextBestAction$1(EglCore eglCore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eglCore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateNextBestAction(null, this);
    }
}
