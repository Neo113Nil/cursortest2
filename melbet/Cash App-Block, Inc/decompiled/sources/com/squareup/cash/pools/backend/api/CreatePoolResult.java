package com.squareup.cash.pools.backend.api;

import com.squareup.protos.cash.pools.MoneyPool;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CreatePoolResult {

    public final class Success implements CreatePoolResult {
        public final MoneyPool pool;

        public Success(MoneyPool moneyPool) {
            moneyPool.getClass();
            this.pool = moneyPool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.pool, ((Success) obj).pool);
        }

        public final int hashCode() {
            return this.pool.hashCode();
        }

        public final String toString() {
            return "Success(pool=" + this.pool + ")";
        }
    }

    public final class Error implements CreatePoolResult {
        public final CreatePoolFailureReason reason;

        public /* synthetic */ Error() {
            this(CreatePoolFailureReason.GENERIC);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.reason == ((Error) obj).reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "Error(reason=" + this.reason + ")";
        }

        public Error(CreatePoolFailureReason createPoolFailureReason) {
            this.reason = createPoolFailureReason;
        }
    }
}
