package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TokenInfo {
    public final String modelName;
    public final Integer tokenLimit;
    public final Integer tokenUsage;

    public TokenInfo(String str, Integer num, Integer num2) {
        this.modelName = str;
        this.tokenLimit = num;
        this.tokenUsage = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) obj;
        return Intrinsics.areEqual(this.modelName, tokenInfo.modelName) && Intrinsics.areEqual(this.tokenLimit, tokenInfo.tokenLimit) && Intrinsics.areEqual(this.tokenUsage, tokenInfo.tokenUsage);
    }

    public final int hashCode() {
        String str = this.modelName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.tokenLimit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tokenUsage;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.tokenLimit, "TokenInfo(modelName=", this.modelName, ", tokenLimit=", ", tokenUsage="), this.tokenUsage, ")");
    }
}
