package com.squareup.cash.investing.db;

import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TokensToStates {
    public final SyncInvestmentHolding.InvestmentHoldingState state;
    public final String token;

    public TokensToStates(SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, String str) {
        str.getClass();
        investmentHoldingState.getClass();
        this.token = str;
        this.state = investmentHoldingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokensToStates)) {
            return false;
        }
        TokensToStates tokensToStates = (TokensToStates) obj;
        return Intrinsics.areEqual(this.token, tokensToStates.token) && this.state == tokensToStates.state;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "TokensToStates(token=" + this.token + ", state=" + this.state + ")";
    }
}
