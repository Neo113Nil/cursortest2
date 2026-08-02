package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;
import papa.internal.InputTracker$listener$1$1$2$trigger$1;

/* loaded from: classes4.dex */
public final class Wallet$WalletOptions implements Api.ApiOptions, Api.ApiOptions.NotRequiredOptions {
    public final int environment;
    public final String zzc;

    public Wallet$WalletOptions(InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$1) {
        this.environment = inputTracker$listener$1$1$2$trigger$1.$cookie;
        this.zzc = inputTracker$listener$1$1$2$trigger$1.$traceSectionName;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Wallet$WalletOptions) || !zzae.equal(Integer.valueOf(this.environment), Integer.valueOf(((Wallet$WalletOptions) obj).environment)) || !zzae.equal(1, 1) || !zzae.equal(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return zzae.equal(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.environment), 1, null, Boolean.TRUE});
    }
}
