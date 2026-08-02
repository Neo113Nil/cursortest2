package com.squareup.cash.banking.views;

import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletRetroOrderSelectionViewEvent;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewEvent;
import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewEvent;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SheetAppMessageEvent.BackClicked backClicked = SheetAppMessageEvent.BackClicked.INSTANCE;
        BalanceHomeViewEvent.Help help = BalanceHomeViewEvent.Help.INSTANCE;
        BalanceHomeViewEvent.OverdraftClicked overdraftClicked = BalanceHomeViewEvent.OverdraftClicked.INSTANCE;
        AfterpayAppletRetroOrderSelectionViewEvent.GoBack goBack = AfterpayAppletRetroOrderSelectionViewEvent.GoBack.INSTANCE;
        ArcadeComponentEvent.Click click = ArcadeComponentEvent.Click.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(BalanceHomeViewEvent.Close.INSTANCE);
                break;
            case 1:
                function1.invoke(goBack);
                break;
            case 2:
                function1.invoke(goBack);
                break;
            case 3:
                function1.invoke(goBack);
                break;
            case 4:
                function1.invoke(AfterpayAppletRetroOrderSelectionViewEvent.TryAgainTapped.INSTANCE);
                break;
            case 5:
                function1.invoke(AgentsHomeViewEvent.TapCreateAgent.INSTANCE);
                break;
            case 6:
                function1.invoke(AgentsHomeViewEvent.TapBack.INSTANCE);
                break;
            case 7:
                function1.invoke(AmountPickerViewEvent$Full$SystemBack.INSTANCE);
                break;
            case 8:
                function1.invoke(AmountPickerViewEvent$Full$HelpClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(AmountPickerViewEvent$Full$Close.INSTANCE);
                break;
            case 10:
                function1.invoke(AlternativeNewSponsorAliasViewEvent.Continue.INSTANCE);
                break;
            case 11:
                function1.invoke(AlternativeNewSponsorAliasViewEvent.Cancel.INSTANCE);
                break;
            case 12:
                function1.invoke(SheetAppMessageEvent.ShareClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(backClicked);
                break;
            case 14:
                function1.invoke(backClicked);
                break;
            case 15:
                function1.invoke(AppUpdateDialogViewEvent.Update.INSTANCE);
                break;
            case 16:
                function1.invoke(AppUpdateDialogViewEvent.Dismiss.INSTANCE);
                break;
            case 17:
                function1.invoke(click);
                break;
            case 18:
                function1.invoke(click);
                break;
            case 19:
                function1.invoke(click);
                break;
            case 20:
                function1.invoke(ArcadeComponentEvent.InlineMessagePrimaryClick.INSTANCE);
                break;
            case 21:
                function1.invoke(ArcadeComponentEvent.InlineMessageSecondaryClick.INSTANCE);
                break;
            case 22:
                function1.invoke(click);
                break;
            case 23:
                function1.invoke(BalanceAppletTileViewEvent.BalanceAppletObfuscationToggled.INSTANCE);
                break;
            case 24:
                function1.invoke(BalanceHomeViewEvent.OverdraftManageClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(BalanceHomeViewEvent.RestrictedBalanceClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(overdraftClicked);
                break;
            case 27:
                function1.invoke(help);
                break;
            case 28:
                function1.invoke(help);
                break;
            default:
                function1.invoke(overdraftClicked);
                break;
        }
        return Unit.INSTANCE;
    }
}
