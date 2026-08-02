package com.squareup.cash.fidesmo.presenters;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public abstract class FidesmoDeniedErrorViewModelKt {
    public static final FidesmoProvisioningViewModel.ButtonAction toButtonAction(FidesmoProvisioningBlocker.ErrorUiConfig.Button button) {
        FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action action = button != null ? button.action : null;
        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) {
            return FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE;
        }
        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) {
            return FidesmoProvisioningViewModel.ButtonAction.Retry.INSTANCE;
        }
        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) {
            String str = ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) action).getValue().url;
            if (str != null) {
                return new FidesmoProvisioningViewModel.ButtonAction.OpenUrl(str);
            }
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return null;
    }

    public static final FidesmoProvisioningViewModel.Error toDeniedErrorViewModel(FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig, String str, String str2, ListUnordered listUnordered, String str3) {
        FidesmoProvisioningViewModel.ButtonAction buttonAction;
        Icon icon;
        ListUnordered listUnordered2;
        String str4;
        String str5;
        FidesmoProvisioningBlocker.ErrorUiConfig.Button button;
        FidesmoProvisioningBlocker.ErrorUiConfig.Button button2;
        str.getClass();
        str3.getClass();
        String str6 = (errorUiConfig == null || (button2 = errorUiConfig.primary_button) == null) ? null : button2.text;
        String str7 = (errorUiConfig == null || (button = errorUiConfig.secondary_button) == null) ? null : button.text;
        String str8 = errorUiConfig != null ? errorUiConfig.dismiss_button_text : null;
        boolean z = str6 == null && str7 == null;
        String str9 = str6 == null ? (str8 == null || !z) ? null : str8 : str6;
        FidesmoProvisioningViewModel.ButtonAction buttonAction2 = toButtonAction(errorUiConfig != null ? errorUiConfig.primary_button : null);
        FidesmoProvisioningViewModel.ButtonAction.Close close = FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE;
        if (buttonAction2 == null) {
            buttonAction2 = (str9 == null || str6 != null) ? null : close;
        }
        FidesmoProvisioningViewModel.ButtonAction buttonAction3 = buttonAction2;
        String str10 = errorUiConfig == null ? str3 : str7 == null ? !z ? str8 : null : str7;
        FidesmoProvisioningViewModel.ButtonAction buttonAction4 = toButtonAction(errorUiConfig != null ? errorUiConfig.secondary_button : null);
        if (buttonAction4 == null) {
            if (str10 == null) {
                close = null;
            }
            buttonAction = close;
        } else {
            buttonAction = buttonAction4;
        }
        String str11 = (errorUiConfig == null || (str5 = errorUiConfig.title) == null) ? str : str5;
        String str12 = (errorUiConfig == null || (str4 = errorUiConfig.body_text) == null) ? str2 : str4;
        if (errorUiConfig != null) {
            Icon icon2 = errorUiConfig.error_icon;
            if (icon2 == null) {
                zzd zzdVar = Icons.Companion;
                icon2 = new Icon("aKVBAL");
            }
            icon = icon2;
        } else {
            icon = null;
        }
        return new FidesmoProvisioningViewModel.Error(str11, str12, icon, (errorUiConfig == null || (listUnordered2 = errorUiConfig.items) == null) ? errorUiConfig != null ? new ListUnordered(EmptyList.INSTANCE, (ListUnordered.Variant) null, 6) : listUnordered : listUnordered2, str9, str10, buttonAction3, buttonAction);
    }
}
