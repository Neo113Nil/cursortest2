package com.appsflyer.internal;

import defpackage.hrg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1bSDK {

    @NotNull
    final String getCurrencyIso4217Code;

    @NotNull
    final String getRevenue;

    public AFd1bSDK(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1bSDK)) {
            return false;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) obj;
        return Intrinsics.d(this.getCurrencyIso4217Code, aFd1bSDK.getCurrencyIso4217Code) && Intrinsics.d(this.getRevenue, aFd1bSDK.getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return hrg.s("HostConfig(prefix=", this.getCurrencyIso4217Code, ", host=", this.getRevenue, ")");
    }
}
