package com.squareup.cash.genericelements.presenters.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericTreeElementsAnalyticsData {
    public final Map genericCDFEventParameters;
    public final String queryToken;
    public final String referrerFlowToken;

    public GenericTreeElementsAnalyticsData(int i, String str, String str2, Map map) {
        map = (i & 1) != 0 ? null : map;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.genericCDFEventParameters = map;
        this.referrerFlowToken = str;
        this.queryToken = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericTreeElementsAnalyticsData)) {
            return false;
        }
        GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData = (GenericTreeElementsAnalyticsData) obj;
        return Intrinsics.areEqual(this.genericCDFEventParameters, genericTreeElementsAnalyticsData.genericCDFEventParameters) && Intrinsics.areEqual(this.referrerFlowToken, genericTreeElementsAnalyticsData.referrerFlowToken) && Intrinsics.areEqual(this.queryToken, genericTreeElementsAnalyticsData.queryToken);
    }

    public final int hashCode() {
        Map map = this.genericCDFEventParameters;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.referrerFlowToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.queryToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericTreeElementsAnalyticsData(genericCDFEventParameters=");
        sb.append(this.genericCDFEventParameters);
        sb.append(", referrerFlowToken=");
        sb.append(this.referrerFlowToken);
        sb.append(", queryToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.queryToken, ")");
    }
}
