package com.squareup.cash.crypto.backend.autoinvest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoAutoInvest {
    public final Money amount;
    public final long nextReloadAt;
    public final String recurringId;
    public final RecurringSchedule schedule;

    public CryptoAutoInvest(String str, Money money, long j, RecurringSchedule recurringSchedule) {
        str.getClass();
        money.getClass();
        recurringSchedule.getClass();
        this.recurringId = str;
        this.amount = money;
        this.nextReloadAt = j;
        this.schedule = recurringSchedule;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoAutoInvest)) {
            return false;
        }
        CryptoAutoInvest cryptoAutoInvest = (CryptoAutoInvest) obj;
        return Intrinsics.areEqual(this.recurringId, cryptoAutoInvest.recurringId) && Intrinsics.areEqual(this.amount, cryptoAutoInvest.amount) && this.nextReloadAt == cryptoAutoInvest.nextReloadAt && Intrinsics.areEqual(this.schedule, cryptoAutoInvest.schedule);
    }

    public final int hashCode() {
        return this.schedule.hashCode() + Recorder$$ExternalSyntheticOutline2.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, this.recurringId.hashCode() * 31, 31), 31, this.nextReloadAt);
    }

    public final String toString() {
        return "CryptoAutoInvest(recurringId=" + RecurringPreferenceId.m3732toStringimpl(this.recurringId) + ", amount=" + this.amount + ", nextReloadAt=" + this.nextReloadAt + ", schedule=" + this.schedule + ")";
    }
}
