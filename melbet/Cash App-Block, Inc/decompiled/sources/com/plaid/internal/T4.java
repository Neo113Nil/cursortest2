package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {22}, m = "read")
/* loaded from: classes5.dex */
public final class T4 extends ContinuationImpl {
    public W4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ W4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(W4 w4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = w4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a(this);
    }
}
