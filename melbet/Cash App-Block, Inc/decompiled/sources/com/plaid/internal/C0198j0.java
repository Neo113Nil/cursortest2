package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", f = "CrashWorkManager.kt", l = {30}, m = "storeCrashAndScheduleUpload")
/* renamed from: com.plaid.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0198j0 extends ContinuationImpl {
    public C0207k0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0207k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198j0(C0207k0 c0207k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0207k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a(null, this);
    }
}
