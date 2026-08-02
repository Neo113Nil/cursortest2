package com.squareup.cash.bitcoin.presenters.applet.widget;

import androidx.compose.runtime.GapComposer;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public interface BitcoinHomeWidgetPresenter {
    BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i);
}
