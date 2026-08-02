package com.squareup.cash.earnings.backend.real;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.earnings.EarningsHomeUIState;

/* loaded from: classes6.dex */
public final class EarningsHomeUiChartState {
    public final boolean hasSeenHomeUiState;
    public final EarningsHomeUIState homeUiState;
    public final boolean shouldShowChart;

    public EarningsHomeUiChartState(EarningsHomeUIState earningsHomeUIState, boolean z, boolean z2) {
        this.homeUiState = earningsHomeUIState;
        this.shouldShowChart = z;
        this.hasSeenHomeUiState = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsHomeUiChartState)) {
            return false;
        }
        EarningsHomeUiChartState earningsHomeUiChartState = (EarningsHomeUiChartState) obj;
        return Intrinsics.areEqual(this.homeUiState, earningsHomeUiChartState.homeUiState) && this.shouldShowChart == earningsHomeUiChartState.shouldShowChart && this.hasSeenHomeUiState == earningsHomeUiChartState.hasSeenHomeUiState;
    }

    public final int hashCode() {
        EarningsHomeUIState earningsHomeUIState = this.homeUiState;
        return Boolean.hashCode(this.hasSeenHomeUiState) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((earningsHomeUIState == null ? 0 : earningsHomeUIState.hashCode()) * 31, 31, this.shouldShowChart);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsHomeUiChartState(homeUiState=");
        sb.append(this.homeUiState);
        sb.append(", shouldShowChart=");
        sb.append(this.shouldShowChart);
        sb.append(", hasSeenHomeUiState=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasSeenHomeUiState, ")");
    }
}
