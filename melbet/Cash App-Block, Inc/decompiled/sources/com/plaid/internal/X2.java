package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {56, 66, 74, 85, 93}, m = "start")
/* loaded from: classes5.dex */
public final class X2 extends ContinuationImpl {
    public Y2 a;
    public N2 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Y2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a((N2) null, false, (ContinuationImpl) this);
    }
}
