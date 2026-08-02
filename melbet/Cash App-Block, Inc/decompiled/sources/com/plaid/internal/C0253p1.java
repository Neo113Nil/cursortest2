package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {91}, m = "openLoginUrl")
/* renamed from: com.plaid.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0253p1 extends ContinuationImpl {
    public C0217l1 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0217l1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253p1(C0217l1 c0217l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0217l1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return C0217l1.a(this.d, (String) null, this);
    }
}
