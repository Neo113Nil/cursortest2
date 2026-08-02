package com.squareup.cash.localization.db;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocalizationConfig {
    public final com.squareup.protos.franklin.common.LocalizationConfig config;

    public LocalizationConfig(com.squareup.protos.franklin.common.LocalizationConfig localizationConfig) {
        this.config = localizationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalizationConfig) && Intrinsics.areEqual(this.config, ((LocalizationConfig) obj).config);
    }

    public final com.squareup.protos.franklin.common.LocalizationConfig getConfig() {
        return this.config;
    }

    public final int hashCode() {
        com.squareup.protos.franklin.common.LocalizationConfig localizationConfig = this.config;
        if (localizationConfig == null) {
            return 0;
        }
        return localizationConfig.hashCode();
    }

    public final String toString() {
        return "LocalizationConfig(config=" + this.config + ")";
    }
}
