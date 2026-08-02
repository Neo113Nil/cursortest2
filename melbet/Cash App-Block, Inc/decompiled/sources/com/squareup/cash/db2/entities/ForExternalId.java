package com.squareup.cash.db2.entities;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ForExternalId {
    public final Long amount;
    public final CurrencyCode amount_currency;
    public final Money boost_amount;
    public final String lending_loan_token;
    public final String loyalty_render_data;
    public final Orientation orientation;
    public final String payment_render_data;
    public final String receipt_render_data;
    public final String recipient_render_data;
    public final Role role;
    public final String sender_render_data;
    public final String their_id;
    public final String token;

    public ForExternalId(String str, Long l, CurrencyCode currencyCode, String str2, Role role, Orientation orientation, String str3, String str4, String str5, String str6, String str7, Money money, String str8) {
        str2.getClass();
        orientation.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.token = str;
        this.amount = l;
        this.amount_currency = currencyCode;
        this.their_id = str2;
        this.role = role;
        this.orientation = orientation;
        this.payment_render_data = str3;
        this.sender_render_data = str4;
        this.recipient_render_data = str5;
        this.receipt_render_data = str6;
        this.loyalty_render_data = str7;
        this.boost_amount = money;
        this.lending_loan_token = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForExternalId)) {
            return false;
        }
        ForExternalId forExternalId = (ForExternalId) obj;
        return this.token.equals(forExternalId.token) && Intrinsics.areEqual(this.amount, forExternalId.amount) && this.amount_currency == forExternalId.amount_currency && Intrinsics.areEqual(this.their_id, forExternalId.their_id) && this.role == forExternalId.role && this.orientation == forExternalId.orientation && Intrinsics.areEqual(this.payment_render_data, forExternalId.payment_render_data) && Intrinsics.areEqual(this.sender_render_data, forExternalId.sender_render_data) && Intrinsics.areEqual(this.recipient_render_data, forExternalId.recipient_render_data) && Intrinsics.areEqual(this.receipt_render_data, forExternalId.receipt_render_data) && Intrinsics.areEqual(this.loyalty_render_data, forExternalId.loyalty_render_data) && Intrinsics.areEqual(this.boost_amount, forExternalId.boost_amount) && Intrinsics.areEqual(this.lending_loan_token, forExternalId.lending_loan_token);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        CurrencyCode currencyCode = this.amount_currency;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31, 31, this.their_id);
        Role role = this.role;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orientation.hashCode() + ((m + (role == null ? 0 : role.hashCode())) * 31)) * 31, 31, this.payment_render_data), 31, this.sender_render_data), 31, this.recipient_render_data);
        String str = this.receipt_render_data;
        int hashCode3 = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.loyalty_render_data;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money = this.boost_amount;
        int hashCode5 = (hashCode4 + (money == null ? 0 : money.hashCode())) * 31;
        String str3 = this.lending_loan_token;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.amount, "ForExternalId(token=", this.token, ", amount=", ", amount_currency=");
        m.append(this.amount_currency);
        m.append(", their_id=");
        m.append(this.their_id);
        m.append(", role=");
        m.append(this.role);
        m.append(", orientation=");
        m.append(this.orientation);
        m.append(", payment_render_data=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.payment_render_data, ", sender_render_data=", this.sender_render_data, ", recipient_render_data=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.recipient_render_data, ", receipt_render_data=", this.receipt_render_data, ", loyalty_render_data=");
        m.append(this.loyalty_render_data);
        m.append(", boost_amount=");
        m.append(this.boost_amount);
        m.append(", lending_loan_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.lending_loan_token, ")");
    }
}
