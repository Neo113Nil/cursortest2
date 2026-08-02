package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.screens.ShoppingScreen$BrandsSearchScreen;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.scannerview.SizeMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class BrandsSearchPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealShopHubAnalyticsHelper analyticsHelper;
    public final ShoppingScreen$BrandsSearchScreen args;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRecentSearchManager recentSearchManager;
    public final SizeMap repository;
    public final RealRouter router;
    public final long searchInputDelay;
    public final AndroidStringManager stringManager;

    public final class State {
        public final boolean isInitialQuery;
        public final boolean isRetrying;
        public final int retryCount;
        public final String searchText;
        public final BrandsSearchViewModel viewModel;

        public State(BrandsSearchViewModel brandsSearchViewModel, String str, boolean z, boolean z2, int i) {
            str.getClass();
            this.viewModel = brandsSearchViewModel;
            this.searchText = str;
            this.isInitialQuery = z;
            this.isRetrying = z2;
            this.retryCount = i;
        }

        public static State copy$default(State state, BrandsSearchViewModel brandsSearchViewModel, String str, boolean z, int i, int i2) {
            if ((i2 & 1) != 0) {
                brandsSearchViewModel = state.viewModel;
            }
            BrandsSearchViewModel brandsSearchViewModel2 = brandsSearchViewModel;
            if ((i2 & 2) != 0) {
                str = state.searchText;
            }
            String str2 = str;
            boolean z2 = (i2 & 4) != 0 ? state.isInitialQuery : false;
            if ((i2 & 8) != 0) {
                z = state.isRetrying;
            }
            boolean z3 = z;
            if ((i2 & 16) != 0) {
                i = state.retryCount;
            }
            state.getClass();
            str2.getClass();
            return new State(brandsSearchViewModel2, str2, z2, z3, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.viewModel.equals(state.viewModel) && Intrinsics.areEqual(this.searchText, state.searchText) && this.isInitialQuery == state.isInitialQuery && this.isRetrying == state.isRetrying && this.retryCount == state.retryCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.retryCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewModel.hashCode() * 31, 31, this.searchText), 31, this.isInitialQuery), 31, this.isRetrying);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(viewModel=");
            sb.append(this.viewModel);
            sb.append(", searchText=");
            sb.append(this.searchText);
            sb.append(", isInitialQuery=");
            re$$ExternalSyntheticOutline0.m(sb, this.isInitialQuery, ", isRetrying=", this.isRetrying, ", retryCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.retryCount, ")", sb);
        }
    }

    public BrandsSearchPresenter(ShoppingScreen$BrandsSearchScreen shoppingScreen$BrandsSearchScreen, SizeMap sizeMap, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl, long j, AndroidClock androidClock, RealRecentSearchManager realRecentSearchManager, Analytics analytics, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper) {
        shoppingScreen$BrandsSearchScreen.getClass();
        this.args = shoppingScreen$BrandsSearchScreen;
        this.repository = sizeMap;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        this.searchInputDelay = j;
        this.clock = androidClock;
        this.recentSearchManager = realRecentSearchManager;
        this.analytics = analytics;
        this.analyticsHelper = realShopHubAnalyticsHelper;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1977125641);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            ShoppingScreen$BrandsSearchScreen shoppingScreen$BrandsSearchScreen = this.args;
            rememberedValue = Updater.mutableStateOf$default(new State(new BrandsSearchViewModel.Loading(shoppingScreen$BrandsSearchScreen.searchText), shoppingScreen$BrandsSearchScreen.searchText, true, false, 0));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, mutableState, 25));
        String str = ((State) mutableState.getValue()).searchText;
        Integer valueOf = Integer.valueOf(((State) mutableState.getValue()).retryCount);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new NotificationActionService$onHandleIntent$1(this, mutableState, continuation, 9);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(str, valueOf, (Function2) rememberedValue2, gapComposer);
        BrandsSearchViewModel brandsSearchViewModel = ((State) mutableState.getValue()).viewModel;
        gapComposer.end(false);
        return brandsSearchViewModel;
    }
}
