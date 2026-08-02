package com.squareup.cash.growtools.presenters.manager.autoinvest;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GrowToolsAutoInvestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1(GrowToolsAutoInvestManager growToolsAutoInvestManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = growToolsAutoInvestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GrowToolsAutoInvestManager.access$navigateToAutoInvestSheet(this.this$0, null, this);
    }
}
