package com.squareup.cash.savings.viewmodels;

import androidx.core.view.ViewGroupKt;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance {
    public final ViewGroupKt action;
    public final String additionalBody;
    public final Amount amount;
    public final HeroNumericsBodyTextViewModel body;
    public final String sectionTitleText;

    public final class Amount {
        public final String label;
        public final long rawValue;

        public Amount(String str, long j) {
            str.getClass();
            this.label = str;
            this.rawValue = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.label, amount.label) && this.rawValue == amount.rawValue;
        }

        public final int hashCode() {
            return Long.hashCode(this.rawValue) + (this.label.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Amount(label=", this.label, ", rawValue=", this.rawValue);
            m.append(")");
            return m.toString();
        }
    }

    public SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance(Amount amount, HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel, String str, ViewGroupKt viewGroupKt, String str2) {
        this.amount = amount;
        this.body = heroNumericsBodyTextViewModel;
        this.additionalBody = str;
        this.action = viewGroupKt;
        this.sectionTitleText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance)) {
            return false;
        }
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance) obj;
        return this.amount.equals(savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.amount) && Intrinsics.areEqual(this.body, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.body) && Intrinsics.areEqual(this.additionalBody, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.additionalBody) && Intrinsics.areEqual(this.action, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.action) && Intrinsics.areEqual(this.sectionTitleText, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.sectionTitleText);
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel = this.body;
        int hashCode2 = (hashCode + (heroNumericsBodyTextViewModel == null ? 0 : heroNumericsBodyTextViewModel.hashCode())) * 31;
        String str = this.additionalBody;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ViewGroupKt viewGroupKt = this.action;
        int hashCode4 = (hashCode3 + (viewGroupKt == null ? 0 : viewGroupKt.hashCode())) * 31;
        String str2 = this.sectionTitleText;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Balance(amount=");
        sb.append(this.amount);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", additionalBody=");
        sb.append(this.additionalBody);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", sectionTitleText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sectionTitleText, ")");
    }
}
