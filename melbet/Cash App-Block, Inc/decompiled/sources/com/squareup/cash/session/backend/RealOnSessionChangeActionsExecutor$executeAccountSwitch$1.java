package com.squareup.cash.session.backend;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealOnSessionChangeActionsExecutor$executeAccountSwitch$1 extends ContinuationImpl {
    public int I$0;
    public Iterator L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOnSessionChangeActionsExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOnSessionChangeActionsExecutor$executeAccountSwitch$1(RealOnSessionChangeActionsExecutor realOnSessionChangeActionsExecutor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOnSessionChangeActionsExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.executeAccountSwitch(this);
    }
}
