package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.di.PreCompletionResultStore", f = "PreCompletionResultStore.kt", l = {24}, m = "readPreCompletionResult")
/* renamed from: com.plaid.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0105b6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0115c6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105b6(C0115c6 c0115c6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0115c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
