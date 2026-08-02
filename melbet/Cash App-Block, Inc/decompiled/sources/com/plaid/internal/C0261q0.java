package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", f = "DatabaseBackedPaneStore.kt", l = {19}, m = "getPane")
/* renamed from: com.plaid.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0261q0 extends ContinuationImpl {
    public C0269r0 a;
    public r8 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0269r0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261q0(C0269r0 c0269r0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0269r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(null, this);
    }
}
