package com.squareup.cash.db2.activity;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.InvestmentOrderType;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.RollupType;
import com.squareup.protos.franklin.ui.TransactionType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashActivity {
    public final long _id;
    public final Long amount;
    public final CurrencyCode amount_currency;
    public final String associated_payment_token;
    public final boolean can_accept_payments;
    public final long display_date;
    public final String display_name;
    public final String email;
    public final String gifted_investment_entity_token;
    public final InvestmentOrderType investment_order_type;
    public final boolean isRegular;
    public final boolean is_badged;
    public final boolean is_bitcoin;
    public final boolean is_business;
    public final boolean is_cash_customer;
    public final boolean is_hidden;
    public final boolean is_outstanding;
    public final boolean is_scheduled;
    public final String lending_loan_token;
    public final String lookup_key;
    public final boolean loyalty_activity;
    public final String loyalty_render_data;
    public final MerchantData merchant_data;
    public final Orientation orientation;
    public final String payment_render_data;
    public final String payment_type;
    public final Image photo;
    public final String receipt_render_data;
    public final String recipient_render_data;
    public final Role role;
    public final RollupType rollup_type;
    public final Long scheduled_for;
    public final String scheduled_payment_token;
    public final String sender_render_data;
    public final String sms;
    public final PaymentState state;
    public final Long sync_entity_version;
    public final String their_id;
    public final Color themed_accent_color;
    public final String threaded_customer_id;
    public final String token;
    public final TransactionType transaction_type;

    public CashActivity(String str, boolean z, long j, String str2, String str3, String str4, String str5, String str6, PaymentState paymentState, Role role, Long l, CurrencyCode currencyCode, boolean z2, boolean z3, boolean z4, Long l2, String str7, Image image, Color color, String str8, String str9, MerchantData merchantData, String str10, String str11, String str12, boolean z5, boolean z6, boolean z7, long j2, String str13, RollupType rollupType, InvestmentOrderType investmentOrderType, String str14, String str15, String str16, String str17, Long l3, boolean z8, boolean z9, boolean z10, Orientation orientation, TransactionType transactionType) {
        this.their_id = str;
        this.is_outstanding = z;
        this._id = j;
        this.token = str2;
        this.payment_render_data = str3;
        this.sender_render_data = str4;
        this.recipient_render_data = str5;
        this.loyalty_render_data = str6;
        this.state = paymentState;
        this.role = role;
        this.amount = l;
        this.amount_currency = currencyCode;
        this.is_badged = z2;
        this.is_bitcoin = z3;
        this.is_scheduled = z4;
        this.scheduled_for = l2;
        this.scheduled_payment_token = str7;
        this.photo = image;
        this.themed_accent_color = color;
        this.lookup_key = str8;
        this.display_name = str9;
        this.merchant_data = merchantData;
        this.email = str10;
        this.sms = str11;
        this.threaded_customer_id = str12;
        this.is_cash_customer = z5;
        this.can_accept_payments = z6;
        this.is_business = z7;
        this.display_date = j2;
        this.receipt_render_data = str13;
        this.rollup_type = rollupType;
        this.investment_order_type = investmentOrderType;
        this.payment_type = str14;
        this.gifted_investment_entity_token = str15;
        this.lending_loan_token = str16;
        this.associated_payment_token = str17;
        this.sync_entity_version = l3;
        this.loyalty_activity = z8;
        this.isRegular = z9;
        this.is_hidden = z10;
        this.orientation = orientation;
        this.transaction_type = transactionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashActivity)) {
            return false;
        }
        CashActivity cashActivity = (CashActivity) obj;
        return this.their_id.equals(cashActivity.their_id) && this.is_outstanding == cashActivity.is_outstanding && this._id == cashActivity._id && this.token.equals(cashActivity.token) && this.payment_render_data.equals(cashActivity.payment_render_data) && this.sender_render_data.equals(cashActivity.sender_render_data) && this.recipient_render_data.equals(cashActivity.recipient_render_data) && Intrinsics.areEqual(this.loyalty_render_data, cashActivity.loyalty_render_data) && this.state == cashActivity.state && this.role == cashActivity.role && Intrinsics.areEqual(this.amount, cashActivity.amount) && this.amount_currency == cashActivity.amount_currency && this.is_badged == cashActivity.is_badged && this.is_bitcoin == cashActivity.is_bitcoin && this.is_scheduled == cashActivity.is_scheduled && Intrinsics.areEqual(this.scheduled_for, cashActivity.scheduled_for) && Intrinsics.areEqual(this.scheduled_payment_token, cashActivity.scheduled_payment_token) && Intrinsics.areEqual(this.photo, cashActivity.photo) && Intrinsics.areEqual(this.themed_accent_color, cashActivity.themed_accent_color) && Intrinsics.areEqual(this.lookup_key, cashActivity.lookup_key) && Intrinsics.areEqual(this.display_name, cashActivity.display_name) && Intrinsics.areEqual(this.merchant_data, cashActivity.merchant_data) && Intrinsics.areEqual(this.email, cashActivity.email) && Intrinsics.areEqual(this.sms, cashActivity.sms) && Intrinsics.areEqual(this.threaded_customer_id, cashActivity.threaded_customer_id) && this.is_cash_customer == cashActivity.is_cash_customer && this.can_accept_payments == cashActivity.can_accept_payments && this.is_business == cashActivity.is_business && this.display_date == cashActivity.display_date && Intrinsics.areEqual(this.receipt_render_data, cashActivity.receipt_render_data) && this.rollup_type == cashActivity.rollup_type && this.investment_order_type == cashActivity.investment_order_type && Intrinsics.areEqual(this.payment_type, cashActivity.payment_type) && Intrinsics.areEqual(this.gifted_investment_entity_token, cashActivity.gifted_investment_entity_token) && Intrinsics.areEqual(this.lending_loan_token, cashActivity.lending_loan_token) && Intrinsics.areEqual(this.associated_payment_token, cashActivity.associated_payment_token) && Intrinsics.areEqual(this.sync_entity_version, cashActivity.sync_entity_version) && this.loyalty_activity == cashActivity.loyalty_activity && this.isRegular == cashActivity.isRegular && this.is_hidden == cashActivity.is_hidden && this.orientation == cashActivity.orientation && this.transaction_type == cashActivity.transaction_type;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getLookup_key() {
        return this.lookup_key;
    }

    public final MerchantData getMerchant_data() {
        return this.merchant_data;
    }

    public final Image getPhoto() {
        return this.photo;
    }

    public final String getSms() {
        return this.sms;
    }

    public final String getTheir_id() {
        return this.their_id;
    }

    public final Color getThemed_accent_color() {
        return this.themed_accent_color;
    }

    public final String getThreaded_customer_id() {
        return this.threaded_customer_id;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.their_id.hashCode() * 31, 31, this.is_outstanding), 31, this._id), 31, this.token), 31, this.payment_render_data), 31, this.sender_render_data), 31, this.recipient_render_data);
        String str = this.loyalty_render_data;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        PaymentState paymentState = this.state;
        int hashCode2 = (hashCode + (paymentState == null ? 0 : paymentState.hashCode())) * 31;
        Role role = this.role;
        int hashCode3 = (hashCode2 + (role == null ? 0 : role.hashCode())) * 31;
        Long l = this.amount;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        CurrencyCode currencyCode = this.amount_currency;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31, 31, this.is_badged), 31, this.is_bitcoin), 31, this.is_scheduled);
        Long l2 = this.scheduled_for;
        int hashCode5 = (m2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.scheduled_payment_token;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.photo;
        int hashCode7 = (hashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.themed_accent_color;
        int hashCode8 = (hashCode7 + (color == null ? 0 : color.hashCode())) * 31;
        String str3 = this.lookup_key;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.display_name;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MerchantData merchantData = this.merchant_data;
        int hashCode11 = (hashCode10 + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        String str5 = this.email;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sms;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.threaded_customer_id;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.is_cash_customer), 31, this.can_accept_payments), 31, this.is_business), 31, this.display_date);
        String str8 = this.receipt_render_data;
        int hashCode14 = (m3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        RollupType rollupType = this.rollup_type;
        int hashCode15 = (hashCode14 + (rollupType == null ? 0 : rollupType.hashCode())) * 31;
        InvestmentOrderType investmentOrderType = this.investment_order_type;
        int hashCode16 = (hashCode15 + (investmentOrderType == null ? 0 : investmentOrderType.hashCode())) * 31;
        String str9 = this.payment_type;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.gifted_investment_entity_token;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lending_loan_token;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.associated_payment_token;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l3 = this.sync_entity_version;
        int hashCode21 = (this.orientation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode20 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.loyalty_activity), 31, this.isRegular), 31, this.is_hidden)) * 31;
        TransactionType transactionType = this.transaction_type;
        return hashCode21 + (transactionType != null ? transactionType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("CashActivity(their_id=", this.their_id, ", is_outstanding=", ", _id=", this.is_outstanding);
        Fragment$5$$ExternalSyntheticOutline0.m(this._id, ", token=", this.token, m1540m);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, ", payment_render_data=", this.payment_render_data, ", sender_render_data=", this.sender_render_data);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, ", recipient_render_data=", this.recipient_render_data, ", loyalty_render_data=", this.loyalty_render_data);
        m1540m.append(", state=");
        m1540m.append(this.state);
        m1540m.append(", role=");
        m1540m.append(this.role);
        m1540m.append(", amount=");
        m1540m.append(this.amount);
        m1540m.append(", amount_currency=");
        m1540m.append(this.amount_currency);
        m1540m.append(", is_badged=");
        m1540m.append(this.is_badged);
        m1540m.append(", is_bitcoin=");
        m1540m.append(this.is_bitcoin);
        m1540m.append(", is_scheduled=");
        m1540m.append(this.is_scheduled);
        m1540m.append(", scheduled_for=");
        m1540m.append(this.scheduled_for);
        m1540m.append(", scheduled_payment_token=");
        m1540m.append(this.scheduled_payment_token);
        m1540m.append(", photo=");
        m1540m.append(this.photo);
        m1540m.append(", themed_accent_color=");
        m1540m.append(this.themed_accent_color);
        m1540m.append(", lookup_key=");
        m1540m.append(this.lookup_key);
        m1540m.append(", display_name=");
        m1540m.append(this.display_name);
        m1540m.append(", merchant_data=");
        m1540m.append(this.merchant_data);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, ", email=", this.email, ", sms=", this.sms);
        m1540m.append(", threaded_customer_id=");
        m1540m.append(this.threaded_customer_id);
        m1540m.append(", is_cash_customer=");
        m1540m.append(this.is_cash_customer);
        m1540m.append(", can_accept_payments=");
        m1540m.append(this.can_accept_payments);
        m1540m.append(", is_business=");
        m1540m.append(this.is_business);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.display_date, ", display_date=", ", receipt_render_data=", m1540m);
        m1540m.append(this.receipt_render_data);
        m1540m.append(", rollup_type=");
        m1540m.append(this.rollup_type);
        m1540m.append(", investment_order_type=");
        m1540m.append(this.investment_order_type);
        m1540m.append(", payment_type=");
        m1540m.append(this.payment_type);
        m1540m.append(", gifted_investment_entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.gifted_investment_entity_token, ", lending_loan_token=", this.lending_loan_token, ", associated_payment_token=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.sync_entity_version, this.associated_payment_token, ", sync_entity_version=", ", loyalty_activity=", m1540m);
        re$$ExternalSyntheticOutline0.m(m1540m, this.loyalty_activity, ", isRegular=", this.isRegular, ", is_hidden=");
        m1540m.append(this.is_hidden);
        m1540m.append(", orientation=");
        m1540m.append(this.orientation);
        m1540m.append(", transaction_type=");
        m1540m.append(this.transaction_type);
        m1540m.append(")");
        return m1540m.toString();
    }
}
