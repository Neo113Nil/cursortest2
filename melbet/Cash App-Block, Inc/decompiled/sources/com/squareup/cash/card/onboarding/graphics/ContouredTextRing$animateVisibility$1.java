package com.squareup.cash.card.onboarding.graphics;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContouredTextRing$animateVisibility$1 extends ContinuationImpl {
    public float F$0;
    public float F$1;
    public long J$0;
    public long J$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContouredTextRing this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContouredTextRing$animateVisibility$1(ContouredTextRing contouredTextRing, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = contouredTextRing;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ContouredTextRing.access$animateVisibility(this.this$0, RecyclerView.DECELERATION_RATE, this);
    }
}
