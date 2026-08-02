package com.squareup.cash.investing.backend.api.data;

import com.squareup.cash.investing.primitives.FilterToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterGroup {
    public final String name;
    public final String namePlural;
    public final FilterToken token;

    public FilterGroup(FilterToken filterToken, String str, String str2) {
        filterToken.getClass();
        str.getClass();
        this.token = filterToken;
        this.name = str;
        this.namePlural = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGroup)) {
            return false;
        }
        FilterGroup filterGroup = (FilterGroup) obj;
        return Intrinsics.areEqual(this.token, filterGroup.token) && Intrinsics.areEqual(this.name, filterGroup.name) && Intrinsics.areEqual(this.namePlural, filterGroup.namePlural);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.value.hashCode() * 31, 31, this.name);
        String str = this.namePlural;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterGroup(token=");
        sb.append(this.token);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", namePlural=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.namePlural, ")");
    }
}
