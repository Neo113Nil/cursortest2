package com.squareup.cash.db2.profile;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BalanceData {
    public final boolean adding_cash_enabled;
    public final List balance_limit_groups;
    public final boolean bitcoin_p2p_enabled;
    public final boolean cash_balance_home_screen_button_enabled;
    public final int cash_balance_home_screen_button_priority;
    public final boolean check_deposits_enabled;
    public final BalanceData.Button dda_form;
    public final BalanceData.Button deposit_check;
    public final BalanceData.Button direct_deposit;
    public final String enable_cryptocurrency_transfer_in_button_text;
    public final EnableCryptocurrencyTransferInStatus enable_cryptocurrency_transfer_in_status;
    public final String enable_cryptocurrency_transfer_out_button_text;
    public final EnableCryptocurrencyTransferOutStatus enable_cryptocurrency_transfer_out_status;
    public final ScheduledReloadData scheduled_reload_data;
    public final boolean scheduled_reload_enabled;

    public BalanceData(boolean z, int i, boolean z2, EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus, String str, List list, ScheduledReloadData scheduledReloadData, boolean z3, EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus, String str2, boolean z4, BalanceData.Button button, BalanceData.Button button2, BalanceData.Button button3, boolean z5) {
        enableCryptocurrencyTransferOutStatus.getClass();
        list.getClass();
        enableCryptocurrencyTransferInStatus.getClass();
        this.cash_balance_home_screen_button_enabled = z;
        this.cash_balance_home_screen_button_priority = i;
        this.adding_cash_enabled = z2;
        this.enable_cryptocurrency_transfer_out_status = enableCryptocurrencyTransferOutStatus;
        this.enable_cryptocurrency_transfer_out_button_text = str;
        this.balance_limit_groups = list;
        this.scheduled_reload_data = scheduledReloadData;
        this.scheduled_reload_enabled = z3;
        this.enable_cryptocurrency_transfer_in_status = enableCryptocurrencyTransferInStatus;
        this.enable_cryptocurrency_transfer_in_button_text = str2;
        this.check_deposits_enabled = z4;
        this.direct_deposit = button;
        this.deposit_check = button2;
        this.dda_form = button3;
        this.bitcoin_p2p_enabled = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceData)) {
            return false;
        }
        BalanceData balanceData = (BalanceData) obj;
        return this.cash_balance_home_screen_button_enabled == balanceData.cash_balance_home_screen_button_enabled && this.cash_balance_home_screen_button_priority == balanceData.cash_balance_home_screen_button_priority && this.adding_cash_enabled == balanceData.adding_cash_enabled && this.enable_cryptocurrency_transfer_out_status == balanceData.enable_cryptocurrency_transfer_out_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_out_button_text, balanceData.enable_cryptocurrency_transfer_out_button_text) && Intrinsics.areEqual(this.balance_limit_groups, balanceData.balance_limit_groups) && Intrinsics.areEqual(this.scheduled_reload_data, balanceData.scheduled_reload_data) && this.scheduled_reload_enabled == balanceData.scheduled_reload_enabled && this.enable_cryptocurrency_transfer_in_status == balanceData.enable_cryptocurrency_transfer_in_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_in_button_text, balanceData.enable_cryptocurrency_transfer_in_button_text) && this.check_deposits_enabled == balanceData.check_deposits_enabled && Intrinsics.areEqual(this.direct_deposit, balanceData.direct_deposit) && Intrinsics.areEqual(this.deposit_check, balanceData.deposit_check) && Intrinsics.areEqual(this.dda_form, balanceData.dda_form) && this.bitcoin_p2p_enabled == balanceData.bitcoin_p2p_enabled;
    }

    public final int hashCode() {
        int hashCode = (this.enable_cryptocurrency_transfer_out_status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cash_balance_home_screen_button_priority, Boolean.hashCode(this.cash_balance_home_screen_button_enabled) * 31, 31), 31, this.adding_cash_enabled)) * 31;
        String str = this.enable_cryptocurrency_transfer_out_button_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.balance_limit_groups);
        ScheduledReloadData scheduledReloadData = this.scheduled_reload_data;
        int hashCode2 = (this.enable_cryptocurrency_transfer_in_status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (scheduledReloadData == null ? 0 : scheduledReloadData.hashCode())) * 31, 31, this.scheduled_reload_enabled)) * 31;
        String str2 = this.enable_cryptocurrency_transfer_in_button_text;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.check_deposits_enabled);
        BalanceData.Button button = this.direct_deposit;
        int hashCode3 = (m2 + (button == null ? 0 : button.hashCode())) * 31;
        BalanceData.Button button2 = this.deposit_check;
        int hashCode4 = (hashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31;
        BalanceData.Button button3 = this.dda_form;
        return Boolean.hashCode(this.bitcoin_p2p_enabled) + ((hashCode4 + (button3 != null ? button3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceData(cash_balance_home_screen_button_enabled=");
        sb.append(this.cash_balance_home_screen_button_enabled);
        sb.append(", cash_balance_home_screen_button_priority=");
        sb.append(this.cash_balance_home_screen_button_priority);
        sb.append(", adding_cash_enabled=");
        sb.append(this.adding_cash_enabled);
        sb.append(", enable_cryptocurrency_transfer_out_status=");
        sb.append(this.enable_cryptocurrency_transfer_out_status);
        sb.append(", enable_cryptocurrency_transfer_out_button_text=");
        NavAction$$ExternalSyntheticOutline0.m(this.enable_cryptocurrency_transfer_out_button_text, ", balance_limit_groups=", ", scheduled_reload_data=", sb, this.balance_limit_groups);
        sb.append(this.scheduled_reload_data);
        sb.append(", scheduled_reload_enabled=");
        sb.append(this.scheduled_reload_enabled);
        sb.append(", enable_cryptocurrency_transfer_in_status=");
        sb.append(this.enable_cryptocurrency_transfer_in_status);
        sb.append(", enable_cryptocurrency_transfer_in_button_text=");
        sb.append(this.enable_cryptocurrency_transfer_in_button_text);
        sb.append(", check_deposits_enabled=");
        sb.append(this.check_deposits_enabled);
        sb.append(", direct_deposit=");
        sb.append(this.direct_deposit);
        sb.append(", deposit_check=");
        sb.append(this.deposit_check);
        sb.append(", dda_form=");
        sb.append(this.dda_form);
        sb.append(", bitcoin_p2p_enabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.bitcoin_p2p_enabled, ")");
    }
}
