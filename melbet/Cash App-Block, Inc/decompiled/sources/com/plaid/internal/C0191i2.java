package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", l = {105}, m = "onBackPressed")
/* renamed from: com.plaid.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0191i2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0200j2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191i2(C0200j2 c0200j2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0200j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a(this);
    }
}
