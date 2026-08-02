package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
class ie implements fz {
    public static final ie initialize = new ie();

    @Override // com.netcetera.threeds.sdk.infrastructure.fz
    public remove ThreeDS2ServiceInstance(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        return new ec(context, juVar, fsVar, fqVar, fwVar, fvVar);
    }
}
