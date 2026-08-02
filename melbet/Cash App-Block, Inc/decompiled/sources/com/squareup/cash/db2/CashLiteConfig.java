package com.squareup.cash.db2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashLiteConfig {
    public final com.squareup.protos.franklin.app.CashLiteConfig config;

    public CashLiteConfig(com.squareup.protos.franklin.app.CashLiteConfig cashLiteConfig) {
        this.config = cashLiteConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashLiteConfig) && Intrinsics.areEqual(this.config, ((CashLiteConfig) obj).config);
    }

    public final int hashCode() {
        com.squareup.protos.franklin.app.CashLiteConfig cashLiteConfig = this.config;
        if (cashLiteConfig == null) {
            return 0;
        }
        return cashLiteConfig.hashCode();
    }

    public final String toString() {
        return "CashLiteConfig(config=" + this.config + ")";
    }
}
