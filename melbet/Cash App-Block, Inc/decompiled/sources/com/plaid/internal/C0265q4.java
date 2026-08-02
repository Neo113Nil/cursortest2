package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", f = "OAuthRedirectUriStore.kt", l = {20, 24}, m = "readOAuthRedirectUri")
/* renamed from: com.plaid.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0265q4 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0273r4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265q4(C0273r4 c0273r4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0273r4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a(this);
    }
}
