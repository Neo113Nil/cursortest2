package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewFallbackUriStore", f = "WebviewFallbackUriStore.kt", l = {20, 24}, m = "readWebviewFallbackUri")
/* loaded from: classes5.dex */
public final class N7 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ O7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N7(O7 o7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = o7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a(this);
    }
}
