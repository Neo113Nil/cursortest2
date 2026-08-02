package com.squareup.cash.pools.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.moshi.JsonClass;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/pools/backend/api/PoolsAppletData;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PoolsAppletData {
    public final int activePoolsCount;
    public final int closedPoolsCount;
    public final CurrencyCode currencyCode;
    public final List highlightedPools;

    public PoolsAppletData(int i, int i2, CurrencyCode currencyCode, List list) {
        currencyCode.getClass();
        list.getClass();
        this.activePoolsCount = i;
        this.closedPoolsCount = i2;
        this.currencyCode = currencyCode;
        this.highlightedPools = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolsAppletData)) {
            return false;
        }
        PoolsAppletData poolsAppletData = (PoolsAppletData) obj;
        return this.activePoolsCount == poolsAppletData.activePoolsCount && this.closedPoolsCount == poolsAppletData.closedPoolsCount && this.currencyCode == poolsAppletData.currencyCode && Intrinsics.areEqual(this.highlightedPools, poolsAppletData.highlightedPools);
    }

    public final int hashCode() {
        return this.highlightedPools.hashCode() + ((this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.closedPoolsCount, Integer.hashCode(this.activePoolsCount) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.activePoolsCount, this.closedPoolsCount, "PoolsAppletData(activePoolsCount=", ", closedPoolsCount=", ", currencyCode=");
        m107m.append(this.currencyCode);
        m107m.append(", highlightedPools=");
        m107m.append(this.highlightedPools);
        m107m.append(")");
        return m107m.toString();
    }
}
