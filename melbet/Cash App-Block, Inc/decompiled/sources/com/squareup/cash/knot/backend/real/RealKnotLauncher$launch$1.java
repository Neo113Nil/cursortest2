package com.squareup.cash.knot.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealKnotLauncher$launch$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealKnotLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealKnotLauncher$launch$1(RealKnotLauncher realKnotLauncher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realKnotLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.launch(null, this);
    }
}
