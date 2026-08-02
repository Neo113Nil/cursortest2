package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {346, 351, 358, 385}, m = "previous")
/* loaded from: classes5.dex */
public final class V2 extends ContinuationImpl {
    public Y2 a;
    public N2 b;
    public r8 c;
    public List d;
    public r8 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Y2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= PKIFailureInfo.systemUnavail;
        return this.g.b(null, this);
    }
}
