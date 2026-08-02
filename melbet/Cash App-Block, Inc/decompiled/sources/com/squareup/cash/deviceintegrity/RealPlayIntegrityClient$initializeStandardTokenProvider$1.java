package com.squareup.cash.deviceintegrity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealPlayIntegrityClient$initializeStandardTokenProvider$1 extends ContinuationImpl {
    public MutexImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPlayIntegrityClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPlayIntegrityClient$initializeStandardTokenProvider$1(RealPlayIntegrityClient realPlayIntegrityClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPlayIntegrityClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initializeStandardTokenProvider(this);
    }
}
