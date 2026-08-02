package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.di.ChannelInfoStore", f = "ChannelInfoStore.kt", l = {25}, m = "readChannelInfo")
/* loaded from: classes5.dex */
public final class B extends ContinuationImpl {
    public C a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.b(this);
    }
}
