package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", l = {41}, m = "sendCrash")
/* loaded from: classes5.dex */
public final class U6 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ X6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(X6 x6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a((Crash) null, this);
    }
}
