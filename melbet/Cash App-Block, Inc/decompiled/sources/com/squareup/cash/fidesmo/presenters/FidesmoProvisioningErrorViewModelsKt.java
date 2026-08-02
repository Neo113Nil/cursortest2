package com.squareup.cash.fidesmo.presenters;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public abstract class FidesmoProvisioningErrorViewModelsKt {
    public static final FidesmoProvisioningViewModel.Error cardDigitizationDeclinedViewModel(AndroidStringManager androidStringManager) {
        String str = androidStringManager.get(R.string.fidesmo_provisioning_digitization_declined_title);
        String str2 = androidStringManager.get(R.string.fidesmo_provisioning_digitization_declined_message);
        zzd zzdVar = Icons.Companion;
        return new FidesmoProvisioningViewModel.Error(str, str2, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_try_again), androidStringManager.get(R.string.fidesmo_provisioning_close), FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE);
    }

    public static final FidesmoProvisioningViewModel.Error emailMismatchViewModel(AndroidStringManager androidStringManager, FidesmoFlowType fidesmoFlowType) {
        String str;
        String str2;
        fidesmoFlowType.getClass();
        String str3 = androidStringManager.get(R.string.fidesmo_provisioning_email_mismatch_title);
        int ordinal = fidesmoFlowType.ordinal();
        if (ordinal == 0) {
            str = androidStringManager.get(R.string.fidesmo_provisioning_email_mismatch_message);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.fidesmo_deprovisioning_email_mismatch_message);
        }
        zzd zzdVar = Icons.Companion;
        Icon icon = new Icon("aKVBAL");
        ListUnordered listUnordered = new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6);
        int ordinal2 = fidesmoFlowType.ordinal();
        if (ordinal2 == 0) {
            str2 = androidStringManager.get(R.string.fidesmo_provisioning_ok);
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str2 = androidStringManager.get(R.string.fidesmo_provisioning_close);
        }
        return new FidesmoProvisioningViewModel.Error(str3, str, icon, listUnordered, str2, null, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, null);
    }

    public static final FidesmoProvisioningViewModel.Error genericNonRetryableViewModel(AndroidStringManager androidStringManager, FidesmoFlowType fidesmoFlowType) {
        String str;
        fidesmoFlowType.getClass();
        int ordinal = fidesmoFlowType.ordinal();
        if (ordinal == 0) {
            str = androidStringManager.get(R.string.fidesmo_provisioning_generic_non_retryable_title);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.fidesmo_deprovisioning_generic_non_retryable_title);
        }
        String str2 = str;
        String str3 = androidStringManager.get(R.string.fidesmo_provisioning_generic_non_retryable_message);
        zzd zzdVar = Icons.Companion;
        Icon icon = new Icon("aKVBAL");
        ListUnordered listUnordered = new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6);
        String str4 = androidStringManager.get(R.string.fidesmo_provisioning_contact_support);
        String str5 = androidStringManager.get(R.string.fidesmo_provisioning_not_now);
        FidesmoProvisioningViewModel.ButtonAction.Close close = FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE;
        return new FidesmoProvisioningViewModel.Error(str2, str3, icon, listUnordered, str4, str5, close, close);
    }

    public static final FidesmoProvisioningViewModel.Error genericRetryableViewModel(AndroidStringManager androidStringManager, FidesmoFlowType fidesmoFlowType) {
        String str;
        fidesmoFlowType.getClass();
        int ordinal = fidesmoFlowType.ordinal();
        if (ordinal == 0) {
            str = androidStringManager.get(R.string.fidesmo_provisioning_generic_retryable_title);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.fidesmo_deprovisioning_generic_retryable_title);
        }
        zzd zzdVar = Icons.Companion;
        return new FidesmoProvisioningViewModel.Error(str, null, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_try_again), androidStringManager.get(R.string.fidesmo_provisioning_not_now), FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE);
    }

    public static final FidesmoProvisioningViewModel.Error nfcDetectionViewModel(AndroidStringManager androidStringManager) {
        String str = androidStringManager.get(R.string.fidesmo_provisioning_nfc_detection_title);
        zzd zzdVar = Icons.Companion;
        return new FidesmoProvisioningViewModel.Error(str, null, new Icon("aKVBAL"), new ListUnordered(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnordered.ListItem[]{new ListUnordered.ListItem(new Icon("YxclJB"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_nfc_detection_instruction_1)), null, null, null, 28, null), new ListUnordered.ListItem(new Icon("Xjy6RJ"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_nfc_detection_instruction_2)), null, null, null, 28, null), new ListUnordered.ListItem(new Icon("StkLXb"), StringsKt.localized(androidStringManager.get(R.string.fidesmo_provisioning_nfc_detection_instruction_3)), null, null, null, 28, null)}), (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_try_again), androidStringManager.get(R.string.fidesmo_provisioning_not_now), FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE);
    }

    public static final FidesmoProvisioningViewModel.Error wrongDeviceViewModel(AndroidStringManager androidStringManager) {
        String str = androidStringManager.get(R.string.fidesmo_provisioning_wrong_device_title);
        String str2 = androidStringManager.get(R.string.fidesmo_provisioning_wrong_device_message);
        zzd zzdVar = Icons.Companion;
        return new FidesmoProvisioningViewModel.Error(str, str2, new Icon("aKVBAL"), new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6), androidStringManager.get(R.string.fidesmo_provisioning_ok), null, FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE, null);
    }
}
