package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.OAuthPolling", f = "OAuthPolling.kt", l = {43, 45}, m = "waitForOAuthComplete")
/* renamed from: com.plaid.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0238n4 extends ContinuationImpl {
    public C0247o4 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0247o4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238n4(C0247o4 c0247o4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0247o4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(this);
    }
}
