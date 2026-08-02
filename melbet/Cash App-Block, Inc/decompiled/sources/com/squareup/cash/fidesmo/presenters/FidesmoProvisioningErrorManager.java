package com.squareup.cash.fidesmo.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.cashtagprovisioning.DeprovisionFailurePhase;
import com.squareup.cash.cdf.cashtagprovisioning.FailurePhase;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$CashTagProvisioning$EligibilityDenied;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$CashTagProvisioning$MissingDeviceInfo;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$CashTagProvisioning$NfcScanFailed;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$CashTagProvisioning$ServerRequestFailed;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.util.cash.StringsKt;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningErrorManager {
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActivationFailureReason {
        public static final /* synthetic */ ActivationFailureReason[] $VALUES;
        public static final ActivationFailureReason MISSING_PROVISIONING_DATA;
        public static final ActivationFailureReason NOTHING_TO_DEPROVISION;
        public static final ActivationFailureReason REQUEST_FAILED;

        static {
            ActivationFailureReason activationFailureReason = new ActivationFailureReason("REQUEST_FAILED", 0);
            REQUEST_FAILED = activationFailureReason;
            ActivationFailureReason activationFailureReason2 = new ActivationFailureReason("MISSING_PROVISIONING_DATA", 1);
            MISSING_PROVISIONING_DATA = activationFailureReason2;
            ActivationFailureReason activationFailureReason3 = new ActivationFailureReason("NOTHING_TO_DEPROVISION", 2);
            NOTHING_TO_DEPROVISION = activationFailureReason3;
            $VALUES = new ActivationFailureReason[]{activationFailureReason, activationFailureReason2, activationFailureReason3};
        }

        public static ActivationFailureReason valueOf(String str) {
            return (ActivationFailureReason) Enum.valueOf(ActivationFailureReason.class, str);
        }

        public static ActivationFailureReason[] values() {
            return (ActivationFailureReason[]) $VALUES.clone();
        }
    }

    public interface JourneySignal {

        public final class Friction implements JourneySignal {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Friction)) {
                    return false;
                }
                UserJourney$Friction$CashTagProvisioning$EligibilityDenied userJourney$Friction$CashTagProvisioning$EligibilityDenied = UserJourney$Friction$CashTagProvisioning$EligibilityDenied.INSTANCE;
                return userJourney$Friction$CashTagProvisioning$EligibilityDenied.equals(userJourney$Friction$CashTagProvisioning$EligibilityDenied);
            }

            public final int hashCode() {
                return 824864231;
            }

            public final String toString() {
                return "Friction(signal=" + UserJourney$Friction$CashTagProvisioning$EligibilityDenied.INSTANCE + ")";
            }
        }

        public final class Frustration implements JourneySignal {
            public final UserJourney$Friction signal;

            public Frustration(UserJourney$Friction userJourney$Friction) {
                this.signal = userJourney$Friction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Frustration) && this.signal.equals(((Frustration) obj).signal);
            }

            public final int hashCode() {
                return this.signal.hashCode();
            }

            public final String toString() {
                return "Frustration(signal=" + this.signal + ")";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivationFailureReason.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActivationFailureReason activationFailureReason = ActivationFailureReason.REQUEST_FAILED;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActivationFailureReason activationFailureReason2 = ActivationFailureReason.REQUEST_FAILED;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FidesmoFlowType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FidesmoFlowType fidesmoFlowType = FidesmoFlowType.PROVISION;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public FidesmoProvisioningErrorManager(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public static ErrorModel activationFailedModel(FidesmoProvisioningViewModel.Error error, ActivationFailureReason activationFailureReason) {
        ProvisioningErrorType provisioningErrorType;
        String str;
        FailurePhase failurePhase = FailurePhase.ELIGIBILITY;
        DeprovisionFailurePhase deprovisionFailurePhase = activationFailureReason == ActivationFailureReason.NOTHING_TO_DEPROVISION ? DeprovisionFailurePhase.DEVICE_DEPROVISIONING : DeprovisionFailurePhase.SERVER_REQUEST;
        int ordinal = activationFailureReason.ordinal();
        JourneySignal.Frustration frustration = null;
        if (ordinal == 0) {
            provisioningErrorType = ProvisioningErrorType.SERVER_REQUEST_FAILED;
        } else if (ordinal == 1) {
            provisioningErrorType = ProvisioningErrorType.MISSING_DEVICE_INFO;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            provisioningErrorType = ProvisioningErrorType.NOTHING_TO_DEPROVISION;
        }
        int ordinal2 = activationFailureReason.ordinal();
        if (ordinal2 == 0) {
            str = "server(networkError)";
        } else if (ordinal2 == 1) {
            str = "client(missingProvisioningData)";
        } else {
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "client(nothingToDeprovision)";
        }
        int ordinal3 = activationFailureReason.ordinal();
        if (ordinal3 == 0) {
            frustration = new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$ServerRequestFailed.INSTANCE);
        } else if (ordinal3 == 1) {
            frustration = new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$MissingDeviceInfo.INSTANCE);
        } else if (ordinal3 != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return new ErrorModel(error, failurePhase, deprovisionFailurePhase, provisioningErrorType, str, frustration, 64);
    }

    public static FidesmoProvisioningViewModel.Error errorViewModel$default(FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager, String str, String str2, Icon icon, ListUnordered listUnordered, String str3, String str4, FidesmoProvisioningViewModel.ButtonAction buttonAction, String str5, int i) {
        if ((i & 4) != 0) {
            icon = null;
        }
        if ((i & 8) != 0) {
            listUnordered = fidesmoProvisioningErrorManager.defaultErrorInstructions(fidesmoProvisioningErrorManager.stringManager.get(R.string.fidesmo_tag_default_name));
        }
        if ((i & 16) != 0) {
            str3 = fidesmoProvisioningErrorManager.stringManager.get(R.string.fidesmo_provisioning_retry);
        }
        if ((i & 32) != 0) {
            str4 = fidesmoProvisioningErrorManager.stringManager.get(R.string.fidesmo_provisioning_cancel);
        }
        if ((i & 64) != 0) {
            buttonAction = str3 != null ? FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE : null;
        }
        FidesmoProvisioningViewModel.ButtonAction.Close close = str4 != null ? FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE : null;
        if ((i & 256) != 0) {
            str5 = fidesmoProvisioningErrorManager.stringManager.get(R.string.fidesmo_tag_default_name);
        }
        if (Intrinsics.areEqual(listUnordered, fidesmoProvisioningErrorManager.defaultErrorInstructions(fidesmoProvisioningErrorManager.stringManager.get(R.string.fidesmo_tag_default_name)))) {
            listUnordered = fidesmoProvisioningErrorManager.defaultErrorInstructions(str5);
        }
        return new FidesmoProvisioningViewModel.Error(str, str2, icon, listUnordered, str3, str4, buttonAction, close);
    }

    public final ErrorModel activationDenied(FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig, String str) {
        str.getClass();
        ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "tagDisplayName", str);
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_title)).format(m);
        format2.getClass();
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("tagDisplayName", str);
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_message)).format(arrayMap);
        format3.getClass();
        return new ErrorModel(FidesmoDeniedErrorViewModelKt.toDeniedErrorViewModel(errorUiConfig, format2, format3, defaultErrorInstructions(str), androidStringManager.get(R.string.fidesmo_provisioning_cancel)), FailurePhase.ELIGIBILITY, DeprovisionFailurePhase.SERVER_REQUEST, ProvisioningErrorType.DENIED, FidesmoProvisioningError.EligibilityDenied.INSTANCE.getCdfErrorMessage(), new JourneySignal.Friction(), 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ErrorModel activationFailed(FidesmoFlowType fidesmoFlowType, FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig, ActivationFailureReason activationFailureReason, String str) {
        FidesmoProvisioningViewModel.Error genericRetryableViewModel;
        String str2;
        String str3;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        fidesmoFlowType.getClass();
        str.getClass();
        if (errorUiConfig == null) {
            int ordinal = fidesmoFlowType.ordinal();
            if (ordinal == 0) {
                int ordinal2 = activationFailureReason.ordinal();
                if (ordinal2 == 0) {
                    genericRetryableViewModel = FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType);
                } else if (ordinal2 == 1) {
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("tagDisplayName", str);
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_title)).format(arrayMap);
                    format2.getClass();
                    ArrayMap arrayMap2 = new ArrayMap(1);
                    arrayMap2.put("tagDisplayName", str);
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_message)).format(arrayMap2);
                    format3.getClass();
                    zzd zzdVar = Icons.Companion;
                    genericRetryableViewModel = errorViewModel$default(this, format2, format3, new Icon("ODO3AU"), defaultErrorInstructions(str), null, androidStringManager.get(R.string.fidesmo_provisioning_cancel), null, str, 192);
                } else {
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str4 = androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_fallback_title);
                    zzd zzdVar2 = Icons.Companion;
                    LocalizedString localizedString = null;
                    genericRetryableViewModel = errorViewModel$default(this, str4, null, new Icon("ODO3AU"), new ListUnordered(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnordered.ListItem[]{new ListUnordered.ListItem(new Icon("YxclJB"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_fallback_instruction_1)), null, localizedString, null, 28, null), new ListUnordered.ListItem(new Icon("b2TSUf"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_fallback_instruction_2)), localizedString, 0 == true ? 1 : 0, null, 28, null), new ListUnordered.ListItem(new Icon("jdlgXl"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_fallback_instruction_3)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 28, null)}), (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_try_again), null, null, null, 448);
                }
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                genericRetryableViewModel = WhenMappings.$EnumSwitchMapping$0[activationFailureReason.ordinal()] == 2 ? nothingToDeprovisionViewModel(str) : errorViewModel$default(this, androidStringManager.get(R.string.fidesmo_provisioning_error_title), androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_message), null, null, null, null, null, str, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            }
            return activationFailedModel(genericRetryableViewModel, activationFailureReason);
        }
        FidesmoProvisioningBlocker.ErrorUiConfig.Button button = errorUiConfig.primary_button;
        if ((button == null || (str2 = button.text) == null) && (str2 = errorUiConfig.retry_button_text) == null) {
            str2 = androidStringManager.get(R.string.fidesmo_provisioning_retry);
        }
        String str5 = str2;
        FidesmoProvisioningViewModel.ButtonAction buttonAction = FidesmoDeniedErrorViewModelKt.toButtonAction(errorUiConfig.primary_button);
        if (buttonAction == null) {
            buttonAction = FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE;
        }
        FidesmoProvisioningViewModel.ButtonAction buttonAction2 = buttonAction;
        FidesmoProvisioningBlocker.ErrorUiConfig.Button button2 = errorUiConfig.secondary_button;
        if ((button2 == null || (str3 = button2.text) == null) && (str3 = errorUiConfig.dismiss_button_text) == null) {
            str3 = androidStringManager.get(R.string.fidesmo_provisioning_cancel);
        }
        String str6 = str3;
        FidesmoProvisioningViewModel.ButtonAction buttonAction3 = FidesmoDeniedErrorViewModelKt.toButtonAction(errorUiConfig.secondary_button);
        if (buttonAction3 == null) {
            buttonAction3 = FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE;
        }
        FidesmoProvisioningViewModel.ButtonAction buttonAction4 = buttonAction3;
        String str7 = errorUiConfig.title;
        if (str7 == null) {
            str7 = androidStringManager.get(R.string.fidesmo_provisioning_error_title);
        }
        String str8 = str7;
        String str9 = errorUiConfig.body_text;
        Icon icon = errorUiConfig.error_icon;
        ListUnordered listUnordered = errorUiConfig.items;
        if (listUnordered == null) {
            listUnordered = defaultErrorInstructions(str);
        }
        if (Intrinsics.areEqual(listUnordered, defaultErrorInstructions(androidStringManager.get(R.string.fidesmo_tag_default_name)))) {
            listUnordered = defaultErrorInstructions(str);
        }
        return activationFailedModel(new FidesmoProvisioningViewModel.Error(str8, str9, icon, listUnordered, str5, str6, buttonAction2, buttonAction4), activationFailureReason);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListUnordered defaultErrorInstructions(String str) {
        zzd zzdVar = Icons.Companion;
        Icon icon = new Icon("b2TSUf");
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "tagDisplayName", lowerCase);
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_error_instruction_1)).format(m);
        format2.getClass();
        LocalizedString localizedString = null;
        ByteString byteString = null;
        return new ListUnordered(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnordered.ListItem[]{new ListUnordered.ListItem(icon, StringsKt.localized(format2), null, localizedString, null, 28, null), new ListUnordered.ListItem(new Icon("g1bp90"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_error_instruction_2)), localizedString, 0 == true ? 1 : 0, byteString, 28, null)}), (ListUnordered.Variant) null, 6);
    }

    public final ErrorModel deviceError(FidesmoDeviceState.Error error, boolean z, FidesmoFlowType fidesmoFlowType, String str) {
        JourneySignal.Frustration frustration;
        JourneySignal.Frustration frustration2;
        FidesmoProvisioningViewModel.Error errorViewModel$default;
        fidesmoFlowType.getClass();
        str.getClass();
        FidesmoProvisioningError fidesmoProvisioningError = error.error;
        FidesmoProvisioningError unwrapped = fidesmoProvisioningError.getUnwrapped();
        boolean z2 = fidesmoFlowType == FidesmoFlowType.DEPROVISION && (unwrapped instanceof FidesmoProvisioningError.NoServiceAvailable) && Intrinsics.areEqual(fidesmoProvisioningError.getSdkMessageId(), "412");
        boolean z3 = z || z2 || (unwrapped instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped instanceof FidesmoProvisioningError.MissingEphemeralKey) || (unwrapped instanceof FidesmoProvisioningError.ServiceLookupFailed) || (unwrapped instanceof FidesmoProvisioningError.NoServiceAvailable) || (unwrapped instanceof FidesmoProvisioningError.TagAlreadyActivated);
        FailurePhase failurePhase = z3 ? FailurePhase.DEVICE_PROVISIONING : FailurePhase.NFC_SCAN;
        DeprovisionFailurePhase deprovisionFailurePhase = z3 ? DeprovisionFailurePhase.DEVICE_DEPROVISIONING : DeprovisionFailurePhase.NFC_SCAN;
        if (z2) {
            frustration2 = null;
        } else {
            if ((unwrapped instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped instanceof FidesmoProvisioningError.MissingEphemeralKey)) {
                frustration = new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$MissingDeviceInfo.INSTANCE);
            } else {
                boolean z4 = unwrapped instanceof FidesmoProvisioningError.ServiceLookupFailed;
                UserJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed userJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed = UserJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed.INSTANCE;
                frustration = (z4 || (unwrapped instanceof FidesmoProvisioningError.NoServiceAvailable) || (unwrapped instanceof FidesmoProvisioningError.TagAlreadyActivated)) ? new JourneySignal.Frustration(userJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed) : z ? new JourneySignal.Frustration(userJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed) : new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$NfcScanFailed.INSTANCE);
            }
            frustration2 = frustration;
        }
        if (z2) {
            errorViewModel$default = nothingToDeprovisionViewModel(str);
        } else {
            FidesmoProvisioningError unwrapped2 = fidesmoProvisioningError.getUnwrapped();
            boolean z5 = unwrapped2 instanceof FidesmoProvisioningError.TagAlreadyActivated;
            AndroidStringManager androidStringManager = this.stringManager;
            if (z5) {
                String str2 = androidStringManager.get(R.string.fidesmo_provisioning_tag_already_activated_title);
                String str3 = androidStringManager.get(R.string.fidesmo_provisioning_tag_already_activated_message);
                zzd zzdVar = Icons.Companion;
                errorViewModel$default = new FidesmoProvisioningViewModel.Error(str2, str3, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_continue), androidStringManager.get(R.string.fidesmo_provisioning_not_now), FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE);
            } else if ((unwrapped2 instanceof FidesmoProvisioningError.ServiceLookupFailed) || (unwrapped2 instanceof FidesmoProvisioningError.NoServiceAvailable)) {
                ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "tagDisplayName", str);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_title)).format(m);
                String format3 = new MessageFormat(resources.getString(R.string.fidesmo_provisioning_delivery_failed_contact_support_message)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, format2, "tagDisplayName", str));
                format3.getClass();
                errorViewModel$default = errorViewModel$default(this, format2, format3, null, null, null, androidStringManager.get(R.string.fidesmo_provisioning_cancel), null, str, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE);
            } else {
                errorViewModel$default = ((unwrapped2 instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped2 instanceof FidesmoProvisioningError.MissingEphemeralKey)) ? FidesmoProvisioningErrorViewModelsKt.genericNonRetryableViewModel(androidStringManager, fidesmoFlowType) : unwrapped2.isGenericRetryable() ? FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType) : FidesmoProvisioningErrorViewModelsKt.nfcDetectionViewModel(androidStringManager);
            }
        }
        return new ErrorModel(errorViewModel$default, failurePhase, deprovisionFailurePhase, z2 ? ProvisioningErrorType.NOTHING_TO_DEPROVISION : DropdownFieldUIKt.toProvisioningErrorType(unwrapped), unwrapped.getCdfErrorMessage(), frustration2, fidesmoProvisioningError);
    }

    public final ErrorModel nfcDisabled(String str, boolean z) {
        str.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        String str2 = z ? androidStringManager.get(R.string.fidesmo_provisioning_retry) : androidStringManager.get(R.string.fidesmo_provisioning_go_to_settings);
        FidesmoProvisioningViewModel.ButtonAction buttonAction = z ? FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE : FidesmoProvisioningViewModel.ButtonAction.OpenNfcSettings.INSTANCE;
        String str3 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_title);
        String str4 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_disabled_message);
        zzd zzdVar = Icons.Companion;
        return new ErrorModel(errorViewModel$default(this, str3, str4, new Icon("aKVBAL"), null, str2, null, buttonAction, str, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), FailurePhase.NFC_SCAN, DeprovisionFailurePhase.NFC_SCAN, ProvisioningErrorType.NFC_DISABLED, (String) null, new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$NfcScanFailed.INSTANCE), 80);
    }

    public final ErrorModel nfcUnavailable(String str) {
        str.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        String str2 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_title);
        String str3 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_message);
        zzd zzdVar = Icons.Companion;
        return new ErrorModel(errorViewModel$default(this, str2, str3, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_ok), null, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, str, 128), FailurePhase.NFC_SCAN, DeprovisionFailurePhase.NFC_SCAN, ProvisioningErrorType.NFC_UNAVAILABLE, (String) null, new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$NfcScanFailed.INSTANCE), 80);
    }

    public final FidesmoProvisioningViewModel.Error nothingToDeprovisionViewModel(String str) {
        AndroidStringManager androidStringManager = this.stringManager;
        String str2 = androidStringManager.get(R.string.fidesmo_nothing_to_deprovision_title);
        String str3 = androidStringManager.get(R.string.fidesmo_nothing_to_deprovision_message);
        zzd zzdVar = Icons.Companion;
        return errorViewModel$default(this, str2, str3, new Icon("BCuf7u"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_nothing_to_deprovision_activate_button), null, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, str, 128);
    }

    public final ErrorModel serviceDeliveryFailed(FidesmoDeviceState.ServiceDeliveryFailed serviceDeliveryFailed, FidesmoFlowType fidesmoFlowType, String str) {
        FidesmoProvisioningViewModel.Error nfcDetectionViewModel;
        FidesmoProvisioningViewModel failed;
        serviceDeliveryFailed.getClass();
        fidesmoFlowType.getClass();
        str.getClass();
        FidesmoProvisioningError unwrapped = serviceDeliveryFailed.error.getUnwrapped();
        boolean z = unwrapped instanceof FidesmoProvisioningError.EmailMismatch;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            nfcDetectionViewModel = FidesmoProvisioningErrorViewModelsKt.emailMismatchViewModel(androidStringManager, fidesmoFlowType);
        } else if ((unwrapped instanceof FidesmoProvisioningError.AppletInstallFailed) || (unwrapped instanceof FidesmoProvisioningError.ActivationFailed) || (unwrapped instanceof FidesmoProvisioningError.SdkRetryLimitExceeded)) {
            nfcDetectionViewModel = FidesmoProvisioningErrorViewModelsKt.nfcDetectionViewModel(androidStringManager);
        } else if (unwrapped instanceof FidesmoProvisioningError.WrongDevice) {
            nfcDetectionViewModel = FidesmoProvisioningErrorViewModelsKt.wrongDeviceViewModel(androidStringManager);
        } else if (unwrapped instanceof FidesmoProvisioningError.CardDigitizationDeclined) {
            nfcDetectionViewModel = FidesmoProvisioningErrorViewModelsKt.cardDigitizationDeclinedViewModel(androidStringManager);
        } else {
            if (unwrapped instanceof FidesmoProvisioningError.FidesmoServiceUnavailable) {
                failed = new FidesmoProvisioningViewModel.Failed(androidStringManager.get(R.string.fidesmo_provisioning_service_unavailable_title), 16, androidStringManager.get(R.string.fidesmo_provisioning_service_unavailable_message), androidStringManager.get(R.string.fidesmo_provisioning_not_now), androidStringManager.get(R.string.fidesmo_provisioning_retry));
                return new ErrorModel(failed, FailurePhase.DEVICE_PROVISIONING, DeprovisionFailurePhase.DEVICE_DEPROVISIONING, DropdownFieldUIKt.toProvisioningErrorType(unwrapped), unwrapped.getCdfErrorMessage(), new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed.INSTANCE), unwrapped);
            }
            nfcDetectionViewModel = unwrapped.isRetryable() ? FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType) : FidesmoProvisioningErrorViewModelsKt.genericNonRetryableViewModel(androidStringManager, fidesmoFlowType);
        }
        failed = nfcDetectionViewModel;
        return new ErrorModel(failed, FailurePhase.DEVICE_PROVISIONING, DeprovisionFailurePhase.DEVICE_DEPROVISIONING, DropdownFieldUIKt.toProvisioningErrorType(unwrapped), unwrapped.getCdfErrorMessage(), new JourneySignal.Frustration(UserJourney$Frustration$CashTagProvisioning$DeviceProvisioningFailed.INSTANCE), unwrapped);
    }

    public final class ErrorModel {
        public final DeprovisionFailurePhase deprovisionFailurePhase;
        public final ProvisioningErrorType errorType;
        public final String fidesmoErrorMessage;
        public final JourneySignal journeySignal;
        public final FidesmoProvisioningError provisioningError;
        public final FailurePhase provisioningFailurePhase;
        public final FidesmoProvisioningViewModel viewModel;

        public ErrorModel(FidesmoProvisioningViewModel fidesmoProvisioningViewModel, FailurePhase failurePhase, DeprovisionFailurePhase deprovisionFailurePhase, ProvisioningErrorType provisioningErrorType, String str, JourneySignal journeySignal, FidesmoProvisioningError fidesmoProvisioningError) {
            provisioningErrorType.getClass();
            this.viewModel = fidesmoProvisioningViewModel;
            this.provisioningFailurePhase = failurePhase;
            this.deprovisionFailurePhase = deprovisionFailurePhase;
            this.errorType = provisioningErrorType;
            this.fidesmoErrorMessage = str;
            this.journeySignal = journeySignal;
            this.provisioningError = fidesmoProvisioningError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorModel)) {
                return false;
            }
            ErrorModel errorModel = (ErrorModel) obj;
            return Intrinsics.areEqual(this.viewModel, errorModel.viewModel) && this.provisioningFailurePhase == errorModel.provisioningFailurePhase && this.deprovisionFailurePhase == errorModel.deprovisionFailurePhase && this.errorType == errorModel.errorType && Intrinsics.areEqual(this.fidesmoErrorMessage, errorModel.fidesmoErrorMessage) && Intrinsics.areEqual(this.journeySignal, errorModel.journeySignal) && Intrinsics.areEqual(this.provisioningError, errorModel.provisioningError);
        }

        public final int hashCode() {
            int hashCode = (this.errorType.hashCode() + ((this.deprovisionFailurePhase.hashCode() + ((this.provisioningFailurePhase.hashCode() + (this.viewModel.hashCode() * 31)) * 31)) * 31)) * 31;
            String str = this.fidesmoErrorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            JourneySignal journeySignal = this.journeySignal;
            int hashCode3 = (hashCode2 + (journeySignal == null ? 0 : journeySignal.hashCode())) * 31;
            FidesmoProvisioningError fidesmoProvisioningError = this.provisioningError;
            return hashCode3 + (fidesmoProvisioningError != null ? fidesmoProvisioningError.hashCode() : 0);
        }

        public final String toString() {
            return "ErrorModel(viewModel=" + this.viewModel + ", provisioningFailurePhase=" + this.provisioningFailurePhase + ", deprovisionFailurePhase=" + this.deprovisionFailurePhase + ", errorType=" + this.errorType + ", fidesmoErrorMessage=" + this.fidesmoErrorMessage + ", journeySignal=" + this.journeySignal + ", provisioningError=" + this.provisioningError + ")";
        }

        public /* synthetic */ ErrorModel(FidesmoProvisioningViewModel.Error error, FailurePhase failurePhase, DeprovisionFailurePhase deprovisionFailurePhase, ProvisioningErrorType provisioningErrorType, String str, JourneySignal journeySignal, int i) {
            this(error, failurePhase, deprovisionFailurePhase, provisioningErrorType, (i & 16) != 0 ? null : str, journeySignal, (FidesmoProvisioningError) null);
        }
    }
}
