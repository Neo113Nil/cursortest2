package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", f = "LocalPaneStateDatabaseStore.kt", l = {23}, m = "putString")
/* loaded from: classes5.dex */
public final class R3 extends ContinuationImpl {
    public S3 a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ S3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a(null, null, null, this);
    }
}
