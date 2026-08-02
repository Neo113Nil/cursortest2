package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", l = {107}, m = "getUrlUri")
/* renamed from: com.plaid.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0327x4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0345z4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327x4(C0345z4 c0345z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0345z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
