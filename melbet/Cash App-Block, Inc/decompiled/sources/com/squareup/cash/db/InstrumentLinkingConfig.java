package com.squareup.cash.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentLinkingConfig {
    public final BankAccountLinkingConfig bank_account_linking_config;
    public final boolean bankbook_enabled;
    public final boolean cash_balance_enabled;
    public final long credit_card_fee_bps;
    public final boolean credit_card_linking_enabled;
    public final String description_bank_account_linked;
    public final String description_no_instrument_linked;
    public final String description_no_instrument_linked_personal;
    public final String header_bank_account_linked;
    public final String header_no_instrument_linked;
    public final String header_no_instrument_linked_personal;
    public final InstrumentLinkingConfig.IssuedCardDisabledStyle issued_card_disabled_style;
    public final boolean issued_cards_enabled;
    public final int max_credit_prompts;
    public final boolean nfc_card_linking_enabled;
    public final boolean physical_issued_cards_enabled;

    public InstrumentLinkingConfig(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, int i, boolean z2, boolean z3, boolean z4, InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle, boolean z5, boolean z6, BankAccountLinkingConfig bankAccountLinkingConfig) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        issuedCardDisabledStyle.getClass();
        this.header_no_instrument_linked = str;
        this.description_no_instrument_linked = str2;
        this.header_bank_account_linked = str3;
        this.description_bank_account_linked = str4;
        this.header_no_instrument_linked_personal = str5;
        this.description_no_instrument_linked_personal = str6;
        this.credit_card_fee_bps = j;
        this.credit_card_linking_enabled = z;
        this.max_credit_prompts = i;
        this.cash_balance_enabled = z2;
        this.issued_cards_enabled = z3;
        this.bankbook_enabled = z4;
        this.issued_card_disabled_style = issuedCardDisabledStyle;
        this.physical_issued_cards_enabled = z5;
        this.nfc_card_linking_enabled = z6;
        this.bank_account_linking_config = bankAccountLinkingConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingConfig)) {
            return false;
        }
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        return Intrinsics.areEqual(this.header_no_instrument_linked, instrumentLinkingConfig.header_no_instrument_linked) && Intrinsics.areEqual(this.description_no_instrument_linked, instrumentLinkingConfig.description_no_instrument_linked) && Intrinsics.areEqual(this.header_bank_account_linked, instrumentLinkingConfig.header_bank_account_linked) && Intrinsics.areEqual(this.description_bank_account_linked, instrumentLinkingConfig.description_bank_account_linked) && Intrinsics.areEqual(this.header_no_instrument_linked_personal, instrumentLinkingConfig.header_no_instrument_linked_personal) && Intrinsics.areEqual(this.description_no_instrument_linked_personal, instrumentLinkingConfig.description_no_instrument_linked_personal) && this.credit_card_fee_bps == instrumentLinkingConfig.credit_card_fee_bps && this.credit_card_linking_enabled == instrumentLinkingConfig.credit_card_linking_enabled && this.max_credit_prompts == instrumentLinkingConfig.max_credit_prompts && this.cash_balance_enabled == instrumentLinkingConfig.cash_balance_enabled && this.issued_cards_enabled == instrumentLinkingConfig.issued_cards_enabled && this.bankbook_enabled == instrumentLinkingConfig.bankbook_enabled && this.issued_card_disabled_style == instrumentLinkingConfig.issued_card_disabled_style && this.physical_issued_cards_enabled == instrumentLinkingConfig.physical_issued_cards_enabled && this.nfc_card_linking_enabled == instrumentLinkingConfig.nfc_card_linking_enabled && Intrinsics.areEqual(this.bank_account_linking_config, instrumentLinkingConfig.bank_account_linking_config);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.issued_card_disabled_style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.max_credit_prompts, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header_no_instrument_linked.hashCode() * 31, 31, this.description_no_instrument_linked), 31, this.header_bank_account_linked), 31, this.description_bank_account_linked), 31, this.header_no_instrument_linked_personal), 31, this.description_no_instrument_linked_personal), 31, this.credit_card_fee_bps), 31, this.credit_card_linking_enabled), 31), 31, this.cash_balance_enabled), 31, this.issued_cards_enabled), 31, this.bankbook_enabled)) * 31, 31, this.physical_issued_cards_enabled), 31, this.nfc_card_linking_enabled);
        BankAccountLinkingConfig bankAccountLinkingConfig = this.bank_account_linking_config;
        return m + (bankAccountLinkingConfig == null ? 0 : bankAccountLinkingConfig.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentLinkingConfig(header_no_instrument_linked=", this.header_no_instrument_linked, ", description_no_instrument_linked=", this.description_no_instrument_linked, ", header_bank_account_linked=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.header_bank_account_linked, ", description_bank_account_linked=", this.description_bank_account_linked, ", header_no_instrument_linked_personal=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.header_no_instrument_linked_personal, ", description_no_instrument_linked_personal=", this.description_no_instrument_linked_personal, ", credit_card_fee_bps=");
        m.append(this.credit_card_fee_bps);
        m.append(", credit_card_linking_enabled=");
        m.append(this.credit_card_linking_enabled);
        m.append(", max_credit_prompts=");
        m.append(this.max_credit_prompts);
        m.append(", cash_balance_enabled=");
        m.append(this.cash_balance_enabled);
        m.append(", issued_cards_enabled=");
        m.append(this.issued_cards_enabled);
        m.append(", bankbook_enabled=");
        m.append(this.bankbook_enabled);
        m.append(", issued_card_disabled_style=");
        m.append(this.issued_card_disabled_style);
        m.append(", physical_issued_cards_enabled=");
        m.append(this.physical_issued_cards_enabled);
        m.append(", nfc_card_linking_enabled=");
        m.append(this.nfc_card_linking_enabled);
        m.append(", bank_account_linking_config=");
        m.append(this.bank_account_linking_config);
        m.append(")");
        return m.toString();
    }
}
