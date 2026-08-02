package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TelemetryLoggingOptions implements Api.ApiOptions, Api.ApiOptions.NotRequiredOptions {
    public static final TelemetryLoggingOptions zaa = new TelemetryLoggingOptions(null);
    public final String zab;

    public /* synthetic */ TelemetryLoggingOptions(String str) {
        this.zab = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return zzae.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zab});
    }
}
