package com.squareup.cash.db2;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TreehouseAppConfig {
    public final String app_name;
    public final String minimal_commit_timestamp;
    public final String path;
    public final String url;

    public TreehouseAppConfig(String str, String str2, String str3, String str4) {
        this.app_name = str;
        this.path = str2;
        this.url = str3;
        this.minimal_commit_timestamp = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreehouseAppConfig)) {
            return false;
        }
        TreehouseAppConfig treehouseAppConfig = (TreehouseAppConfig) obj;
        return Intrinsics.areEqual(this.app_name, treehouseAppConfig.app_name) && Intrinsics.areEqual(this.path, treehouseAppConfig.path) && Intrinsics.areEqual(this.url, treehouseAppConfig.url) && Intrinsics.areEqual(this.minimal_commit_timestamp, treehouseAppConfig.minimal_commit_timestamp);
    }

    public final int hashCode() {
        String str = this.app_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minimal_commit_timestamp;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TreehouseAppConfig(app_name=", this.app_name, ", path=", this.path, ", url="), this.url, ", minimal_commit_timestamp=", this.minimal_commit_timestamp, ")");
    }
}
