package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes10.dex */
public final class zam {
    public final int zaa;
    public final ConnectionResult zab;

    public zam(ConnectionResult connectionResult, int i) {
        zzae.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i;
    }

    public final int zaa() {
        return this.zaa;
    }

    public final ConnectionResult zab() {
        return this.zab;
    }
}
