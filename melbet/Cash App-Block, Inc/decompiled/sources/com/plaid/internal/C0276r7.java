package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController", f = "TwilioAuthController.kt", l = {25, 42}, m = "asyncAuthentication")
/* renamed from: com.plaid.internal.r7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0276r7 extends ContinuationImpl {
    public C0294t7 a;
    public C0303u7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0294t7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276r7(C0294t7 c0294t7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0294t7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(null, this);
    }
}
