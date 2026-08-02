package com.squareup.cash.biometrics;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class AndroidBiometricsStore$read$1 extends ContinuationImpl {
    public Activity L$0;
    public Biometrics$Info L$2;
    public BiometricsStore$AnalyticsPayload L$3;
    public BiometricsStore$read$1 L$4;
    public AndroidSecureValue L$5;
    public Ref$IntRef L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidBiometricsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBiometricsStore$read$1(AndroidBiometricsStore androidBiometricsStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidBiometricsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.read(null, null, null, null, null, this);
    }
}
