package com.squareup.cash.pools.backend.api;

import com.squareup.protos.cash.pools.MoneyPool;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolData {
    public final MoneyPool pool;
    public final Boolean viewerCanLeavePool;

    public PoolData(MoneyPool moneyPool, Boolean bool) {
        this.pool = moneyPool;
        this.viewerCanLeavePool = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolData)) {
            return false;
        }
        PoolData poolData = (PoolData) obj;
        return Intrinsics.areEqual(this.pool, poolData.pool) && Intrinsics.areEqual(this.viewerCanLeavePool, poolData.viewerCanLeavePool);
    }

    public final int hashCode() {
        MoneyPool moneyPool = this.pool;
        int hashCode = (moneyPool == null ? 0 : moneyPool.hashCode()) * 31;
        Boolean bool = this.viewerCanLeavePool;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PoolData(pool=" + this.pool + ", viewerCanLeavePool=" + this.viewerCanLeavePool + ")";
    }
}
