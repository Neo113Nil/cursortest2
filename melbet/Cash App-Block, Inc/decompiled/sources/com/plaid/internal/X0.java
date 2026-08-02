package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", f = "ExponentialBackoffRetry.kt", l = {22, 24}, m = "doNetworkCallWithRetries$link_sdk_release")
/* loaded from: classes5.dex */
public final class X0<T> extends ContinuationImpl {
    public Object a;
    public Ref$ObjectRef b;
    public Ref$ObjectRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Z0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Z0 z0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = z0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a(null, this);
    }
}
