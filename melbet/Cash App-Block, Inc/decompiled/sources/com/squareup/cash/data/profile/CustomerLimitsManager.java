package com.squareup.cash.data.profile;

import com.squareup.cash.db2.profile.Effective_limits;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public interface CustomerLimitsManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long EXPIRATION_TIME;

        static {
            Duration.Companion companion = Duration.Companion;
            EXPIRATION_TIME = DurationKt.toDuration(5, DurationUnit.MINUTES);
        }
    }

    /* loaded from: classes5.dex */
    public final class TransactionLimit {
        public final Effective_limits customerLimit;
        public final Money maxTransactionAmount;

        public TransactionLimit(Effective_limits effective_limits, Money money) {
            money.getClass();
            this.customerLimit = effective_limits;
            this.maxTransactionAmount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionLimit)) {
                return false;
            }
            TransactionLimit transactionLimit = (TransactionLimit) obj;
            return Intrinsics.areEqual(this.customerLimit, transactionLimit.customerLimit) && Intrinsics.areEqual(this.maxTransactionAmount, transactionLimit.maxTransactionAmount);
        }

        public final int hashCode() {
            Effective_limits effective_limits = this.customerLimit;
            return this.maxTransactionAmount.hashCode() + ((effective_limits == null ? 0 : effective_limits.hashCode()) * 31);
        }

        public final String toString() {
            return "TransactionLimit(customerLimit=" + this.customerLimit + ", maxTransactionAmount=" + this.maxTransactionAmount + ")";
        }
    }
}
