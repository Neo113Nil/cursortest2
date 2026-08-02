package com.squareup.cash.checks;

import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.R;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.VerifyCheckDepositViewModel;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class VerifyCheckDepositPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final VerifyCheckDepositScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public VerifyCheckDepositPresenter(VerifyCheckDepositScreen verifyCheckDepositScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, BlockerFlowListener blockerFlowListener, AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        verifyCheckDepositScreen.getClass();
        this.args = verifyCheckDepositScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.moneyFormatterFactory = factory;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        Object dateInputKt$$ExternalSyntheticLambda1;
        Object obj;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-546254066);
        final int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        int i3 = 21;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = new CardScene$$ExternalSyntheticLambda1(21);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Object obj3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = new CardScene$$ExternalSyntheticLambda1(22);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == obj2) {
            rememberedValue3 = new Function0(this) { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ VerifyCheckDepositPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = i2;
                    VerifyCheckDepositPresenter verifyCheckDepositPresenter = this.f$0;
                    switch (i4) {
                        case 0:
                            CheckDepositBlocker.PhotoCaptureData photoCaptureData = verifyCheckDepositPresenter.args.checkDepositBlocker.photo_capture_data;
                            photoCaptureData.getClass();
                            CheckDepositBlocker.PhotoCaptureData.Controls controls = photoCaptureData.front_of_check_controls;
                            controls.getClass();
                            String str = controls.take_photo_button_title;
                            str.getClass();
                            return Updater.mutableStateOf$default(str);
                        default:
                            CheckDepositBlocker.PhotoCaptureData photoCaptureData2 = verifyCheckDepositPresenter.args.checkDepositBlocker.photo_capture_data;
                            photoCaptureData2.getClass();
                            CheckDepositBlocker.PhotoCaptureData.Controls controls2 = photoCaptureData2.back_of_check_controls;
                            controls2.getClass();
                            String str2 = controls2.take_photo_button_title;
                            str2.getClass();
                            return Updater.mutableStateOf$default(str2);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer, 0);
        Object[] objArr4 = new Object[0];
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        final int i4 = 1;
        if (changedInstance2 || rememberedValue4 == obj2) {
            rememberedValue4 = new Function0(this) { // from class: com.squareup.cash.checks.VerifyCheckDepositPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ VerifyCheckDepositPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i42 = i4;
                    VerifyCheckDepositPresenter verifyCheckDepositPresenter = this.f$0;
                    switch (i42) {
                        case 0:
                            CheckDepositBlocker.PhotoCaptureData photoCaptureData = verifyCheckDepositPresenter.args.checkDepositBlocker.photo_capture_data;
                            photoCaptureData.getClass();
                            CheckDepositBlocker.PhotoCaptureData.Controls controls = photoCaptureData.front_of_check_controls;
                            controls.getClass();
                            String str = controls.take_photo_button_title;
                            str.getClass();
                            return Updater.mutableStateOf$default(str);
                        default:
                            CheckDepositBlocker.PhotoCaptureData photoCaptureData2 = verifyCheckDepositPresenter.args.checkDepositBlocker.photo_capture_data;
                            photoCaptureData2.getClass();
                            CheckDepositBlocker.PhotoCaptureData.Controls controls2 = photoCaptureData2.back_of_check_controls;
                            controls2.getClass();
                            String str2 = controls2.take_photo_button_title;
                            str2.getClass();
                            return Updater.mutableStateOf$default(str2);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue4, gapComposer, 0);
        Object[] objArr5 = new Object[0];
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = new CardScene$$ExternalSyntheticLambda1(23);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue5, gapComposer, 48);
        Object[] objArr6 = new Object[0];
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = new CardScene$$ExternalSyntheticLambda1(24);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue6, gapComposer, 48);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState12 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState13 = (MutableState) rememberedValue8;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj2) {
            rememberedValue9 = new TemporaryStorage$getDir$2(this, null, i3);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
        boolean changed = gapComposer.changed(mutableState11) | gapComposer.changed(obj3) | gapComposer.changed(mutableState10) | gapComposer.changed(mutableState8) | gapComposer.changedInstance(this) | gapComposer.changed(mutableState7) | gapComposer.changed(mutableState9);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changed || rememberedValue10 == obj2) {
            mutableState = mutableState7;
            obj = obj3;
            dateInputKt$$ExternalSyntheticLambda1 = new DateInputKt$$ExternalSyntheticLambda1(this, mutableState11, mutableState12, obj, mutableState10, mutableState8, mutableState, mutableState9, 5);
            mutableState2 = mutableState11;
            mutableState3 = mutableState12;
            mutableState4 = mutableState10;
            mutableState5 = mutableState9;
            mutableState6 = mutableState8;
            gapComposer.updateRememberedValue(dateInputKt$$ExternalSyntheticLambda1);
        } else {
            mutableState6 = mutableState8;
            dateInputKt$$ExternalSyntheticLambda1 = rememberedValue10;
            mutableState5 = mutableState9;
            mutableState4 = mutableState10;
            mutableState2 = mutableState11;
            obj = obj3;
            mutableState3 = mutableState12;
            mutableState = mutableState7;
        }
        Function2 function2 = (Function2) dateInputKt$$ExternalSyntheticLambda1;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed2 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue11 == obj2) {
            rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i2);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue11, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState13, obj, (State) mutableState, 16));
        VerifyCheckDepositScreen verifyCheckDepositScreen = this.args;
        CheckDepositBlocker.PhotoCaptureData photoCaptureData = verifyCheckDepositScreen.checkDepositBlocker.photo_capture_data;
        photoCaptureData.getClass();
        String str = photoCaptureData.title;
        str.getClass();
        String str2 = photoCaptureData.description;
        str2.getClass();
        CheckDepositBlocker.PhotoCaptureData.Controls controls = photoCaptureData.front_of_check_controls;
        controls.getClass();
        String str3 = controls.label;
        str3.getClass();
        VerifyCheckDepositViewModel.CheckFaceCellViewModel checkFaceCellViewModel = new VerifyCheckDepositViewModel.CheckFaceCellViewModel(str3, (String) mutableState6.getValue(), (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) mutableState4.getValue());
        CheckDepositBlocker.PhotoCaptureData.Controls controls2 = photoCaptureData.back_of_check_controls;
        controls2.getClass();
        String str4 = controls2.label;
        str4.getClass();
        VerifyCheckDepositViewModel.CheckFaceCellViewModel checkFaceCellViewModel2 = new VerifyCheckDepositViewModel.CheckFaceCellViewModel(str4, (String) mutableState5.getValue(), (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) mutableState2.getValue());
        String str5 = photoCaptureData.primary_button_label;
        str5.getClass();
        MoneyFormatter create = this.moneyFormatterFactory.create(MoneyFormatterConfig.COMPACT);
        Money money = verifyCheckDepositScreen.blockersData.amount;
        money.getClass();
        VerifyCheckDepositViewModel verifyCheckDepositViewModel = new VerifyCheckDepositViewModel(str, str2, String.format(str5, Arrays.copyOf(new Object[]{create.format(money)}, 1)), checkFaceCellViewModel, checkFaceCellViewModel2, ((Boolean) mutableState3.getValue()).booleanValue(), ((Boolean) mutableState13.getValue()).booleanValue(), this.stringManager.get(R.string.check_deposit_fraud_warning));
        gapComposer.end(false);
        return verifyCheckDepositViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersNavigator;
        public final Provider moneyFormatterFactory;
        public final LambdaProvider stringManager;

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealPasscodeFlowStarter.MetroFactory metroFactory, DoubleCheck doubleCheck2, BorrowUiFactory.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3) {
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.blockerFlowAnalytics = metroFactory;
            this.appService = doubleCheck2;
            this.blockersNavigator = metroFactory2;
            this.moneyFormatterFactory = metroFactory3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory2) {
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.blockerFlowAnalytics = metroFactory;
            this.blockersNavigator = instanceFactory;
            this.moneyFormatterFactory = metroFactory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory2, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory3) {
            this.analytics = doubleCheck;
            this.blockerFlowAnalytics = metroFactory;
            this.appService = doubleCheck2;
            this.blockersNavigator = metroFactory2;
            this.stringManager = lambdaProvider;
            this.moneyFormatterFactory = metroFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory, RealBrazeConfigurator.MetroFactory metroFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory) {
            this.analytics = doubleCheck;
            this.blockerFlowAnalytics = metroFactory;
            this.blockersNavigator = metroFactory2;
            this.appService = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.moneyFormatterFactory = instanceFactory;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, LambdaProvider lambdaProvider, RealBadger2.MetroFactory metroFactory2, DoubleCheck doubleCheck2) {
            this.blockerFlowAnalytics = instanceFactory;
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.moneyFormatterFactory = metroFactory2;
            this.appService = doubleCheck2;
        }
    }
}
