package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", l = {125, 127}, m = "readPendingResult")
/* loaded from: classes5.dex */
public final class B4 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0345z4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C0345z4 c0345z4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0345z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return C0345z4.b(this.c, this);
    }
}
