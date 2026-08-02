package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {108, 112, 115, 116, 119, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, m = "storeStateAndNavigate")
/* renamed from: com.plaid.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0280s2 extends ContinuationImpl {
    public Object a;
    public N2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0289t2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280s2(C0289t2 c0289t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0289t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a((N2) null, this);
    }
}
