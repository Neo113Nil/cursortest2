package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {439, 456}, m = "resume")
/* loaded from: classes5.dex */
public final class W2 extends ContinuationImpl {
    public Y2 a;
    public N2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Y2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a((N2) null, (D6) null, this);
    }
}
