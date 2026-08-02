package com.squareup.cash.boost.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class UserRewardsData {
    public final boolean has_recently_used_boost;
    public final boolean new_to_boost;
    public final Money ytd_total_saving;

    public UserRewardsData(boolean z, boolean z2, Money money) {
        this.new_to_boost = z;
        this.has_recently_used_boost = z2;
        this.ytd_total_saving = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRewardsData)) {
            return false;
        }
        UserRewardsData userRewardsData = (UserRewardsData) obj;
        return this.new_to_boost == userRewardsData.new_to_boost && this.has_recently_used_boost == userRewardsData.has_recently_used_boost && Intrinsics.areEqual(this.ytd_total_saving, userRewardsData.ytd_total_saving);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.new_to_boost) * 31, 31, this.has_recently_used_boost);
        Money money = this.ytd_total_saving;
        return m + (money == null ? 0 : money.hashCode());
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("UserRewardsData(new_to_boost=", ", has_recently_used_boost=", ", ytd_total_saving=", this.new_to_boost, this.has_recently_used_boost);
        m.append(this.ytd_total_saving);
        m.append(")");
        return m.toString();
    }
}
