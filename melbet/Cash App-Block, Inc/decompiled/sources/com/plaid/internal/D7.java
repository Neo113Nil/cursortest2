package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewBackgroundTransparencyStore", f = "WebviewBackgroundTransparencyStore.kt", l = {27}, m = "readWebviewBackgroundTransparencyState")
/* loaded from: classes5.dex */
public final class D7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ E7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(E7 e7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = e7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
