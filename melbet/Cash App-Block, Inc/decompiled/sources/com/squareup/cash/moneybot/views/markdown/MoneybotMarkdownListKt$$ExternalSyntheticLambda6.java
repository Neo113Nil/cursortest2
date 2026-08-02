package com.squareup.cash.moneybot.views.markdown;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextStyle;
import com.mikepenz.markdown.compose.ComposeLocalKt$$ExternalSyntheticLambda14;
import com.squareup.cash.R;
import com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel;
import com.squareup.cash.banking.applets.presenters.OverdraftModel$Activated;
import com.squareup.cash.banking.applets.presenters.OverdraftModel$Disabled;
import com.squareup.cash.banking.applets.presenters.OverdraftModel$Eligible;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.text.StringsKt___StringsKt;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class MoneybotMarkdownListKt$$ExternalSyntheticLambda6 implements Function5 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ MoneybotMarkdownListKt$$ExternalSyntheticLambda6(ComposeLocalKt$$ExternalSyntheticLambda14 composeLocalKt$$ExternalSyntheticLambda14, String str, int i, TextStyle textStyle) {
        this.f$0 = composeLocalKt$$ExternalSyntheticLambda14;
        this.f$1 = str;
        this.f$3 = textStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    @Override // kotlin.jvm.functions.Function5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        MutableState mutableState;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        PagerDefaults pagerDefaults;
        BalanceAppletTileViewModel.OverdraftModel overdraftModel;
        String str9;
        int i = this.$r8$classId;
        Object obj6 = this.f$3;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ComposeLocalKt$$ExternalSyntheticLambda14 composeLocalKt$$ExternalSyntheticLambda14 = (ComposeLocalKt$$ExternalSyntheticLambda14) obj7;
                TextStyle textStyle = (TextStyle) obj6;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                ASTNodeImpl aSTNodeImpl = (ASTNodeImpl) obj3;
                Composer composer = (Composer) obj4;
                ((Integer) obj5).getClass();
                MarkdownElementType markdownElementType = MarkdownTokenTypes.LIST_NUMBER;
                if (aSTNodeImpl != null) {
                    MoneybotMarkdownKt.safeGetUnescapedTextInNode(aSTNodeImpl, this.f$1);
                }
                MoneybotMarkdownKt.m3631MoneybotMarkdownBasicTextJAgEBs0(composeLocalKt$$ExternalSyntheticLambda14.transform(markdownElementType, intValue, intValue2), textStyle, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, composer, 0, 131068);
                return Unit.INSTANCE;
            default:
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj7;
                MoneyFormatter moneyFormatter = (MoneyFormatter) tapToPayPresenter.screen;
                MutableState mutableState2 = (MutableState) obj6;
                BalanceRepositoryModel balanceRepositoryModel = (BalanceRepositoryModel) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                FamilyProfile familyProfile = (FamilyProfile) obj3;
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                boolean booleanValue3 = ((Boolean) obj5).booleanValue();
                familyProfile.getClass();
                if (balanceRepositoryModel == null) {
                    return (BalanceAppletTileViewModel.Loading) tapToPayPresenter.screenRecodingDetector;
                }
                Money money = balanceRepositoryModel.balance;
                BalanceRepositoryModel.AccountAndRoutingState accountAndRoutingState = balanceRepositoryModel.accountAndRoutingState;
                AndroidStringManager androidStringManager = (AndroidStringManager) tapToPayPresenter.flowStarter;
                Resources resources = androidStringManager.resources;
                String format2 = moneyFormatter.format(money);
                mutableState2.setValue(Boolean.valueOf(familyProfile instanceof FamilyProfile.ManagedAccount));
                Money money2 = balanceRepositoryModel.restrictedBalance;
                Object obj8 = null;
                String format3 = money2 != null ? moneyFormatter.format(money2) : null;
                String str10 = (String) tapToPayPresenter.ttpSessionManager;
                boolean z = accountAndRoutingState instanceof BalanceRepositoryModel.AccountAndRoutingState.Displayed;
                BalanceRepositoryModel.AccountAndRoutingState.Hidden hidden = BalanceRepositoryModel.AccountAndRoutingState.Hidden.INSTANCE;
                BalanceRepositoryModel.AccountAndRoutingState.Masked masked = BalanceRepositoryModel.AccountAndRoutingState.Masked.INSTANCE;
                if (z) {
                    str = format3;
                    Object[] objArr = {StringsKt___StringsKt.takeLast(4, ((BalanceRepositoryModel.AccountAndRoutingState.Displayed) accountAndRoutingState).accountNumber)};
                    resources.getClass();
                    mutableState = mutableState2;
                    str2 = new MessageFormat(resources.getString(R.string.balance_banking_packaging_applet_tile_formatted_cash_balance)).format(objArr);
                    str2.getClass();
                } else {
                    str = format3;
                    mutableState = mutableState2;
                    if (accountAndRoutingState.equals(masked)) {
                        str2 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_no_account_number);
                    } else {
                        if (!accountAndRoutingState.equals(hidden)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return obj8;
                        }
                        str2 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_no_account_number_evolution);
                    }
                }
                String str11 = str2;
                if (z) {
                    Object[] objArr2 = {TapToPayPresenter.formatNumberForContentDescription(StringsKt___StringsKt.takeLast(4, ((BalanceRepositoryModel.AccountAndRoutingState.Displayed) accountAndRoutingState).accountNumber))};
                    resources.getClass();
                    str4 = new MessageFormat(resources.getString(R.string.balance_banking_packaging_applet_tile_formatted_account_number_content_description)).format(objArr2);
                    str4.getClass();
                } else {
                    if (!accountAndRoutingState.equals(masked)) {
                        if (!accountAndRoutingState.equals(hidden)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return obj8;
                        }
                        str3 = null;
                        if (!z) {
                            Object[] objArr3 = {StringsKt___StringsKt.takeLast(3, ((BalanceRepositoryModel.AccountAndRoutingState.Displayed) accountAndRoutingState).routingNumber)};
                            resources.getClass();
                            str6 = new MessageFormat(resources.getString(R.string.balance_banking_packaging_applet_tile_formatted_routing_number)).format(objArr3);
                            str6.getClass();
                        } else {
                            if (!accountAndRoutingState.equals(masked)) {
                                if (!accountAndRoutingState.equals(hidden)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj8;
                                }
                                str5 = null;
                                if (z) {
                                    Object[] objArr4 = {TapToPayPresenter.formatNumberForContentDescription(StringsKt___StringsKt.takeLast(3, ((BalanceRepositoryModel.AccountAndRoutingState.Displayed) accountAndRoutingState).routingNumber))};
                                    resources.getClass();
                                    str8 = new MessageFormat(resources.getString(R.string.balance_banking_packaging_applet_tile_formatted_routing_number_content_description)).format(objArr4);
                                    str8.getClass();
                                } else {
                                    if (!accountAndRoutingState.equals(masked)) {
                                        if (!accountAndRoutingState.equals(hidden)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return obj8;
                                        }
                                        str7 = null;
                                        boolean z2 = balanceRepositoryModel.canCashIn;
                                        boolean z3 = balanceRepositoryModel.canCashOut;
                                        BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons = new BalanceAppletTileViewModel.BalanceMovementButtons(z2, z3, (String) tapToPayPresenter.mriFactory, (String) tapToPayPresenter.navigator, booleanValue2, (booleanValue3 || z3) ? false : true);
                                        Long l = money.amount;
                                        long longValue = l == null ? l.longValue() : 0L;
                                        pagerDefaults = balanceRepositoryModel.overdraftModel;
                                        if (pagerDefaults == null) {
                                            if (pagerDefaults instanceof OverdraftModel$Activated) {
                                                str9 = ((OverdraftModel$Activated) pagerDefaults).amountUsedText;
                                            } else if (pagerDefaults instanceof OverdraftModel$Disabled) {
                                                str9 = ((OverdraftModel$Disabled) pagerDefaults).amountUsedText;
                                            } else {
                                                if (!(pagerDefaults instanceof OverdraftModel$Eligible)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return obj8;
                                                }
                                                str9 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_overdraft_status_eligible_amount_used_text);
                                            }
                                            overdraftModel = new BalanceAppletTileViewModel.OverdraftModel(str9, pagerDefaults.getUseWarningTextColor());
                                        } else {
                                            overdraftModel = null;
                                        }
                                        if (str != null) {
                                            resources.getClass();
                                            obj8 = new MessageFormat(resources.getString(R.string.restricted_balance_label)).format(new Object[]{str});
                                            obj8.getClass();
                                        }
                                        obj8 = new BalanceAppletTileViewModel.Loaded.Default(str10, balanceMovementButtons, this.f$1, str11, str3, format2, longValue, new BalanceAppletTileViewModel.BalanceObfuscationButton(!booleanValue ? androidStringManager.get(R.string.balance_obfuscation_state_hidden_content_description) : androidStringManager.get(R.string.balance_obfuscation_state_shown_content_description), !booleanValue ? androidStringManager.get(R.string.balance_obfuscation_show_click_label) : androidStringManager.get(R.string.balance_obfuscation_hide_click_label), booleanValue), str5, str7, overdraftModel, obj8, ((Boolean) mutableState.getValue()).booleanValue());
                                        return obj8;
                                    }
                                    str8 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_no_routing_number_content_description);
                                }
                                str7 = str8;
                                boolean z22 = balanceRepositoryModel.canCashIn;
                                boolean z32 = balanceRepositoryModel.canCashOut;
                                BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons2 = new BalanceAppletTileViewModel.BalanceMovementButtons(z22, z32, (String) tapToPayPresenter.mriFactory, (String) tapToPayPresenter.navigator, booleanValue2, (booleanValue3 || z32) ? false : true);
                                Long l2 = money.amount;
                                long longValue2 = l2 == null ? l2.longValue() : 0L;
                                pagerDefaults = balanceRepositoryModel.overdraftModel;
                                if (pagerDefaults == null) {
                                }
                                if (str != null) {
                                }
                                obj8 = new BalanceAppletTileViewModel.Loaded.Default(str10, balanceMovementButtons2, this.f$1, str11, str3, format2, longValue2, new BalanceAppletTileViewModel.BalanceObfuscationButton(!booleanValue ? androidStringManager.get(R.string.balance_obfuscation_state_hidden_content_description) : androidStringManager.get(R.string.balance_obfuscation_state_shown_content_description), !booleanValue ? androidStringManager.get(R.string.balance_obfuscation_show_click_label) : androidStringManager.get(R.string.balance_obfuscation_hide_click_label), booleanValue), str5, str7, overdraftModel, obj8, ((Boolean) mutableState.getValue()).booleanValue());
                                return obj8;
                            }
                            str6 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_no_routing_number);
                        }
                        str5 = str6;
                        if (z) {
                        }
                        str7 = str8;
                        boolean z222 = balanceRepositoryModel.canCashIn;
                        boolean z322 = balanceRepositoryModel.canCashOut;
                        BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons22 = new BalanceAppletTileViewModel.BalanceMovementButtons(z222, z322, (String) tapToPayPresenter.mriFactory, (String) tapToPayPresenter.navigator, booleanValue2, (booleanValue3 || z322) ? false : true);
                        Long l22 = money.amount;
                        long longValue22 = l22 == null ? l22.longValue() : 0L;
                        pagerDefaults = balanceRepositoryModel.overdraftModel;
                        if (pagerDefaults == null) {
                        }
                        if (str != null) {
                        }
                        obj8 = new BalanceAppletTileViewModel.Loaded.Default(str10, balanceMovementButtons22, this.f$1, str11, str3, format2, longValue22, new BalanceAppletTileViewModel.BalanceObfuscationButton(!booleanValue ? androidStringManager.get(R.string.balance_obfuscation_state_hidden_content_description) : androidStringManager.get(R.string.balance_obfuscation_state_shown_content_description), !booleanValue ? androidStringManager.get(R.string.balance_obfuscation_show_click_label) : androidStringManager.get(R.string.balance_obfuscation_hide_click_label), booleanValue), str5, str7, overdraftModel, obj8, ((Boolean) mutableState.getValue()).booleanValue());
                        return obj8;
                    }
                    str4 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_no_account_number_content_description);
                }
                str3 = str4;
                if (!z) {
                }
                str5 = str6;
                if (z) {
                }
                str7 = str8;
                boolean z2222 = balanceRepositoryModel.canCashIn;
                boolean z3222 = balanceRepositoryModel.canCashOut;
                BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons222 = new BalanceAppletTileViewModel.BalanceMovementButtons(z2222, z3222, (String) tapToPayPresenter.mriFactory, (String) tapToPayPresenter.navigator, booleanValue2, (booleanValue3 || z3222) ? false : true);
                Long l222 = money.amount;
                long longValue222 = l222 == null ? l222.longValue() : 0L;
                pagerDefaults = balanceRepositoryModel.overdraftModel;
                if (pagerDefaults == null) {
                }
                if (str != null) {
                }
                obj8 = new BalanceAppletTileViewModel.Loaded.Default(str10, balanceMovementButtons222, this.f$1, str11, str3, format2, longValue222, new BalanceAppletTileViewModel.BalanceObfuscationButton(!booleanValue ? androidStringManager.get(R.string.balance_obfuscation_state_hidden_content_description) : androidStringManager.get(R.string.balance_obfuscation_state_shown_content_description), !booleanValue ? androidStringManager.get(R.string.balance_obfuscation_show_click_label) : androidStringManager.get(R.string.balance_obfuscation_hide_click_label), booleanValue), str5, str7, overdraftModel, obj8, ((Boolean) mutableState.getValue()).booleanValue());
                return obj8;
        }
    }

    public /* synthetic */ MoneybotMarkdownListKt$$ExternalSyntheticLambda6(TapToPayPresenter tapToPayPresenter, String str, MutableState mutableState) {
        this.f$0 = tapToPayPresenter;
        this.f$1 = str;
        this.f$3 = mutableState;
    }
}
