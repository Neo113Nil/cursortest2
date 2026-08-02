package com.squareup.cash.session.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DoubleWriteSessionManager$conditionalDoubleWrite$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Function2 L$0;
    public Mutex L$1;
    public DoubleWriteSessionManager L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DoubleWriteSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleWriteSessionManager$conditionalDoubleWrite$1(DoubleWriteSessionManager doubleWriteSessionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = doubleWriteSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.conditionalDoubleWrite(null, this);
    }
}
