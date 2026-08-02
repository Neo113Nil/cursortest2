package com.squareup.cash.checks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.screens.CaptureCheckFaceScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CaptureCheckFacePresenter implements MoleculePresenter {
    public final CaptureCheckFaceScreen args;
    public final CardModelView$iconTexture$$inlined$map$1 cameraPermissionDenials;
    public final Flow cameraPermissionGrants;
    public final ErrorReporter errorReporter;
    public final IntentLauncher intentLauncher;
    public final String miSnapLicense;
    public final MiSnapSettings.UseCase miSnapUseCase;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidPermissionManager permissionManager;
    public final AndroidStringManager stringManager;

    public CaptureCheckFacePresenter(ErrorReporter errorReporter, IntentLauncher intentLauncher, AndroidStringManager androidStringManager, AndroidPermissionManager androidPermissionManager, CaptureCheckFaceScreen captureCheckFaceScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        MiSnapSettings.UseCase useCase;
        PermissionChecker permissionChecker = androidPermissionManager.permissionChecker;
        captureCheckFaceScreen.getClass();
        this.errorReporter = errorReporter;
        this.intentLauncher = intentLauncher;
        this.stringManager = androidStringManager;
        this.permissionManager = androidPermissionManager;
        this.args = captureCheckFaceScreen;
        this.navigator = screenNavigator;
        this.miSnapLicense = captureCheckFaceScreen.miSnapLicense;
        int ordinal = captureCheckFaceScreen.checkFace.ordinal();
        if (ordinal == 0) {
            useCase = MiSnapSettings.UseCase.CHECK_FRONT;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            useCase = MiSnapSettings.UseCase.CHECK_BACK;
        }
        this.miSnapUseCase = useCase;
        this.cameraPermissionGrants = permissionChecker.granted("android.permission.CAMERA");
        this.cameraPermissionDenials = new CardModelView$iconTexture$$inlined$map$1(permissionChecker.denials(), 24);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Object dotGridKt$DotGrid$3$1;
        Continuation continuation;
        MutableState mutableState4;
        MutableState mutableState5;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1990553150);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState6 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState7 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState8 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState9 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState10 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            mutableState3 = mutableState9;
            StateFlowKt$$ExternalSyntheticLambda3 stateFlowKt$$ExternalSyntheticLambda3 = new StateFlowKt$$ExternalSyntheticLambda3(this, mutableState10, mutableState6, mutableState3, mutableState8, mutableState7, 4);
            mutableState = mutableState10;
            mutableState6 = mutableState6;
            mutableState7 = mutableState7;
            mutableState2 = mutableState8;
            rememberedValue7 = Updater.derivedStateOf(stateFlowKt$$ExternalSyntheticLambda3);
            gapComposer.updateRememberedValue(rememberedValue7);
        } else {
            mutableState = mutableState10;
            mutableState2 = mutableState8;
            mutableState3 = mutableState9;
        }
        State state = (State) rememberedValue7;
        Unit unit = Unit.INSTANCE;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState3, continuation2, 5);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue9 == neverEqualPolicy) {
            continuation = null;
            dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, mutableState6, mutableState7, continuation, 2);
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
        } else {
            dotGridKt$DotGrid$3$1 = rememberedValue9;
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) dotGridKt$DotGrid$3$1);
        CaptureCheckFaceViewModel.Loaded.FinalFrame finalFrame = (CaptureCheckFaceViewModel.Loaded.FinalFrame) mutableState.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
            mutableState4 = mutableState;
            mutableState5 = mutableState11;
            RealProfileManager$setPhoto$2 realProfileManager$setPhoto$2 = new RealProfileManager$setPhoto$2(mutableState4, this, mutableState5, continuation, 1);
            gapComposer.updateRememberedValue(realProfileManager$setPhoto$2);
            rememberedValue10 = realProfileManager$setPhoto$2;
        } else {
            mutableState4 = mutableState;
            mutableState5 = mutableState11;
        }
        Updater.LaunchedEffect(gapComposer, finalFrame, (Function2) rememberedValue10);
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState2, (Object) mutableState5, (State) mutableState4, 15));
        CaptureCheckFaceViewModel captureCheckFaceViewModel = (CaptureCheckFaceViewModel) state.getValue();
        gapComposer.end(false);
        return captureCheckFaceViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final LambdaProvider errorReporter;
        public final Provider intentLauncher;
        public final Provider permissionManager;
        public final LambdaProvider stringManager;

        public MetroFactory(RealCashVibrator.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, ShiftsAnalytics.MetroFactory metroFactory2) {
            this.intentLauncher = metroFactory;
            this.errorReporter = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.permissionManager = metroFactory2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
            this.errorReporter = lambdaProvider;
            this.intentLauncher = metroFactory;
            this.permissionManager = metroFactory2;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck) {
            this.errorReporter = lambdaProvider;
            this.intentLauncher = metroFactory;
            this.stringManager = lambdaProvider2;
            this.permissionManager = doubleCheck;
        }
    }
}
