package com.squareup.cash.datefilterbar.views;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class DateFilterBarKt$animateScrollToItemCenter$1 extends ContinuationImpl {
    public int I$0;
    public LazyListState L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DateFilterBarKt.access$animateScrollToItemCenter(null, 0, this);
    }
}
