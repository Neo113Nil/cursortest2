package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", l = {41}, m = "trackWebviewFallbackEmitPreCompletionResult$link_sdk_release")
/* loaded from: classes5.dex */
public final class G7 extends ContinuationImpl {
    public I7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(I7 i7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = i7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.b(this);
    }
}
