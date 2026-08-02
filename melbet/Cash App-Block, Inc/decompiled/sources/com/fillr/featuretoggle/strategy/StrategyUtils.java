package com.fillr.featuretoggle.strategy;

import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.preferences.BooleanPreference;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class StrategyUtils {
    public static final void IDConsentContent(IDConsentContentState iDConsentContentState, Function0 function0, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1863994833);
        int i2 = i | (gapComposer.changedInstance(iDConsentContentState) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Async async = iDConsentContentState.payload;
            if ((async instanceof Async.Uninitialized) || (async instanceof Async.Loading)) {
                gapComposer.startReplaceGroup(-637622591);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                boolean z = async instanceof Async.Success;
                int i3 = 9;
                Object obj = Composer.Companion.Empty;
                if (z) {
                    gapComposer.startReplaceGroup(-637541154);
                    GenericScreenState genericScreenState = new GenericScreenState(((IDConsentContentState.Payload) ((Async.Success) async).value).idConsentContentPane.screen, false);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj) {
                        rememberedValue = new Body$$ExternalSyntheticLambda0(i3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    FillrWidget.WidgetType.AnonymousClass1.GenericScreen(genericScreenState, function0, (Function0) rememberedValue, function1, gapComposer, (i2 & 112) | MLKEMEngine.KyberPolyBytes | ((i2 << 3) & 7168));
                    gapComposer.end(false);
                } else {
                    if (!(async instanceof Async.Fail)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -297665216, false);
                    }
                    gapComposer.startReplaceGroup(-637189490);
                    boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(async);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj) {
                        rememberedValue2 = new ResetScreenKt$$ExternalSyntheticLambda2(function12, async, 9);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue2, gapComposer, 0, 1);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(iDConsentContentState, i, function0, function1, function12, 27);
        }
    }

    public static final void IDConsentContentScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1042122170);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            FinancialConnectionsSessionManifest.Pane pane = IDConsentContentViewModel.PANE;
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 11);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(IDConsentContentViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(IDConsentContentViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(iDConsentContentViewModel.stateFlow, gapComposer);
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            IDConsentContentState$ViewEffect$OpenUrl iDConsentContentState$ViewEffect$OpenUrl = ((IDConsentContentState) collectAsState.getValue()).viewEffect;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (iDConsentContentState$ViewEffect$OpenUrl == null) {
                gapComposer.startReplaceGroup(-1837651273);
            } else {
                gapComposer.startReplaceGroup(-1837651272);
                boolean changedInstance = gapComposer.changedInstance(iDConsentContentState$ViewEffect$OpenUrl) | gapComposer.changedInstance(uriHandler) | gapComposer.changedInstance(iDConsentContentViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    Logger$_log$2 logger$_log$2 = new Logger$_log$2(iDConsentContentState$ViewEffect$OpenUrl, uriHandler, iDConsentContentViewModel, null, 18);
                    iDConsentContentViewModel = iDConsentContentViewModel;
                    gapComposer.updateRememberedValue(logger$_log$2);
                    rememberedValue = logger$_log$2;
                }
                Updater.LaunchedEffect(gapComposer, iDConsentContentState$ViewEffect$OpenUrl, (Function2) rememberedValue);
            }
            gapComposer.end(false);
            IDConsentContentState iDConsentContentState = (IDConsentContentState) collectAsState.getValue();
            boolean changedInstance2 = gapComposer.changedInstance(iDConsentContentViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                RenderSystem.AnonymousClass1 anonymousClass1 = new RenderSystem.AnonymousClass1(0, iDConsentContentViewModel, IDConsentContentViewModel.class, "onContinueClick", "onContinueClick()V", 0, 5);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue2);
            boolean changedInstance3 = gapComposer.changedInstance(iDConsentContentViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TextFieldUIKt$TextField$4$1(1, iDConsentContentViewModel, IDConsentContentViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)V", 0, 17);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue3);
            boolean changedInstance4 = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 18);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue4 = textFieldUIKt$TextField$4$1;
            }
            IDConsentContent(iDConsentContentState, function0, function1, (Function1) ((KFunction) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, 15);
        }
    }

    public static int getPercentage(String str) {
        if (str == null || str.length() == 0 || str == null || str.length() == 0) {
            return 0;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return 0;
            }
        }
        return Integer.parseInt(str);
    }

    public static BooleanPreference provideAtmWithdrawalExplainerViewedPreference(SharedPreferences sharedPreferences) {
        return new BooleanPreference(sharedPreferences, "atm-withdrawal-explainer-viewed", false);
    }

    public static BooleanPreference providePysicalDepositViewedPreference(SharedPreferences sharedPreferences) {
        return new BooleanPreference(sharedPreferences, "paper-cash-tutorial-viewed", false);
    }
}
