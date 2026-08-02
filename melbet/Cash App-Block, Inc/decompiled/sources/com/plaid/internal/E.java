package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling", f = "ChannelPolling.kt", l = {51, 52}, m = "pollOnChannel")
/* loaded from: classes5.dex */
public final class E extends ContinuationImpl {
    public F a;
    public A b;
    public G c;
    public String d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ F g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= PKIFailureInfo.systemUnavail;
        return F.a(this.g, null, null, this);
    }
}
