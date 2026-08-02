package com.squareup.cash.offers.views.collection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.viewmodels.OffersCollectionListingViewModel;
import com.squareup.cash.offers.viewmodels.OffersFullscreenCollectionViewModel;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OffersCollectionListingKt {

    /* renamed from: lambda$-47021494, reason: not valid java name */
    public static final ComposableLambdaImpl f515lambda$47021494 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(4), false, -47021494);

    public static final void OffersCollectionError(OffersCollectionListingViewModel.Error error, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1919682661);
        int i2 = (gapComposer.changedInstance(error) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UtilsKt.OffersTabEmptyView(6, gapComposer, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), error.title);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(error, i, 16);
        }
    }

    public static final void OffersCollectionListing(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        Modifier modifier2;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2069591169);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changed(rememberLazyListState) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(15, list, rememberLazyListState, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(modifier2, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, (i2 >> 3) & 14, 508);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(list, modifier, function1, i, 4);
        }
    }

    public static final void OffersCollectionLoaded(OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(719442881);
        int i2 = (gapComposer.changedInstance(offersFullscreenCollectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            OffersCollectionListingViewModel offersCollectionListingViewModel = offersFullscreenCollectionViewModel.listViewModel;
            offersCollectionListingViewModel.getClass();
            OffersCollectionListing(((i2 << 3) & 896) | 48, gapComposer, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), ((OffersCollectionListingViewModel.Loaded) offersCollectionListingViewModel).items, function1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersFullscreenCollectionView$$ExternalSyntheticLambda3(offersFullscreenCollectionViewModel, function1, i);
        }
    }

    public static final void OffersCollectionLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-40641233);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            UtilsKt.OffersTabLoadingProgress(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 10);
        }
    }
}
