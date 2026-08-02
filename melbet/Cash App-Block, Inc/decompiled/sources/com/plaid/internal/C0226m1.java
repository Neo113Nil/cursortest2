package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {67}, m = "doOnStart")
/* renamed from: com.plaid.internal.m1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0226m1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0217l1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226m1(C0217l1 c0217l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0217l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
