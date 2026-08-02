package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {56, 56, 58}, m = "previous")
/* renamed from: com.plaid.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0254p2 extends ContinuationImpl {
    public C0289t2 a;
    public Y2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0289t2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254p2(C0289t2 c0289t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0289t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(this);
    }
}
