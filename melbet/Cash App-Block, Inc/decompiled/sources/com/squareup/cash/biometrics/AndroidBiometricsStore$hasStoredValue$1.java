package com.squareup.cash.biometrics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AndroidBiometricsStore$hasStoredValue$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidBiometricsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBiometricsStore$hasStoredValue$1(AndroidBiometricsStore androidBiometricsStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidBiometricsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.hasStoredValue(null, this);
    }
}
