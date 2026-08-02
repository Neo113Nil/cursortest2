package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", l = {25}, m = "retrieveAllEvents")
/* renamed from: com.plaid.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0335y3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0344z3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335y3(C0344z3 c0344z3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0344z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
