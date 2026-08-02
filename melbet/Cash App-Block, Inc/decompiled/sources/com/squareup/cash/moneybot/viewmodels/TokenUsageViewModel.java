package com.squareup.cash.moneybot.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TokenUsageViewModel {
    public final String modelName;
    public final String tokenLimit;
    public final String tokenUsage;
    public final float usagePercentage;

    public TokenUsageViewModel(String str, String str2, String str3, float f) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.modelName = str;
        this.tokenUsage = str2;
        this.tokenLimit = str3;
        this.usagePercentage = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenUsageViewModel)) {
            return false;
        }
        TokenUsageViewModel tokenUsageViewModel = (TokenUsageViewModel) obj;
        return Intrinsics.areEqual(this.modelName, tokenUsageViewModel.modelName) && Intrinsics.areEqual(this.tokenUsage, tokenUsageViewModel.tokenUsage) && Intrinsics.areEqual(this.tokenLimit, tokenUsageViewModel.tokenLimit) && Float.compare(this.usagePercentage, tokenUsageViewModel.usagePercentage) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.usagePercentage) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.modelName.hashCode() * 31, 31, this.tokenUsage), 31, this.tokenLimit);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TokenUsageViewModel(modelName=", this.modelName, ", tokenUsage=", this.tokenUsage, ", tokenLimit=");
        m.append(this.tokenLimit);
        m.append(", usagePercentage=");
        m.append(this.usagePercentage);
        m.append(")");
        return m.toString();
    }
}
