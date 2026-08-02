package com.squareup.cash.growtools.presenters.manager.state;

import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGrowToolsManagerViewAppearanceTracker$track$1 extends ContinuationImpl {
    public GrowToolsManagerScreen.Origin L$0;
    public GrowToolsManagerScreen.InvestmentType L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGrowToolsManagerViewAppearanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGrowToolsManagerViewAppearanceTracker$track$1(RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGrowToolsManagerViewAppearanceTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.track(null, null, this);
    }
}
