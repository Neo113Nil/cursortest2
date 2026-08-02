package com.squareup.cash.qrcodes.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$DefaultQrCodeTab;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$MetroFactory;
import com.squareup.cash.qrcodes.navigation.RealQrCodesOutboundNavigator$Factory$Impl;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.ui.FullCashtag;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class QrCodeProfilePresenter implements MoleculePresenter {
    public final Screen exitScreen;
    public final RealFamilyProfileManager familyProfileManager;
    public final boolean isTeenMode;
    public final BetterNavigator.ScreenNavigator navigator;
    public final EglCore outboundNavigator;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final KeyValue paymentPadThemeSelection;
    public final RealProfileManager profileManager;
    public final RealQrCodesPresenter qrCodesPresenter;
    public final boolean showUpdatedSharingUi;
    public final TeenQrCodeScreen teenQrCodeScreen;

    public QrCodeProfilePresenter(RealProfileManager realProfileManager, RealP2pSettingsManager realP2pSettingsManager, RealQrCodesPresenter realQrCodesPresenter, RealQrCodesOutboundNavigator$Factory$Impl realQrCodesOutboundNavigator$Factory$Impl, KeyValue keyValue, FeatureFlagManager featureFlagManager, RealFamilyProfileManager realFamilyProfileManager, QrCodeScreen qrCodeScreen, TeenQrCodeScreen teenQrCodeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Screen screen;
        this.profileManager = realProfileManager;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.qrCodesPresenter = realQrCodesPresenter;
        this.paymentPadThemeSelection = keyValue;
        this.familyProfileManager = realFamilyProfileManager;
        this.teenQrCodeScreen = teenQrCodeScreen;
        this.navigator = screenNavigator;
        TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory = realQrCodesOutboundNavigator$Factory$Impl.delegateFactory;
        Analytics analytics = (Analytics) taxesPasswordPresenter$MetroFactory.syncValueReader.getValue();
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) taxesPasswordPresenter$MetroFactory.flowStarter.getValue();
        analytics.getClass();
        featureFlagManager2.getClass();
        this.outboundNavigator = new EglCore(26, analytics, featureFlagManager2, screenNavigator);
        this.showUpdatedSharingUi = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$DefaultQrCodeTab.INSTANCE)).enabled();
        this.exitScreen = (qrCodeScreen == null || (screen = qrCodeScreen.exitScreen) == null) ? teenQrCodeScreen != null ? teenQrCodeScreen.exitScreen : null : screen;
        this.isTeenMode = teenQrCodeScreen != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.squareup.cash.data.profile.Badge] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        QrCodeProfileViewModel qrCodeProfileViewModel;
        FullCashtag fullCashtag;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-516074865);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = this.profileManager.publicProfile();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = this.p2pSettingsManager.select();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        PaymentPadTheme paymentPadTheme = PaymentPadTheme.GREEN;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new SelectPaymentPlanBlockerPresenter$models$1$2(this, (Continuation) r10, 25);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState produceState = Updater.produceState(gapComposer, paymentPadTheme, (Function2) rememberedValue5);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = this.familyProfileManager.familyProfile;
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        boolean z = ((FamilyProfile) Updater.collectAsState((StateFlow) rememberedValue6, FamilyProfile.Standard.INSTANCE, null, gapComposer, 0, 2).getValue()) instanceof FamilyProfile.ManagedAccount;
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (MoleculePresenter) this, (Object) produceState, mutableState, 18));
        QrCodeArgs qrCodeArgs = (QrCodeArgs) mutableState.getValue();
        TeenQrCodeScreen teenQrCodeScreen = this.teenQrCodeScreen;
        ?? r2 = 1;
        int i2 = 0;
        if (qrCodeArgs != null) {
            gapComposer.startReplaceGroup(1599089554);
            RealQrCodesPresenter realQrCodesPresenter = this.qrCodesPresenter;
            if (teenQrCodeScreen != null) {
                gapComposer.startReplaceGroup(1599144796);
                String str2 = teenQrCodeScreen.dependentCashtag;
                str2.getClass();
                mutableState2.setValue(realQrCodesPresenter.models(qrCodeArgs, "https://cash.me/qr/".concat(str2), gapComposer, 0));
                QrCodeModel qrCodeModel = (QrCodeModel) mutableState2.getValue();
                qrCodeModel.getClass();
                String str3 = qrCodeModel.errorMessage;
                if (str3 != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer, str3, new QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1(str3, r10, this, i2));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1599524701);
                PublicProfile publicProfile = (PublicProfile) collectAsState.getValue();
                if (publicProfile != null) {
                    gapComposer.startReplaceGroup(1599679174);
                    FullCashtag fullCashtag2 = publicProfile.fullCashtag;
                    mutableState2.setValue(realQrCodesPresenter.models(qrCodeArgs, fullCashtag2 != null ? fullCashtag2.cashtag_qr_image_url : null, gapComposer, 0));
                    QrCodeModel qrCodeModel2 = (QrCodeModel) mutableState2.getValue();
                    qrCodeModel2.getClass();
                    String str4 = qrCodeModel2.errorMessage;
                    if (str4 != null) {
                        gapComposer.startReplaceGroup(-1106477359);
                        Updater.LaunchedEffect(gapComposer, str4, new QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1(str4, r10, this, r2 == true ? 1 : 0));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1106436997);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1599937683);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1599951571);
            gapComposer.end(false);
        }
        if (teenQrCodeScreen != null) {
            QrCodeModel qrCodeModel3 = (QrCodeModel) mutableState2.getValue();
            boolean z2 = qrCodeModel3 != null ? qrCodeModel3.loading : true;
            String str5 = teenQrCodeScreen.dependentCashtag;
            QrCodeModel qrCodeModel4 = (QrCodeModel) mutableState2.getValue();
            qrCodeProfileViewModel = new QrCodeProfileViewModel(z2, str5, qrCodeModel4 != null ? qrCodeModel4.qrImage : null, true, teenQrCodeScreen.dependentName, null, false, this.showUpdatedSharingUi);
        } else {
            QrCodeModel qrCodeModel5 = (QrCodeModel) mutableState2.getValue();
            PublicProfile publicProfile2 = (PublicProfile) collectAsState.getValue();
            P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) collectAsState2.getValue();
            boolean isRatePlanBusiness = p2pSettingsManager$P2pSettings != null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false;
            boolean z3 = !z;
            boolean z4 = qrCodeModel5 != null ? qrCodeModel5.loading : true;
            if (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null || (str = FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag)) == null) {
                str = "null";
            }
            qrCodeProfileViewModel = new QrCodeProfileViewModel(z4, str, qrCodeModel5 != null ? qrCodeModel5.qrImage : null, publicProfile2 != null, publicProfile2 != null ? publicProfile2.fullName : null, publicProfile2 != null ? ProfilesKt.profileBadge(publicProfile2, isRatePlanBusiness) : 0, z3, this.showUpdatedSharingUi);
        }
        gapComposer.end(false);
        return qrCodeProfileViewModel;
    }
}
