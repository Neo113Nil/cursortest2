package com.squareup.cash.investing.presenters.teengraduation;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class StocksTransferEtaSheetPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final AndroidDateFormatManager dateFormatter;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealInvestingStateManager stateManager;
    public final AndroidStringManager stringManager;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final LambdaProvider dateFormatter;
        public final LambdaProvider ioDispatcher;
        public final Provider stateManager;
        public final LambdaProvider stringManager;

        public /* synthetic */ MetroFactory(BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
            this.stateManager = broadwayModule$ProvideBroadwayMetroFactory;
            this.dateFormatter = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.ioDispatcher = lambdaProvider3;
        }
    }

    public /* synthetic */ StocksTransferEtaSheetPresenter(RealInvestingStateManager realInvestingStateManager, AndroidDateFormatManager androidDateFormatManager, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.stateManager = realInvestingStateManager;
        this.dateFormatter = androidDateFormatManager;
        this.stringManager = androidStringManager;
        this.ioDispatcher = coroutineContext;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String format2;
        String format3;
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RealInvestingStateManager realInvestingStateManager = this.stateManager;
        Continuation continuation = null;
        AndroidStringManager androidStringManager = this.stringManager;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1611861502);
                InvestingState investingStates = realInvestingStateManager.investingStates(gapComposer);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(investingStates);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MusicPresenter$models$1$1(this, investingStates, mutableState, (Continuation) null);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, investingStates, (Function2) rememberedValue2);
                Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 29));
                String str = androidStringManager.get(R.string.investing_stocks_transfer_eta_title);
                String str2 = (String) mutableState.getValue();
                if (str2 == null) {
                    format2 = androidStringManager.get(R.string.investing_stocks_transfer_eta_sheet_explanation_without_date);
                } else {
                    ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, InquiryField.DateField.TYPE, str2);
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.investing_stocks_transfer_eta_sheet_explanation_with_date)).format(m);
                    format2.getClass();
                }
                StocksTransferEtaViewModel stocksTransferEtaViewModel = new StocksTransferEtaViewModel(str, format2, androidStringManager.get(R.string.investing_stocks_transfer_eta_sheet_dismiss_button));
                gapComposer.end(false);
                return stocksTransferEtaViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1040921416);
                InvestingState investingStates2 = realInvestingStateManager.investingStates(gapComposer2);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState2 = (MutableState) rememberedValue3;
                boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(investingStates2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new GLThread$start$2(this, investingStates2, mutableState2, (Continuation) null);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer2, investingStates2, (Function2) rememberedValue4);
                Updater.LaunchedEffect(gapComposer2, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 28));
                String str3 = androidStringManager.get(R.string.investing_stocks_transfer_eta_title);
                String str4 = (String) mutableState2.getValue();
                if (str4 == null) {
                    format3 = androidStringManager.get(R.string.investing_stocks_transfer_eta_fullscreen_explanation_without_date);
                } else {
                    ArrayMap m2 = zzel$EnumUnboxingLocalUtility.m(1, InquiryField.DateField.TYPE, str4);
                    Resources resources2 = androidStringManager.resources;
                    resources2.getClass();
                    format3 = new MessageFormat(resources2.getString(R.string.investing_stocks_transfer_eta_fullscreen_explanation_with_date)).format(m2);
                    format3.getClass();
                }
                StocksTransferEtaViewModel stocksTransferEtaViewModel2 = new StocksTransferEtaViewModel(str3, format3, androidStringManager.get(R.string.investing_stocks_transfer_eta_fullscreen_dismiss_button));
                gapComposer2.end(false);
                return stocksTransferEtaViewModel2;
        }
    }
}
