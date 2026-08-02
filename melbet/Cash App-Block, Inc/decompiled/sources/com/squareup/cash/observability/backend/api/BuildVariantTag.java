package com.squareup.cash.observability.backend.api;

/* loaded from: classes4.dex */
public enum BuildVariantTag {
    StagingDebug("staging-debug"),
    ProductionInternal("production-internal"),
    ProductionRelease("production-release");

    public final String unifiedName;

    BuildVariantTag(String str) {
        this.unifiedName = str;
    }
}
