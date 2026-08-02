package com.squareup.cash.db2.profile;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositAccount {
    public final String account_number_prefix;
    public final Boolean display_complete_account_number;
    public final String explanation_text;
    public final boolean is_placeholder;
    public final String routing_number;
    public final String support_node_token;

    public DirectDepositAccount(String str, String str2, boolean z, String str3, Boolean bool, String str4) {
        str.getClass();
        str2.getClass();
        this.routing_number = str;
        this.account_number_prefix = str2;
        this.is_placeholder = z;
        this.explanation_text = str3;
        this.display_complete_account_number = bool;
        this.support_node_token = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositAccount)) {
            return false;
        }
        DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
        return Intrinsics.areEqual(this.routing_number, directDepositAccount.routing_number) && Intrinsics.areEqual(this.account_number_prefix, directDepositAccount.account_number_prefix) && this.is_placeholder == directDepositAccount.is_placeholder && Intrinsics.areEqual(this.explanation_text, directDepositAccount.explanation_text) && Intrinsics.areEqual(this.display_complete_account_number, directDepositAccount.display_complete_account_number) && Intrinsics.areEqual(this.support_node_token, directDepositAccount.support_node_token);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.routing_number.hashCode() * 31, 31, this.account_number_prefix), 31, this.is_placeholder);
        String str = this.explanation_text;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.display_complete_account_number;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.support_node_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DirectDepositAccount(routing_number=", this.routing_number, ", account_number_prefix=", this.account_number_prefix, ", is_placeholder=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.is_placeholder, ", explanation_text=", this.explanation_text, ", display_complete_account_number=");
        m.append(this.display_complete_account_number);
        m.append(", support_node_token=");
        m.append(this.support_node_token);
        m.append(")");
        return m.toString();
    }
}
