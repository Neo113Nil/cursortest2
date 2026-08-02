package com.squareup.cash.db2;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptocurrencyConfig {
    public final String btc_welcome_message;
    public final String dismiss_button_text;
    public final String learn_about_btc_button_text;
    public final String learn_about_btc_url;
    public final Long minimum_withdrawal_limit_sats;

    public CryptocurrencyConfig(Long l, String str, String str2, String str3, String str4) {
        this.btc_welcome_message = str;
        this.learn_about_btc_button_text = str2;
        this.learn_about_btc_url = str3;
        this.dismiss_button_text = str4;
        this.minimum_withdrawal_limit_sats = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptocurrencyConfig)) {
            return false;
        }
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        return Intrinsics.areEqual(this.btc_welcome_message, cryptocurrencyConfig.btc_welcome_message) && Intrinsics.areEqual(this.learn_about_btc_button_text, cryptocurrencyConfig.learn_about_btc_button_text) && Intrinsics.areEqual(this.learn_about_btc_url, cryptocurrencyConfig.learn_about_btc_url) && Intrinsics.areEqual(this.dismiss_button_text, cryptocurrencyConfig.dismiss_button_text) && Intrinsics.areEqual(this.minimum_withdrawal_limit_sats, cryptocurrencyConfig.minimum_withdrawal_limit_sats);
    }

    public final int hashCode() {
        String str = this.btc_welcome_message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.learn_about_btc_button_text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.learn_about_btc_url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dismiss_button_text;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.minimum_withdrawal_limit_sats;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CryptocurrencyConfig(btc_welcome_message=", this.btc_welcome_message, ", learn_about_btc_button_text=", this.learn_about_btc_button_text, ", learn_about_btc_url=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.learn_about_btc_url, ", dismiss_button_text=", this.dismiss_button_text, ", minimum_withdrawal_limit_sats=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.minimum_withdrawal_limit_sats, ")");
    }
}
