package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", l = {45, 49, 53}, m = "preloadWorkflow")
/* renamed from: com.plaid.internal.i6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0195i6 extends ContinuationImpl {
    public C0213k6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0213k6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195i6(C0213k6 c0213k6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0213k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.b(this);
    }
}
