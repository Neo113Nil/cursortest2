package com.squareup.cash.banking.sections;

import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;

/* loaded from: classes5.dex */
public abstract class MoreWaysToAddMoneySectionPresenterKt {
    public static final BankingDialogScreen.Dialog.Button toScreenButton(BankingTab.Dialog.Button button) {
        BankingTab.ClientScenarioAction value;
        String str = button.text;
        if (str == null) {
            str = "";
        }
        BankingTab.Dialog.Button.Action_ action_ = button.Action;
        ClientScenario clientScenario = null;
        BankingTab.Dialog.Button.Action_.ClientScenarioAction clientScenarioAction = action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction ? (BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_ : null;
        if (clientScenarioAction != null && (value = clientScenarioAction.getValue()) != null) {
            clientScenario = value.client_scenario;
        }
        return new BankingDialogScreen.Dialog.Button(clientScenario, str);
    }
}
