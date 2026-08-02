package com.squareup.cash.core.navigationcontainer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AcceptableScrim$interact$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public SuspendLambda L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AcceptableScrim this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptableScrim$interact$1(AcceptableScrim acceptableScrim, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = acceptableScrim;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.interact(null, this);
    }
}
