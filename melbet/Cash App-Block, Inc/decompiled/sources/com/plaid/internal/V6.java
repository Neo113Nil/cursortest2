package com.plaid.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", l = {55}, m = "sendCrashes")
/* loaded from: classes5.dex */
public final class V6 extends ContinuationImpl {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(X6 x6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= PKIFailureInfo.systemUnavail;
        return this.c.a((List) null, this);
    }
}
