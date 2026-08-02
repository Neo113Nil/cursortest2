package com.squareup.cash.blockers.analytics;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import com.google.zxing.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7 extends ContinuationImpl {
    public Result L$5;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics(0, null, null, null, this, null, null);
    }
}
