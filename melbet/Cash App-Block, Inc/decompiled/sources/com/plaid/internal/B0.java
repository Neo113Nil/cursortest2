package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.DestinationFactory", f = "DestinationFactory.kt", l = {63}, m = "create")
/* loaded from: classes5.dex */
public final class B0 extends ContinuationImpl {
    public A0 a;
    public N2 b;
    public r8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ A0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(A0 a0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = a0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a((N2) null, this);
    }
}
