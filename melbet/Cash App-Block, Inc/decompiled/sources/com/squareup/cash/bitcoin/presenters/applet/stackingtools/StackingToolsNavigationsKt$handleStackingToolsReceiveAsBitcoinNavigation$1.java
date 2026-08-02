package com.squareup.cash.bitcoin.presenters.applet.stackingtools;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class StackingToolsNavigationsKt$handleStackingToolsReceiveAsBitcoinNavigation$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RotateKt.handleStackingToolsReceiveAsBitcoinNavigation(null, null, null, null, null, this);
    }
}
