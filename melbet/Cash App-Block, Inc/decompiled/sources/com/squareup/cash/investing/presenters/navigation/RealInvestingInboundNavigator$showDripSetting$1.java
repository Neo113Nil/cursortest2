package com.squareup.cash.investing.presenters.navigation;

import androidx.emoji2.text.MetadataRepo;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealInvestingInboundNavigator$showDripSetting$1 extends ContinuationImpl {
    public ScreenSource L$0;
    public InvestingScreens.DividendReinvestmentSettingScreen L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetadataRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInvestingInboundNavigator$showDripSetting$1(MetadataRepo metadataRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = metadataRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showDripSetting(null, this);
    }
}
