package com.squareup.cash.data.blockers;

import com.fillr.e0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$download$1 extends ContinuationImpl {
    public e0 L$0;
    public BlockersScreens L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$download$1(RealBlockersHelper realBlockersHelper, Continuation continuation) {
        super(continuation);
        this.this$0 = realBlockersHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.download(null, null, this);
    }
}
