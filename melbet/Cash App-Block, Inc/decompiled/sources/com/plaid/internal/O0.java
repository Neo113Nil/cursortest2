package com.plaid.internal;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.views.EmbeddedUrlService", f = "EmbeddedUrlService.kt", l = {35}, m = "fetchEmbeddedUrlFromWorkflowStart-gIAlu-s$link_sdk_release")
/* loaded from: classes5.dex */
public final class O0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ P0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(P0 p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = p0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        Object a = this.b.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
