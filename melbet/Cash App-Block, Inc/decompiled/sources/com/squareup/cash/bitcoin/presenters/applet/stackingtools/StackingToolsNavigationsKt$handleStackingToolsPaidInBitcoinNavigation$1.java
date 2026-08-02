package com.squareup.cash.bitcoin.presenters.applet.stackingtools;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class StackingToolsNavigationsKt$handleStackingToolsPaidInBitcoinNavigation$1 extends ContinuationImpl {
    public PaidInBitcoinState L$0;
    public BetterNavigator.ScreenNavigator L$1;
    public RealPaidInBitcoinNavigator L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RotateKt.handleStackingToolsPaidInBitcoinNavigation(null, null, null, null, null, null, null, this);
    }
}
