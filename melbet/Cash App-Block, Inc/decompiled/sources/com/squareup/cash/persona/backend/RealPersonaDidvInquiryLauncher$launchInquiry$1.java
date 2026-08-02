package com.squareup.cash.persona.backend;

import com.squareup.cash.observability.backend.api.SpanTracking;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealPersonaDidvInquiryLauncher$launchInquiry$1 extends ContinuationImpl {
    public SpanTracking L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPersonaDidvInquiryLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPersonaDidvInquiryLauncher$launchInquiry$1(RealPersonaDidvInquiryLauncher realPersonaDidvInquiryLauncher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPersonaDidvInquiryLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.launchInquiry(null, null, null, false, null, false, this);
    }
}
