package com.squareup.cash.qrcodes.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.qrcodescanner.QRCodeScannerScanComplete;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.featureflags.AmplitudeExperiments$DefaultQrCodeTab;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileSurfacesKeypadQrToProfile;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.util.clock.AndroidClock;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CashQrScannerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final CashQrCodeScanner args;
    public final RealRecipientRepository$suggestions$$inlined$map$1 cameraEvents;
    public final CashQrScannerPresenter$special$$inlined$filter$1 cameraPermissionDenials;
    public final Flow cameraPermissionGrants;
    public final RealCryptoInvoiceParser cryptoInvoiceParser;
    public final boolean isQrToProfileEnabled;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNfcPaymentsManager nfcPaymentsManager;
    public final AndroidPermissionManager permissionManager;
    public final AssetPublicSuffixList qrCodesHandler;
    public final boolean showUpdatedSharingUi;
    public final AndroidStringManager stringManager;

    public final class State {
        public final CameraState cameraState;
        public final String handlingQrCodeData;
        public final boolean hasCameraPermission;
        public final Instant loadingStartTime;

        public State(boolean z, CameraState cameraState, String str, Instant instant) {
            instant.getClass();
            this.hasCameraPermission = z;
            this.cameraState = cameraState;
            this.handlingQrCodeData = str;
            this.loadingStartTime = instant;
        }

        public static State copy$default(State state, boolean z, CameraState cameraState, String str, int i) {
            if ((i & 1) != 0) {
                z = state.hasCameraPermission;
            }
            if ((i & 2) != 0) {
                cameraState = state.cameraState;
            }
            if ((i & 4) != 0) {
                str = state.handlingQrCodeData;
            }
            Instant instant = state.loadingStartTime;
            state.getClass();
            instant.getClass();
            return new State(z, cameraState, str, instant);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.hasCameraPermission == state.hasCameraPermission && this.cameraState == state.cameraState && Intrinsics.areEqual(this.handlingQrCodeData, state.handlingQrCodeData) && Intrinsics.areEqual(this.loadingStartTime, state.loadingStartTime);
        }

        public final int hashCode() {
            int hashCode = (this.cameraState.hashCode() + (Boolean.hashCode(this.hasCameraPermission) * 31)) * 31;
            String str = this.handlingQrCodeData;
            return this.loadingStartTime.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "State(hasCameraPermission=" + this.hasCameraPermission + ", cameraState=" + this.cameraState + ", handlingQrCodeData=" + this.handlingQrCodeData + ", loadingStartTime=" + this.loadingStartTime + ")";
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityEvent.values().length];
            try {
                ActivityEvent activityEvent = ActivityEvent.CREATE;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CashQrScannerPresenter(PermissionChecker permissionChecker, AndroidClock androidClock, AndroidPermissionManager androidPermissionManager, AndroidStringManager androidStringManager, Analytics analytics, RealCryptoInvoiceParser realCryptoInvoiceParser, RealCashAppUrlParser realCashAppUrlParser, Flow flow, RealNfcPaymentsManager realNfcPaymentsManager, AssetPublicSuffixList assetPublicSuffixList, FeatureFlagManager featureFlagManager, CashQrCodeScanner cashQrCodeScanner, BetterNavigator.ScreenNavigator screenNavigator) {
        cashQrCodeScanner.getClass();
        this.permissionManager = androidPermissionManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.cryptoInvoiceParser = realCryptoInvoiceParser;
        this.nfcPaymentsManager = realNfcPaymentsManager;
        this.qrCodesHandler = assetPublicSuffixList;
        this.args = cashQrCodeScanner;
        this.navigator = screenNavigator;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.showUpdatedSharingUi = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$DefaultQrCodeTab.INSTANCE)).enabled();
        this.isQrToProfileEnabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MobileSurfacesKeypadQrToProfile.INSTANCE)).enabled();
        this.cameraPermissionGrants = permissionChecker.granted("android.permission.CAMERA");
        this.cameraPermissionDenials = new CashQrScannerPresenter$special$$inlined$filter$1(permissionChecker.denials(), 0);
        this.cameraEvents = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$trackScanMainQrCode(CashQrScannerPresenter cashQrScannerPresenter, Analytics analytics, String str, boolean z, ContinuationImpl continuationImpl) {
        CashQrScannerPresenter$trackScanMainQrCode$1 cashQrScannerPresenter$trackScanMainQrCode$1;
        int i;
        BitcoinPayments bitcoinPayments;
        QRCodeScannerScanComplete.Category category;
        if (continuationImpl instanceof CashQrScannerPresenter$trackScanMainQrCode$1) {
            cashQrScannerPresenter$trackScanMainQrCode$1 = (CashQrScannerPresenter$trackScanMainQrCode$1) continuationImpl;
            int i2 = cashQrScannerPresenter$trackScanMainQrCode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashQrScannerPresenter$trackScanMainQrCode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashQrScannerPresenter$trackScanMainQrCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashQrScannerPresenter$trackScanMainQrCode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoInvoiceParser realCryptoInvoiceParser = cashQrScannerPresenter.cryptoInvoiceParser;
                    cashQrScannerPresenter$trackScanMainQrCode$1.L$0 = analytics;
                    cashQrScannerPresenter$trackScanMainQrCode$1.L$1 = str;
                    cashQrScannerPresenter$trackScanMainQrCode$1.Z$0 = z;
                    cashQrScannerPresenter$trackScanMainQrCode$1.label = 1;
                    obj = realCryptoInvoiceParser.parse(str, false, cashQrScannerPresenter$trackScanMainQrCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = cashQrScannerPresenter$trackScanMainQrCode$1.Z$0;
                    str = cashQrScannerPresenter$trackScanMainQrCode$1.L$1;
                    analytics = cashQrScannerPresenter$trackScanMainQrCode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoinPayments = (BitcoinPayments) obj;
                if (!(bitcoinPayments instanceof BitcoinPayments.Bitcoin)) {
                    category = ((BitcoinPayments.Bitcoin) bitcoinPayments).bitcoinPayment.isUri ? QRCodeScannerScanComplete.Category.BITCOIN_URI : QRCodeScannerScanComplete.Category.BITCOIN_ADDRESS;
                } else if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
                    category = QRCodeScannerScanComplete.Category.LIGHTNING_ADDRESS;
                } else {
                    str.getClass();
                    category = StringsKt__StringsJVMKt.startsWith(str, "https://cash.app/launch/cash-card/activate", false) ? QRCodeScannerScanComplete.Category.CARD_ACTIVATION : QRCodeScannerScanComplete.Category.UNSPECIFIED;
                }
                analytics.track(new QRCodeScannerScanComplete(category, Boolean.valueOf(z)), null);
                return Unit.INSTANCE;
            }
        }
        cashQrScannerPresenter$trackScanMainQrCode$1 = new CashQrScannerPresenter$trackScanMainQrCode$1(cashQrScannerPresenter, continuationImpl);
        Object obj2 = cashQrScannerPresenter$trackScanMainQrCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashQrScannerPresenter$trackScanMainQrCode$1.label;
        if (i != 0) {
        }
        bitcoinPayments = (BitcoinPayments) obj2;
        if (!(bitcoinPayments instanceof BitcoinPayments.Bitcoin)) {
        }
        analytics.track(new QRCodeScannerScanComplete(category, Boolean.valueOf(z)), null);
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1507283394);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            CameraState cameraState = CameraState.RESUMED;
            Instant instant = Instant.MIN;
            instant.getClass();
            rememberedValue = Updater.mutableStateOf$default(new State(false, cameraState, null, instant));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        String str = ((State) mutableState.getValue()).handlingQrCodeData;
        if (str != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, str, new CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1(str, continuation, this, mutableState, 0));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new AndroidFileSaver$save$2(this, mutableState, continuation, 17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(this, 28);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue3, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, mutableState, 12));
        boolean z = ((State) mutableState.getValue()).hasCameraPermission;
        CameraState cameraState2 = ((State) mutableState.getValue()).cameraState;
        boolean z2 = this.showUpdatedSharingUi;
        CashQrCodeScanner cashQrCodeScanner = this.args;
        CashQrScannerViewModel cashQrScannerViewModel = new CashQrScannerViewModel(z, cameraState2, z2 && !cashQrCodeScanner.hideSegmentedControl, this.isQrToProfileEnabled && !cashQrCodeScanner.hideSegmentedControl, cashQrCodeScanner.hideSegmentedControl);
        gapComposer.end(false);
        return cashQrScannerViewModel;
    }
}
