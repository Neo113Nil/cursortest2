package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class GpsLocationConsentBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.GpsLocationConsentBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final RealGpsLocationManager gpsLocationManager;
    public final CardModelView$iconTexture$$inlined$map$1 locationPermissionDenials;
    public final BetterNavigator.ScreenNavigator navigator;
    public final PermissionChecker permissionChecker;
    public final CoroutineScope scope;
    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 triggerRefresh;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityLifecycleStates;
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider blockersDataNavigator;
        public final Provider blockersHelperFactory;
        public final Provider gpsLocationManager;
        public final LambdaProvider permissionChecker;
        public final InstanceFactory scope;

        public MetroFactory(LambdaProvider lambdaProvider, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, RealFeatureFlagManager.MetroFactory metroFactory2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.permissionChecker = lambdaProvider;
            this.activityLifecycleStates = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.blockersDataNavigator = metroFactory;
            this.gpsLocationManager = metroFactory2;
            this.blockersHelperFactory = instanceFactory;
            this.scope = instanceFactory2;
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GpsLocationConsentBlocker.GpsConsentStatus.values().length];
            try {
                iArr[GpsLocationConsentBlocker.GpsConsentStatus.GPS_CONSENT_STATUS_ALLOW_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GpsLocationConsentBlocker.GpsConsentStatus.GPS_CONSENT_STATUS_WHILE_USING_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GpsLocationConsentBlocker.GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GpsLocationConsentBlocker.TriggerSource.values().length];
            try {
                iArr2[GpsLocationConsentBlocker.TriggerSource.CARD_ACTIVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GpsLocationConsentBlocker.TriggerSource.CARD_TRANSACTION_AUTH_PROMPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GpsLocationConsentBlocker.TriggerSource.SUSPENSION_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public GpsLocationConsentBlockerPresenter(PermissionChecker permissionChecker, StateFlow stateFlow, Analytics analytics, AppService appService, BlockersDataNavigator blockersDataNavigator, RealGpsLocationManager realGpsLocationManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, CoroutineScope coroutineScope, BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.permissionChecker = permissionChecker;
        this.analytics = analytics;
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.gpsLocationManager = realGpsLocationManager;
        this.scope = coroutineScope;
        this.args = gpsLocationConsentBlockerScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.triggerRefresh = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(stateFlow, 1), 21);
        this.locationPermissionDenials = new CardModelView$iconTexture$$inlined$map$1(permissionChecker.denials(), 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitBlockerAction(GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter, BlockerAction.SubmitAction submitAction, ContinuationImpl continuationImpl) {
        GpsLocationConsentBlockerPresenter$submitBlockerAction$1 gpsLocationConsentBlockerPresenter$submitBlockerAction$1;
        int i;
        BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen = gpsLocationConsentBlockerPresenter.args;
        BlockersData blockersData = gpsLocationConsentBlockerScreen.blockersData;
        if (continuationImpl instanceof GpsLocationConsentBlockerPresenter$submitBlockerAction$1) {
            gpsLocationConsentBlockerPresenter$submitBlockerAction$1 = (GpsLocationConsentBlockerPresenter$submitBlockerAction$1) continuationImpl;
            int i2 = gpsLocationConsentBlockerPresenter$submitBlockerAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                gpsLocationConsentBlockerPresenter$submitBlockerAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = gpsLocationConsentBlockerPresenter$submitBlockerAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gpsLocationConsentBlockerPresenter$submitBlockerAction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = gpsLocationConsentBlockerPresenter.appService;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData.flowToken;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(blockersData.requestContext, submitAction.id, EmptyList.INSTANCE, 8);
                    gpsLocationConsentBlockerPresenter$submitBlockerAction$1.label = 1;
                    obj = appService.submitForm(clientScenario, str, submitFormRequest, gpsLocationConsentBlockerPresenter$submitBlockerAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BlockerActionUtilKt.handleSubmitFormResponse((ApiResult) obj, gpsLocationConsentBlockerScreen, blockersData, gpsLocationConsentBlockerPresenter.navigator, gpsLocationConsentBlockerPresenter.blockersDataNavigator);
                return Unit.INSTANCE;
            }
        }
        gpsLocationConsentBlockerPresenter$submitBlockerAction$1 = new GpsLocationConsentBlockerPresenter$submitBlockerAction$1(gpsLocationConsentBlockerPresenter, continuationImpl);
        Object obj2 = gpsLocationConsentBlockerPresenter$submitBlockerAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gpsLocationConsentBlockerPresenter$submitBlockerAction$1.label;
        if (i != 0) {
        }
        BlockerActionUtilKt.handleSubmitFormResponse((ApiResult) obj2, gpsLocationConsentBlockerScreen, blockersData, gpsLocationConsentBlockerPresenter.navigator, gpsLocationConsentBlockerPresenter.blockersDataNavigator);
        return Unit.INSTANCE;
    }

    public static GpsLocationConsentBlockerViewModel.Loaded toConfirmationModel(GpsLocationConsentBlocker.ConfirmationContent confirmationContent) {
        Icon icon = confirmationContent.image;
        icon.getClass();
        FormBlocker.Element.TextElement textElement = confirmationContent.title;
        textElement.getClass();
        String str = textElement.text;
        str.getClass();
        FormBlocker.Element.TextElement textElement2 = confirmationContent.subtitle;
        textElement2.getClass();
        String str2 = textElement2.text;
        str2.getClass();
        FormBlocker.Element.ButtonElement buttonElement = confirmationContent.prominent_button;
        buttonElement.getClass();
        BlockerAction blockerAction = buttonElement.action;
        blockerAction.getClass();
        String str3 = blockerAction.text;
        str3.getClass();
        FormBlocker.Element.ButtonElement buttonElement2 = confirmationContent.prominent_button;
        buttonElement2.getClass();
        BlockerAction blockerAction2 = buttonElement2.action;
        blockerAction2.getClass();
        return new GpsLocationConsentBlockerViewModel.Loaded(icon, str, str2, null, null, new GpsLocationConsentBlockerViewModel.Loaded.Button(str3, null, new GpsLocationConsentBlockerViewEvent.BlockerActionClicked(blockerAction2)));
    }

    public static GpsLocationConsentBlockerViewModel.Loaded toConsentInitiationModel(GpsLocationConsentBlocker gpsLocationConsentBlocker) {
        Icon icon = gpsLocationConsentBlocker.image;
        icon.getClass();
        FormBlocker.Element.TextElement textElement = gpsLocationConsentBlocker.header_text;
        textElement.getClass();
        String str = textElement.text;
        str.getClass();
        FormBlocker.Element.TextElement textElement2 = gpsLocationConsentBlocker.message_text;
        textElement2.getClass();
        String str2 = textElement2.text;
        str2.getClass();
        FormBlocker.Element.ButtonElement buttonElement = gpsLocationConsentBlocker.prominent_button;
        buttonElement.getClass();
        BlockerAction blockerAction = buttonElement.action;
        blockerAction.getClass();
        String str3 = blockerAction.text;
        str3.getClass();
        FormBlocker.Element.ButtonElement buttonElement2 = gpsLocationConsentBlocker.prominent_button;
        buttonElement2.getClass();
        BlockerAction blockerAction2 = buttonElement2.action;
        blockerAction2.getClass();
        GpsLocationConsentBlockerViewEvent.BlockerActionClicked blockerActionClicked = new GpsLocationConsentBlockerViewEvent.BlockerActionClicked(blockerAction2);
        GpsLocationConsentBlockerViewModel.Loaded.Button button = null;
        GpsLocationConsentBlockerViewModel.Loaded.Button button2 = new GpsLocationConsentBlockerViewModel.Loaded.Button(str3, null, blockerActionClicked);
        FormBlocker.Element.ButtonElement buttonElement3 = gpsLocationConsentBlocker.subtle_button;
        buttonElement3.getClass();
        BlockerAction blockerAction3 = buttonElement3.action;
        blockerAction3.getClass();
        String str4 = blockerAction3.text;
        str4.getClass();
        GpsLocationConsentBlockerViewModel.Loaded.Button button3 = new GpsLocationConsentBlockerViewModel.Loaded.Button(str4, null, GpsLocationConsentBlockerViewEvent.OpenHalfSheet.INSTANCE);
        FormBlocker.Element.ButtonElement buttonElement4 = gpsLocationConsentBlocker.standard_button;
        if (buttonElement4 != null) {
            BlockerAction blockerAction4 = buttonElement4.action;
            blockerAction4.getClass();
            String str5 = blockerAction4.text;
            str5.getClass();
            BlockerAction blockerAction5 = buttonElement4.action;
            blockerAction5.getClass();
            button = new GpsLocationConsentBlockerViewModel.Loaded.Button(str5, null, new GpsLocationConsentBlockerViewEvent.BlockerActionClicked(blockerAction5));
        }
        return new GpsLocationConsentBlockerViewModel.Loaded(icon, str, str2, button3, button, button2);
    }

    public static GpsLocationConsentBlockerViewModel.Loaded toConsentNotGrantedModel(GpsLocationConsentBlocker gpsLocationConsentBlocker) {
        Icon icon = gpsLocationConsentBlocker.image;
        icon.getClass();
        FormBlocker.Element.TextElement textElement = gpsLocationConsentBlocker.header_text;
        textElement.getClass();
        String str = textElement.text;
        str.getClass();
        FormBlocker.Element.TextElement textElement2 = gpsLocationConsentBlocker.message_text;
        textElement2.getClass();
        String str2 = textElement2.text;
        str2.getClass();
        GpsLocationConsentBlocker.IconButtonElement iconButtonElement = gpsLocationConsentBlocker.icon_button;
        iconButtonElement.getClass();
        Icon icon2 = iconButtonElement.icon;
        icon2.getClass();
        GpsLocationConsentBlocker.IconButtonElement iconButtonElement2 = gpsLocationConsentBlocker.icon_button;
        iconButtonElement2.getClass();
        FormBlocker.Element.ButtonElement buttonElement = iconButtonElement2.prominent_button;
        buttonElement.getClass();
        BlockerAction blockerAction = buttonElement.action;
        blockerAction.getClass();
        String str3 = blockerAction.text;
        str3.getClass();
        GpsLocationConsentBlocker.IconButtonElement iconButtonElement3 = gpsLocationConsentBlocker.icon_button;
        iconButtonElement3.getClass();
        FormBlocker.Element.ButtonElement buttonElement2 = iconButtonElement3.prominent_button;
        buttonElement2.getClass();
        BlockerAction blockerAction2 = buttonElement2.action;
        blockerAction2.getClass();
        GpsLocationConsentBlockerViewModel.Loaded.Button button = new GpsLocationConsentBlockerViewModel.Loaded.Button(str3, icon2, new GpsLocationConsentBlockerViewEvent.BlockerActionClicked(blockerAction2));
        FormBlocker.Element.ButtonElement buttonElement3 = gpsLocationConsentBlocker.subtle_button;
        buttonElement3.getClass();
        BlockerAction blockerAction3 = buttonElement3.action;
        blockerAction3.getClass();
        String str4 = blockerAction3.text;
        str4.getClass();
        GpsLocationConsentBlockerViewModel.Loaded.Button button2 = null;
        GpsLocationConsentBlockerViewModel.Loaded.Button button3 = new GpsLocationConsentBlockerViewModel.Loaded.Button(str4, null, GpsLocationConsentBlockerViewEvent.OpenHalfSheet.INSTANCE);
        FormBlocker.Element.ButtonElement buttonElement4 = gpsLocationConsentBlocker.end_flow_button;
        if (buttonElement4 != null) {
            BlockerAction blockerAction4 = buttonElement4.action;
            blockerAction4.getClass();
            String str5 = blockerAction4.text;
            str5.getClass();
            BlockerAction blockerAction5 = buttonElement4.action;
            blockerAction5.getClass();
            button2 = new GpsLocationConsentBlockerViewModel.Loaded.Button(str5, null, new GpsLocationConsentBlockerViewEvent.BlockerActionClicked(blockerAction5));
        }
        return new GpsLocationConsentBlockerViewModel.Loaded(icon, str, str2, button3, button2, button);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object navHostKt$NavHost$33$1;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Object consentNotGrantedModel;
        char c;
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1717584017);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState5 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        PermissionChecker permissionChecker = this.permissionChecker;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.valueOf(permissionChecker.hasLocation()));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState6 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.valueOf(permissionChecker.hasBackgroundLocation()));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState7 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState8 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(Boolean.valueOf(permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState9 = (MutableState) rememberedValue5;
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(17, mutableState5, this, flow, (Continuation) null));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue6 == neverEqualPolicy) {
            mutableState = mutableState6;
            mutableState2 = mutableState7;
            mutableState3 = mutableState9;
            navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(this, mutableState, mutableState2, mutableState3, mutableState8, (Continuation) null, 3);
            mutableState4 = mutableState8;
            gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
        } else {
            navHostKt$NavHost$33$1 = rememberedValue6;
            mutableState = mutableState6;
            mutableState2 = mutableState7;
            mutableState4 = mutableState8;
            mutableState3 = mutableState9;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) navHostKt$NavHost$33$1);
        Boolean bool = (Boolean) mutableState2.getValue();
        bool.booleanValue();
        Boolean bool2 = (Boolean) mutableState.getValue();
        bool2.booleanValue();
        Boolean bool3 = (Boolean) mutableState3.getValue();
        bool3.booleanValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
            MutableState mutableState10 = mutableState2;
            MutableState mutableState11 = mutableState;
            zzmh zzmhVar = new zzmh(this, mutableState10, mutableState11, mutableState3, null, 28);
            mutableState2 = mutableState10;
            mutableState = mutableState11;
            gapComposer.updateRememberedValue(zzmhVar);
            rememberedValue7 = zzmhVar;
        }
        Updater.LaunchedEffect(bool, bool2, bool3, (Function2) rememberedValue7, gapComposer);
        if (((Boolean) mutableState5.getValue()).booleanValue()) {
            consentNotGrantedModel = GpsLocationConsentBlockerViewModel.Loading.INSTANCE;
        } else {
            GpsLocationConsentBlocker gpsLocationConsentBlocker = this.args.blocker;
            if (gpsLocationConsentBlocker.minimum_gps_consent_status == null) {
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                if (booleanValue) {
                    GpsLocationConsentBlocker.ConfirmationContent confirmationContent = gpsLocationConsentBlocker.confirmation_content;
                    confirmationContent.getClass();
                    consentNotGrantedModel = toConfirmationModel(confirmationContent);
                } else {
                    consentNotGrantedModel = (booleanValue2 || booleanValue3) ? toConsentNotGrantedModel(gpsLocationConsentBlocker) : toConsentInitiationModel(gpsLocationConsentBlocker);
                }
            } else {
                GpsLocationConsentBlocker.GpsConsentStatus gpsConsentStatus = ((Boolean) mutableState2.getValue()).booleanValue() ? GpsLocationConsentBlocker.GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS : ((Boolean) mutableState.getValue()).booleanValue() ? GpsLocationConsentBlocker.GpsConsentStatus.GPS_CONSENT_STATUS_WHILE_USING_APP : null;
                GpsLocationConsentBlocker.GpsConsentStatus gpsConsentStatus2 = gpsLocationConsentBlocker.minimum_gps_consent_status;
                gpsConsentStatus2.getClass();
                boolean booleanValue4 = ((Boolean) mutableState4.getValue()).booleanValue();
                if (gpsConsentStatus != null) {
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i3 = iArr[gpsConsentStatus.ordinal()];
                    char c2 = 1;
                    if (i3 != -1) {
                        if (i3 == 1) {
                            c = 1;
                        } else if (i3 == 2) {
                            c = 2;
                        } else if (i3 == 3) {
                            c = 3;
                        }
                        i2 = iArr[gpsConsentStatus2.ordinal()];
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    c2 = 2;
                                } else if (i2 == 3) {
                                    c2 = 3;
                                }
                            }
                            if (c >= c2) {
                                GpsLocationConsentBlocker.ConfirmationContent confirmationContent2 = gpsLocationConsentBlocker.confirmation_content;
                                confirmationContent2.getClass();
                                consentNotGrantedModel = toConfirmationModel(confirmationContent2);
                            }
                        }
                        c2 = 0;
                        if (c >= c2) {
                        }
                    }
                    c = 0;
                    i2 = iArr[gpsConsentStatus2.ordinal()];
                    if (i2 != -1) {
                    }
                    c2 = 0;
                    if (c >= c2) {
                    }
                }
                consentNotGrantedModel = (gpsConsentStatus == null && booleanValue4) ? toConsentNotGrantedModel(gpsLocationConsentBlocker) : gpsConsentStatus == null ? toConsentInitiationModel(gpsLocationConsentBlocker) : toConsentNotGrantedModel(gpsLocationConsentBlocker);
            }
        }
        gapComposer.end(false);
        return consentNotGrantedModel;
    }
}
