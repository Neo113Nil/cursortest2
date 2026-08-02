package com.squareup.cash.db2.profile;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LimitedAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Effective_limits {
    public final Money limit_amount;
    public final String limit_exceeded_message;
    public final LimitedAction limited_action;

    public Effective_limits(LimitedAction limitedAction, Money money, String str) {
        limitedAction.getClass();
        money.getClass();
        this.limited_action = limitedAction;
        this.limit_amount = money;
        this.limit_exceeded_message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effective_limits)) {
            return false;
        }
        Effective_limits effective_limits = (Effective_limits) obj;
        return this.limited_action == effective_limits.limited_action && Intrinsics.areEqual(this.limit_amount, effective_limits.limit_amount) && Intrinsics.areEqual(this.limit_exceeded_message, effective_limits.limit_exceeded_message);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.limit_amount, this.limited_action.hashCode() * 31, 31);
        String str = this.limit_exceeded_message;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Effective_limits(limited_action=");
        sb.append(this.limited_action);
        sb.append(", limit_amount=");
        sb.append(this.limit_amount);
        sb.append(", limit_exceeded_message=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.limit_exceeded_message, ")");
    }
}
