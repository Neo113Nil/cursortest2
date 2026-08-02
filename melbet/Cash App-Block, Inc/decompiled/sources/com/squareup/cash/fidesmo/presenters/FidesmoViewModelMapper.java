package com.squareup.cash.fidesmo.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.presenters.ActivationResult;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final class FidesmoViewModelMapper {
    public final AndroidStringManager stringManager;

    public FidesmoViewModelMapper(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public static FidesmoProvisioningViewModel.Button createYouTubeButton(FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo helpVideo) {
        String str;
        String str2;
        if (helpVideo == null || (str = helpVideo.android_url) == null) {
            return null;
        }
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null || (str2 = helpVideo.button_text) == null) {
            return null;
        }
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return new FidesmoProvisioningViewModel.Button(str2, new FidesmoProvisioningViewModel.ButtonAction.OpenUrl(str));
    }

    public static FidesmoProvisioningViewModel.Error errorViewModel$default(FidesmoViewModelMapper fidesmoViewModelMapper, String str, String str2, Icon icon, ListUnordered listUnordered, String str3, FidesmoProvisioningViewModel.ButtonAction buttonAction, int i) {
        FidesmoProvisioningViewModel.ButtonAction buttonAction2;
        Icon icon2 = (i & 4) != 0 ? null : icon;
        if ((i & 8) != 0) {
            listUnordered = fidesmoViewModelMapper.defaultErrorInstructions(fidesmoViewModelMapper.stringManager.get(R.string.fidesmo_tag_default_name));
        }
        ListUnordered listUnordered2 = listUnordered;
        String str4 = (i & 16) != 0 ? fidesmoViewModelMapper.stringManager.get(R.string.fidesmo_provisioning_retry) : str3;
        String str5 = (i & 32) != 0 ? fidesmoViewModelMapper.stringManager.get(R.string.fidesmo_provisioning_cancel) : null;
        if ((i & 64) != 0) {
            buttonAction2 = str4 != null ? FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE : null;
        } else {
            buttonAction2 = buttonAction;
        }
        FidesmoProvisioningViewModel.ButtonAction.Close close = str5 != null ? FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE : null;
        fidesmoViewModelMapper.getClass();
        return new FidesmoProvisioningViewModel.Error(str, str2, icon2, listUnordered2, str4, str5, buttonAction2, close);
    }

    public final String activationInProgressTitle(FidesmoScanningPulseShape fidesmoScanningPulseShape, FidesmoFlowType fidesmoFlowType, ScanningStarPlacement scanningStarPlacement, boolean z) {
        int i;
        int i2;
        boolean areEqual = Intrinsics.areEqual(scanningStarPlacement, ScanningStarPlacement.Unknown.INSTANCE);
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual || Intrinsics.areEqual(scanningStarPlacement, ScanningStarPlacement.Bounce.INSTANCE) || Intrinsics.areEqual(scanningStarPlacement, ScanningStarPlacement.Snake.INSTANCE)) {
            if (!z) {
                int ordinal = fidesmoScanningPulseShape.ordinal();
                if (ordinal == 0) {
                    i = R.string.fidesmo_provisioning_in_progress_title_animated_star;
                } else if (ordinal == 1) {
                    i = R.string.fidesmo_provisioning_in_progress_title_animated_heart;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = R.string.fidesmo_provisioning_in_progress_title_animated_mini_card;
                }
                return androidStringManager.get(i);
            }
        } else if (!(scanningStarPlacement instanceof ScanningStarPlacement.Position)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal2 = fidesmoFlowType.ordinal();
        if (ordinal2 == 0) {
            int ordinal3 = fidesmoScanningPulseShape.ordinal();
            if (ordinal3 == 0) {
                i2 = R.string.fidesmo_provisioning_in_progress_title_star;
            } else if (ordinal3 == 1) {
                i2 = R.string.fidesmo_provisioning_in_progress_title_heart;
            } else {
                if (ordinal3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i2 = R.string.fidesmo_provisioning_in_progress_title_mini_card;
            }
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int ordinal4 = fidesmoScanningPulseShape.ordinal();
            if (ordinal4 == 0) {
                i2 = R.string.fidesmo_deprovisioning_in_progress_title_star;
            } else if (ordinal4 == 1) {
                i2 = R.string.fidesmo_deprovisioning_in_progress_title_heart;
            } else {
                if (ordinal4 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i2 = R.string.fidesmo_deprovisioning_in_progress_title_mini_card;
            }
        }
        return androidStringManager.get(i2);
    }

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
        return new ListUnordered(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnordered.ListItem[]{new ListUnordered.ListItem(icon, com.squareup.util.cash.StringsKt.localized(format2), null, null, null, 28, null), new ListUnordered.ListItem(new Icon("g1bp90"), com.squareup.util.cash.StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_error_instruction_2)), null, null, null, 28, null)}), (ListUnordered.Variant) null, 6);
    }

    public final FidesmoProvisioningViewModel.Error nfcDisabledErrorViewModel(boolean z) {
        AndroidStringManager androidStringManager = this.stringManager;
        String str = z ? androidStringManager.get(R.string.fidesmo_provisioning_retry) : androidStringManager.get(R.string.fidesmo_provisioning_go_to_settings);
        FidesmoProvisioningViewModel.ButtonAction buttonAction = z ? FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE : FidesmoProvisioningViewModel.ButtonAction.OpenNfcSettings.INSTANCE;
        String str2 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_title);
        String str3 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_disabled_message);
        zzd zzdVar = Icons.Companion;
        return errorViewModel$default(this, str2, str3, new Icon("aKVBAL"), null, str, buttonAction, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
    }

    public final FidesmoProvisioningViewModel postInstructionsViewModel(ActivationResult activationResult, FidesmoDeviceState fidesmoDeviceState, FidesmoFlowType fidesmoFlowType, FidesmoProvisioningBlocker.ScanningUiConfig scanningUiConfig, FidesmoProvisioningBlocker.SuccessUiConfig successUiConfig, String str, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape, TagFormFactor tagFormFactor, boolean z, FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo helpVideo) {
        FidesmoDeviceState.CheckingStability checkingStability;
        int i;
        fidesmoDeviceState.getClass();
        fidesmoFlowType.getClass();
        str.getClass();
        scanningStarPlacement.getClass();
        fidesmoScanningPulseShape.getClass();
        tagFormFactor.getClass();
        boolean equals = fidesmoDeviceState.equals(FidesmoDeviceState.NfcUnavailable.INSTANCE);
        AndroidStringManager androidStringManager = this.stringManager;
        if (equals) {
            String str2 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_title);
            String str3 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_message);
            zzd zzdVar = Icons.Companion;
            return errorViewModel$default(this, str2, str3, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_ok), FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, 128);
        }
        if (fidesmoDeviceState.equals(FidesmoDeviceState.NfcDisabled.INSTANCE)) {
            return nfcDisabledErrorViewModel(z);
        }
        if (fidesmoDeviceState instanceof FidesmoDeviceState.Error) {
            FidesmoProvisioningError unwrapped = ((FidesmoDeviceState.Error) fidesmoDeviceState).error.getUnwrapped();
            return ((unwrapped instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped instanceof FidesmoProvisioningError.MissingEphemeralKey)) ? FidesmoProvisioningErrorViewModelsKt.genericNonRetryableViewModel(androidStringManager, fidesmoFlowType) : unwrapped.isGenericRetryable() ? FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType) : FidesmoProvisioningErrorViewModelsKt.nfcDetectionViewModel(androidStringManager);
        }
        boolean z2 = activationResult instanceof ActivationResult.Activating;
        float f = RecyclerView.DECELERATION_RATE;
        boolean z3 = true;
        if (z2) {
            if ((fidesmoDeviceState instanceof FidesmoDeviceState.PreparingDelivery) || (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService)) {
                return toViewModel(fidesmoDeviceState, null, fidesmoFlowType, scanningUiConfig, successUiConfig, str, scanningStarPlacement, fidesmoScanningPulseShape, tagFormFactor, helpVideo);
            }
            if (!(fidesmoDeviceState instanceof FidesmoDeviceState.Connected) && !(fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability)) {
                z3 = false;
            }
            String activationInProgressTitle = activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, z3);
            if ((fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability) && (i = (checkingStability = (FidesmoDeviceState.CheckingStability) fidesmoDeviceState).total) > 0) {
                f = checkingStability.count / i;
            }
            return new FidesmoProvisioningViewModel.Activating(activationInProgressTitle, z3, f, fidesmoFlowType == FidesmoFlowType.PROVISION ? createYouTubeButton(helpVideo) : null, str, scanningStarPlacement, fidesmoScanningPulseShape);
        }
        if (!(activationResult instanceof ActivationResult.Completed)) {
            if (activationResult instanceof ActivationResult.Denied) {
                return FidesmoDeniedErrorViewModelKt.toDeniedErrorViewModel(((ActivationResult.Denied) activationResult).errorConfig, androidStringManager.get(R.string.fidesmo_provisioning_error_title), androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_message), defaultErrorInstructions(str), androidStringManager.get(R.string.fidesmo_provisioning_cancel));
            }
            if (activationResult.equals(ActivationResult.Failed.INSTANCE)) {
                return errorViewModel$default(this, androidStringManager.get(R.string.fidesmo_provisioning_error_title), androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_message), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!(fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability)) {
            return toViewModel(fidesmoDeviceState, ((ActivationResult.Completed) activationResult).successScreen, fidesmoFlowType, scanningUiConfig, successUiConfig, str, scanningStarPlacement, fidesmoScanningPulseShape, tagFormFactor, helpVideo);
        }
        String activationInProgressTitle2 = activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, true);
        int i2 = ((FidesmoDeviceState.CheckingStability) fidesmoDeviceState).total;
        if (i2 > 0) {
            f = r0.count / i2;
        }
        return new FidesmoProvisioningViewModel.Activating(activationInProgressTitle2, true, f, fidesmoFlowType == FidesmoFlowType.PROVISION ? createYouTubeButton(helpVideo) : null, str, scanningStarPlacement, fidesmoScanningPulseShape);
    }

    public final FidesmoProvisioningViewModel.Scanning.InProgress preparingDeliveryViewModel(FidesmoFlowType fidesmoFlowType, String str, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        String activationInProgressTitle;
        int ordinal = fidesmoFlowType.ordinal();
        if (ordinal == 0) {
            activationInProgressTitle = activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, true);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            activationInProgressTitle = this.stringManager.get(R.string.fidesmo_provisioning_preparing_deprovision_title);
        }
        return new FidesmoProvisioningViewModel.Scanning.InProgress(activationInProgressTitle, null, null, str, scanningStarPlacement, fidesmoScanningPulseShape, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FidesmoProvisioningViewModel toViewModel(FidesmoDeviceState fidesmoDeviceState, SuccessScreen successScreen, FidesmoFlowType fidesmoFlowType, FidesmoProvisioningBlocker.ScanningUiConfig scanningUiConfig, FidesmoProvisioningBlocker.SuccessUiConfig successUiConfig, String str, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape, TagFormFactor tagFormFactor, FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo helpVideo) {
        String str2;
        FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid bookletGrid;
        FidesmoProvisioningViewModel.Success.Provisioned.Tile tile;
        FidesmoProvisioningViewModel.Success.Provisioned.Card card;
        BookletTile.StaticContent staticContent;
        Image image;
        LocalizedString localizedString;
        BookletTile.GridContent gridContent;
        FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item item;
        String str3;
        int i;
        int i2 = 0;
        boolean areEqual = Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.Disconnected.INSTANCE);
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual) {
            int ordinal = fidesmoFlowType.ordinal();
            if (ordinal == 0) {
                i = R.string.fidesmo_provisioning_disconnected_title;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i = R.string.fidesmo_deprovisioning_disconnected_title;
            }
            return new FidesmoProvisioningViewModel.Scanning.Disconnected(androidStringManager.get(i), fidesmoFlowType == FidesmoFlowType.PROVISION ? createYouTubeButton(helpVideo) : null);
        }
        if (Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.NfcDisabled.INSTANCE)) {
            return nfcDisabledErrorViewModel(false);
        }
        if (Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.NfcUnavailable.INSTANCE)) {
            String str4 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_title);
            String str5 = androidStringManager.get(R.string.fidesmo_provisioning_nfc_unavailable_message);
            zzd zzdVar = Icons.Companion;
            return errorViewModel$default(this, str4, str5, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_ok), FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, 128);
        }
        if (fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability) {
            List<String> list = scanningUiConfig != null ? scanningUiConfig.hero_text : null;
            return new FidesmoProvisioningViewModel.Scanning.InProgress(activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, true), i2, Integer.valueOf(list != null ? list.size() : 0), str, scanningStarPlacement, fidesmoScanningPulseShape, 56);
        }
        if (fidesmoDeviceState instanceof FidesmoDeviceState.Connected) {
            List<String> list2 = scanningUiConfig != null ? scanningUiConfig.hero_text : null;
            return new FidesmoProvisioningViewModel.Scanning.InProgress(activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, true), i2, Integer.valueOf(list2 != null ? list2.size() : 0), str, scanningStarPlacement, fidesmoScanningPulseShape, 56);
        }
        if (Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.PreparingDelivery.INSTANCE)) {
            return preparingDeliveryViewModel(fidesmoFlowType, str, scanningStarPlacement, fidesmoScanningPulseShape);
        }
        if (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) {
            FidesmoDeviceState.DeliveringService deliveringService = (FidesmoDeviceState.DeliveringService) fidesmoDeviceState;
            Integer num = deliveringService.currentStep;
            Integer num2 = deliveringService.totalSteps;
            return (num == null && num2 == null) ? preparingDeliveryViewModel(fidesmoFlowType, str, scanningStarPlacement, fidesmoScanningPulseShape) : new FidesmoProvisioningViewModel.Scanning.InProgress(activationInProgressTitle(fidesmoScanningPulseShape, fidesmoFlowType, scanningStarPlacement, true), num, num2, str, scanningStarPlacement, fidesmoScanningPulseShape, 56);
        }
        if (!(fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered)) {
            if (fidesmoDeviceState instanceof FidesmoDeviceState.Error) {
                FidesmoProvisioningError unwrapped = ((FidesmoDeviceState.Error) fidesmoDeviceState).error.getUnwrapped();
                return ((unwrapped instanceof FidesmoProvisioningError.MissingEncryptedData) || (unwrapped instanceof FidesmoProvisioningError.MissingEphemeralKey)) ? FidesmoProvisioningErrorViewModelsKt.genericNonRetryableViewModel(androidStringManager, fidesmoFlowType) : unwrapped.isGenericRetryable() ? FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType) : FidesmoProvisioningErrorViewModelsKt.nfcDetectionViewModel(androidStringManager);
            }
            if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDeliveryFailed) {
                FidesmoProvisioningError unwrapped2 = ((FidesmoDeviceState.ServiceDeliveryFailed) fidesmoDeviceState).error.getUnwrapped();
                return unwrapped2 instanceof FidesmoProvisioningError.EmailMismatch ? FidesmoProvisioningErrorViewModelsKt.emailMismatchViewModel(androidStringManager, fidesmoFlowType) : unwrapped2 instanceof FidesmoProvisioningError.WrongDevice ? FidesmoProvisioningErrorViewModelsKt.wrongDeviceViewModel(androidStringManager) : ((unwrapped2 instanceof FidesmoProvisioningError.AppletInstallFailed) || (unwrapped2 instanceof FidesmoProvisioningError.ActivationFailed) || (unwrapped2 instanceof FidesmoProvisioningError.SdkRetryLimitExceeded)) ? FidesmoProvisioningErrorViewModelsKt.nfcDetectionViewModel(androidStringManager) : unwrapped2 instanceof FidesmoProvisioningError.CardDigitizationDeclined ? FidesmoProvisioningErrorViewModelsKt.cardDigitizationDeclinedViewModel(androidStringManager) : unwrapped2 instanceof FidesmoProvisioningError.FidesmoServiceUnavailable ? new FidesmoProvisioningViewModel.Failed(androidStringManager.get(R.string.fidesmo_provisioning_service_unavailable_title), 16, androidStringManager.get(R.string.fidesmo_provisioning_service_unavailable_message), androidStringManager.get(R.string.fidesmo_provisioning_not_now), androidStringManager.get(R.string.fidesmo_provisioning_retry)) : unwrapped2.isRetryable() ? FidesmoProvisioningErrorViewModelsKt.genericRetryableViewModel(androidStringManager, fidesmoFlowType) : FidesmoProvisioningErrorViewModelsKt.genericNonRetryableViewModel(androidStringManager, fidesmoFlowType);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (fidesmoFlowType == FidesmoFlowType.DEPROVISION) {
            return new FidesmoProvisioningViewModel.Success.Deprovisioned(androidStringManager.get(R.string.fidesmo_deprovisioning_success_highlighted_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_standard_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_button));
        }
        if (successScreen == null) {
            return errorViewModel$default(this, androidStringManager.get(R.string.fidesmo_provisioning_error_title), androidStringManager.get(R.string.fidesmo_provisioning_activation_failed_message), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        }
        if (successUiConfig == null || (str2 = successUiConfig.disclosure_text) == null || str2.length() == 0) {
            str2 = null;
        }
        String str6 = successScreen.highlighted_title;
        BookletTile bookletTile = successScreen.tiles;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = successScreen.standard_title;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = successScreen.button_text;
        if (str8 == null) {
            str8 = androidStringManager.get(R.string.fidesmo_provisioning_done);
        }
        if (bookletTile == null || (gridContent = bookletTile.grid_content) == null) {
            bookletGrid = null;
        } else {
            LocalizedString localizedString2 = gridContent.title_text;
            String translated = localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : "";
            List<BookletTile.GridContent.GridItem> list3 = gridContent.grid_items;
            ArrayList arrayList = new ArrayList();
            for (BookletTile.GridContent.GridItem gridItem : list3) {
                Icon icon = gridItem.icon;
                if (icon == null || (str3 = icon.arcade_id) == null) {
                    item = null;
                } else {
                    Icon icon2 = new Icon(str3);
                    LocalizedString localizedString3 = gridItem.title_text;
                    String translated2 = localizedString3 != null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : "";
                    LocalizedString localizedString4 = gridItem.detail_text;
                    item = new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(icon2, translated2, localizedString4 != null ? com.squareup.util.cash.StringsKt.translated(localizedString4) : "");
                }
                if (item != null) {
                    arrayList.add(item);
                }
            }
            bookletGrid = new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid(translated, arrayList);
        }
        if (bookletTile == null || (staticContent = bookletTile.static_content) == null || (image = staticContent.hero_image) == null || (localizedString = staticContent.title_text) == null) {
            tile = null;
        } else {
            String translated3 = com.squareup.util.cash.StringsKt.translated(localizedString);
            LocalizedString localizedString5 = staticContent.detail_text;
            tile = new FidesmoProvisioningViewModel.Success.Provisioned.Tile(image, translated3, localizedString5 != null ? com.squareup.util.cash.StringsKt.translated(localizedString5) : "");
        }
        List<SuccessScreen.Card> list4 = successScreen.cards;
        ArrayList arrayList2 = new ArrayList();
        for (SuccessScreen.Card card2 : list4) {
            String str9 = card2.header;
            if (str9 != null) {
                if (StringsKt.isBlank(str9)) {
                    str9 = null;
                }
                if (str9 != null) {
                    String str10 = card2.image_url;
                    if (str10 == null || StringsKt.isBlank(str10)) {
                        str10 = null;
                    }
                    String str11 = card2.button_text;
                    if (str11 == null || StringsKt.isBlank(str11)) {
                        str11 = null;
                    }
                    String str12 = card2.button_url;
                    if (str12 == null || StringsKt.isBlank(str12)) {
                        str12 = null;
                    }
                    card = new FidesmoProvisioningViewModel.Success.Provisioned.Card(str10, str9, str11, str12);
                    if (card == null) {
                        arrayList2.add(card);
                    }
                }
            }
            card = null;
            if (card == null) {
            }
        }
        String str13 = successScreen.disclosure_text;
        if (str13 != null) {
            String str14 = StringsKt.isBlank(str13) ? null : str13;
            if (str14 != null) {
                str2 = str14;
            }
        }
        return new FidesmoProvisioningViewModel.Success.Provisioned(str6, str7, str8, bookletGrid, tile, arrayList2, str2, tagFormFactor);
    }
}
