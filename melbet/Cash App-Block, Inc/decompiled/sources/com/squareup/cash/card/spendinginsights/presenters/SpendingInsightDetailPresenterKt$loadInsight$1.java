package com.squareup.cash.card.spendinginsights.presenters;

import com.google.android.gms.internal.mlkit_genai_prompt.zzahj;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SpendingInsightDetailPresenterKt$loadInsight$1 extends ContinuationImpl {
    public CaptureCheckFaceKt$$ExternalSyntheticLambda12 L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzahj.access$loadInsight(null, null, null, null, this);
    }
}
