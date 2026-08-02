package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {65, 68, 70, 72}, m = "resume")
/* renamed from: com.plaid.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0263q2 extends ContinuationImpl {
    public C0289t2 a;
    public D6 b;
    public N2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0289t2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0263q2(C0289t2 c0289t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0289t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a((D6) null, this);
    }
}
